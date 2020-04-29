package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.pages.RegistrationCompletePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {

    @When("^I click on Register Link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to Register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        new RegisterPage().verifyTextYourPersonalDetails("Your Personal Details");
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().sendTextToFirstNameField(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().sendTextToLastNameField(lastName);
    }

    @And("^I enter day \"([^\"]*)\"$")
    public void iEnterDay(String day)  {
        new RegisterPage().selectDayDOBFromDropDownMenu(day);
    }

    @And("^I enter month \"([^\"]*)\"$")
    public void iEnterMonth(String month)  {
        new RegisterPage().selectMonthDOBFromDropDownMenu(month);
    }

    @And("^I enter year \"([^\"]*)\"$")
    public void iEnterYear(String year)  {
        new RegisterPage().selectYearDOBFromDropDownMenu(year);
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String regEmail)  {
        new RegisterPage().sendTextToEmailField(regEmail);
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String coName)  {
        new RegisterPage().sendTextToCompanyNameField(coName);
    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String regPass)  {
        new RegisterPage().sendTextToPasswordField(regPass);
    }

    @And("^I enter register confirm password \"([^\"]*)\"$")
    public void iEnterRegisterConfirmPassword(String regCoPass)  {
        new RegisterPage().sendTextToConfirmPasswordField(regCoPass);
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should be able to Register and create an account successfully$")
    public void iShouldBeAbleToRegisterAndCreateAnAccountSuccessfully() {
        new RegistrationCompletePage().verifyRegistrationCompleteText("Your registration completed");
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errMsg)  {
        new RegisterPage().verifyRequiredFieldErrorText(errMsg);
    }

    @And("^I enter random email address$")
    public void iEnterRandomEmailAddress() {
        new RegisterPage().sendRandomEmailToEmailField();
    }
}
