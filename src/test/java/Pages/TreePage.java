package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class TreePage extends DriverFactory {
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
    public void clicks_getting_started_button_on_tree_pane() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By getstartedbtn=By.xpath("//a[@href='tree']");
        driver.findElement(getstartedbtn).click();
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
    public void redirected_to_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");

    }
    // @TS_tree_02
    public void clicks_on_overview_of_trees_link() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        By ovrvwbtn= By.xpath("/html/body/div[2]/ul[1]/a");
        driver.findElement(ovrvwbtn).click();
    }

    public void directed_to_overview_of_trees_page() {
        String currurl= driver.getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }
    public void redirected_to_try_editor_page_with_run_button() {
        String currurl= driver.getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }
    //@TS_tree_05

    public void tree_page_after_logged_in() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
    }

    public void clicks_on_terminologies_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        By terminobtn= By.xpath("/html/body/div[2]/ul[2]/a");
        LoggerLoad.info("click " + driver.findElement(terminobtn).getText() + " on Tree page");
        driver.findElement(terminobtn).click();
    }

    public void redirected_to_terminologies_of_tree_page() {
        String currurl= driver.getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }
    //TS_tree_06
    public void in_terminologies_page_after_logged_in() {
        //driver.get("https://dsportalapp.herokuapp.com/tree/");
    }
    public void redirected_to_page_having_an_try_editor_with_a_run_button_to_test() {
        driver.get("https://dsportalapp.herokuapp.com/tryEditor");
        String currurl= driver.getCurrentUrl();
        System.out.println("The user is on :" + currurl);
    }

    //@TS_tree_08
    public void on_the_tree_page_after_logged_in() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
    }

    public void clicks_on_the_types_of_trees_button() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By typesoftrees=By.xpath("/html/body/div[2]/ul[3]/a");
        LoggerLoad.info("click " + driver.findElement(typesoftrees).getText() + " on Tree page");
        driver.findElement(typesoftrees).click();
    }

    public void directed_to_the_types_of_trees_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/types-of-trees/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //@TS_tree_11

    public void in_tree_page_after_logged_in() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
    }

    public void clicks_on_tree_traversals_button() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By treetraversalbtn=By.xpath("/html/body/div[2]/ul[4]/a");
        LoggerLoad.info("click " + driver.findElement(treetraversalbtn).getText() + " on Tree page");
        driver.findElement(treetraversalbtn).click();
    }
    public void directed_to_tree_traversals_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/tree-traversals/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //@TS_tree_14
    public void clicks_traversal_illustration_button() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By tillustbtn=By.xpath("/html/body/div[2]/ul[5]/a");
        LoggerLoad.info("click " + driver.findElement(tillustbtn).getText() + " on Tree page");
        driver.findElement(tillustbtn).click();
    }
    public void directed_to_traversals_illustration_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/traversals-illustration/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_tree_17
    public void clicks_binary_trees_button() {

        driver.get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By binarytrbtn=By.xpath("/html/body/div[2]/ul[6]/a");
        LoggerLoad.info("click " + driver.findElement(binarytrbtn).getText() + " on Tree page");
        driver.findElement(binarytrbtn).click();
    }

    public void directed_to_binary_trees_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/binary-trees/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }
    //TS_tree_20
    public void clicks_types_of_binary_trees_button() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,400)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By typesbinarytrbtn=By.xpath("/html/body/div[2]/ul[7]/a");
        LoggerLoad.info("click " + driver.findElement(typesbinarytrbtn).getText() + " on Tree page");
        driver.findElement(typesbinarytrbtn).click();
    }

    public void directed_to_types_of_binary_trees_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }


    //TS_tree_23
    public void clicks_implementation_in_python_button() {
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,400)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By implebtn=By.xpath("/html/body/div[2]/ul[8]/a");
        LoggerLoad.info("click " + driver.findElement(implebtn).getText() + " on Tree page");
        driver.findElement(implebtn).click();
    }

    public void directed_to_implementation_in_python_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_tree_26
    public void clicks_binary_tree_traversals_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By bttravbtn=By.xpath("/html/body/div[2]/ul[9]/a");
        LoggerLoad.info("click " + driver.findElement(bttravbtn).getText() + " on Tree page");
        driver.findElement(bttravbtn).click();
    }

    public void directed_to_binary_tree_traversals_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }
    //TS_tree_29
    public void clicks_implementation_of_binary_trees_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By impbtbtn=By.xpath("/html/body/div[2]/ul[10]/a");
        LoggerLoad.info("click " + driver.findElement(impbtbtn).getText() + " on Tree page");
        driver.findElement(impbtbtn).click();
    }
    public void directed_to_implementation_of_binary_trees_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_tree_32
    public void clicks_applications_of_binary_trees_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By abtbtn=By.xpath("/html/body/div[2]/ul[11]/a");
        LoggerLoad.info("click " + driver.findElement(abtbtn).getText() + " on Tree page");
        driver.findElement(abtbtn).click();
    }

    public void directed_to_applications_of_binary_trees_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }

    //TS_tree_35
    public void clicks_binary_search_trees_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        By bstbtn=By.xpath("/html/body/div[2]/ul[12]/a");
        LoggerLoad.info("click " + driver.findElement(bstbtn).getText() + " on Tree page");
        driver.findElement(bstbtn).click();
    }

    public void directed_to_binary_search_trees_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/binary-search-trees/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }
    //TS_tree_38
    public void clicks_implementation_of_bst_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
        driver.get("https://dsportalapp.herokuapp.com/tree/");
        By ibstbtn=By.xpath("/html/body/div[2]/ul[13]/a");
        LoggerLoad.info("click " + driver.findElement(ibstbtn).getText() + " on Tree page");
        driver.findElement(ibstbtn).click();
    }

    public void directed_to_implementation_of_bst_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
        System.out.println("The user is landed on : " + driver.getTitle());
    }
    //TS_tree_41
    public void clicks_practice_questions_button_of_tree_page() {
        driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
        By practiceq=By.xpath("/html/body/div[2]/div/div[1]/div/a");
        LoggerLoad.info("click " + driver.findElement(practiceq).getText() + " on Tree page");
        driver.findElement(practiceq).click();
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
        driver.findElement(signout_lnk).click();

    }

}