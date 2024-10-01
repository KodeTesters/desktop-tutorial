package Pages;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;

public class RegistrationPage extends DriverFactory {

    String expectedTooltip="Please fill out this field";
    public void open_ds_algo() {

        driver.get("https://dsportalapp.herokuapp.com/");
    }
    public void click_getstart() {
        WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
        getstart.click();
    }
    public String gettitle()
    {
        String title=driver.getTitle();
        return title;
    }
    public void register() {
        WebElement register=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
        register.click();
    }
    public void click_empty_regiterform() throws IOException {
        //Actions actions=new Actions(driver);
        WebElement register1=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));

        register1.click();
//	    WebElement activeElement = driver.switchTo().activeElement();
//	    String messageStr = activeElement.getAttribute("validationMessage");
//	    System.out.println("Actual message appeared on screen: " + messageStr);
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File source=screenshot.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\barie\\IdeaProjects\\desktop-tutorial\\Screenshots\\empty_register_form.png");
        FileHandler.copy(source,destination);
    }
    public void user_in_registerpage() {
        driver.get("https://dsportalapp.herokuapp.com/");
        WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
        getstart.click();
        WebElement register=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
        register.click();
    }
    public void click_registerlink_with_username_otherfield_empty(String name) throws Exception {
        WebElement usname=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
        usname.sendKeys(name);
        WebElement register2=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
        register2.click();
        WebElement activeElement = driver.switchTo().activeElement();
        String messageStr = activeElement.getAttribute("validationMessage");
        System.out.println("Actual message appeared on screen: " + messageStr);
        TakesScreenshot screenshot=(TakesScreenshot) driver;

        File source=screenshot.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\barie\\IdeaProjects\\desktop-tutorial\\Screenshots\\please_fill_out.png");
        FileHandler.copy(source,destination);
    }
    public void click_with_username_password(DataTable dataTable ) {
        List<List<String>> credentials=dataTable.cells();
        WebElement username1=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
        username1.sendKeys(credentials.get(0).get(0));
        WebElement passwrd1=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
        passwrd1.sendKeys(credentials.get(0).get(1));
        WebElement regis=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
        regis.click();
        WebElement activeElement = driver.switchTo().activeElement();
        String messageStr = activeElement.getAttribute("validationMessage");
        System.out.println("Actual message appeared on screen: " + messageStr);
        username1.clear();
        passwrd1.clear();
    }
    public void click_register_with_different_password_in_confirmationfield(DataTable dataTable) throws Exception {
        List<List<String>> credentials=dataTable.cells();
        WebElement username2=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
        username2.sendKeys(credentials.get(0).get(0));
        WebElement passwrd2=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
        passwrd2.sendKeys(credentials.get(0).get(1));
        WebElement pasconfrm=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
        pasconfrm.sendKeys(credentials.get(0).get(2));
        WebElement register3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
        register3.click();
        WebElement activeElement = driver.switchTo().activeElement();
        String messageStr = activeElement.getAttribute("validationMessage");
        System.out.println("Actual message appeared on screen: " + messageStr);
        TakesScreenshot screenshot=(TakesScreenshot) driver;

        File source=screenshot.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\barie\\IdeaProjects\\desktop-tutorial\\Screenshots\\password_mismatch.png");
        FileHandler.copy(source,destination);
    }
    public void error_message() {
        WebElement errormsg=driver.findElement(By.xpath("/html/body/div[3]"));
        String error=errormsg.getText();
        System.out.println("errormsg is" + error);
    }
    public void user_enter_password_less_than_eight_character()
    {
        WebElement uname1=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
        uname1.sendKeys("kodetesters");
        WebElement pwrd=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
        pwrd.sendKeys("kode");
        WebElement pconfrm=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
        pconfrm.sendKeys("kode");
        WebElement regis=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
        regis.click();
    }




}
