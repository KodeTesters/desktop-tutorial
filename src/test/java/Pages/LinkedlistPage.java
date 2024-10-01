package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class LinkedlistPage extends DriverFactory {
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
    public void redirected_to_homepage() {
        driver.get("https://dsportalapp.herokuapp.com/home");
    }
    public void dropdown_linkedlist()
    {
        By datastruct_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
        driver.findElement(datastruct_dd).click();
        By ll_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]");
        driver.findElement(ll_dd).click();
    }

    // @TS_01
    public void getting_started_button_in_linked_list_pane() {
        By getstartedbtn=By.xpath(" /html/body/div[2]/div[3]/div/div/a");
        driver.findElement(getstartedbtn).click();
    }
    public void redirected_to_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
    }

    //@TS_02
    public void clicks_introduction_button() {
        By introbtn=By.xpath("/html/body/div[2]/ul[1]/a");
        LoggerLoad.info("click " + driver.findElement(introbtn).getText() + " on Linked list page");
        driver.findElement(introbtn).click();
    }

    public void directed_to_introduction_of_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");
        System.out.println("The user is landed on : " + driver.getTitle());
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
    public void creating_a_linked_list_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
        By creatingllbtn=By.xpath("/html/body/div[2]/ul[2]/a");
        driver.findElement(creatingllbtn).click();
    }

    public void directed_to_creating_linked_list_of_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //@TS_08

    public void clicks_the_types_of_linked_list_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
        By typesofllbtn=By.xpath("/html/body/div[2]/ul[3]/a");
        LoggerLoad.info("click " + driver.findElement(typesofllbtn).getText() + " on Linked list page");
        driver.findElement(typesofllbtn).click();
    }

    public void directed_to_types_of_linked_list_of_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_11

    public void clicks_the_implement_linked_list_in_python_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
        By implellbtn=By.xpath("/html/body/div[2]/ul[4]/a");
        LoggerLoad.info("click " + driver.findElement(implellbtn).getText() + " on Linked list page");
        driver.findElement(implellbtn).click();
    }

    public void directed_to_implement_linked_list_in_python_of_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_14
    public void clicks_traversal_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
        By traversalbtn=By.xpath("/html/body/div[2]/ul[5]/a");
        LoggerLoad.info("click " + driver.findElement(traversalbtn).getText() + " on Linked list page");
        driver.findElement(traversalbtn).click();
    }
    public void directed_to_traversal_page_of_linked_list() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/traversal/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_17
    public void clicks_insertion_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
        By insertionbtn=By.xpath("/html/body/div[2]/ul[6]/a");
        LoggerLoad.info("click " + driver.findElement(insertionbtn).getText() + " on Linked list page");
        driver.findElement(insertionbtn).click();
    }

    public void directed_to_insertion_of_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }
    //TS_20
    public void clicks_the_deletion_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/");
        By deletionbtn=By.xpath("/html/body/div[2]/ul[7]/a");
        LoggerLoad.info("click " + driver.findElement(deletionbtn).getText() + " on Linked list page");
        driver.findElement(deletionbtn).click();
    }

    public void directed_to_deletion_of_linked_list_page() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_23
    public void clicks_practice_questions_button() {
        driver.get("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
        By practiceq=By.xpath(" /html/body/div[2]/div/div[1]/div/a");
        LoggerLoad.info("click " + driver.findElement(practiceq).getText() + " on Linked list page");
        driver.findElement(practiceq).click();
    }

    public void directed_to_practice_page() {
        driver.get(" https://dsportalapp.herokuapp.com/linked-list/practice");
        System.out.println("The user is landed on : " + driver.getTitle());
        //for signout page
        By signout=By.xpath("  /html/body/div[1]/nav/div/div[2]/ul/a[3]");
        driver.findElement(signout).click();
    }

    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " on Linked list page");
        driver.findElement(signout_lnk).click();
    }



}