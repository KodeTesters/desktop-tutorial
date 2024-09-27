package driverFactory;

import java.time.Duration;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

@Slf4j
public class DriverFactory {
    public	static WebDriver driver;
    public static WebDriver initializeDrivers(String browser)
    {
        LoggerLoad.info("Initializing driver for --------------------------------- : "+browser);
        if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("safari")) {

            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

        driver.manage().window().maximize();

        driver.get("https://dsportalapp.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        return driver;
    }

   

    public static WebDriver getdriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        } else {
            return driver;

        }
    }

    public static void closeallDriver() {
        driver.close();
        driver.quit();
    }
}