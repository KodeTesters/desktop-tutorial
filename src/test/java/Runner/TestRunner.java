package Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driverFactory.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.LoggerLoad;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/target/Cucumber.json",

                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:MyTestSuite",
                "html:target/dsAlgoReport.html" }, // reporting purpose
                name = { "MyTestSuite" }, // name of the test
                monochrome = false, // console output
                tags = "@DataStructureFeature", // tags from feature file
                features = { "src/test/resources/features" }, // location of feature files
                glue = { "stepDefinitions", "pageObjects", "driverFactory", "hooks" }) // location of step definition
                                                                                       // files

public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
                return super.scenarios();
        }

        
        public   WebDriver driver;
        private static DriverFactory driverfactory;
        
        @BeforeTest
        @Parameters({ "browser" })
        public void defineBrowser(@Optional ("firefox") String browser) throws Throwable {
                System.out.println("Browser is" + browser);
                driverfactory = new DriverFactory();
                driver = driverfactory.initializeDrivers(browser);
                LoggerLoad.info("Initializing driver for : " + browser);
        }
}
