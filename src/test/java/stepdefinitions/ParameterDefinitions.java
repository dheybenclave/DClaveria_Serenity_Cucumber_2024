package stepdefinitions;

import actors.ActorLists;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinitions {

    ActorLists actorLists;

    @ParameterType(".*")
    public Actor actor(String actorName) {
        actorName = actorName.isEmpty() ?  "tester" : actorName;
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
