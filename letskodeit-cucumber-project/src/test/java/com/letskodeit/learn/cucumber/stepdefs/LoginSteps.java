package com.letskodeit.learn.cucumber.stepdefs;

import com.cucumber.listener.Reporter;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.LoginPage;
import com.letskodeit.learn.pages.MyAccountPage;
import com.sun.org.apache.bcel.internal.generic.NEW;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog(" I am on Home Page " + "https://learn.letskodeit.com/");
    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailAdd(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on log in button$")
    public void iClickOnLogInButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @Then("^I should see my courses text \"([^\"]*)\"$")
    public void iShouldSeeMyCoursesText(String myCoursesTxt) {
        new MyAccountPage().verifyMyCourseText(myCoursesTxt);
    }

    @And("^I click on the avatar link$")
    public void iClickOnTheAvatarLink() {
        new MyAccountPage().clickOnAvatar();
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        new MyAccountPage().clickOnLogOut();
    }

    @Then("^I should see login text \"([^\"]*)\"$")
    public void iShouldSeeLoginText(String loginTxt) {
        new HomePage().verifyLoginText(loginTxt);
    }

}
