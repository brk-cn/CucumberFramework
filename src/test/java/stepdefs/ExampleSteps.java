package stepdefs;

import org.openqa.selenium.WebDriver;
import utils.Driver;
import pages.GooglePage;
import pages.PersonalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class ExampleSteps {
    WebDriver driver = Driver.getDriver();
    GooglePage googlePage = new GooglePage(driver);

    @Given("The user is on Google")
    public void theUserIsOnGoogle() {
        googlePage.goToGoogle();
    }

    @When("The user searches for {string}")
    public void theUserSearchesFor(String searchQuery) {
        googlePage.search(searchQuery);
    }

    @Then("The user should see a link with the text {string} in the results")
    public void theUserShouldSeeALinkWithTheTextInTheResults(String expectedLink) {
        boolean resultVisible = googlePage.isResultVisible(expectedLink);
        if (!resultVisible) {
            throw new AssertionError("Expected link not visible: " + expectedLink);
        }
    }

    @And("The user clicks the link the text {string}")
    public void theUserClicksTheLinkTheText(String link) {
        googlePage.clickResultByText(link);
    }

    @Then("The page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {
        PersonalPage personalPage = new PersonalPage(driver);
        personalPage.checkTitle(expectedTitle);
    }
}
