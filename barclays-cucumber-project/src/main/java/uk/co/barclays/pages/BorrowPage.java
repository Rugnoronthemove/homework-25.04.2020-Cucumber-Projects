package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class BorrowPage extends Utility {

    private static final Logger log = LogManager.getLogger(BorrowPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Barclays Overdraft')]")
    WebElement _overDraftLink;


    public void clickOnOverDraftLink() {
        Reporter.addStepLog(" Clicking on the overdraft link on Borrow page " + _overDraftLink.toString());
        clickOnElement(_overDraftLink);
        log.info(" Clicking on the overdraft link on Borrow page " + _overDraftLink.toString());
    }

}
