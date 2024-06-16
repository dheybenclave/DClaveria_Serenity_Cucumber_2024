package stepdefinitions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NavigateTo extends UIInteractions {
    public static Logger logger = LoggerFactory.getLogger(NavigateTo.class);

    public static Performable thePage(String homePage) {

        logger.info("Navigate Page to {}", homePage);

        final String pageName;

        switch (homePage.toUpperCase()) {
            case "DEMOASPAWESOMEPAGE":
                pageName = "pages.demoaspawesome";
                break;
            case "WIKIHOMEPAGE":
                pageName = "pages.wiki";
                break;
            case "PRODINNERASPNETAWESOME":
                pageName = String.format("pages.%s", homePage.toLowerCase());
                break;
            default:
                logger.error("Unknown page: {}", homePage);
                pageName = "pages.default"; // Or any other appropriate default page
                break;
        }

        return Task.where(String.format("{0} opens the %s Page", homePage.toUpperCase()), Open.browserOn().thePageNamed(pageName));
    }
}
