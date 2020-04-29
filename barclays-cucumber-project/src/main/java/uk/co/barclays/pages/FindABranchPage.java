package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class FindABranchPage extends Utility {

    private static final Logger log = LogManager.getLogger(FindABranchPage.class.getName());

    @FindBy(id = "location")
    WebElement _searchBar;

    @FindBy(xpath = "//div[@id='search-area']//div[2]//div[1]//input[1]")
    WebElement _searchButton;

    @FindBy(xpath = "//span[contains(text(),'Watford')]")
    WebElement _searchResult;

//    @FindBy(xpath = "//li[@class='resultsItem']//span[2]")
//    WebElement _searchResult;


    public void enterBranchName(String text) {
        Reporter.addStepLog(" Entering the branch name: " + text + " in the search Bar " + _searchBar.toString());
        sendTextToElement(_searchBar, text);
        log.info(" Entering the branch name: " + text + " in the search Bar " + _searchBar.toString());
    }

    public void verifyTheSearchResults(String text) {
        Reporter.addStepLog(" Verifying: " + text + " displayed in the search results " + _searchResult.toString());
        verifyTextAssertMethod(_searchResult,text);
//        verifyTextAssertTrueContainsMethod(_searchResult, text);
        log.info(" Verifying: " + text + " displayed in the search results " + _searchResult.toString());
    }

    public void clickOnSearchButton() {
        Reporter.addStepLog(" Clicking on the search button " + _searchButton.toString());
        clickOnElement(_searchButton);
        log.info(" Clicking on the search button " + _searchButton.toString());
    }

}
