package com.orangehrmlive.demo.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //feature file path
        features = ".",
        //creates Jason report                      // creates cucumber defualt report          //creates cucumber extent report
        plugin = {"json:target/RunCuke/cucumber.json","pretty","html:target/cucumber-report/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        monochrome = true
)
public class CukeTest {
    //configuration for junit setup
    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        //generates Extent report in the given path
        String reportConfigPath = projectPath + "/src/test/java/com/orangehrmlive/demo/resources/extentreport/extent-config.xml";
        //using the Reporter from cucumber.Listener
        Reporter.loadXMLConfig(reportConfigPath);
        //The below code generates details of environment information  //System.getProperty gets system name & system timezone
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }

}