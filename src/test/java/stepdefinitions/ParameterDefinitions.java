package stepdefinitions;

import actors.ActorLists;
import io.cucumber.java.*;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterDefinitions extends PageObject {
    public static Logger logger = LoggerFactory.getLogger(ParameterDefinitions.class);
    ActorLists actorLists;
    WebDriver driver1;
    PageObject pageObject;

    @ParameterType(".*")
    public Actor actor(String actorName) {
        actorName = actorName.isEmpty() ? "tester" : actorName;
        return OnStage.theActorCalled(actorName);
    }
    @BeforeEach
    void setup() {
        driver1 = WebDriverManager.chromedriver().create();
        logger.info(String.format("Set Up Driver : %s", driver1));
        this.setDriver(driver1);
        pageObject.setDriver(driver1);
    }

    @AfterEach
    void teardown() {
        driver1.quit();
    }



    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void tearDown() {
        this.getDriver().close();
        this.getDriver().quit();
    }


}
