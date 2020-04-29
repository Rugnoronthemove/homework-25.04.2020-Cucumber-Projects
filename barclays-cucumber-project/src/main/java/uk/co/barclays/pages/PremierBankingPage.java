package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class PremierBankingPage extends Utility {

    private static final Logger log = LogManager.getLogger(PremierBankingPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Premier Banking')]")
    WebElement _premierBankingText;

    @FindBy(xpath = "//a[contains(text(),'Spring Budget 2020')]")
    WebElement _springBudget;


    public void verifyIfPremierBankingTextIsDisplayed(String str) {
        Reporter.addStepLog(" Verifying text: " + str + " is displayed on premier banking page " + _premierBankingText.toString());
        verifyThatTextIsDisplayed(_premierBankingText, str);
        log.info(" Verifying text: " + str + " is displayed on premier banking page " + _premierBankingText.toString());
    }

    public void clickOnSpringBudget() {
        Reporter.addStepLog(" Clicking on spring budget link " + _springBudget.toString());
        clickOnElement(_springBudget);
        log.info(" Clicking on spring budget link " + _springBudget.toString());

    }

}

