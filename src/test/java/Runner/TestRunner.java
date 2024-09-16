package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "Stepdefinition", // Path to your step definitions (package name)
        plugin = {"pretty", "Html:target/dsAlgoReport.html"}, // Reporting purposes
        monochrome = true // Makes the console output more readable

)
public class TestRunner  {
    // No additional code needed
}
