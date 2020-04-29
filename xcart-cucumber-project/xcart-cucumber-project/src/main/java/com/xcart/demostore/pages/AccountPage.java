package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement _myAccountText;

    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement _myAccountButton;

    @FindBy(xpath = "//ul[@class='account-links dropdown-menu']//li[7]")
    WebElement _logoutButton;

    @FindBy(css = "div[class^='dropdown header_bar-my_account']>a")
    WebElement _loginAccountText;

    @FindBy(xpath = "//html//body//div//div//div//div//div//div//div//ul//li//span[contains(text(),'Hot deals')]")
    WebElement _hotDeals;

    @FindBy(xpath = "//div[@id='header-area']//div//div//div//div//span[contains(text(),'Sale')]")
    WebElement _sale;

    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement _salePageText;

    @FindBy(id = "ui-id-3")
    WebElement _productAddedText;

    public void clickOnLogOutButton() {
        Reporter.addStepLog(" Click on logout button " + _logoutButton.toString());
        clickOnElement(_logoutButton);
        log.info(" Click on logout button " + _logoutButton.toString());
    }

    public void verifyAccountText(String str) {
        Reporter.addStepLog(" Verify text: " + str + " on My account page " + _myAccountText.toString());
        verifyTextAssertEqualsMethod(_myAccountText, str);
        log.info(" Verify text: " + str + " on My account page " + _myAccountText.toString());
    }

    public void clickOnMyAccountButton() {
        Reporter.addStepLog(" Click on My account button " + _myAccountButton.toString());
        clickOnElement(_myAccountButton);
        log.info(" Click on My account button " + _myAccountButton.toString());
    }

    public void verifyLogInAccountText(String str) {
        Reporter.addStepLog(" Verify text: " + str + " displayed on my account page " + _loginAccountText.toString());
        verifyTextAssertEqualsMethod(_loginAccountText, str);
        log.info(" Verify text: " + str + " displayed on my account page " + _loginAccountText.toString());
    }

    public void clickOnHotDeals() {
        Reporter.addStepLog(" Click on Hot Deals Link " + _hotDeals.toString());
        waitUntilElementToBeClickable(_hotDeals,20);
        clickOnElement(_hotDeals);
        log.info(" Click on Hot Deals Link " + _hotDeals.toString());
    }

    public void clickOnSale() {
        Reporter.addStepLog(" Clicking on Sale Link " + _sale.toString());
        waitUntilElementToBeClickable(_sale,20);
        clickOnElement(_sale);
        log.info(" Click on Sale Link " + _sale.toString());
    }

    public void verifySalePageText(String str) {
        Reporter.addStepLog(" Verify text: "+str+" is displayed on sale page"+_salePageText.toString());
        verifyTextAssertEqualsMethod(_salePageText,str);
        log.info(" Verify text: "+str+" is displayed on sale page"+_salePageText.toString());
    }

    public void verifyAddToCartText(String str) {
        Reporter.addStepLog(" Verify text: " + str + " product added to cart " + _productAddedText.toString());
        waitUntilElementToBeClickable(_productAddedText,20);
        verifyTextAssertEqualsMethod(_productAddedText, str);
        log.info(" Verify text: " + str + " product added to cart " + _productAddedText.toString());
    }

}


