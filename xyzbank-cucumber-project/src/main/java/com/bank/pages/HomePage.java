package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLogin;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLogin;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement _homeBtn;


    public void clickOnHomeButton() {
        Reporter.addStepLog(" Click on Home button: " + _homeBtn.toString());
        waitUntilElementToBeClickable(_homeBtn, 20);
        clickOnElement(_homeBtn);
        log.info(" Click on Home button: " + _homeBtn.toString());
    }

    public void clickOnBankManagerLoginTab() {
        Reporter.addStepLog(" Click on BankManagerLogin tab: " + _bankManagerLogin.toString());
        waitUntilElementToBeClickable(_bankManagerLogin, 20);
        clickOnElement(_bankManagerLogin);
        log.info(" Click on BankManagerLogin tab: " + _bankManagerLogin.toString());
    }

    public void clickOnCustomerLoginTab() {
        Reporter.addStepLog(" Click on CustomerLogin tab: " + _customerLogin.toString());
        waitUntilElementToBeClickable(_customerLogin, 20);
        clickOnElement(_customerLogin);
        log.info(" Click on CustomerLogin tab: " + _customerLogin.toString());
    }

}


