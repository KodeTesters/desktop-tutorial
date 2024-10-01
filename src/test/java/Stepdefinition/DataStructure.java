package Stepdefinition;

import Pages.DatastrucPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure {
DatastrucPage dsp=new DatastrucPage();
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		dsp.signin_page();
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String username, String password) {
		dsp.valid_username_password(username, password);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		dsp.login_button();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		dsp.homepage_url();
	}
	@When("user clicks Get started button below Data Structure homepage")
	public void user_clicks_get_started_button_below_data_structure_homepage() {
		dsp.user_click_getstartlink();
		//	WebElement getstart=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a"));
//		getstart.click();
	}
	@Then("user should land in Data Structures- Introduction Page")
	public void user_should_land_in_data_structures_introduction_page() {

	}
	@When("user clicks Time Complexity button")
	public void user_clicks_time_complexity_button() {
		dsp.user_click_timecomplex();
//		WebElement timecomplex=driver.findElement(By.xpath("/html/body/div[2]/ul/a"));
//		timecomplex.click();
	}
	@Then("user should  redirected to time complexity of Data structures-Introduction")
	public void user_should_redirected_to_time_complexity_of_data_structures_introduction() {

	}
	@When("user clicks Try Here button")
	public void user_clicks_try_here_button() {
		dsp.tryhere();
	}

	@Then("user is redirected to a page having a TryEditor with Run button")
	public void user_is_redirected_to_a_page_having_a_try_editor_with_run_button() {
		String title=dsp.gettitle();
		System.out.println("Title of current page:"+ title);
		// qp.tryEditor_url();
	}

	@When("user enters valid python code {string}")
	public void user_enters_valid_python_code(String validcode) {
		dsp.editor_txtarea_validcode(validcode);
	}

	@When("clicks Run button")
	public void clicks_run_button() {
		dsp.run_button();
	}

	@Then("page displays output")
	public void page_displays_output() {
		String output= dsp.output_display();
		System.out.println("output of code :"+ output);
	}

	@When("The user enters invalid python code {string}")
	public void the_user_enters_invalid_python_code(String invalidcode) {
		dsp.invalid_code(invalidcode);
	}

	@Then("An alert message should be displayed")
	public void an_alert_message_should_be_displayed() {
		String alertmsg =dsp.alert_wrongcode();
		System.out.println("Alert message"+ alertmsg);
		dsp.revertback();
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
//	    practiceques.click();
	}

	@Then("user should be redirected to Practice Questions of Data structures-Introduction")
	public void user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
		dsp.gettitle();
		dsp.signout();
	}

}
