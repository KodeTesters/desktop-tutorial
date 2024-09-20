package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static driverFactory.DriverFactory.getdriver;

public class GraphSteps {

    @When("The user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String string, String string2) {
    }

    @When("^The user click on login button$")
    public void the_user_click_on_login_button() {

    }

    @Then("^The user should be redirected to Ds Algo Home Page$")
    public void the_user_should_be_redirected_to_ds_algo_home_page() {

    }

    @Given("^The user is on the DsAlgo Home Page$")
    public void the_user_is_on_the_ds_algo_home_page() {

    }

    @When("^user clicks Getting Started button in Graph module$")
    public void user_clicks_getting_started_button_in_graph_module() {

    }

    @Then("^user should be directed to Graph overview Page$")
    public void user_should_be_directed_to_graph_overview_page() {

    }

    @When("^user clicks Graph$")
    public void user_clicks_graph() {

    }

    @Then("^user is redirected to Graph page$")
    public void user_is_redirected_to_graph_page() {

    }

    @Then("^user clicks Try Here button$")
    public void user_clicks_try_here_button() {

    }

    @When("The user Enters valid python code in tryEditor from data {string}")
    public void the_user_enters_valid_python_code_in_try_editor_from_data(String string) {

    }

    @When("^user click on Run button$")
    public void user_click_on_run_button() {

    }

    @Then("^The user should be presented with the Run$")
    public void the_user_should_be_presented_with_the_run() {

    }

    @When("The user Enter invalid python code in tryEditor from sheet {code}")
    public void the_user_enter_invalid_python_code_in_try_editor_from_sheet(String code) {

    }

    @When("^user click on a Run button$")
    public void user_click_on_a_run_button() {

    }

    @Then("^The user get the error message$")
    public void the_user_get_the_error_message() {

    }

    @Given("The user is on the DsAlgo Signin Page")
    public void The_user_is_on_the_DsAlgo_Signin_Page() {
        // Write code here that turns the phrase above into concrete actions
    }
}
