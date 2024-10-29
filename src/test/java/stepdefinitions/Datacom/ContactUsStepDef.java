package stepdefinitions.Datacom;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.Datacom.ContactUsPage.ContactUsPage;
import stepdefinitions.CommonStepDef;
import utils.Utilities;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ContactUsStepDef extends PageComponent {
    public static Logger logger = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[1].getClassName());

    CommonStepDef commonStepDef;
    ContactUsPage contactUsPage;
    Utilities utils = new Utilities();

    @Then("I validate and verify header control element :$")
    public void iValidateAndVerifyHeaderControlElement(DataTable dataTable) {

        commonStepDef.AcceptAllCookiesPage();
        List<Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
        commonStepDef.testStep(String.format("Validate And Verify Tab Header And Content : dataTableList %s", dataTableList));
        commonStepDef.waitOnPage();
        for (Map<String, String> e : dataTableList) {

            String _tabs = e.get("Tab").replace(" ", "-").toLowerCase();
            commonStepDef.verifyVisibilityofElement(contactUsPage.LBL_HEADER_CONTENT_TAB(_tabs));
            commonStepDef.clickElement(contactUsPage.LBL_HEADER_CONTENT_TAB(_tabs));
            commonStepDef.verifyTextInPage(e.get("Content"));
        }
    }

    @And("I validate and verify the {} location using the following :")
    public void iValidateTheLocationUsingTheFollowing(String location, DataTable dataTable) {

        List<Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
        commonStepDef.testStep(String.format("Validate And Verify Tab %s And Content : dataTableList %s", location, dataTableList));

        commonStepDef.clickElement(contactUsPage.LBL_LOCATION_TAB(location));

        for (Map<String, String> e : dataTableList) {
            commonStepDef.CollapaseMenu(contactUsPage.BTN_LOCATION_GROUP(e.get("Location")), "open");
            waitABit(2000);
            commonStepDef.verifyTextInPageWithParentSelector(contactUsPage.PARENT_LOCATION_GROUP_NAME, e.get("Location"), e.get("Phone"), e.get("Email"));

            commonStepDef.testStep(String.format("CurrentActualAddress %s | CurrentExpectedAdress %s", contactUsPage.LBL_LOCATION_GROUP_ADDRESS().getText(), e.get("Address")));
            assertThat(contactUsPage.LBL_LOCATION_GROUP_ADDRESS().getText().equals(e.get("Address")));

            commonStepDef.clickTextWithParentSelectorIfExist(contactUsPage.PARENT_LOCATION_GROUP_NAME, "Get directions");
            Ensure.thatTheCurrentPage().currentUrl().contains("https://www.google.com/maps/place/");
            waitABit(1200);
            commonStepDef.clickBackPage();
        }
    }

    @Then("I validate the Contact Us Form using the following :")
    public void iValidateTheContactUsButton(DataTable dataTable) {

        List<Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
        commonStepDef.testStep(String.format("Validate And Verify The Contact Us Form %s", dataTableList));

        commonStepDef.clickElement(contactUsPage.BTN_CONTACT_US());

        for (Map<String, String> e : dataTableList) {
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_FIRST_NAME(), String.format("%s_%s", e.get("First Name"), utils.generateRandomStringInteger(3)), 1500);
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_LAST_NAME(),  String.format("%s_%s", e.get("Last Name"), utils.generateRandomString()), 1500);
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_EMAIL(), e.get("Email"), 1500);
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_PHONE(), e.get("Phone"), 1500);
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_JOB_TITLE(), e.get("Job Title"), 1500);
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_COMPANY(), e.get("Company"), 1500);
            contactUsPage.BTN_CONTACT_US_COUNTRY().selectByVisibleText(e.get("Country"));
            waitABit(1500);
            contactUsPage.BTN_CONTACT_US_HOW_CAN_WE_HELP().selectByVisibleText(e.get("Category 1"));
            waitABit(1500);
            contactUsPage.TXT_CONTACT_US_CUSTOM_5().selectByVisibleText(e.get("Category 2"));
            waitABit(1500);
            commonStepDef.enterText(contactUsPage.TXT_CONTACT_US_MESSAGE(), e.get("Message"), 1500);
            contactUsPage.TXT_CONTACT_US_MESSAGE().sendKeys(Keys.TAB);
            commonStepDef.clickElement(contactUsPage.BTN_SUBMIT());

            commonStepDef.waitOnPage();
            waitABit(2000);

            commonStepDef.verifyTextInPage(
                    "received your message. One of our experts will be in touch with you soon.",
                    "Thank you for getting in touch with us");

            commonStepDef.clickElementIfExist(contactUsPage.BTN_FORM_CLOSE());
        }


    }
}
