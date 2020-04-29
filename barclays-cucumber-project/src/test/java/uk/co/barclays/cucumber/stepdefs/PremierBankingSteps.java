package uk.co.barclays.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.PremierBankingPage;
import uk.co.barclays.pages.SpringBudgetPage;

public class PremierBankingSteps {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on Home page: " + "https://www.barclays.co.uk/");
    }

    @When("^I click on Premier link$")
    public void iClickOnPremierLink() {
        new HomePage().clickOnPremierLink();
    }

    @Then("^I see the text \"([^\"]*)\" on Premier banking page$")
    public void iSeeTheTextOnPremierBankingPage(String text) {
        new PremierBankingPage().verifyIfPremierBankingTextIsDisplayed(text);
    }

    @And("^I click on Spring budget link$")
    public void iClickOnSpringBudgetLink() {
        new PremierBankingPage().clickOnSpringBudget();
    }

    @Then("^I see the text \"([^\"]*)\" on Spring Budget page$")
    public void iSeeTheTextOnSpringBudgetPage(String text) {
        new SpringBudgetPage().verifySpringBudgetText(text);
    }

}
