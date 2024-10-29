package pages.Datacom.ContactUsPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

public class ContactUsPage extends UIInteractions {

    // Header
    public WebElementFacade BTN_NAVIGATION_SEARCHBOX() {
        return $("//div[@class='cmp-search__field']");
    }

    public WebElementFacade TXT_NAVIGATION_SEARCHBOX() {
        return $("//input[@class='cmp-search__input']");
    }

    public WebElementFacade BTN_FORM_CLOSE() {
        return $("//span[@class='cmp-mrkto-modal__content__close fal fa-times']");
    }


    //Content
    public WebElementFacade LBL_HEADER_CONTENT_TAB(String tabName) {
        return $("(//*[@data-tab-id='" + tabName + "']/a)[1]");
    }

    //Location Section

    public String PARENT_LOCATION_GROUP_NAME = "//div[@style='display: block;']//div[contains(@class,'cmp-location__location__name open')]/parent::div";

    public WebElementFacade LBL_LOCATION_TAB(String locationTabName) {
        return $("//li[@data-tab-section-id and contains(text(),'" + locationTabName + "')]");
    }

    public WebElementFacade BTN_LOCATION_GROUP(String locationGroupName) {
        return $("//div[@class='cmp-location__location-container']/div[contains(text(),'" + locationGroupName + "')]");
    }

    public WebElementFacade DIV_MAP_HASH_VALUE(String mapHash) {
        return $("//div[@aria-roledescription='map' and @aria-describedby='" + mapHash + "']");
    }

    public WebElementFacade LBL_LOCATION_GROUP_ADDRESS() {
        return $("//p[@class='cmp-location__location__address']");
    }

    //Contact Us Form
    public WebElementFacade BTN_CONTACT_US() {
        return $("  //div[@id='cmp-mrkto-modal-thank-you']");
    }

    public WebElementFacade TXT_CONTACT_US_FIRST_NAME() {
        return $("//input[@id='FirstName']");
    }

    public WebElementFacade TXT_CONTACT_US_LAST_NAME() {
        return $("//input[@id='LastName']");
    }

    public WebElementFacade TXT_CONTACT_US_EMAIL() {
        return $("//input[@id='Email']");
    }

    public WebElementFacade TXT_CONTACT_US_PHONE() {
        return $("//input[@id='Phone']");
    }

    public WebElementFacade TXT_CONTACT_US_JOB_TITLE() {
        return $("//input[@id='Title']");
    }

    public WebElementFacade TXT_CONTACT_US_COMPANY() {
        return $("//input[@id='Company']");
    }

    public WebElementFacade BTN_CONTACT_US_COUNTRY() {
        return $("//select[@id='Country']");
    }

    public WebElementFacade BTN_CONTACT_US_HOW_CAN_WE_HELP() {
        return $("//select[@id='custom2']");
    }

    public WebElementFacade TXT_CONTACT_US_CUSTOM_5() {
        return $("//select[@id='custom5']");
    }

    public WebElementFacade TXT_CONTACT_US_MESSAGE() {
        return $("//input[@id='How_can_we_help__c']");
    }

    public WebElementFacade BTN_SUBMIT() {
        return $("//button[@type='submit']");
    }


    //Footer

    String PARENT_FOOTER = "//footer/div[contains(@class,'footer__ctn')]";


}
