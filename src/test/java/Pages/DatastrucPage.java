package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import driverFactory.DriverFactory;
import utilities.LoggerLoad;

public class DatastrucPage extends DriverFactory{
	//WebDriver driver=new ChromeDriver();
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
	public void user_click_getstartlink() {
		WebElement getstart=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a"));
		getstart.click();
	}
	public void user_click_timecomplex() {
		WebElement timecomplex=driver.findElement(By.xpath("/html/body/div[2]/ul/a"));
		LoggerLoad.info("click " + timecomplex.getText() + " on data structure page");
		timecomplex.click();
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
//			  getgetdriver()().findElement(editor_box).click();
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
	public void tryEditor_url()
	{
		String tryEditor_url=getdriver().getCurrentUrl();
		System.out.println("Url of tryeditor page"+ tryEditor_url );
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
		driver.navigate().back();
	}
	public void error() {
		String alert=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(" error message : " + alert);
		driver.navigate().back();
	}
	public void user_isin_datastruct_intropage() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}
	public void click_practiceques() {
		WebElement practiceques=driver.findElement(By.xpath("//*[@id=\"content\"]/a"));
		LoggerLoad.info("click " + practiceques.getText() + " on data structure page");
		practiceques.click();
	}

	//	public void capture_screenshot() throws Exception {
//		TakesScreenshot screenshot=(TakesScreenshot) driver;
//
//		File source=screenshot.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\Users\barie\IdeaProjects\desktop-tutorial\Screenshots\\practicequespage.png");
//		FileHandler.copy(source,destination);
//	}
	public void signout()
	{
		By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
		LoggerLoad.info("click " + driver.findElement(signout_lnk).getText() + " link");
		driver.findElement(signout_lnk).click();
	}

}
