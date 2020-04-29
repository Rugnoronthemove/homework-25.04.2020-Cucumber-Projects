package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Borrow")
    WebElement _borrow;

    @FindBy(xpath = "//body/div/div/header/div/nav/ul/li[2]/a[1]")
    WebElement _premierText;

    @FindBy(xpath = "//span[contains(text(),'Find a branch')]")
    WebElement _findABranch;

    public void mouseHoverOnBorrow() {
        Reporter.addStepLog(" Mouse hovering on borrow link " + _borrow.toString());
        mouseHover(_borrow);
        log.info(" Mouse hovering on borrow link " + _borrow.toString());
    }

    public void clickOnPremierLink() {
        Reporter.addStepLog(" Clicking on premier link " + _premierText.toString());
        clickOnElement(_premierText);
        log.info(" Clicking on premier link " + _premierText.toString());
    }
    public void clickOnFindABranch(){
        Reporter.addStepLog(" Clicking on find a branch on Home page "+_findABranch.toString());
        clickOnElement(_findABranch);
        log.info(" Clicking on find a branch on Home page "+_findABranch.toString());
    }

}
