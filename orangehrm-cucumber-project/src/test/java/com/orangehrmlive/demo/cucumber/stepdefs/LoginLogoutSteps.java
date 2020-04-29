package com.orangehrmlive.demo.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.pages.AccountPage;
import com.orangehrmlive.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutSteps {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on Home page: " + "https://opensource-demo.orangehrmlive.com/");
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String email) {
        new HomePage().clickAndSendTextToUsernameField(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new HomePage().clickAndSendTextToPasswordField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginBtn();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        new AccountPage().verifyTextWelcomeAdmin("Welcome Admin");
    }

    @And("^I click on welcome admin link and logout link$")
    public void iClickOnWelcomeAdminLinkAndLogoutLink() {
        new AccountPage().clickOnWelcomeAdmin();
        new AccountPage().clickOnLogoutLink();
    }

    @Then("^I should see the text \"([^\"]*)\"$")
    public void iShouldSeeTheText(String text) {
        new HomePage().verifyTextLoginPanelText(text);
    }

}
