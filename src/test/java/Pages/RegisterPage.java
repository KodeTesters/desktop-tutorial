package Pages;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RegisterPage extends DriverFactory {

    // Open the application
    public void open_ds_algo() {
        getdriver().get("https://dsportalapp.herokuapp.com/");
    }

    // Click the 'Get Started' button
    public void click_getstart() {
        WebElement getstart = getdriver().findElement(By.xpath("//a/button[text()='Get Started']"));
        getstart.click();
    }

    // Click on the 'Register' link
    public void register() {
        WebElement register = getdriver().findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
        register.click();
    }

    // Submit empty register form and take screenshot
    public void click_empty_register_form() throws IOException {
        WebElement registerBtn = getRegisterButton();
        registerBtn.click();
        takeScreenshot("empty_register_form.png");
    }

    // Open the register page directly
    public void user_in_registerpage() {
        open_ds_algo();
        click_getstart();
        register();
    }

    // Fill only username and leave other fields empty, then click register and take screenshot
    public void click_registerlink_with_username_otherfield_empty(String name) throws Exception {
        WebElement usrname = driver.findElement(By.xpath("//*[@id='id_username']"));
        usrname.sendKeys(name);
        WebElement register2 = getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
        register2.click();

        WebElement activeElement = getdriver().switchTo().activeElement();
        String messageStr = activeElement.getAttribute("validationMessage");
        System.out.println("Actual message appeared on screen: " + messageStr);

        takeScreenshot("please_fill_out.png");
    }

    // Register with username and password from DataTable
    public void click_with_username_password(DataTable dataTable) {
        List<List<String>> credentials=dataTable.cells();
        WebElement username1=getdriver().findElement(By.xpath("//*[@id=\"id_username\"]"));
        username1.sendKeys(credentials.get(0).get(0));
        WebElement passwrd1=getdriver().findElement(By.xpath("//*[@id=\"id_password1\"]"));
        passwrd1.sendKeys(credentials.get(0).get(1));
        WebElement regis=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
        regis.click();
        WebElement activeElement = getdriver().switchTo().activeElement();
        String messageStr = activeElement.getAttribute("validationMessage");
        System.out.println("Actual message appeared on screen: " + messageStr);
        username1.clear();
        passwrd1.clear();
    }

    // Register with mismatching passwords and take screenshot
    public void click_register_with_different_password_in_confirmationfield(DataTable dataTable) throws Exception {
        List<List<String>> credentials = dataTable.asLists(String.class);
        WebElement username = driver.findElement(By.xpath("//*[@id='id_username']"));
        username.sendKeys(credentials.get(0).get(0));
        WebElement password = driver.findElement(By.xpath("//*[@id='id_password1']"));
        password.sendKeys(credentials.get(0).get(1));
//        WebElement confirmPassword = driver.findElement(By.xpath("//*[@id='id_password2']"));
//        confirmPassword.sendKeys(credentials.get(0).get(2));

        WebElement registerBtn = getRegisterButton();
        registerBtn.click();

        WebElement activeElement = getdriver().switchTo().activeElement();
        String messageStr = activeElement.getAttribute("validationMessage");
        System.out.println("Actual message appeared on screen: " + messageStr);

        takeScreenshot("password_mismatch.png");
    }

    // Capture error message and print it
    public void error_message() {
        //WebElement errorMsg = getdriver().findElement(By.xpath("//*[@id='id_password2']/following-sibling::small"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='id_password1']"));
        String validationMessage = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;", passwordField);
        System.out.println("Validation message: " + validationMessage);

//        String message = errorMsg.getText();
//        System.out.println("Error message displayed: " + message);
    }

    // Enter password with less than eight characters
    public void user_enter_password_less_than_eight_character() {
        WebElement username = driver.findElement(By.xpath("//*[@id='id_username']"));
        username.sendKeys("bitbudd");
        WebElement password = driver.findElement(By.xpath("//*[@id='id_password1']"));
        password.sendKeys("budd");
        WebElement confirmPassword = driver.findElement(By.xpath("//*[@id='id_password2']"));
        confirmPassword.sendKeys("budd");

        WebElement registerBtn = getRegisterButton();
        registerBtn.click();
    }

    // Utility to take screenshot
    public void takeScreenshot(String filename) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) getdriver();
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\barie\\IdeaProjects\\desktop-tutorial\\Screenshots\\" + filename);
        FileHandler.copy(source, destination);
    }

    // Common method to get the Register button
    public WebElement getRegisterButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
    }
}
