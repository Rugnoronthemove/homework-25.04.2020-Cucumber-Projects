package com.letskodeit.learn.pages;

import com.cucumber.listener.Reporter;
import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li[1]")
    WebElement _myCoursesText;

    @FindBy(xpath = "//img[@class='gravatar']")
    WebElement _avatarClick;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    WebElement _logoutBtn;

    public void verifyMyCourseText(String myCourseTxt) {
        Reporter.addStepLog(" Verify text: " + myCourseTxt + " is displayed on my account page ");
        waitUntilElementToBeClickable(_myCoursesText, 20);
        log.info("Verify text: " + myCourseTxt + " is displayed on my account page ");
    }

    public void clickOnAvatar() {
        Reporter.addStepLog(" Click on the avatar image " + _avatarClick.toString());
        clickOnElement(_avatarClick);
        log.info(" Click on the avatar image " + _avatarClick.toString());
    }

    public void clickOnLogOut() {
        Reporter.addStepLog(" Click on logout " + _logoutBtn.toString());
        clickOnElement(_logoutBtn);
        log.info(" Click on logout " + _logoutBtn.toString());
    }

}
