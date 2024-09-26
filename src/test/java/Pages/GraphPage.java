
package Pages;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driverFactory.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.LoggerLoad;
import java.io.IOException;


public class GraphPage extends DriverFactory {

    public static WebDriver driver = DriverFactory.getdriver();
    ElementsUtils eleUtil = new ElementsUtils();

  public GraphPage() {
        PageFactory.initElements(driver, this);
    }

    String homepage = ConfigReader.getHomePage();
    String graphurl = ConfigReader.getGraphUrl();
    String graphgraphurl = ConfigReader.getGraphGraphUrl();
    String graphrepresentationsurl = ConfigReader.getGraphRepresentationsUrl();

    // homepage
    @FindBy(xpath = "//a[contains(text(), 'Data Structures')]")WebElement dropdown;
    @FindBy(xpath = "//a[normalize-space()='Graph']")WebElement dropdown_graph;

    //Graph Page
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Graph']")WebElement GraphLink;
    @FindBy(xpath = "//a[normalize-space()='Graph Representations']")WebElement GraphRepresentationslink;
    @FindBy(xpath = "//a[@class='btn btn-info']")WebElement GraphTryherelink;
    @FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement GraphPracQuesLink;
    @FindBy(xpath = "//textarea[@tabindex='0']")WebElement editorInput;
    @FindBy(xpath = "//button[@type='button']")WebElement runButton;
    @FindBy(id = "output")WebElement output;

    public void user_click_to_login() {
        getdriver().get("https://dsportalapp.herokuapp.com/");

        getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
        getdriver().findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
        getdriver().findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("kodetesters");
        getdriver().findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("numpyninja24");
        getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();

    }


    // Dropdown
    public void dropdown_graph() {
      //  getdriver().get("https://dsportalapp.herokuapp.com/");
       // getdriver().findElement(By.xpath("//button[@class='btn']")).click();
        dropdown.click();
        LoggerLoad.info("user clicked on Data Structure dropdown");
        dropdown_graph.click();
        LoggerLoad.info("user selected graph from data structures dropdown");
    }

    public String getGraphPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void navigateToHomePage() {
        driver.get(homepage);
        LoggerLoad.info("user is in home page");
    }

    public void navigateToGraphPage() {
        driver.get(graphurl);
        LoggerLoad.info("user is in graph page");
    }

    public void navigateToGraphGraphPage() {
        driver.get(graphgraphurl);
        LoggerLoad.info("user is in graphgraphpage");
    }

    public void navigateToGraphRepresentationsPage() {
        driver.get(graphrepresentationsurl);
        LoggerLoad.info("user is in graph representations page");
    }

    public void clickOnGraphPracQuesLink() {
        GraphPracQuesLink.click();
        LoggerLoad.info("User clicked on Graph Practice Questions link");
    }

    public void clickOnGraphLink() {
        GraphLink.click();
        LoggerLoad.info("User clicked on Graph link");
    }

    public void clickOnGraphRepresentationsLink() {
        GraphRepresentationslink.click();
        LoggerLoad.info("User clicked on Graph Representations link");
    }

    public void clickOnGraphTryhereLink() {
        GraphTryherelink.click();
        LoggerLoad.info("User clicked on Graph Try here link");
    }

    public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
        String code = eleUtil.getCodefromExcel(sheetname, rownumber);
        eleUtil.enterCode(code, editorInput);
    }
}
