package Stepdefinition;


import Pages.StackPage;
import Runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {
	StackPage sp=new StackPage();
	@Given("user should clicks the Getting Started button in Stack")
	public void user_should_clicks_the_getting_started_button_in_stack() throws Exception {
		sp.getstart();
	}

	@Then("The user is in the Stack page after logged")
	public void the_user_is_in_the_stack_page_after_logged() {
		sp.gettitle();
	}

	@When("user clicks Operations in Stack button")
	public void user_clicks_operations_in_stack_button() {
		sp.click_operation_stackbutton();
	}

	@Then("user should be directed to Operations in Stack Page")
	public void user_should_be_directed_to_operations_in_stack_page() {
		sp.get_url();
	}
	@Given("user is on Operations in stack page")
	public void user_is_on_operations_in_stack_page() {
		sp.get_url();
	}

	@When("user clicks Implementation button")
	public void user_clicks_implementation_button() {
		sp.user_click_implementation();
	}

	@Then("user should be directed to Implementation Page")
	public void user_should_be_directed_to_implementation_page() {
		sp.get_url();
	}
	@Given("user is on Implementation page")
	public void user_is_on_implementation_page() {

	}

	@When("user clicks Application button")
	public void user_clicks_application_button() {
		sp.click_applicationbtn();
	}

	@Then("user should be directed to Application Page")
	public void user_should_be_directed_to_application_page() {
		sp.get_url();
	}

	@Given("user in Stack page")
	public void user_in_stack_page() {

	}

	@When("The user clicks Practice Questions button of Stack page")
	public void the_user_clicks_practice_questions_button_of_stack_page() {
		sp.practice_questions();
		sp.signout();
	}


}