package Stepdefinition;

import Pages.DatastrucPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.textui.TestRunner;

public class DataStructure {
DatastrucPage dsp=new DatastrucPage();
//@Given("user in home page after logged in")
//public void user_in_home_page_after_logged_in() {
//			dsp.login();
////	  driver.get("https://dsportalapp.herokuapp.com/");
////	   			driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
////			driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
////			driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("bitbuddies");
////			  driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("buddies@123");
////			  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
//}

@When("user clicks Get started button below Data Structure homepage")
public void user_clicks_get_started_button_below_data_structure_homepage() {
			dsp.user_click_getstartlink();
	//	WebElement getstart=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a"));
//	getstart.click();
}
@Then("user should land in Data Structures- Introduction Page")
public void user_should_land_in_data_structures_introduction_page() {
   
}
@When("user clicks Time Complexity button")
public void user_clicks_time_complexity_button() {
					dsp.user_click_timecomplex();
//	WebElement timecomplex=driver.findElement(By.xpath("/html/body/div[2]/ul/a"));
//	timecomplex.click();
}
@Then("user should  redirected to time complexity of Data structures-Introduction")
public void user_should_redirected_to_time_complexity_of_data_structures_introduction() {
   
}
@Then("user clicks try Here button")
public void user_clicks_try_here_button() {
				dsp.try_here();
//	WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
//    tryhere.click();
}
@Then("user should be redirected to a page having an tryEditor with a Run button")
public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {
   
}

@When("user send a valid python code in Editor field with data {string}")
public void user_send_a_valid_python_code_in_editor_field_with_data(String validcode) {
					dsp.enter_vaild_code(validcode);
	//	WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
//	editbox.sendKeys(validcode);
//	editbox.sendKeys(Keys.ENTER);
}
@Then("user click run button")
public void user_click_run_button() {
				dsp.runbutton();
//	WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
//	   run.click();
}
@Then("valid code is executed and the result is displayed")
public void valid_code_is_executed_and_the_result_is_displayed() {
			dsp.output_display();
			String output= dsp.output_display();
			  System.out.println("output of code :"+ output);
	//	String result=driver.findElement(By.xpath("//*[@id=\"output\"]")).getText();
//	System.out.println("  valid code  " +  result);
//	driver.navigate().back();
//	WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
//    tryhere.click();
}
//@When("user write invalid code print =abc and click the run button")
//public void user_write_invalid_code_print_abc_and_click_the_run_button() {
//				dsp.invalid_code();
//	//	WebElement editbx = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
////	editbx.sendKeys("ghhtt");
////	WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
////	   run.click();
//}
@When("user write invalid code {string} and click the run button")
public void user_write_invalid_code_and_click_the_run_button(String invalidcode) {
   dsp.invalid_code(invalidcode);
   dsp.runbutton();
}

@Then("the error message is displayed")
public void the_error_message_is_displayed() {
	      dsp.error();
//	Alert alert=driver.switchTo().alert();
//	alert.accept();
// System.out.println(" error message : " + alert);
}
@Given("user is in the Data structures-Introduction page")
public void user_is_in_the_data_structures_introduction_page() {
				//dsp.user_isin_datastruct_intropage();
	//    driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
}

@When("user clicks the Practice Questions button")
public void user_clicks_the_practice_questions_button() {
					dsp.click_practiceques();
	//	WebElement practiceques=driver.findElement(By.xpath("//*[@id=\"content\"]/a"));
//    practiceques.click();
}

@Then("user should be redirected to Practice Questions of Data structures-Introduction")
public void user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
  dsp.gettitle();
  dsp.signout();
}

//@Then("capture the screenshot")
//public void capture_the_screenshot() throws Exception {
//			dsp.capture_screenshot();
////TakesScreenshot screenshot=(TakesScreenshot) driver;
////	
////	File source=screenshot.getScreenshotAs(OutputType.FILE);
////	File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\practicequespage.png");
////	FileHandler.copy(source,destination);
//}


}
