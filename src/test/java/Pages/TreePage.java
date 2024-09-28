package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class TreePage extends DriverFactory {
    //DriverFactory df=new DriverFactory();

    //  @TS_tree
    public void signin_page_of_ds_algo_portal() {
        //   By getstartedbtn=By.xpath("/html/body/div[1]/div/div/a/button");
        getdriver().get("https://dsportalapp.herokuapp.com/home");
        By signinbtn=By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[3]");
        //	 getdriver().findElement(getstartedbtn).click();
        getdriver().findElement(signinbtn).click();
    }

    public void enter_valid_and(String username, String password) {
        By usernamebtn=By.xpath("//*[@id=\'id_username\']");
        By passwrdbtn=By.xpath("//*[@id=\'id_password\']");
        getdriver().findElement(usernamebtn).sendKeys(username);
        getdriver().findElement(passwrdbtn).sendKeys(password);
    }

    //	 @TS_tree_01
    public void clicks_getting_started_button_on_tree_pane() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By getstartedbtn=By.xpath("//a[@href='tree']");
        getdriver().findElement(getstartedbtn).click();
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

    public void redirected_to_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");

    }
    // @TS_tree_02
    public void clicks_on_overview_of_trees_link() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        By ovrvwbtn= By.xpath("/html/body/div[2]/ul[1]/a");
        getdriver().findElement(ovrvwbtn).click();
    }

    public void directed_to_overview_of_trees_page() {
        String currurl= getdriver().getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }
    // @TS_tree_03

    public void clicks_try_here_button_in_tree_page() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By tryherebtn= By.xpath("//*[@href='/tryEditor']");
        getdriver().findElement(tryherebtn).click();
    }

    public void redirected_to_try_editor_page_with_run_button() {
        String currurl= getdriver().getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }
    //@TS_tree_05

    public void tree_page_after_logged_in() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
    }

    public void clicks_on_terminologies_button() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        By terminobtn= By.xpath("/html/body/div[2]/ul[2]/a");
        LoggerLoad.info("click " + driver.findElement(terminobtn).getText() + " on Tree page");
        getdriver().findElement(terminobtn).click();
    }

    public void redirected_to_terminologies_of_tree_page() {
        String currurl= getdriver().getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }
    //TS_tree_06
    public void in_terminologies_page_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/");
    }
    public void redirected_to_page_having_an_try_editor_with_a_run_button_to_test() {
        getdriver().get("https://dsportalapp.herokuapp.com/tryEditor");
        String currurl= getdriver().getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }

    //@TS_tree_08
    public void on_the_tree_page_after_logged_in() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
    }

    public void clicks_on_the_types_of_trees_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By typesoftrees=By.xpath("/html/body/div[2]/ul[3]/a");
        LoggerLoad.info("click " + driver.findElement(typesoftrees).getText() + " on Tree page");
        getdriver().findElement(typesoftrees).click();
    }

    public void directed_to_the_types_of_trees_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/types-of-trees/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

//@TS_tree_11

    public void in_tree_page_after_logged_in() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
    }

    public void clicks_on_tree_traversals_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By treetraversalbtn=By.xpath("/html/body/div[2]/ul[4]/a");
        LoggerLoad.info("click " + driver.findElement(treetraversalbtn).getText() + " on Tree page");
        getdriver().findElement(treetraversalbtn).click();
    }
    public void directed_to_tree_traversals_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/tree-traversals/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //@TS_tree_14
    public void clicks_traversal_illustration_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By tillustbtn=By.xpath("/html/body/div[2]/ul[5]/a");
        LoggerLoad.info("click " + driver.findElement(tillustbtn).getText() + " on Tree page");
        getdriver().findElement(tillustbtn).click();
    }
    public void directed_to_traversals_illustration_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/traversals-illustration/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_tree_17
    public void clicks_binary_trees_button() {

        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By binarytrbtn=By.xpath("/html/body/div[2]/ul[6]/a");
        LoggerLoad.info("click " + driver.findElement(binarytrbtn).getText() + " on Tree page");
        getdriver().findElement(binarytrbtn).click();
    }

    public void directed_to_binary_trees_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/binary-trees/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }
    //TS_tree_20
    public void clicks_types_of_binary_trees_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,400)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By typesbinarytrbtn=By.xpath("/html/body/div[2]/ul[7]/a");
        LoggerLoad.info("click " + driver.findElement(typesbinarytrbtn).getText() + " on Tree page");
        getdriver().findElement(typesbinarytrbtn).click();
    }

    public void directed_to_types_of_binary_trees_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }


    //TS_tree_23
    public void clicks_implementation_in_python_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,400)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By implebtn=By.xpath("/html/body/div[2]/ul[8]/a");
        LoggerLoad.info("click " + driver.findElement(implebtn).getText() + " on Tree page");
        getdriver().findElement(implebtn).click();
    }

    public void directed_to_implementation_in_python_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_tree_26
    public void clicks_binary_tree_traversals_button() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By bttravbtn=By.xpath("/html/body/div[2]/ul[9]/a");
        LoggerLoad.info("click " + driver.findElement(bttravbtn).getText() + " on Tree page");
        getdriver().findElement(bttravbtn).click();
    }

    public void directed_to_binary_tree_traversals_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }
    //TS_tree_29
    public void clicks_implementation_of_binary_trees_button() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By impbtbtn=By.xpath("/html/body/div[2]/ul[10]/a");
        LoggerLoad.info("click " + driver.findElement(impbtbtn).getText() + " on Tree page");
        getdriver().findElement(impbtbtn).click();
    }
    public void directed_to_implementation_of_binary_trees_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_tree_32
    public void clicks_applications_of_binary_trees_button() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By abtbtn=By.xpath("/html/body/div[2]/ul[11]/a");
        LoggerLoad.info("click " + driver.findElement(abtbtn).getText() + " on Tree page");
        getdriver().findElement(abtbtn).click();
    }

    public void directed_to_applications_of_binary_trees_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }

    //TS_tree_35
    public void clicks_binary_search_trees_button() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By bstbtn=By.xpath("/html/body/div[2]/ul[12]/a");
        LoggerLoad.info("click " + driver.findElement(bstbtn).getText() + " on Tree page");
        getdriver().findElement(bstbtn).click();
    }

    public void directed_to_binary_search_trees_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/binary-search-trees/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }
    //TS_tree_38
    public void clicks_implementation_of_bst_button() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        getdriver().get("https://dsportalapp.herokuapp.com/tree/");
        By ibstbtn=By.xpath("/html/body/div[2]/ul[13]/a");
        LoggerLoad.info("click " + driver.findElement(ibstbtn).getText() + " on Tree page");
        getdriver().findElement(ibstbtn).click();
    }

    public void directed_to_implementation_of_bst_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
        System.out.println("The user is landed on : " + getdriver().getTitle());
    }
    //TS_tree_41
    public void clicks_practice_questions_button_of_tree_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
        By practiceq=By.xpath("/html/body/div[2]/div/div[1]/div/a");
        LoggerLoad.info("click " + driver.findElement(practiceq).getText() + " on Tree page");
        getdriver().findElement(practiceq).click();
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
        getdriver().findElement(signout_lnk).click();
    }






}