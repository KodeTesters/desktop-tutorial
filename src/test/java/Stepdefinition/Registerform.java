package Stepdefinition;

import Pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Registerform {
    RegisterPage rp = new RegisterPage();
    @Given("user Enters register page")
    public void user_enters_register_page() {
    rp.open_ds_algo();
    rp.click_getstart();
    rp.register();
    }
    @When("The user clicks Register button with all fields empty")
    public void the_user_clicks_register_button_with_all_fields_empty() throws IOException {
    rp.click_empty_register_form();
    }
    @Then("display an error {string} below Username textbox")
    public void display_an_error_below_username_textbox(String string) {
    System.out.println("please fillout this field");
    }
    @Given("user is in register page")
    public void user_is_in_register_page() {
    user_is_in_the_register_page();
    }
    @When("The user clicks Register button after entering {string} with other fields empty")
    public void the_user_clicks_register_button_after_entering_with_other_fields_empty(String string) throws Exception {
    rp.click_registerlink_with_username_otherfield_empty("kodetesters");
    }
    @Then("display an error {string} below Password textbox")
    public void display_an_error_below_password_textbox(String string) {
    System.out.println("Error message displayed");
    }
    @Given("user in registerform")
    public void user_in_registerform() {

        rp.user_in_registerpage();
    }
    @When("user clicks Register button after entering Username and password with Password Confirmation field empty")
    public void user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty(DataTable dataTable ) throws Exception {
    rp.click_register_with_different_password_in_confirmationfield(dataTable);
    }
    @Then("display an error {string} below Password Confirmation textbox")
    public void display_an_error_below_password_confirmation_textbox(String string) {
        rp.error_message();
    System.out.println("OUTPUT ====> please fill out this field");
    }
    @Given("user is redirected to register page")
    public void user_is_redirected_to_register_page() {
       rp.user_in_registerpage();
    }
    @When("user clicks Register after entering different passwords in Password and Password Confirmation")
    public void user_clicks_register_after_entering_different_passwords_in_password_and_password_confirmation(DataTable dataTable) throws Exception {
    rp.click_register_with_different_password_in_confirmationfield(dataTable);
    }
    @Then("display an error message \"password_mismatch")
    public void display_an_error_message_password_mismatch() {
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
    rp.error_message();
    }

}