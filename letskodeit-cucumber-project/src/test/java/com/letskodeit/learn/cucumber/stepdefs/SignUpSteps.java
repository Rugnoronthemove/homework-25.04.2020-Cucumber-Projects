package com.letskodeit.learn.cucumber.stepdefs;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps {

    @When("^I click on Sign up link$")
    public void iClickOnSignUpLink() {
        new HomePage().clickOnSignUpBtn();
    }

    @Then("^I should see sign up to lets kode it text \"([^\"]*)\"$")
    public void iShouldSeeSignUpToLetsKodeItText(String signUpTxt) {
        new SignUpPage().verifyTextSignUpToLetsKodeIt(signUpTxt);
    }

    @And("^I enter full name \"([^\"]*)\"$")
    public void iEnterFullName(String fullName) {
        new SignUpPage().enterFullName(fullName);
    }

    @And("^I enter a random email address$")
    public void iEnterARandomEmailAddress() {
        new SignUpPage().enterRandomEmailAdd();
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String pass) {
        new SignUpPage().enterConfirmPassword(pass);
    }

    @And("^I select the check box for terms and conditions$")
    public void iSelectTheCheckBoxForTermsAndConditions() {
        new SignUpPage().clickCheckBoxTermsAndCond();
    }

    @And("^I click on Sign up button$")
    public void iClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpButton();
    }

}

