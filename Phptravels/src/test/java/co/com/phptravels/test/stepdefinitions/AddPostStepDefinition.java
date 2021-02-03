package co.com.phptravels.test.stepdefinitions;

import co.com.phptravels.test.models.Post;
import co.com.phptravels.test.questions.ThePost;
import co.com.phptravels.test.tasks.Create;
import co.com.phptravels.test.tasks.GoTo;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddPostStepDefinition {

    @When("^he create a new post$")
    public void heCreateANewPost(List<Post> list) {
        theActorInTheSpotlight().attemptsTo(GoTo.post());
        theActorInTheSpotlight().attemptsTo(Create.post(list.get(0)));
    }

    @When("^he search the post$")
    public void heSearchThePost() {
    }

    @Then("^he will see that the post was created$")
    public void heWillSeeThatThePostWasCreated() {
        OnStage.theActorInTheSpotlight().should(seeThat(ThePost.wasCreated()));
    }

}
