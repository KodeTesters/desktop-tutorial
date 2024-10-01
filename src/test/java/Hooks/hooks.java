package Hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.LoggerLoad;

import java.io.ByteArrayInputStream;
import java.util.Properties;

public class hooks extends DriverFactory {
    public static WebDriver driver;
    static ConfigReader configReader;
    static DriverFactory driverfactory;
    static Scenario scenario;
    static Properties prop;
    //	@BeforeAll
//	public void getPropertyValues() throws IOException
//	{
//		configReader=new ConfigReader();
//		prop= configReader.initializedProperties();
//	}

    @BeforeAll
    public static void before() throws Throwable {
        //Get browser Type from config file
        LoggerLoad.info("Loading Config file");
        //ConfigReader.initializedProperties();
        configReader=new ConfigReader();
        prop= configReader.initializedProperties();
        String browser = ConfigReader.getBrowserType();

        //Initialize driver from driver factory
        driverfactory = new DriverFactory();
        driver = driverfactory.initializeBrowser(browser);
        LoggerLoad.info("Initializing driver for : "+browser);

    }

    @Before
    public void scenario(Scenario scenario) {
        // driver = initializeBrowser("chrome");
        LoggerLoad.info("===============================================================================================");
        LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
        LoggerLoad.info("-----------------------------------------------------------------------------------------------");

    }

    @AfterStep
    public void afterstep(Scenario scenario) {
        if (scenario.isFailed()) {
            LoggerLoad.error("Steps Failed , Taking Screenshot");
            final byte[] screenshot = ((TakesScreenshot) getdriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
            Allure.addAttachment("Myscreenshot",
                    new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }
    @AfterAll
    public static void after() {
        driverfactory= new DriverFactory();
        LoggerLoad.info("Closing Driver");
        driverfactory.closeallDriver();
        driver.quit();
    }

}
