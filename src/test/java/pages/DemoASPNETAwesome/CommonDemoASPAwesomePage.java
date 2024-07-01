package pages.DemoASPNETAwesome;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

public class CommonDemoASPAwesomePage extends UIInteractions {
    public WebElementFacade NAVIGATE_MODULE_PARENT(String category){
        return $(String.format("//div[@data-g='Menu']//*[@class='awe-ce-ico']/parent::*/following::a[text()='%s']", category));}

    public WebElementFacade NAVIGATE_MODULE_SUB(String groupName) {
       return $("(//div[@data-g='Menu']//*[contains(@class,'awe-cbc')]/following::*[text()='" + groupName + "'])[1]");
    }

    public WebElementFacade PAGE_CONTROL_LABEL(String labelText) {
        return $(String.format("//*[contains(text(),'%s')]", labelText));
    }
}
