package navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigateTo {
    public static Logger logger = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[1].getClassName());

    public static Performable theSearchHomePage() {

        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePage.class));

    }
    public static Performable thePage(String homePage) {

        logger.info(String.format("Navigate Page to %s", homePage));

        Task openURL;
        
        switch (homePage.toUpperCase()) {
            case "DEMOASPAWESOMEPAGE":
                openURL = Task.where("{0} opens the Demo ASP Awesome Application Page", Open.browserOn().thePageNamed("pages.demoaspawesome"));
                break;
            case "WIKIHOMEPAGE":
                openURL = Task.where("{0} opens the Wikipedia Application Page", Open.browserOn().thePageNamed("pages.wiki"));
                break;
            default:
                openURL = Task.where("{0} opens the Default Application Page", Open.browserOn().thePageNamed("pages.default"));
        }
        return openURL;
    }


}
