package Stepdefinition;

import Pages.HomePage;
import Runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage hp=new HomePage();
    @Given("The user opens DS Algo portal link")
    public void the_user_opens_ds_algo_portal_link() {
        hp.open_dsalgo_portal();

    }
    @When("The user clicks the Get Started button")
    public void the_user_clicks_the_get_started_button() {
        hp.get_start_click();
    }

    @Then("The user should be redirected to homepage and verify the title")
    public void the_user_should_be_redirected_to_homepage_and_verify_the_title() {
        System.out.println("Output-----The user should see 6 panes with different data structures");
    }

    @Given("user click on the sign in link")
    public void user_click_on_the_sign_in_link() throws Exception {
        hp.sign_in_click_link();


    }

    @Then("user redirected to login page")
    public void user_redirected_to_login_page() {

    }

    @When("user clicks on dropdown {string}")
    public void user_clicks_on_dropdown(String menu) throws Exception {
        hp.drop_down_click(menu);

    }
    @Then("alert the user with a message You are not logged in")
    public void alert_the_user_with_a_message_you_are_not_logged_in() {
        System.out.println("OUTPUT---you are not logged in");

    }
    @When("The user clicks any of the Get Started buttons below the data structures")
    public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures() {
        hp.any_get_start();
    }

    @Then("the user with a message You are not logged in")
    public void the_user_with_a_message_you_are_not_logged_in() throws Exception {
        System.out.println("you are not logged in");
        hp.screen_shot_not_logged_in();
    }

    @When("The user clicks Register")
    public void the_user_clicks_register() {
        hp.register_click_to_register_form();

    }

    @Then("The user should be redirected to Register form")
    public void the_user_should_be_redirected_to_register_form() throws Exception {
        hp.screen_shot_of_register_form();
        System.out.println("OUTPUT---The Screenshot of the register form is taken");
    }

}

