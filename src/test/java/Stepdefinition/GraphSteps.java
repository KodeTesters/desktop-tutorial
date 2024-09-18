package Stepdefinition;


import Pages.Graphpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static driverFactory.DriverFactory.getdriver;

public class GraphSteps  {

   Graphpage gp =new Graphpage();
    @Given("The user is on the login Page")
    public void the_user_is_on_the_login_page() {
        gp.user_click_to_login();
    }
    @When("The user click on login button")
    public void the_user_click_on_login_button() {
        getdriver().get("https://dsportalapp.herokuapp.com/");
    }
    @Then("The user should be redirected to the home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/home");
    }
        @Given("^The user is on the DsAlgo Home Page$")
        public void the_user_is_on_the_ds_algo_home_page() {
            gp.user_click_to_login();
           //   String expectedUrl = "https://dsportalapp.herokuapp.com/home"; // Replace with the actual URL of the Graph page
            //String actualUrl = gp.getdriver().getCurrentUrl();

            //Assert.assertTrue("The user is not redirected to the Graph page", actualUrl.contains(expectedUrl));

        }

        @When("^user clicks Getting Started button in Graph module$")
        public void user_clicks_getting_started_button_in_graph_module() {
            gp.getstart();
        }
        @Then("^user should be directed to Graph overview Page$")
        public void user_should_be_directed_to_graph_overview_page() {
           System.out.println("The user is in Graph overview page");

        }
        @When("^user clicks Graph$")
        public void user_clicks_graph() {
            gp.clickGraph();
        }
        @Then("^user is redirected to Graph page$")
        public void user_is_redirected_to_graph_page() {

        }


        @Then("^user clicks Try Here button$")
        public void user_clicks_try_here_button() {

        }


    @Given("^The user is in a try here page having  tryEditor with a Run button to test$")
    public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {

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
    @When("The user Enter invalid python code in tryEditor from sheet {string}")
    public void the_user_enter_invalid_python_code_in_try_editor_from_sheet(String string) {

    }
    @When("^user click on a Run button$")
    public void user_click_on_a_run_button() {

    }
    @Then("^The user get the error message$")
    public void the_user_get_the_error_message() {

    }

}

