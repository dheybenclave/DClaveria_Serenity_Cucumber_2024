package stepdefinitions.demoaspnetawesome;

import actors.ActorLists;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import navigation.NavigateTo;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.pages.PageObject;

public class commonStepDef extends PageObject {

    public Actor _actor;

    @Given("{actor} is navigating in {}")
    public void testerIsNavigatingInDuckDuckGoHomePage(Actor actor , String page) {
        _actor = actor;
        _actor.wasAbleTo(NavigateTo.thePage(page));
//        _actor.attemptsTo(NavigateTo.thePage("DEMOASPAWESOMEPAGE"));
    }
}
