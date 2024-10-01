package Stepdefinition;

import Pages.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerform {

    RegistrationPage rp=new RegistrationPage();
    @Given("open ds algo portal")
    public void open_ds_algo_portal() {
        rp.open_ds_algo();
    }
    @When("user click  get started")
    public void user_click_get_started() {
        rp.click_getstart();
    }
    @When("user click  register")
    public void user_click_register() {
        rp.register();

    }
    //	@Then("The user should be redirected to homepage")
//	public void the_user_should_be_redirected_to_homepage() {
//		String title=rp.gettitle();
//		   System.out.println("Title of current page:"+ title);
//	}
    @Then("it should get into register form")
    public void it_should_get_into_register_form() {
        System.out.println("USER enter into the register form");
    }
    @When("The user clicks Register button with all fields empty")
    public void the_user_clicks_register_button_with_all_fields_empty() throws Exception {
        rp.click_empty_regiterform();
    }
    @When("display an error {string} below Username textbox")
    public void display_an_error_below_username_textbox(String string) {
        System.out.println("OUTPUT==-----Please fill out this field" );
    }

    //**************username through feature file***************
    @Given("user is in register page")
    public void user_is_in_register_page() {
        rp.user_in_registerpage();
    }
    @When("The user clicks Register button after entering {string} with other fields empty")
    public void the_user_clicks_register_button_after_entering_with_other_fields_empty(String name) throws Exception {
        rp.click_registerlink_with_username_otherfield_empty(name);
    }
    @Then("display an error {string} below Password textbox")
    public void display_an_error_below_password_textbox(String string) {
        System.out.println("Please fill out this field" );
    }
    //*******username and password through datatable*********
    @Given("user in registerform")
    public void user_in_registerform() {
        rp.user_in_registerpage();
    }
    @When("user clicks Register button after entering Username and password with Password Confirmation field empty")
    public void user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty(DataTable dataTable) {
        rp.click_with_username_password(dataTable);
    }
    @Then("display an error {string} below Password Confirmation textbox")
    public void display_an_error_below_password_confirmation_textbox(String string) {
        System.out.println("OUTPUT--+++++++--Please fill out this field" );
    }
    @Given("user is redirected to register page")
    public void user_is_redirected_to_register_page() {
        rp.user_in_registerpage();
    }
    @When("user clicks Register after entering different passwords in Password and Password Confirmation")
    public void user_clicks_register_after_entering_different_passwords_in_password_and_password_confirmation(DataTable dataTable) throws Exception {
        rp.click_register_with_different_password_in_confirmationfield(dataTable);
    }
    //	@Then("display an error message \"password_mismatch")
//	public void display_an_error_message_password_mismatch() {
//					rp.error_message();
//	}
    @Then("display an error message {string}")
    public void display_an_error_message(String msg) {
        rp.error_message();
    }
    @Given("user is in the register page")
    public void user_is_in_the_register_page() {
        rp.user_in_registerpage();
    }
    @When("The user enters a Password with characters less than eight")
    public void the_user_enters_a_password_with_characters_less_than_eight() {
        rp.user_enter_password_less_than_eight_character();
    }
    @Then("error message Password should contain atleast eight characters")
    public void error_message_password_should_contain_atleast_eight_characters() {
        System.out.println("Password should contain atleast eight characters");
    }

}
