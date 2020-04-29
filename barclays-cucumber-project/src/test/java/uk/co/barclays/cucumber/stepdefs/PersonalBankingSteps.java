package uk.co.barclays.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.barclays.pages.BorrowPage;
import uk.co.barclays.pages.FindABranchPage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.OverDraftPage;

public class PersonalBankingSteps {

    @When("^I click on Borrow link$")
    public void iClickOnBorrowLink() {
        new HomePage().mouseHoverOnBorrow();
    }

    @And("^I click on Overdraft link$")
    public void iClickOnOverdraftLink() {
        new BorrowPage().clickOnOverDraftLink();
    }

    @Then("^I can see text \"([^\"]*)\" on Overdraft page$")
    public void iCanSeeTextOnOverdraftPage(String text) {
        new OverDraftPage().verifyOverDraftText(text);
    }

    @When("^I click on Find a branch$")
    public void iClickOnFindABranch() {
        new HomePage().clickOnFindABranch();
    }

    @And("^I enter branch name \"([^\"]*)\"$")
    public void iEnterBranchName(String text) {
        new FindABranchPage().enterBranchName(text);
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new FindABranchPage().clickOnSearchButton();
    }

    @Then("^I see the result \"([^\"]*)\"$")
    public void iSeeTheResult(String text) {
        new FindABranchPage().verifyTheSearchResults(text);
    }

}

