package stepdefinitions;

import actors.ActorLists;
import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.UnknownPageException;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.BaseClass;


public class NavigateTo extends PageComponent {
    public static Logger logger = LoggerFactory.getLogger(NavigateTo.class);


//    public static void thePage(String pageName){
//        String pageUrl = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.currentEnvironmentVariables())
//                .getOptionalProperty(pageName)
//                .orElse(SystemEnvironmentVariables.currentEnvironmentVariables().getProperty(pageName));
//        if (pageUrl == null) {
//            throw new UnknownPageException("No page defined with the name '" + pageUrl + "'");
//        }
//
//    }
//
//    public static Performable thePages(String homePage) {
//
//        logger.info("Navigate Page to {}", homePage);
//
//        final String pageName;
//
//        switch (homePage.toUpperCase()) {
//            case "DEMOASPAWESOMEPAGE":
//                pageName = "pages.demoaspawesome";
//                break;
//            case "WIKIHOMEPAGE":
//                pageName = "pages.wiki";
//                break;
//            case "PRODINNERASPNETAWESOME":
//                pageName = String.format("pages.%s", homePage.toLowerCase());
//                break;
//            default:
//                logger.error("Unknown page: {}", homePage);
//                pageName = "pages.default"; // Or any other appropriate default page
//                break;
//        }
//
//
//        return Task.where(String.format("{0} opens the %s Page", homePage.toUpperCase()), Open.browserOn().thePageNamed(pageName));
//    }
}
