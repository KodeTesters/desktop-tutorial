package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class HomePage extends DriverFactory {

    //Dsalgo page
    @FindBy (xpath="//a[@href='/home']")WebElement getstart_link;
    @FindBy (xpath="//a[contains(text(),'Get Started')]")WebElement getstart;

    //alert
    @FindBy (xpath="//*[@class='alert alert-primary']")WebElement alert_msg;

    //Homepage
    @FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstart_datastructures;
    @FindBy (xpath="//a[@href='array']")WebElement getstart_array;
    @FindBy (xpath="//a[@href='linked-list']")WebElement getstart_linkedlist;
    @FindBy (xpath="//a[@href='stack']")WebElement getstart_stack;
    @FindBy (xpath="//a[@href='queue']")WebElement getstart_queue;
    @FindBy (xpath="//a[@href='tree']")WebElement getstart_tree;
    @FindBy (xpath="//a[@href='graph']")WebElement getstart_graph;

    @FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a")WebElement dropdown;
    @FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]")WebElement dropdown_array;
    @FindBy (xpath="//*[@id='navbarCollapse']//a[2]")WebElement dropdown_linkedlist;
    @FindBy (xpath="//*[@id='navbarCollapse']//a[3]")WebElement dropdown_stack;
    @FindBy (xpath="//*[@id='navbarCollapse']//a[4]")WebElement dropdown_queue;
    @FindBy (xpath="//*[@id='navbarCollapse']//a[5]")WebElement dropdown_tree;
    @FindBy (xpath="//*[@id='navbarCollapse']//a[6]")WebElement dropdown_graph;

    //sigin
    @FindBy (xpath="//a[@href='/login']") WebElement signin;
    //register
    @FindBy (xpath="//a[@href='/register']")WebElement register;

    // Page Elements
    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void dsalgopage() {

        driver.get("https://dsportalapp.herokuapp.com/");

    }

    public void getStarted_link(String str) {

        getstart_link.click();

    }

    public String getPageTitle() {

        String title = driver.getTitle();
        return title;

    }

    public String alert() {

        String msg = alert_msg.getText();
        return msg;

    }

    // Home page Elements
    public void homepage() {

        driver.get("https://dsportalapp.herokuapp.com/home");

    }

    public void getStarted_home(String string) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        switch (string) {
            case "Datastructures":
                LoggerLoad.info("click " + getstart_datastructures.getText() + "link on  DataStructures ");
                js.executeScript("arguments[0].click()",getstart_datastructures);
//				getstart_datastructures.click();
                break;
            case "Arrays":
                LoggerLoad.info("click " + getstart_array.getText() + "link on Array ");
                js.executeScript("arguments[0].click()",getstart_array);
                //getstart_array.click();
                break;
            case "Linkedlist":
                LoggerLoad.info("click " + getstart_linkedlist.getText() + "link on LinkedList");
                js.executeScript("arguments[0].click()",getstart_linkedlist);
                //getstart_linkedlist.click();
                break;
            case "Stack":
                LoggerLoad.info("click " + getstart_stack.getText() + "link on stack");
                js.executeScript("arguments[0].click()",getstart_stack);
                //getstart_stack.click();
                break;
            case "Queue":
                LoggerLoad.info("click " + getstart_queue.getText() + "link on queue ");
                getstart_queue.click();
                break;
            case "Tree":
                LoggerLoad.info("click " + getstart_tree.getText() + "link on Tree ");
                getstart_tree.click();
                break;
            case "Graph":
                LoggerLoad.info("click " + getstart_graph.getText() + "link on Graph ");
                js.executeScript("arguments[0].click()",getstart_graph);
                //getstart_graph.click();
                break;
        }
    }

    // Dropdown
    public void dropdown(String string) {

        dropdown.click();
        switch (string) {
            case "Arrays":
                LoggerLoad.info("User click on " + string);
                dropdown_array.click();
                break;
            case "Linkedlist":
                LoggerLoad.info("User click on " + string);
                dropdown_linkedlist.click();
                break;
            case "Stack":
                LoggerLoad.info("User click on " + string);
                dropdown_stack.click();
                break;
            case "Queue":
                LoggerLoad.info("User click on " + string);
                dropdown_queue.click();
                break;
            case "Tree":
                LoggerLoad.info("User click on " + string);
                dropdown_tree.click();
                break;
            case "Graph":
                LoggerLoad.info("User click on " + string);
                dropdown_graph.click();
                break;
        }

    }

    // Signin
    public void signin_link() {
        signin.click();
    }

    public String login_page() {
        String title = driver.getTitle();
        return title;
    }

    // Register
    public void register_link() {

        register.click();

    }

    public String register_page() {
        String title = driver.getTitle();
        return title;
    }
}
