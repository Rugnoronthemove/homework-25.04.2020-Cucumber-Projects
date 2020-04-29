package uk.co.expedia.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;

public class LoginSteps {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on Homepage: " + "https://www.expedia.co.uk/");
    }

    @When("^I click on Account link$")
    public void iClickOnAccountLink() {
        new HomePage().clickOnAccountTab();
    }


    @Then("^I should the see text \"([^\"]*)\"$")
    public void iShouldTheSeeText(String signInText)  {
        new AccountPage().verifyAccountPageText(signInText);
    }

    @And("^I click on Sign In button$")
    public void iClickOnSignInButton() {
        new AccountPage().clickOnSignInBtn();
    }

    @And("^I enter \"([^\"]*)\" in the email address field$")
    public void iEnterInTheEmailAddressField(String emailAdd)  {
        new SignInPage().sendTextToEmailField(emailAdd);
    }

    @And("^I enter \"([^\"]*)\" in the password field$")
    public void iEnterInThePasswordField(String pass)  {
        new SignInPage().sendTextToPasswordField(pass);
    }

    @And("^I click on the Sign In button$")
    public void iClickOnTheSignInButton() {
        new SignInPage().clickOnSignInTab();
    }

    @Then("^I should see a error message \"([^\"]*)\"$")
    public void iShouldSeeAErrorMessage(String errMsg)  {
        new SignInPage().verifyErrorMessage(errMsg);
    }

}
