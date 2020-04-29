package com.xcart.demostore.cucumber.stepdefs;

import com.xcart.demostore.pages.AccountPage;
import com.xcart.demostore.pages.LoginPage;
import com.xcart.demostore.pages.NewAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateNewAccountSteps {

    @And("^I click on create new account$")
    public void iClickOnCreateNewAccount() {
        new LoginPage().clickOnCreateAccount();
    }


    @And("^I enter random email \"([^\"]*)\" in the email field$")
    public void iEnterRandomEmailInTheEmailField(String email) {
        new NewAccountPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String pass) {
        new NewAccountPage().enterPassword(pass);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String coPass) {
        new NewAccountPage().enterConfPassword(coPass);
    }

    @And("^I click on create account$")
    public void iClickOnCreateAccount() {
        new NewAccountPage().clickOnCreateButton();
    }


    @And("^I click on Hot Deals$")
    public void iClickOnHotDeals() {
        new AccountPage().clickOnHotDeals();
    }

    @And("^I click on Sale$")
    public void iClickOnSale() {
        new AccountPage().clickOnSale();
    }


    @Then("^I should see the text \"([^\"]*)\" on Sale page$")
    public void iShouldSeeTheTextOnSalePage(String saleText) {
        new AccountPage().verifySalePageText(saleText);
    }

    @Then("^I should see the text \"([^\"]*)\"$")
    public void iShouldSeeTheText(String myAccText) {
        new AccountPage().verifyAccountText(myAccText);
    }
}
