package co.com.phptravels.test.stepdefinitions;

import co.com.phptravels.test.tasks.Create;
import co.com.phptravels.test.tasks.GoTo;
import co.com.phptravels.test.tasks.Login;
import co.com.phptravels.test.models.Categories;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.phptravels.test.utils.drivers.OwnRemoteWebDriver.hisBrowserWeb;
import static co.com.phptravels.test.utils.drivers.OwnRemoteWebDriver.on;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddCategoryStepDefinition {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Felipe");
    }

    @Given("^he should logged in phptravels$")
    public void heShouldLoggedInPhptravels() {
        hisBrowserWeb();
        theActorInTheSpotlight()
                .can(BrowseTheWeb.with(on("https://www.phptravels.net/admin")));
        theActorInTheSpotlight().attemptsTo(Login.inPhptravels());
    }

    @When("^he create a new category$")
    public void heCreateANewCategory(List<Categories> categories) {

        theActorInTheSpotlight().attemptsTo(GoTo.categories());
        theActorInTheSpotlight().attemptsTo(Create.category(categories.get(0)));
    }

    @When("^he search the new category$")
    public void heSearchTheNewCategory(List<String> category){
        theActorInTheSpotlight().attemptsTo(GoTo.searchCategory(category.get(1)));
    }

    @Then("^he will see that the category was created$")
    public void heWillSeeThatTheCategoryWasCreated() {
    }

}
