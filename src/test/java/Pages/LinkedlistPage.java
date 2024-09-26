package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class LinkedlistPage extends DriverFactory {


    //@TS_Linkedlist
    public void signin_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/home");
        //   By getstartedbtn=By.xpath("//*[@class='btn']");
        // By getstartedbtn=By.xpath("//*[@class='btn']");)
        //  getdriver().findElement(getstartedbtn).click();
        By signinbtn=By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[3]");
        getdriver().findElement(signinbtn).click();
    }

    public void valid_username_password(String username, String password) {
        By usernamebtn=By.xpath("//*[@id=\"id_username\"]");
        By passwrdbtn=By.xpath("//*[@id=\"id_password\"]");
        getdriver().findElement(usernamebtn).sendKeys(username);
        getdriver().findElement(passwrdbtn).sendKeys(password);
    }

    public void login_button() {
        By loginbtn=By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
        getdriver().findElement(loginbtn).click();
    }
    public void redirected_to_homepage() {
        getdriver().get("https://dsportalapp.herokuapp.com/home");
    }
    public void dropdown_linkedlist()
    {
        By datastruct_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
        getdriver().findElement(datastruct_dd).click();
        By ll_dd=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]");
        getdriver().findElement(ll_dd).click();
    }

    // @TS_01
    public void getting_started_button_in_linked_list_pane() {
        By getstartedbtn=By.xpath(" /html/body/div[2]/div[3]/div/div/a");
        getdriver().findElement(getstartedbtn).click();
    }
    public void redirected_to_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
    }

    //@TS_02
    public void clicks_introduction_button() {
        By introbtn=By.xpath("/html/body/div[2]/ul[1]/a");
        LoggerLoad.info("click " + driver.findElement(introbtn).getText() + " on Linked list page");
        getdriver().findElement(introbtn).click();
    }

    public void directed_to_introduction_of_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/introduction/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }
    public void tryhere()
    {
        //Actions actions=new Actions(getdriver());
        By tryherebtn=By.xpath("/html/body/div[2]/div/div[2]/a");
        LoggerLoad.info("click on" + driver.findElement(tryherebtn).getText()+"button");
        getdriver().findElement(tryherebtn).click();
        //actions.scrollToElement(getdriver().findElement(tryherebtn)).click(getdriver().findElement(tryherebtn)).perform();
    }
    //		public void tryEditor()
//		{
//			By editor_box=By.xpath("//*[@id='answer_form']");
//			  getdriver().findElement(editor_box).click();
//		}
    public void editor_txtarea_validcode(String validcode)
    {
//			By editor_text=By.xpath("/html/body/div/div/form/div/div/div[1]/textarea");
//			JavascriptExecutor executor = (JavascriptExecutor) getdriver();
//		    executor.executeScript("document.getdriver().findElement(editor_text).value='validpythoncode';");
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

    //TS_03
    public void clicks_try_here_button_of_the_introduction_page() {
        By tryherebtn=By.xpath("/html/body/div[2]/div/div[2]/a");
        getdriver().findElement(tryherebtn).click();
    }

    public void redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
        getdriver().get("https://dsportalapp.herokuapp.com/tryEditor");
    }

    ////TS_04 ,@TS_07,@TS_10,TS_13,TS_16,TS_19,@TS_22
    public void valid_python_code_in_try_editor_from_data(String validpythoncode) {
        By editorbox=By.xpath("//*[@class='CodeMirror-scroll']");
        // /html/body/div/div/form/div/div/div[1]/textarea
        WebElement multivalues = getdriver().findElement(editorbox);
        multivalues.sendKeys(validpythoncode);
        multivalues.sendKeys(Keys.ENTER);
    }

    public void click_on_run_button() {
        By runbtn=By.xpath("/html/body/div/div/form/button");
        getdriver().findElement(runbtn).click();
    }

    public void should_be_presented_with_the_run() {
        By result=By.xpath("//*[@id=\"output\"]");
        String res= getdriver().findElement(result).getText();
        System.out.println("The result for the valid python code:  " + res );
    }

    public void invalid_python_code_in_try_editor_from_sheet(String invalidpythoncode) {
        By editorbox=By.xpath("/html/body/div/div/form/div/div/div[1]/textarea");
        getdriver().findElement(editorbox).sendKeys(invalidpythoncode);
    }

    public void get_the_error_message() {
        Alert alert=getdriver().switchTo().alert();
        alert.accept();
        getdriver().switchTo().defaultContent();

    }

    //@TS_05
    public void creating_a_linked_list_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
        By creatingllbtn=By.xpath("/html/body/div[2]/ul[2]/a");
        getdriver().findElement(creatingllbtn).click();
    }

    public void directed_to_creating_linked_list_of_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //@TS_08

    public void clicks_the_types_of_linked_list_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
        By typesofllbtn=By.xpath("/html/body/div[2]/ul[3]/a");
        LoggerLoad.info("click " + driver.findElement(typesofllbtn).getText() + " on Linked list page");
        getdriver().findElement(typesofllbtn).click();
    }

    public void directed_to_types_of_linked_list_of_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_11

    public void clicks_the_implement_linked_list_in_python_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
        By implellbtn=By.xpath("/html/body/div[2]/ul[4]/a");
        LoggerLoad.info("click " + driver.findElement(implellbtn).getText() + " on Linked list page");
        getdriver().findElement(implellbtn).click();
    }

    public void directed_to_implement_linked_list_in_python_of_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_14
    public void clicks_traversal_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
        By traversalbtn=By.xpath("/html/body/div[2]/ul[5]/a");
        LoggerLoad.info("click " + driver.findElement(traversalbtn).getText() + " on Linked list page");
        getdriver().findElement(traversalbtn).click();
    }
    public void directed_to_traversal_page_of_linked_list() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/traversal/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_17
    public void clicks_insertion_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
        By insertionbtn=By.xpath("/html/body/div[2]/ul[6]/a");
        LoggerLoad.info("click " + driver.findElement(insertionbtn).getText() + " on Linked list page");
        getdriver().findElement(insertionbtn).click();
    }

    public void directed_to_insertion_of_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }
    //TS_20
    public void clicks_the_deletion_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/");
        By deletionbtn=By.xpath("/html/body/div[2]/ul[7]/a");
        LoggerLoad.info("click " + driver.findElement(deletionbtn).getText() + " on Linked list page");
        getdriver().findElement(deletionbtn).click();
    }

    public void directed_to_deletion_of_linked_list_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_23
    public void clicks_practice_questions_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
        By practiceq=By.xpath(" /html/body/div[2]/div/div[1]/div/a");
        LoggerLoad.info("click " + driver.findElement(practiceq).getText() + " on Linked list page");
        getdriver().findElement(practiceq).click();
    }

    public void directed_to_practice_page() {
        getdriver().get(" https://dsportalapp.herokuapp.com/linked-list/practice");
        System.out.println("The user is landed on : " + getdriver().getTitle());
        //for signout page
        By signout=By.xpath("  /html/body/div[1]/nav/div/div[2]/ul/a[3]");
        getdriver().findElement(signout).click();
    }

    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " on Linked list page");
        getdriver().findElement(signout_lnk).click();
    }



}