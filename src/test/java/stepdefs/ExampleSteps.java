package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class ExampleSteps {
    @Given("The user is on Google")
    public void theUserIsOnGoogle() {
    }

    @When("The user searches for {string}")
    public void theUserSearchesFor(String searchQuery) {
    }

    @Then("The user should see a link website in the results")
    public void theUserShouldSeeALinkWebsiteInTheResults() {
    }

    @And("The user clicks the link")
    public void theUserClicksTheLink() {
    }

    @Then("The page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {
    }
}
