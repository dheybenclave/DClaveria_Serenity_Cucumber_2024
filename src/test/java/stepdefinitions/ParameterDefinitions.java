package stepdefinitions;

import actors.ActorLists;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinitions extends PageObject {

    ActorLists actorLists;

    @ParameterType(".*")
    public Actor actor(String actorName) {
        actorName = actorName.isEmpty() ? "tester" : actorName;
        return OnStage.theActorCalled(actorName);
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
