package Pages;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import driverFactory.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends DriverFactory {
    // Create a common wait method
    private WebDriverWait getWait() {
        return new WebDriverWait(getdriver(), Duration.ofSeconds(10));
    }

    public void open_dsalgo_portal() {
        getdriver().get("https://dsportalapp.herokuapp.com/");
    }
    public void get_start_click() {
        WebDriverWait wait = getWait();
        WebElement getstart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn']")));
        getstart.click();
    }
    public void sign_in_click_link() throws Exception {
        getdriver().get("https://dsportalapp.herokuapp.com/");
        get_start_click();
        WebDriverWait wait = getWait();
        WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign in']")));
        signin.click();

            // Screenshot after clicking sign-in
        takeScreenshot("signin_page.png");
    }
    public void drop_down_click(String menu) throws Exception {
        getdriver().get("https://dsportalapp.herokuapp.com/");
        getdriver().findElement(By.xpath("//button[@class='btn']")).click();
        WebElement dpdw1=getdriver().findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
        dpdw1.click();
        // Screenshot after clicking dropdown
        takeScreenshot("drop_down_options.png");
        switch (menu) {
            case "Arrays":
                WebElement array=getdriver().findElement(By.xpath("//a[contains(text(),'Arrays')]"));
                array.click();
                break;
            case "Linkedlist":
                WebElement linklist=getdriver().findElement(By.xpath("//a[contains(text(),'Linked List')]"));
                linklist.click();

                break;
            case "Stack":
                WebElement stack=getdriver().findElement(By.xpath("//a[contains(text(),'Stack')]"));
                stack.click();

                break;
            case "Queue":
                WebElement queue=getdriver().findElement(By.xpath("//a[contains(text(),'Queue')]"));
                queue.click();

                break;
            case "Tree":
                WebElement tree=getdriver().findElement(By.xpath("//a[contains(text(),'Tree')]"));
                tree.click();

                break;
            case "Graph":
                WebElement graph=getdriver().findElement(By.xpath("//a[contains(text(),'Graph')]"));
                graph.click();

                break;
        }
        //return;
    }
    public void any_get_start() {
        getdriver().get("https://dsportalapp.herokuapp.com/");
        getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
        WebElement anygetstart=getdriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a"));
        anygetstart.click();
    }
    public void screen_shot_not_logged_in() throws Exception {
        takeScreenshot("not_loggedin.png");
    }
    public void register_click_to_register_form() {
        getdriver().get("https://dsportalapp.herokuapp.com/");
        get_start_click();
        //Given user is on Home Page
        WebElement register = getdriver().findElement(By.xpath("//a[@href ='/register']"));
        register.click();
        // Click on the register link
        getdriver().getCurrentUrl();
    }
    public void screen_shot_of_register_form() throws Exception {
        takeScreenshot("registerform.png");
    }

    // Method to take screenshots and save to a relative path
    private void takeScreenshot(String fileName) throws Exception {
        TakesScreenshot screenshot = (TakesScreenshot) getdriver();
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + fileName;
        File destination = new File(screenshotPath);
        FileHandler.copy(source, destination);
    }
}