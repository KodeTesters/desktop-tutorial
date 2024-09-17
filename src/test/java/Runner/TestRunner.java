package Runner;


import driverFactory.DriverFactory;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"Stepdefinition", "Hooks","Pages","driverFactory" },    // Packages containing step definitions and hooks
        tags = " ", // tags to run specific features
        plugin = {"pretty", "html:target/dsAlgoReport.html"}, // Reporting purposes
        monochrome = true // Makes the console output more readable
         )
public class TestRunner {

}
