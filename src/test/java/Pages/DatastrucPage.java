package Pages;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class DatastrucPage extends DriverFactory{
	//WebDriver driver=new ChromeDriver();
	public void login() {
		  getdriver().get("https://dsportalapp.herokuapp.com/");
 			getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
		getdriver().findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		getdriver().findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("kodetesters");
		  getdriver().findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("numpyninja24");
		  getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
	}
	public void user_click_getstartlink() {
		WebElement getstart=getdriver().findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a"));
	getstart.click();
	}
	public void user_click_timecomplex() {
		WebElement timecomplex=getdriver().findElement(By.xpath("/html/body/div[2]/ul/a"));
		LoggerLoad.info("click " + timecomplex.getText() + " on data structure page");
		timecomplex.click();
			}
	public void try_here() {
		WebElement tryhere=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
		LoggerLoad.info("click on" + tryhere.getText()+"button");
	    tryhere.click();
			}
	public String output_display()
	{
		 By result=By.xpath("//*[@id=\"output\"]");
	     String res= getdriver().findElement(result).getText();
	     return res;
	}
	public void enter_vaild_code(String validcode) {
		WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		LoggerLoad.info("Enter valid code " + editbox.getText() + " on Try Editor Page");
		editbox.sendKeys(validcode);
		editbox.sendKeys(Keys.ENTER);
	}
	public void runbutton() {
		WebElement run=getdriver().findElement(By.xpath("/html/body/div/div/form/button"));
		   run.click();
			}
	public void code_valid_executed() {
		String result=getdriver().findElement(By.xpath("//*[@id=\"output\"]")).getText();
		System.out.println("  valid code  " +  result);
		getdriver().navigate().back();
		WebElement tryhere=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
	    tryhere.click();
	}
	public void invalid_code(String invalidcode)
	{
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		LoggerLoad.info("Enter invalid code " + editbox.getText() + " on Try Editor Page");
		editbox.sendKeys(invalidcode);
		
		//editbox.sendKeys(Keys.ENTER);
	}
	public void error() {
		String alert=getdriver().switchTo().alert().getText();
		getdriver().switchTo().alert().accept();
	 System.out.println(" error message : " + alert);
	 getdriver().navigate().back();
	}
	public void user_isin_datastruct_intropage() {
		  getdriver().navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}
	public void click_practiceques() {
		WebElement practiceques=getdriver().findElement(By.xpath("//*[@id=\"content\"]/a"));
		LoggerLoad.info("click " + practiceques.getText() + " on data structure page");
	    practiceques.click();
	}
	public String gettitle()
	{
		String title=getdriver().getTitle();
		return title;
	}
	public void capture_screenshot() throws Exception {
		TakesScreenshot screenshot=(TakesScreenshot) getdriver();
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\barie\\IdeaProjects\\desktop-tutorial\\Screenshots\\practicequespage.png");
		FileHandler.copy(source,destination);
	}
	public void signout()
	{
		By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
		LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
		getdriver().findElement(signout_lnk).click();
	}
}
