package Stepdefinition;

import Pages.LinkedlistPage;
import Runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.LinkedlistPage;

public class LinkedlistSteps extends TestRunner {
    LinkedlistPage lsp=new LinkedlistPage();

    @Given("The user is on the home page after logged in")
    public void the_user_is_on_the_home_page_after_logged_in() {
        lsp.get_url();

    }

    @When("The user clicks the Getting Started button in linked list pane")
    public void the_user_clicks_the_getting_started_button_in_linked_list_pane() {

        lsp.dropdown_linkedlist();
    }

    @Then("The user redirected to Linked List  Page")
    public void the_user_redirected_to_linked_list_page() {
        lsp.gettitle();
    }


    @Given("The user is on the Linked List page after logged in")
    public void the_user_is_on_the_linked_list_page_after_logged_in() {
    }

    @When("The user clicks Introduction button")
    public void the_user_clicks_introduction_button() {
        lsp.clicks_introduction_button();
    }

    @Then("The user should be directed to Introduction of Linked List Page")
    public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
        lsp.get_url();
    }

    @Given("The user is on the Introduction of linked list page")
    public void the_user_is_on_the_introduction_of_linked_list_page() {

    }

    @When("The user clicks Try Here button of the introduction page")
    public void the_user_clicks_try_here_button_of_the_introduction_page() {
        // lsp.clicks_try_here_button_of_the_introduction_page();
    }

    @Then("The user redirected to the page having an tryEditor with a Run button to test")
    public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
        lsp.get_url();
    }

    @Given("The user is in a try here page having  tryEditor with a Run button to test")
    public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {

    }

    @When("The user Enters valid python code in tryEditor from data {string}")
    public void the_user_enters_valid_python_code_in_try_editor_from_data(String validpythoncode) {
        lsp.editor_txtarea_validcode(validpythoncode);
    }

    @When("user click on Run button")
    public void user_click_on_run_button() {
        lsp.click_on_run_button();
    }

    @Then("The user should be presented with the Run")
    public void the_user_should_be_presented_with_the_run() {
        lsp.output_display();
        String output= lsp.output_display();
        System.out.println("output of code :"+ output);

    }

    @When("The user Enter invalid python code in tryEditor from sheet {string}")
    public void the_user_enter_invalid_python_code_in_try_editor_from_sheet(String invalidpythoncode) {

        lsp.invalid_code(invalidpythoncode);
    }

    @When("user click on a Run button")
    public void user_click_on_a_run_button() {
        this.user_click_on_run_button();
    }

    @Then("The user get the error message")
    public void the_user_get_the_error_message() {

        String alertmsg =lsp.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
        lsp.revertback();
    }


    @When("The user clicks creating a linked list button")
    public void the_user_clicks_creating_a_linked_list_button() {
        lsp.creating_a_linked_list_button();
    }

    @Then("The user should be directed to Creating Linked List of Linked List Page")
    public void the_user_should_be_directed_to_creating_linked_list_of_linked_list_page() {
        lsp.get_url();
    }

    @Given("The user is on the Creating a Linked List after logged in")
    public void the_user_is_on_the_creating_a_linked_list_after_logged_in() {

    }

    @When("The user clicks Try Here button in the creating linked list page")
    public void the_user_clicks_try_here_button_in_the_creating_linked_list_page() {
        this.the_user_clicks_try_here_button_of_the_introduction_page();
    }

    @Then("The user should be redirected to a page having an tryEditor with a Run button to test")
    public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
        this.the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test();

    }

    @When("The user clicks the Types of Linked List button")
    public void the_user_clicks_the_types_of_linked_list_button() {
        lsp.clicks_the_types_of_linked_list_button();
    }

    @Then("The user should be directed to Types of Linked List of Linked List Page")
    public void the_user_should_be_directed_to_types_of_linked_list_of_linked_list_page() {
        lsp.directed_to_types_of_linked_list_of_linked_list_page();
    }

    @Given("The user is in the Types of Linked list after logged in")
    public void the_user_is_in_the_types_of_linked_list_after_logged_in() {
    }

    @When("The user clicks Try Here button in the types of linked list page")
    public void the_user_clicks_try_here_button_in_the_types_of_linked_list_page() {
        this.the_user_clicks_try_here_button_of_the_introduction_page();
    }

    @When("The user clicks the Implement Linked List in Python button")
    public void the_user_clicks_the_implement_linked_list_in_python_button() {
        lsp.clicks_the_implement_linked_list_in_python_button();
    }

    @Then("The user should be directed to Implement Linked List in Python of Linked List Page")
    public void the_user_should_be_directed_to_implement_linked_list_in_python_of_linked_list_page() {
        lsp.directed_to_implement_linked_list_in_python_of_linked_list_page();
    }

    @Given("The user is in the Implement Linked List in Python page")
    public void the_user_is_in_the_implement_linked_list_in_python_page() {
    }

    @When("The user clicks Try Here button in the implemented linked list in python page")
    public void the_user_clicks_try_here_button_in_the_implemented_linked_list_in_python_page() {
        this.the_user_clicks_try_here_button_of_the_introduction_page();
    }

    @When("The user clicks Traversal button")
    public void the_user_clicks_traversal_button() {
        lsp.clicks_traversal_button();
    }

    @Then("The user directed to Traversal Page of linked list")
    public void the_user_directed_to_traversal_page_of_linked_list() {
        //lsp.directed_to_traversal_page_of_linked_list();
    }


    @Given("user in  traversal page")
    public void user_in_traversal_page() {

    }

    @When("user clicks Try Here button in traversal page")
    public void user_clicks_try_here_button_in_traversal_page() {
        this.the_user_clicks_try_here_button_of_the_introduction_page();
    }

    @Then("user should be redirected to a page having an tryEditor with a Run button to test")
    public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {

    }

    @When("The user clicks Insertion button")
    public void the_user_clicks_insertion_button() {
        lsp.clicks_insertion_button();
    }

    @Then("The user should be directed to Insertion of Linked List Page")
    public void the_user_should_be_directed_to_insertion_of_linked_list_page() {
        lsp.directed_to_insertion_of_linked_list_page();
    }

    @Given("user in insertion after logged in")
    public void user_in_insertion_after_logged_in() {
    }

    @When("user clicks Try Here button in Insertion page")
    public void user_clicks_try_here_button_in_insertion_page() {
        this.the_user_clicks_try_here_button_of_the_introduction_page();
    }

    @When("The user clicks the Deletion button")
    public void the_user_clicks_the_deletion_button() {
        lsp.clicks_the_deletion_button();
    }

    @Then("The user should be directed to Deletion of Linked List Page")
    public void the_user_should_be_directed_to_deletion_of_linked_list_page() {
        lsp.directed_to_deletion_of_linked_list_page();
    }

    @Given("The user is on the Deletion after logged in")
    public void the_user_is_on_the_deletion_after_logged_in() {
    }

    @When("The user clicks Try Here button in the Deletion page")
    public void the_user_clicks_try_here_button_in_the_deletion_page() {
        this.the_user_clicks_try_here_button_of_the_introduction_page();
    }

    @When("The user clicks Practice Questions button")
    public void the_user_clicks_practice_questions_button() {
        lsp.clicks_practice_questions_button();

    }

    @Then("The user should be directed to Practice page")
    public void the_user_should_be_directed_to_practice_page(){
        lsp.gettitle();
        lsp.signout();
    }


}


