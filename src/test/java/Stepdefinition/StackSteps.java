package Stepdefinition;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.Stack;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {
	Stack stack = new Stack();

	@When("user clicks Getting Started button in Stack module")
	public void user_clicks_getting_started_button_in_stack_module() throws Exception {
		stack.getstart();

	}

	 




	@Then("user should be directed to Stack overview Page")
	public void user_should_be_directed_to_stack_overview_page() {
		stack.gettitle();

	}

	@When("user clicks Operations in Stack")
	public void user_clicks_operations_in_stack() {
		stack.click_operation_stackbutton();

	}
	@Then("user is redirected to Opeartions in Stack page")
	public void user_is_redirected_to_opeartions_in_stack_page() {
		stack.get_url();

	}


	@Given("The user is in a try here page having  tryEditor with a Run button to test")
	public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
		stack.tryhere();

	}
	
	@When("user clicks Implementation")
	public void user_clicks_implementation() {
		stack.user_click_implementation();

	}

	@Then("user is redirected to implementation page")
	public void user_is_redirected_to_implementation_page() {
		

	}
	@When("user clicks Applications")
	public void user_clicks_applications() {
		stack.click_applicationbtn();

	}
	@Then("user is redirected to Applications page")
	public void user_is_redirected_to_applications_page() {
		stack.get_url();

	}



	@Given("The user is on the Stack Home Page")
	public void the_user_is_on_the_stack_home_page() {

	}
	@When("The user clicks on the Practice Questions button")
public void the_user_clicks_on_the_practice_questions_button() {
    stack.practice_questions();
	stack.signout();
}

	
	

	

}
