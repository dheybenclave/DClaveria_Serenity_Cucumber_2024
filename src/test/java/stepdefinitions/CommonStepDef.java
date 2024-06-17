package stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.ProDinnerPage.CommonPage;

import java.util.Iterator;
import java.util.Set;

public class CommonStepDef extends UIInteractions {
    public static Logger logger = LoggerFactory.getLogger(CommonStepDef.class);
    private int CLIENT_CODE_STACK_INDEX;
    public CommonPage commonPage;
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
        testStep(String.format("Click for Element '%s'", element));
        verifyVisibilityofElement(element);
        waitABit(2000);
        element.click();
    }

    public void enterText(WebElementFacade element, String value, int waitForMilliSec) {
        testStep(String.format("Enter Text '%s' with Value %s", element, value));
        verifyVisibilityofElement(element);
        element.type(value);
        waitABit(waitForMilliSec);
    }

    public void setAttibute(WebElementFacade element, String attName, String attValue, int waitForMilliSec) {
        testStep(String.format("Set Attribute  '%s' | Name : '%s' | Value : '%s'", element, attName, attValue));
        element.shouldBePresent();
        JavascriptExecutor js = (JavascriptExecutor) this.getDriver();
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attName, attValue);
        waitABit(waitForMilliSec);
    }

    public void setInputValue(WebElementFacade element, String value, int waitForMilliSec) {
        testStep(String.format("Set Value '%s' with Value %s", element, value));
        this.setAttibute(element, "value", value, waitForMilliSec);
        waitABit(waitForMilliSec);
    }


    public void NavigateToUIPage(WebElementFacade element) {
        testStep(String.format("Navigate to : '%s'", element));
        verifyVisibilityofElement(element);
        element.click();
    }

    public void verifyTextInPage(String... textList) {
        for (String currText : textList) {
            testStep(String.format("verify the text in the page :%s", textList));
            verifyVisibilityofElement(commonPage.TXT_FIELD(currText));
        }
    }


    public void testStep(String message) {
        logger.info(String.format("%s : %s", Thread.currentThread().getStackTrace()[1].getMethodName(), message));
    }
}
