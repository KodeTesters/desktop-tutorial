package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class QueuePage extends DriverFactory {
    public void signin_page()
    {
        driver.get(" https://dsportalapp.herokuapp.com/home/");
        //By getstarted=By.xpath(")
        By signin_link=By.xpath("//*[@id='navbarCollapse']/div[2]/ul/a[3]");
        driver.findElement(signin_link).click();
    }
    public void valid_username_password(String username,String password)
    {
        By username_txtbox=By.xpath("//*[@id='id_username']");
        By password_txtbox=By.id("id_password");
        driver.findElement(username_txtbox).sendKeys(username);
        driver.findElement(password_txtbox).sendKeys(password);

    }
    public void login_button()
    {
        By loginbtn=By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
        driver.findElement(loginbtn).click();
    }
    public void homepage_url()
    {
        String home_url=driver.getCurrentUrl();
        System.out.println("Url of home page"+ home_url);
    }
    public void getstarted_queue()
    {
        By gsqueuebtn=By.xpath("//a[@href='queue']");
        driver.findElement(gsqueuebtn).click();
    }
    public void dropdown_queue()
    {
        By datastruct_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
        driver.findElement(datastruct_dd).click();
        By queue_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]");
        driver.findElement(queue_dd).click();
    }
    public void get_url()
    {
        String get_url=driver.getCurrentUrl();
        System.out.println("Url of array page"+ get_url);
    }
    public void tryeditor_page()
    {
        driver.get("https://dsportalapp.herokuapp.com/tryEditor");
    }
    public void tryhere()
    {
        //Actions actions=new Actions(driver);
        By tryherebtn=By.xpath("/html/body/div[2]/div/div[2]/a");
        LoggerLoad.info("click on" + driver.findElement(tryherebtn).getText()+"button");
        driver.findElement(tryherebtn).click();
        //actions.scrollToElement(driver.findElement(tryherebtn)).click(driver.findElement(tryherebtn)).perform();
    }
    //			public void tryEditor()
//			{
//				By editor_box=By.xpath("//*[@id='answer_form']");
//				  driver.findElement(editor_box).click();
//			}
    public void editor_txtarea_validcode(String validcode)
    {
//				By editor_text=By.xpath("/html/body/div/div/form/div/div/div[1]/textarea");
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//			    executor.executeScript("document.driver.findElement(editor_text).value='validpythoncode';");
        WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
        LoggerLoad.info("Enter valid code " + editbox.getText() + " on Try Editor Page");
        editbox.sendKeys(validcode);
        editbox.sendKeys(Keys.ENTER);

    }
    public void tryEditor_url()
    {
        String tryEditor_url=driver.getCurrentUrl();
        System.out.println("Url of tryeditor page"+ tryEditor_url );
    }
    //public void enterPythoncode(String )
    public void run_button()
    {
        By runbtn=By.xpath("/html/body/div/div/form/button");
        LoggerLoad.info("click " + driver.findElement(runbtn).getText() + " on try editor page");
        driver.findElement(runbtn).click();
    }
    public String output_display()
    {
        By result=By.xpath("//*[@id=\"output\"]");
        String res= driver.findElement(result).getText();
        return res;
    }
    public void invalid_code(String invalidcode)
    {
        driver.get("https://dsportalapp.herokuapp.com/tryEditor");
        WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
        LoggerLoad.info("Enter invalid code " + editbox.getText() + " on Try Editor Page");
        editbox.sendKeys(invalidcode);

        //editbox.sendKeys(Keys.ENTER);
    }

    public String alert_wrongcode()
    {
        String alertmsg=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertmsg;

    }
    public String gettitle()
    {
        String title=driver.getTitle();
        return title;
    }
    public void revertback()
    {
        driver.navigate().back();
    }
    public void implementation_of_queue()
    {
        By implementationqueue_lnk=By.xpath("/html/body/div[2]/ul[1]/a");
        LoggerLoad.info("click " + driver.findElement(implementationqueue_lnk).getText() + " on Queue page");
        driver.findElement(implementationqueue_lnk).click();
    }
    public void implementation_using_collections()
    {
        By implementationcollec_lnk=By.xpath("//*[@id=\"content\"]/li[2]/a");
        LoggerLoad.info("click " + driver.findElement(implementationcollec_lnk).getText() + " on Queue page");
        driver.findElement(implementationcollec_lnk).click();
    }
    public void implementation_using_array()
    {
        By implementationarray_lnk=By.xpath("//*[@id=\"content\"]/li[3]/a");
        LoggerLoad.info("click " + driver.findElement(implementationarray_lnk).getText() + " on Queue page");
        driver.findElement(implementationarray_lnk).click();
    }
    public void queue_op()
    {
        By queueOp_lnk=By.xpath("//*[@id=\"content\"]/li[4]/a");
        LoggerLoad.info("click " + driver.findElement(queueOp_lnk).getText() + " on Queue page");
        driver.findElement(queueOp_lnk).click();
    }
    public void practice_questions()
    {
        By arrays_Practice=By.xpath("//a[contains(text(),'Practice Questions')]");
        LoggerLoad.info("click " + driver.findElement(arrays_Practice).getText() + " on Queue page");
        driver.findElement(arrays_Practice).click();
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
        driver.findElement(signout_lnk).click();
    }

}