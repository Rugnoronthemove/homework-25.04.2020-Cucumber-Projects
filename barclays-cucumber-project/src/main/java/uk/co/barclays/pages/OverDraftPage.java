package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class OverDraftPage extends Utility {

    private static final Logger log = LogManager.getLogger(OverDraftPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Overdrafts explained')]")
    WebElement _overDraftText;

    public void verifyOverDraftText(String txt) {
        Reporter.addStepLog(" Verifying the text: " + txt + " is displayed on overdraft page " + _overDraftText.toString());
        verifyTextAssertMethod(_overDraftText, txt);
        log.info(" Verifying the text: " + txt + " is displayed on overdraft page " + _overDraftText.toString());
    }

}
