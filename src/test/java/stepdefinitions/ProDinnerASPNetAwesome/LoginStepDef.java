package stepdefinitions.ProDinnerASPNetAwesome;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.Actor;
import pages.ProDinnerPage.CommonProDinnerPage;
import pages.ProDinnerPage.SignInPage;
import stepdefinitions.CommonStepDef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.UserCredentials;

public class LoginStepDef extends PageComponent {
    public static Logger logger = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[1].getClassName());

    CommonStepDef commonStepDef;
    CommonProDinnerPage commonPage;
    SignInPage signInPage;

    String _username, _password = "";

    @Given("{} is login in {}")
    public void LoginUser(String actor, String page) {

        commonStepDef.navigatePage(page);
        commonStepDef.clickElement(commonPage.LNK_SIGN_IN());

        commonStepDef.testStep(String.format("I login in the application as %s", actor));
        GetCredentials(actor);
        commonStepDef.enterText(signInPage.TXT_USERNAME(), _username, 2000);
        commonStepDef.enterText(signInPage.TXT_PASSWORD(), _password, 2000);
        commonStepDef.clickElement(signInPage.BTN_SIGN_IN());  //clickOn(signInPage.BTN_SIGN_IN);
        waitABit(2000);
        commonStepDef.verifyVisibilityofElement(commonPage.LNK_SIGN_OUT());

    }

    private void GetCredentials(String actor) {

        logger.info(String.format("Get Credentials of %s", actor));

        switch (actor) {
            case "ProDinnerAdmin":
                _username = UserCredentials.ProDinnerAdmin.getUsername();
                _password = UserCredentials.ProDinnerAdmin.getPassword();
                break;
            case "Admin":
                _username = UserCredentials.Admin.getUsername();
                _password = UserCredentials.Admin.getPassword();
                break;
            default:
                break;
        }
    }


}
