package Runner;

import driverFactory.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;
import utilities.LoggerLoad;


@CucumberOptions(plugin = { "pretty","json:target/target/Cucumber.json",
        "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "pretty","html:target/dsAlgoReport.html"}, // reporting purpose
        monochrome = true, // console output
        tags = "", // tags from feature file
        features = { "src/test/resources/features" }, // location of feature files
        glue = { "Stepdefinition","Hooks" }) // location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {

                return super.scenarios();
        }
        public	static WebDriver driver;
        //@Optional("firefox")
        private static DriverFactory driverfactory;

        @BeforeTest
        @Parameters({"browser"})
       public void defineBrowser(@Optional("firefox") String browser) throws Throwable {
                System.out.println("Browser is"+browser);
                ConfigReader.setBrowserType(browser);
                LoggerLoad.info("Initializing driver for : "+browser);
        }

}
