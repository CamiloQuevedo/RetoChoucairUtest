package co.com.retochoucair.utest.stepdefinitions;

import co.com.retochoucair.utest.model.Utest_Data;
import co.com.retochoucair.utest.questions.ResponseQuestion;
import co.com.retochoucair.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Camilo wants to register on the Utest page$")
    public void thatCamiloWantsToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage());

    }

    @When("^Enter all the required data and necessary permissions$")
    public void enterAllTheRequiredDataAndNecessaryPermissions(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Insert_Personal_Data.thePage(data), Insert_Personal_Location.thePage(data),
                Insert_Personal_Devices.thePage(data), Insert_Personal_Password.thePage(data));

    }

    @Then("^he completes the registration successfully on the page$")
    public void heCompletesTheRegistrationSuccessfullyOnThePage(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResponseQuestion.toData(data)));
    }
}
