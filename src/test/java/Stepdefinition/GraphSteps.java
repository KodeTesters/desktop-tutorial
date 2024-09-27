package Stepdefinition;

import Pages.GraphPage;
import Runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.LoggerLoad;

import static driverFactory.DriverFactory.getdriver;
import static org.testng.AssertJUnit.assertEquals;

public class GraphSteps extends TestRunner {

    GraphPage graphPage = new GraphPage();
    String Excelpath = ConfigReader.getExcelFilePath();
    //String expectedMsg;

    @Given("The user is on the login Page")
    public void the_user_is_on_the_login_page() {
        // Navigate to the homepage and click the login button
        graphPage.user_click_to_login();
        LoggerLoad.info("User navigated to login page and logged in");
    }

    @When("The user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String username, String password) {
        // This step is already handled in the user_click_to_login method
        LoggerLoad.info("Credentials entered: " + username + " and " + password);
    }

    @Then("The user click on login button")
    public void the_user_click_on_login_button() {
        // This step is also handled in the user_click_to_login method
        LoggerLoad.info("Login button clicked");
    }

    @Then("The user redirected to homepage")
    public void theUserRedirectedToHomepage() {
        graphPage.navigateToHomePage();
    }


    // @TS_graph_02
    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        System.out.println("User is on the homepage");
    }

    @When("The user clicks the graph item from the drop down menu")
    public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
        graphPage.dropdown_graph();
    }

    @Then("The user be directed to Graph Page")
    public void the_user_be_directed_to_graph_page() {
        String Title = graphPage.getGraphPageTitle();
        LoggerLoad.info("title of current page : " + Title);
        //assertEquals(Title, "Graph", "Title not matched");
    }

    // @TS_graph_03
    @Given("The user is on the Graph Page")
    public void the_user_is_on_the_graph_page() {
        graphPage.navigateToGraphPage();
    }

    @When("The user clicks Graph link on Graph page")
    public void the_user_clicks_graph_link_on_graph_page() {
        graphPage.clickOnGraphLink();
    }

    @Then("The user should be redirected to Graph Graph page")
    public void the_user_should_be_redirected_to_graph_graph_page() {
        String Title = graphPage.getGraphPageTitle();
        LoggerLoad.info("Title of the current page is : " + Title);
        assertEquals(Title, "Graph", "Title not matched");
    }

    // @TS_graph_04
    @Given("The user navigates to Graph Graph page")
    public void the_user_navigates_to_graph_graph_page() {
        graphPage.navigateToGraphGraphPage();
    }

    @Then("The user should be directed to Editor page with Run button")
    public void the_user_should_be_directed_to_editor_page_with_run_button() {

        String Title = graphPage.getGraphPageTitle();
        LoggerLoad.info("Title of current page is :" + Title);
        assertEquals(Title, "Assessment", "Title not matched");
    }

    // TS_graph_07
    @Given("The user in editor page and navigates to the graph page")
    public void the_user_in_editor_page_and_navigates_to_the_graph_page() {
        graphPage.navigateToGraphPage();
    }

    @When("The user clicks on Graph Representations link")
    public void the_user_clicks_on_graph_representations_link() {
        graphPage.clickOnGraphRepresentationsLink();
    }

    @Then("The user should be redirected to Graph Representations page")
    public void the_user_should_be_redirected_to_graph_representations_page() {
        String Title = graphPage.getGraphPageTitle();
        LoggerLoad.info("Title of current page is :" + Title);
        assertEquals(Title, "Graph Representations", "Error found , Incorrect title found");
    }

    // TS_graph_08
    @Given("The user is in Graph Representations page")
    public void the_user_is_in_graph_representations_page() {
        graphPage.navigateToGraphRepresentationsPage();
    }

    @When("The user clicks on Tryhere link on graph representations page")
    public void the_user_clicks_on_tryhere_link_on_graph_representations_page() {
        graphPage.clickOnGraphTryhereLink();
    }

    // TS_graph_11
    @Given("The user is in Editor page and navigates to graph representations page")
    public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
        graphPage.navigateToGraphRepresentationsPage();
    }

    @When("the user clicks on Practice Questions in graph representations page")
    public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
        graphPage.clickOnGraphPracQuesLink();
    }

    @Then("The user is directed to graph Practice page")
    public void the_user_is_directed_to_graph_practice_page() {
        String Title = graphPage.getGraphPageTitle();
        LoggerLoad.info("Title of current page is :" + Title);
        assertEquals(Title, "Practice Questions", "Title not matched");
    }


}
