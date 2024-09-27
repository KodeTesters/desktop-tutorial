package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class GraphsPage extends DriverFactory {

    public void user_click_to_login() {
        getdriver().get("https://dsportalapp.herokuapp.com/");

        getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
        getdriver().findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
        getdriver().findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("bitbuddies");
        getdriver().findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("buddies@123");
        getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
    }
    public void getstart() {
        getdriver().findElement(By.xpath("/html/body/div[3]/div[7]/div/div/a")).click();
    }
    public void dropdown_graph()
    {
        By datastruct_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
        getdriver().findElement(datastruct_dd).click();
        By graph_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]");
        getdriver().findElement(graph_dd).click();
    }
    public void clickgraph() {
        WebElement click_graph=getdriver().findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
        LoggerLoad.info("click " + click_graph.getText() + " link");
        click_graph.click();
    }
    //@trybutton
    public void tryhere() {
        WebElement tryhere=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
        LoggerLoad.info("click on" + tryhere.getText()+"button");
        tryhere.click();
    }
    public void code_to_tryeditor(String validcode) {
        WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
        LoggerLoad.info("Enter valid code " + editbox.getText() + " on Try Editor Page");
        editbox.sendKeys(validcode);
        editbox.sendKeys(Keys.ENTER);
    }
    public void run_button() {
        WebElement run=getdriver().findElement(By.xpath("/html/body/div/div/form/button"));
        LoggerLoad.info("click " + run.getText() + " on try editor page");
        run.click();
    }
    public void code_execution() {
        String result=getdriver().findElement(By.xpath("//*[@id=\"output\"]")).getText();
        System.out.println("  valid code  " +  result);
        getdriver().navigate().back();
        WebElement tryhere=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
        tryhere.click();
    }

    public void editor_txtarea_validcode(String validcode)
    {
//		By editor_text=By.xpath("/html/body/div/div/form/div/div/div[1]/textarea");
//		JavascriptExecutor executor = (JavascriptExecutor) getdriver();
//	    executor.executeScript("document.getdriver().findElement(editor_text).value='validpythoncode';");
        WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
        LoggerLoad.info("Enter valid code " + editbox.getText() + " on Try Editor Page");
        editbox.sendKeys(validcode);
        editbox.sendKeys(Keys.ENTER);

    }
    public void get_url()
    {
        String get_url=getdriver().getCurrentUrl();
        System.out.println("Url of tryeditor page"+ get_url );
    }
    //public void enterPythoncode(String )

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

    public void alert_alert_error() {
        String alert=getdriver().switchTo().alert().getText();
        getdriver().switchTo().alert().accept();
        System.out.println("The error message in the alert box: " + alert);
    }
    //@reprensentation
    public void navi_graph() {
        getdriver().navigate().to("https://dsportalapp.herokuapp.com/graph/graph/");
    }
    public void click_graphicalrepresent() {
        WebElement graphicalrep=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[1]/div/li[2]/a"));
        LoggerLoad.info("click " + graphicalrep.getText() + " on Graph page");
        graphicalrep.click();

    }
    public void practice_questions()
    {
        By arrays_Practice=By.xpath("//a[contains(text(),'Practice Questions')]");
        LoggerLoad.info("click " + driver.findElement(arrays_Practice).getText() + " on Graph page");
        getdriver().findElement(arrays_Practice).click();
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " on Graph page");
        getdriver().findElement(signout_lnk).click();
    }
}

