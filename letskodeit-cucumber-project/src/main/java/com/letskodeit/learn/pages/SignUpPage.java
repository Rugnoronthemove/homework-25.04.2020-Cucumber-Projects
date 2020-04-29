package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());


    @FindBy(xpath = "//input[@id='user_name']")
    WebElement _fullNameFiled;

    @FindBy(xpath = "//input[@id='user_email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='user_password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='user_password_confirmation']")
    WebElement _confPasswordField;

    @FindBy(xpath = "//input[@id='user_agreed_to_terms']")
    WebElement _checkBoxTermsCond;

    @FindBy(xpath = "//input[@name='commit']")
    WebElement _signUpButton;

    @FindBy(xpath = "//h1")
    WebElement _signUpToLetsKodeIt;


    public void verifyTextSignUpToLetsKodeIt(String verifyTxt) {
        Reporter.addStepLog(" Verify text: " + verifyTxt + " is displayed on the sign up page " + _signUpToLetsKodeIt.toString());
        verifyTextAssertMethod(_signUpToLetsKodeIt, verifyTxt);
        log.info(" Verify text: " + verifyTxt + " is displayed on the sign up page " + _signUpToLetsKodeIt.toString());
    }

    public void enterFullName(String fullName) {
        Reporter.addStepLog("enter full name " + fullName + "to the filed" + _fullNameFiled.toString());
        sendTextToElement(_fullNameFiled, fullName);
        log.info("enter full name " + fullName + "to the filed" + _fullNameFiled.toString());
    }

    public void enterEmailAdd(String email) {
        Reporter.addStepLog("enter email" + email + " to the filed" + _emailField.toString());
        sendTextToElement(_emailField, email);
        log.info("enter email" + email + " to the filed" + _emailField.toString());
    }

    public void enterRandomEmailAdd() {
        String regEmail = "xyz" + getRandomString(2) + "@gmail.com";
        Reporter.addStepLog(" Enter email " + regEmail + " to the field " + _emailField.toString());
        sendTextToElement(_emailField, regEmail);
        log.info(" Enter email: " + regEmail + " to the field " + _emailField.toString());
    }

    public void enterPassword(String pwd) {
        Reporter.addStepLog(" Enter password: " + pwd + " to the field " + _passwordField.toString());
        sendTextToElement(_passwordField, pwd);
        log.info(" Enter password: " + pwd + " to the field " + _passwordField.toString());
    }

    public void enterConfirmPassword(String cPwd) {
        Reporter.addStepLog(" Enter confirm password: " + cPwd + " to the field " + _confPasswordField.toString());
        sendTextToElement(_confPasswordField, cPwd);
        log.info(" Enter confirm password: " + cPwd + " to the field " + _confPasswordField.toString());
    }

    public void clickCheckBoxTermsAndCond() {
        Reporter.addStepLog(" Select the checkbox for terms and condition " + _checkBoxTermsCond.toString());
        checkBoxClick(_checkBoxTermsCond);
        log.info(" Select the checkbox for terms and condition " + _checkBoxTermsCond.toString());
    }

    public void clickOnSignUpButton() {
        Reporter.addStepLog(" Click on sign up button " + _signUpButton.toString());
        clickOnElement(_signUpButton);
        log.info(" Click on sign up button " + _signUpButton.toString());
    }

}
