package uk.gov.harrow.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.gov.harrow.basepage.BasePage;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.loadproperty.LoadProperty;
import uk.gov.harrow.utility.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //assigns Author name in extents report
        Reporter.assignAuthor("Harrow","GroupStudy");
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }

}
