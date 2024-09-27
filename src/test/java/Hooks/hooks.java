package Hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.LoggerLoad;

import java.io.ByteArrayInputStream;

public class hooks extends DriverFactory {
//
//    @BeforeAll
//    public static void before() throws Throwable {
//        LoggerLoad.info("Loading Config file");
//        ConfigReader.getProperties();
//        String browser = ConfigReader.getBrowserType();
//        driver = initializeDrivers(browser);
//        LoggerLoad.info("Initializing driver for : "+browser);
//    }

    @Before
    public void scenario(Scenario scenario) {

        // driver = initializeDrivers("chrome");
        LoggerLoad.info("===============================================================================================");
        LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
        LoggerLoad.info("-----------------------------------------------------------------------------------------------");

    }

    @AfterStep
    public void afterstep(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) getdriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
            Allure.addAttachment("Myscreenshot",
                    new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }
    @After
    public static void after() {

        LoggerLoad.info("Closing Driver");
        DriverFactory.closeallDriver();
    }

}
