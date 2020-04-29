package com.xcart.demostore.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xcart.demostore.pages.AccountPage;
import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on Home Page:" + "https://demostore.x-cart.com/");
    }

    @When("^I click on Sign in tab$")
    public void iClickOnSignInTab() {
        new HomePage().clickOnSignInTab();
    }

    @And("^I enter \"([^\"]*)\" id in the email field$")
    public void iEnterIdInTheEmailField(String email) {
        new LoginPage().enterLoginEmail(email);
    }

    @And("^I enter \"([^\"]*)\"in the password field$")
    public void iEnterInThePasswordField(String pass) {
        new LoginPage().enterLoginPassword(pass);
    }

    @And("^I click on Sign in button$")
    public void iClickOnSignInButton() {
        new LoginPage().clickOnSignInButton();
    }



    @And("^I click on my account button$")
    public void iClickOnMyAccountButton() {
        new AccountPage().clickOnMyAccountButton();
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        new AccountPage().clickOnLogOutButton();
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String signInTxt) {
        new HomePage().verifySignInText(signInTxt);
    }

    @Then("^I should see the text \"([^\"]*)\" on my account page$")
    public void iShouldSeeTheTextOnMyAccountPage(String loginAccText) throws Throwable {
        new AccountPage().verifyLogInAccountText(loginAccText);
    }
}
