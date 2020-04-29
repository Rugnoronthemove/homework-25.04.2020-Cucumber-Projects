package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class SpringBudgetPage extends Utility {

    private static final Logger log = LogManager.getLogger(SpringBudgetPage.class.getName());

    @FindBy(xpath = "//h2[contains(text(),'Spring Budget 2020')]")
    WebElement _springBudgetText;

    public void verifySpringBudgetText(String txt) {
        Reporter.addStepLog(" Verifying the text: " + txt + " is displayed on spring budget page " + _springBudgetText.toString());
        verifyTextAssertMethod(_springBudgetText, txt);
        log.info(" Verifying the text: " + txt + " is displayed on spring budget page " + _springBudgetText.toString());
    }

}
