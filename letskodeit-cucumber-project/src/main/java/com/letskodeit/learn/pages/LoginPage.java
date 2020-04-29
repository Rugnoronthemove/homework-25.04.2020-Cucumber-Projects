package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='user_email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='user_password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@name='commit']")
    WebElement _loginBtn;


    public void enterEmailAdd(String email) {
        Reporter.addStepLog(" Enter email: " + email + " to the filed " + _emailField.toString());
        sendTextToElement(_emailField, email);
        log.info(" Enter email: " + email + " to the filed " + _emailField.toString());
    }

    public void enterPassword(String pwd) {
        Reporter.addStepLog(" Enter password: " + pwd + " to the field " + _passwordField.toString());
        sendTextToElement(_passwordField, pwd);
        log.info(" Enter password: " + pwd + " to the field " + _passwordField.toString());
    }

    public void clickOnLoginBtn() {
        Reporter.addStepLog(" Clicking on Log in button " + _loginBtn.toString());
        clickOnElement(_loginBtn);
        log.info(" Clicking on Log in button " + _loginBtn.toString());
    }


}

