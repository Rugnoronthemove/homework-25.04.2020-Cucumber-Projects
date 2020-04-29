package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(css = "a[class$='create-account-link']")
    WebElement _createAccountLink;

    @FindBy(css = "input#login-email")
    WebElement _emailField;

    @FindBy(css = "input#login-password")
    WebElement _passwordField;

    @FindBy(xpath = "//tr[3]//button[@class='btn  regular-button  submit']/span")
    WebElement _signInButton;

    public void clickOnCreateAccount() {
        Reporter.addStepLog(" Click on creating new account link " + _createAccountLink.toString());
        clickOnElement(_createAccountLink);
        log.info(" Click on creating new account link " + _createAccountLink.toString());
    }

    public void enterLoginEmail(String str) {
        Reporter.addStepLog(" Enter email id: " + str + " in the email field " + _emailField.toString());
        sendTextToElement(_emailField, str);
        log.info(" Enter email id: " + str + " in the email field " + _emailField.toString());
    }

    public void enterLoginPassword(String str) {
        Reporter.addStepLog(" Enter password: " + str + " in the password field " + _passwordField.toString());
        sendTextToElement(_passwordField, str);
        log.info(" Enter password: " + str + " in the password field " + _passwordField.toString());
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog(" Click on sign in button " + _signInButton.toString());
        clickOnElement(_signInButton);
        log.info(" Click on sign in button " + _signInButton.toString());
    }

}

