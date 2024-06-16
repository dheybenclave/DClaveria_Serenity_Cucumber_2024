package stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.ProDinnerPage.CommonPage;

import java.util.Iterator;
import java.util.Set;

public class CommonStepDef extends UIInteractions {
    public static Logger logger = LoggerFactory.getLogger(CommonStepDef.class);
    private static final int CLIENT_CODE_STACK_INDEX = 0;
    CommonPage commonSelector;
    public Actor _actor;
    public String mainwindow;
    public Set<String> s1;
    public Iterator<String> i1;


    @Given("{actor} is navigating in {}")
    public void navigatePage(Actor actor, String page) {
        _actor = actor;
        _actor.wasAbleTo(NavigateTo.thePage(page));
        Ensure.thatTheCurrentPage().currentUrl();
    }


    public void generatedSwitchHandler() {
        logger.info("generatedSwitchHandler ");
        mainwindow = this.getDriver().getWindowHandle();
        s1 = this.getDriver().getWindowHandles();
        i1 = s1.iterator();
    }

    public void switchToMainWindow(String windowHandle) {
        logger.info("switchToMainWindow ");
        this.getDriver().switchTo().window(windowHandle);
    }

    public void switchToParentFrame() {
        logger.info("switchToParentFrame ");
        this.getDriver().switchTo().parentFrame();
        this.getDriver().switchTo().frame(0);
        this.getDriver().switchTo().defaultContent();
    }

    public void verifyVisibilityofElement(WebElementFacade element) {
        logger.info(String.format("I Verify the Visibility of the element %s in the page", element));
        logger.info(String.format("the element %s is %s", element, element.isDisplayed()));
        shouldBeVisible(element);
    }

    public void verifyPresenceofElement(WebElementFacade element) {
        logger.info(String.format("I Verify the Presence of the element %s in the page", element));
        logger.info(String.format("the element %s is %s", element, element.isDisplayed()));
        element.isPresent();
    }

    public void clickElement(WebElementFacade element) {

        verifyVisibilityofElement(element);
        element.click();
    }

    public void enterText(WebElementFacade element, String value, int waitForMilliSec) {
        logger.info(String.format("Enter Text '%s' with Value %s", element, value));
        verifyVisibilityofElement(element);
        element.type(value);
        waitABit(waitForMilliSec);
    }
    public void testStep(String message ){
        logger.info(String.format("%s : %s", Thread.currentThread().getStackTrace()[CLIENT_CODE_STACK_INDEX].getMethodName(), message));

    }
}
