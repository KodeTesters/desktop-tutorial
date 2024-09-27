package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.GraphPage;
import Runner.TestRunner;

public class GraphSteps extends TestRunner {
    GraphPage gp=new GraphPage();
    @Given("user is in the Home page after logged in")
    public void user_is_in_the_home_page_after_logged_in() {
        gp.get_url();
    }

    @When("user clicks Getting Started button in Graph module")
    public void user_clicks_getting_started_button_in_graph_module() {
        gp.dropdown_graph();
    }

    @Then("user should be directed to Graph overview Page")
    public void user_should_be_directed_to_graph_overview_page() {
        gp.gettitle();
    }

    @When("user clicks Graph")
    public void user_clicks_graph() {
        gp.clickgraph();
    }

    @Then("user is redirected to Graph page")
    public void user_is_redirected_to_graph_page() {
        gp.gettitle();
    }

    @Given("user is navigated to Graph page")
    public void user_is_navigated_to_graph_page() {

    }

    @When("user clicks graphical representation")
    public void user_clicks_graphical_representation() {
        gp.click_graphicalrepresent();
    }

    @Then("user clicks tryhere")
    public void user_clicks_tryhere() {
        gp.tryhere();
    }

    @Given("user in Graph page")
    public void user_in_graph_page() {
        gp.get_url();
    }

    @When("The user clicks Practice Questions button of Graph page")
    public void the_user_clicks_practice_questions_button_of_graph_page() {
        gp.practice_questions();

    }

}