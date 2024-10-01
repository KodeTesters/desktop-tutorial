package Pages;

import driverFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilities.LoggerLoad;

public class ArrayPage extends DriverFactory {
    public void signin_page()
    {
        driver.get(" https://dsportalapp.herokuapp.com/home/");
        //By getstarted=By.xpath(")
        By signin_link=By.xpath("//*[@id='navbarCollapse']/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signin_link).getText() + " on home page");
        driver.findElement(signin_link).click();
    }
    public void valid_username_password(String username,String password)
    {
        By username_txtbox=By.xpath("//*[@id='id_username']");
        By password_txtbox=By.id("id_password");
        LoggerLoad.info("Send username " + driver.findElement(username_txtbox).getText() + " on signin page");
        LoggerLoad.info("Send password " + driver.findElement(password_txtbox).getText() + " on Signin page");
        driver.findElement(username_txtbox).sendKeys(username);
        driver.findElement(password_txtbox).sendKeys(password);

    }
    public void login_button()
    {
        By loginbtn=By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
        LoggerLoad.info("click " + driver.findElement(loginbtn).getText() + " on Signin page");
        driver.findElement(loginbtn).click();
    }
    public void homepage_url()
    {
        String home_url=driver.getCurrentUrl();
        System.out.println("Url of home page"+ home_url);
        LoggerLoad.info("title of page " + driver.getTitle() + " on home page");
    }
    public void getstarted_array()
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //Actions action=new Actions(driver);
        By array_page= By.xpath("/html/body/div[2]/div[2]/div/div/a");
        executor.executeScript("arguments[0].click();",driver.findElement(array_page));
        //driver.findElement(array_page).click();
        //action.scrollToElement(driver.findElement(array_page)).click(driver.findElement(array_page)).perform();
    }

    public void dropdown_array()
    {
        By datastruct_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
        driver.findElement(datastruct_dd).click();
        By array_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]");
        driver.findElement(array_dd).click();
    }
    public void get_url()
    {
        String get_url=driver.getCurrentUrl();
        System.out.println("Url of array page"+ get_url);
    }
    public void array_page()
    {
        driver.get("https://dsportalapp.herokuapp.com/array/");
    }
    public void array_python_page()
    {
        String arrtitle=driver.getCurrentUrl();
        System.out.println("Current title"+ arrtitle);
    }
    public void tryeditor_page()
    {
        driver.get("https://dsportalapp.herokuapp.com/tryEditor");
    }

    public void arrays_on_python_link()
    {
        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        //Actions action=new Actions(driver);
        By arrays_in_python=By.xpath("/html/body/div[2]/ul[1]/a");
        LoggerLoad.info("click " + driver.findElement(arrays_in_python).getText() + " on array page");
        driver.findElement(arrays_in_python).click();
        // action.scrollToElement(driver.findElement(arrays_in_python)).click(driver.findElement(arrays_in_python)).perform();
        //executor.executeScript("arguments[0].click();",driver.findElement(arrays_in_python));

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
//				  getdriver().findElement(editor_box).click();
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
    public void arrays_using_list()
    {
        By arrays_listlink=By.xpath("//*[@id=\"content\"]/li[2]/a");
        LoggerLoad.info("click " + driver.findElement(arrays_listlink).getText() + " on array page");
        driver.findElement(arrays_listlink).click();
    }
    public void basic_operations()
    {
        By arrays_basicop=By.xpath("//*[@id=\"content\"]/li[3]/a");
        LoggerLoad.info("click " + driver.findElement(arrays_basicop).getText() + " on array page");
        driver.findElement(arrays_basicop).click();
    }
    public void applications_of_array()
    {
        By arrays_applications=By.xpath("//*[@id=\"content\"]/li[4]/a");
        LoggerLoad.info("click " + driver.findElement(arrays_applications).getText() + " on array page");
        driver.findElement(arrays_applications).click();
    }
    public void practice_questions()
    {
        By arrays_Practice=By.xpath("//a[contains(text(),'Practice Questions')]");
        LoggerLoad.info("click " + driver.findElement(arrays_Practice).getText() + " on array page");
        driver.findElement(arrays_Practice).click();
    }
    public void practice_page()
    {
        driver.get("https://dsportalapp.herokuapp.com/array/practice");
    }
    public void search_the_array()
    {
        By arr_practice_search=By.xpath("/html/body/div[2]/a");
        LoggerLoad.info("click " + driver.findElement(arr_practice_search).getText() + " on practice page");
        driver.findElement(arr_practice_search).click();
    }
    public String run_result()
    {
        By runresult=By.xpath("/html/body/div/div[2]/div");
        String output=driver.findElement(runresult).getText();
        return output;
    }
    public void submitbtn()
    {
        By submit_btn=By.xpath("//*[@class='button']");
        LoggerLoad.info("click " + driver.findElement(submit_btn).getText() + " button");
        driver.findElement(submit_btn).click();
    }

    public void maxConsecOnes()
    {
        By arr_max=By.xpath("/html/body/div[3]/a");
        LoggerLoad.info("click " + driver.findElement(arr_max).getText() + " on practice page");
        driver.findElement(arr_max).click();
    }
    public void findnumbers()
    {
        By arr_findNum=By.xpath("/html/body/div[4]/a");
        LoggerLoad.info("click " + driver.findElement(arr_findNum).getText() + " on practice page");
        driver.findElement(arr_findNum).click();
    }
    public void squaresSortedArray()
    {
        By arr_squares=By.xpath("/html/body/div[5]/a");
        LoggerLoad.info("click " + driver.findElement(arr_squares).getText() + " on practice page");
        driver.findElement(arr_squares).click();
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
        driver.findElement(signout_lnk).click();
    }

}
