package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class QueuePage extends DriverFactory {
    private static final By implementationcollec_lnk = null;
    public void signin_page()
    {
        getdriver().get(" https://dsportalapp.herokuapp.com/home/");
        //By getstarted=By.xpath(")
        By signin_link=By.xpath("//*[@id='navbarCollapse']/div[2]/ul/a[3]");
        getdriver().findElement(signin_link).click();
    }
    public void valid_username_password(String username,String password)
    {
        By username_txtbox=By.xpath("//*[@id='id_username']");
        By password_txtbox=By.id("id_password");
        getdriver().findElement(username_txtbox).sendKeys(username);
        getdriver().findElement(password_txtbox).sendKeys(password);

    }
    public void login_button()
    {
        By loginbtn=By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
        getdriver().findElement(loginbtn).click();
    }
    public void homepage_url()
    {
        String home_url=getdriver().getCurrentUrl();
        System.out.println("Url of home page"+ home_url);
    }
    public void getstarted_queue()
    {
        By gsqueuebtn=By.xpath("//a[@href='queue']");
        getdriver().findElement(gsqueuebtn).click();
    }
    public void dropdown_queue()
    {
        By datastruct_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
        getdriver().findElement(datastruct_dd).click();
        By queue_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]");
        getdriver().findElement(queue_dd).click();
    }
    public void tryhere()
    {
        //Actions actions=new Actions(getdriver());
        By tryherebtn=By.xpath("/html/body/div[2]/div/div[2]/a");
        LoggerLoad.info("click on" + driver.findElement(tryherebtn).getText()+"button");
        getdriver().findElement(tryherebtn).click();
        //actions.scrollToElement(getdriver().findElement(tryherebtn)).click(getdriver().findElement(tryherebtn)).perform();
    }
    //			public void tryEditor()
//			{
//				By editor_box=By.xpath("//*[@id='answer_form']");
//				  getgetdriver()().findElement(editor_box).click();
//			}
    public void editor_txtarea_validcode(String validcode)
    {
//				By editor_text=By.xpath("/html/body/div/div/form/div/div/div[1]/textarea");
//				JavascriptExecutor executor = (JavascriptExecutor) getdriver();
//			    executor.executeScript("document.getdriver().findElement(editor_text).value='validpythoncode';");
        WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
        LoggerLoad.info("Enter valid code " + editbox.getText() + " on Try Editor Page");
        editbox.sendKeys(validcode);
        editbox.sendKeys(Keys.ENTER);

    }
    public void tryEditor_url()
    {
        String tryEditor_url=getdriver().getCurrentUrl();
        System.out.println("Url of tryeditor page"+ tryEditor_url );
    }
    //public void enterPythoncode(String )
    public void run_button()
    {
        By runbtn=By.xpath("/html/body/div/div/form/button");
        LoggerLoad.info("click " + driver.findElement(runbtn).getText() + " on try editor page");
        getdriver().findElement(runbtn).click();
    }
    public String output_display()
    {
        By result=By.xpath("//*[@id=\"output\"]");
        String res= getdriver().findElement(result).getText();
        return res;
    }
    public void invalid_code(String invalidcode)
    {
        driver.get("https://dsportalapp.herokuapp.com/tryEditor");
        WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
        LoggerLoad.info("Enter invalid code " + editbox.getText() + " on Try Editor Page");
        editbox.sendKeys(invalidcode);

        //editbox.sendKeys(Keys.ENTER);
    }

    public String alert_wrongcode()
    {
        String alertmsg=getdriver().switchTo().alert().getText();
        getdriver().switchTo().alert().accept();
        return alertmsg;

    }
    public String gettitle()
    {
        String title=getdriver().getTitle();
        return title;
    }
    public void revertback()
    {
        getdriver().navigate().back();
    }
    public void implementation_of_queue()
    {
        By implementationqueue_lnk=By.xpath("/html/body/div[2]/ul[1]/a");
        LoggerLoad.info("click " + driver.findElement(implementationqueue_lnk).getText() + " on Queue page");
        getdriver().findElement(implementationqueue_lnk).click();
    }
    public void implementation_using_collections()
    {
        By implementationcollec_lnk=By.xpath("//*[@id=\"content\"]/li[2]/a");
        LoggerLoad.info("click " + driver.findElement(implementationcollec_lnk).getText() + " on Queue page");
        getdriver().findElement(implementationcollec_lnk).click();
    }
    public void implementation_using_array()
    {
        By implementationarray_lnk=By.xpath("//*[@id=\"content\"]/li[3]/a");
        LoggerLoad.info("click " + driver.findElement(implementationarray_lnk).getText() + " on Queue page");
        getdriver().findElement(implementationarray_lnk).click();
    }
    public void queue_op()
    {
        By queueOp_lnk=By.xpath("//*[@id=\"content\"]/li[4]/a");
        LoggerLoad.info("click " + driver.findElement(queueOp_lnk).getText() + " on Queue page");
        getdriver().findElement(queueOp_lnk).click();
    }
    public void practice_questions()
    {
        By arrays_Practice=By.xpath("//a[contains(text(),'Practice Questions')]");
        LoggerLoad.info("click " + driver.findElement(arrays_Practice).getText() + " on Queue page");
        getdriver().findElement(arrays_Practice).click();
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
        getdriver().findElement(signout_lnk).click();
    }
}