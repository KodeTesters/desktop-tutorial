package Stepdefinition;

import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerform {
    RegisterPage rp = new RegisterPage();

    @Given("user opens the Ds-Algo Portal")
    public void user_opens_the_ds_algo_portal() {
        rp.open_ds_algo();
    }

    @When("user clicks  get started")
    public void user_clicks_get_started() {
        rp.click_get_started();
    }

    @Then("The user should be redirected to homepage")
    public void the_user_should_be_redirected_to_homepage() {
        String title = rp.gettitle();
        System.out.println("The title of the page is: " + title);
    }

    @When("user click  register")
    public void user_click_register() {
        rp.click_register();
    }

    @Then("it should get into register form")
    public void it_should_get_into_register_form() {
        System.out.println("The user is in register form");
    }

    @When("User clicks Register button with all fields empty")
    public void user_clicks_register_button_with_all_fields_empty() throws Exception {
        rp.empty_register_form();

    }

    @Then("display an error {string} below Username textbox")
    public void display_an_error_below_username_textbox(String string) {
        System.out.println("OUTPUT=Please fill out this field.");
    }

    // username through feature file
    @Given("user in registerpage")
    public void user_in_registerpage() {

    }

    @When("The user clicks Register button after entering {string} with other fields empty")
    public void the_user_clicks_register_button_after_entering_with_other_fields_empty(String string) {

    }

    @Then("display an error {string} below Password textbox")
    public void display_an_error_below_password_textbox(String string) {

    }

    // #sendng credentials using data table
    @Given("user in registerform")
    public void user_in_registerform() {

    }

    @When("user clicks Register button after entering Username and password with Password Confirmation field empty")
    public void user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty(
            io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("display an error {string} below Password Confirmation textbox")
    public void display_an_error_below_password_confirmation_textbox(String string) {

    }

    //
    @Given("user is redirected to register form")
    public void user_is_redirected_to_register_form() {

    }

    @When("user clicks Register after entering different passwords in Password and Password Confirmation")
    public void user_clicks_register_after_entering_different_passwords_in_password_and_password_confirmation(
            io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("display an error message \"password_mismatch")
    public void display_an_error_message_password_mismatch() {

    }

}