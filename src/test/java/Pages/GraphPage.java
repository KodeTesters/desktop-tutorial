package Pages;

import driverFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GraphPage extends DriverFactory {

    public void user_click_to_login() {
        getdriver().get("https://dsportalapp.herokuapp.com/");

        getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
        getdriver().findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
        getdriver().findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("kodetesters");
        getdriver().findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("numpyninja24");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")));
        loginButton.click();
       // getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();

    }
    public void getstart() {
        getdriver().findElement(By.xpath("/html/body/div[3]/div[7]/div/div/a")).click();
    }
    public void clickGraph() {
        WebElement click_graph=getdriver().findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
        System.out.println("Clicking on the link: " + click_graph.getText());
        click_graph.click();
    }
}