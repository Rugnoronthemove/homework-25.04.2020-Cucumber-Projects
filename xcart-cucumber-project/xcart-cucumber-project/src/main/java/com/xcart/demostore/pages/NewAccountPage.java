package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(css = "input#login")
    WebElement _emailField;

    @FindBy(css = "input#password")
    WebElement _passwordField;

    @FindBy(css = "input#password-conf")
    WebElement _confPassword;

    @FindBy(xpath = "//div[@class='button submit']//button[@type='submit']")
    WebElement _createButton;


    public void enterEmail(String str) {
        Reporter.addStepLog(" Enter email id: " + str + " in the email field " + _emailField.toString());
        sendTextToElement(_emailField, "abcd" + getRandomString(2) + "@gmail.com");
        log.info(" Enter email id: " + str + " in the email field " + _emailField.toString());

    }

    public void enterPassword(String str) {
        Reporter.addStepLog(" Enter password: " + str + " in the password field " + _passwordField.toString());
        sendTextToElement(_passwordField, str);
        log.info(" Enter password: " + str + " in the password field " + _passwordField.toString());

    }

    public void enterConfPassword(String str) {
        Reporter.addStepLog(" Enter conf password: " + str + " in the conf password field " + _confPassword.toString());
        sendTextToElement(_confPassword, str);
        log.info(" Enter conf password: " + str + " in the conf password field " + _confPassword.toString());
    }

    public void clickOnCreateButton() {
        Reporter.addStepLog(" Click on create button " + _createButton.toString());
        clickOnElement(_createButton);
        log.info(" Click on create button " + _createButton.toString());
    }

}

