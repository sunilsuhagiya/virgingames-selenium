package com.virgingames.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


// Using @Runwith from junit

@RunWith(Cucumber.class)
@CucumberOptions(
        // Feature file path is from content root
        features = "src/test/java/resources/featurefile",
        // Glue path is from root source for step def
        glue = "com/virgingames",
        // To generate report and path of the file and extend report as well as jason
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"
        }

)

public class VirginGamesRunner {

    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 11" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.9");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}
