package com.xcart.demostore.pages;

import com.cucumber.listener.Reporter;
import com.xcart.demostore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//div[@id='header-bar']//div//span[contains(text(),'Sign in')]")
    WebElement _signInTab;

//    @FindBy(xpath = "//div[@class='header_bar-sign_in']//span")
//    WebElement _signInTab;

    public void verifySignInText(String str) {
        Reporter.addStepLog(" Verify text: " + str + " is displayed on Home page" + _signInTab.toString());
        verifyTextAssertEqualsMethod(_signInTab, str);
        log.info(" Verify text: " + str + " is displayed on Home page" + _signInTab.toString());
    }

    public void clickOnSignInTab() {
        Reporter.addStepLog(" Click on sign in link on home page " + _signInTab.toString());
        clickOnElement(_signInTab);
        log.info(" Click on sign in link on home page " + _signInTab.toString());
    }

}

