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

	public void getstart() throws Exception {
		WebElement getstartStack=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a"));
		getstartStack.click();
//			TakesScreenshot screenshot=(TakesScreenshot) driver;
//			File source=screenshot.getScreenshotAs(OutputType.FILE);
//			File destination=new File("C:\Users\barie\IdeaProjects\desktop-tutorial\Screenshots\\user_loggedin_stackpage.png");
//			FileHandler.copy(source,destination);
	}
	 
	public void click_operation_stackbutton() {
		WebElement Opera=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
		LoggerLoad.info("click " + Opera.getText() + " on Stack page");
		Opera.click();
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
	//		public void tryEditor()
//		{
//			By editor_box=By.xpath("//*[@id='answer_form']");
//			  getdriver().findElement(editor_box).click();
//		}
	public void editor_txtarea_validcode(String validcode)
	{
//			By editor_text=By.xpath("/html/body/div/div/form/div/div/div[1]/textarea");
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//		    executor.executeScript("document.driver.findElement(editor_text).value='validpythoncode';");
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
		driver.findElement(arrays_Practice).click();
	}
	public void signout()
	{
		By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
		LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
		driver.findElement(signout_lnk).click();
	}
}