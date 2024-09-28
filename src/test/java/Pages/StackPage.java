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

public class StackPage extends DriverFactory{
	public void tryhere() {
		WebElement tryhere=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
		LoggerLoad.info("click on" + tryhere.getText()+"button");
	    tryhere.click();
	}
	public void getstart() throws Exception {
		 WebElement getstartStack=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a"));
			getstartStack.click();
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\user_loggedin_stackpage.png");
			FileHandler.copy(source,destination);
	}
	 
	public void click_operation_stackbutton() {
		WebElement Opera=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
		LoggerLoad.info("click " + Opera.getText() + " on Stack page");
		Opera.click();
	}

	public void code_to_tryeditor(String validcode) {
		WebElement editbox = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
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
	public void invalid_code() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		WebElement editbx = getdriver().findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		editbx.sendKeys("ghhtt");
		WebElement run=getdriver().findElement(By.xpath("/html/body/div/div/form/button"));
		   run.click();
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
	public void user_click_implementation () {
		WebElement implement=driver.findElement(By.xpath("//*[@id=\"content\"]/li[2]/a"));
		LoggerLoad.info("click " + implement.getText() + " on Stack page");
		   implement.click();
		}
	
	public void click_applicationbtn() {
		WebElement application=driver.findElement(By.xpath("//*[@id=\"content\"]/li[3]/a"));
		LoggerLoad.info("click " + application.getText() + " on Stack page");
		 application.click();
	}
	
	public void practice_questions()
	{
		By arrays_Practice=By.xpath("//a[contains(text(),'Practice Questions')]");
		LoggerLoad.info("click " + driver.findElement(arrays_Practice).getText() + " on Stack page");
	    getdriver().findElement(arrays_Practice).click();
	}
	public void signout()
	{
		By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
		LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
		getdriver().findElement(signout_lnk).click();
	}
	// Method to take screenshots and save to a relative path
	// private void takeScreenshot(String fileName) throws Exception {
       // TakesScreenshot screenshot = (TakesScreenshot) getdriver();
       // File source = screenshot.getScreenshotAs(OutputType.FILE);
       // String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + fileName;
       // File destination = new File(screenshotPath);
       // FileHandler.copy(source, destination);
    //}
}