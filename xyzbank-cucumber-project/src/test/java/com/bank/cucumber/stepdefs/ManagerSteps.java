package com.bank.cucumber.stepdefs;

import com.bank.pages.*;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManagerSteps {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on HomePage" + "http://www.way2automation.com/angularjs-protractor/banking/#/login");
    }


    @When("^I click on BankManagerLogin button$")
    public void iClickOnBankManagerLoginButton() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("^I click on Add Customer button$")
    public void iClickOnAddCustomerButton() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() {
        new AddCustomerPage().enterFirstName();
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String lName) {
        new AddCustomerPage().enterLastName(lName);
    }

    @And("^I enter Post code \"([^\"]*)\"$")
    public void iEnterPostCode(String pCode)  {
        new AddCustomerPage().enterPostCode(pCode);
    }

    @Then("^I should add customer successfully$")
    public void iShouldAddCustomerSuccessfully() {
        new AddCustomerPage().clickOnAddCustomerButtonAndVerifyAlertText("Customer added successfully");
    }

    @And("^I click on Open Account button$")
    public void iClickOnOpenAccountButton() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("^I search for the customer by name that I added$")
    public void iSearchForTheCustomerByNameThatIAdded() {
//        new OpenAccountPage().searchCustomerCreatedInFirstTest("Severus");
        new OpenAccountPage().searchCustomerCreatedInFirstTest(6);
    }

    @And("^I select currency Pound$")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectCurrencyPound(2);
    }

    @Then("^I should open account successfully$")
    public void iShouldOpenAccountSuccessfully() {
        new OpenAccountPage().clickOnProcessButtonAndVerifyAlertText("Account created successfully");
    }

    @Given("^I click on Customers Button$")
    public void iClickOnCustomersButton() {
        new BankManagerLoginPage().clickOnCustomersTab();
    }

    @When("^I search for the customer$")
    public void iSearchForTheCustomer() {
        new CustomersPage().searchCustomerName("Severus");
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new CustomersPage().clickOnDeleteButton();
    }

    @Then("^I should delete the customer from the Customers list$")
    public void iShouldDeleteTheCustomerFromTheCustomersList() {
    }

}
