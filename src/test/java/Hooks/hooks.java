package Hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.LoggerLoad;

public class hooks extends DriverFactory {
   // public static WebDriver driver;
    private static DriverFactory driverfactory;
    //static Scenario scenario;

    @Before

    public void scenario(Scenario scenario) {
       driverfactory = new DriverFactory();
       driver = driverfactory.initializeDrivers("chrome");
        LoggerLoad .info("===============================================================================================");
        LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
        LoggerLoad.info("-----------------------------------------------------------------------------------------------");

    }

    @AfterStep
    public void afterstep(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) getdriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }
        @After
        public static void after() {
            //driverfactory = new DriverFactory();
            LoggerLoad.info("Closing Driver");
            DriverFactory.closeallDriver();
        }

        }
        
