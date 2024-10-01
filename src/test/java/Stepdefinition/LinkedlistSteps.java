package Stepdefinition;

import Pages.LinkedlistPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedlistSteps  {
    LinkedlistPage lsp=new LinkedlistPage();
    @Given("The user is on the home page after logged in")
    public void the_user_is_on_the_home_page_after_logged_in() {
        lsp.get_url();

    }

    @When("The user clicks the Getting Started button in linked list pane")
    public void the_user_clicks_the_getting_started_button_in_linked_list_pane() {
        //lsp.getting_started_button_in_linked_list_pane();
        lsp.dropdown_linkedlist();
    }

    @Then("The user redirected to Linked List  Page")
    public void the_user_redirected_to_linked_list_page() {
        lsp.gettitle();
    }

    //@TS_02
    @Given("The user is on the Linked List page after logged in")
    public void the_user_is_on_the_linked_list_page_after_logged_in() {
    }

    @When("The user clicks Introduction button")
    public void the_user_clicks_introduction_button() {
        lsp.clicks_introduction_button();
    }

    @Then("The user should be directed to Introduction of Linked List Page")
    public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
        //  lsp.directed_to_introduction_of_linked_list_page();
        lsp.get_url();
    }
    @When("The user clicks creating a linked list button")
    public void the_user_clicks_creating_a_linked_list_button() {
        lsp.creating_a_linked_list_button();
    }

    @Then("The user should be directed to Creating Linked List of Linked List Page")
    public void the_user_should_be_directed_to_creating_linked_list_of_linked_list_page() {
        // lsp.directed_to_creating_linked_list_of_linked_list_page();
        lsp.get_url();
    }
    @When("The user clicks the Types of Linked List button")
    public void the_user_clicks_the_types_of_linked_list_button() {
        lsp.clicks_the_types_of_linked_list_button();
    }

    @Then("The user should be directed to Types of Linked List of Linked List Page")
    public void the_user_should_be_directed_to_types_of_linked_list_of_linked_list_page() {
        lsp.directed_to_types_of_linked_list_of_linked_list_page();
    }
    @When("The user clicks the Implement Linked List in Python button")
    public void the_user_clicks_the_implement_linked_list_in_python_button() {
        lsp.clicks_the_implement_linked_list_in_python_button();
    }

    @Then("The user should be directed to Implement Linked List in Python of Linked List Page")
    public void the_user_should_be_directed_to_implement_linked_list_in_python_of_linked_list_page() {
        lsp.directed_to_implement_linked_list_in_python_of_linked_list_page();
    }
    @When("The user clicks Traversal button")
    public void the_user_clicks_traversal_button() {
        lsp.clicks_traversal_button();
    }

    @Then("The user directed to Traversal Page of linked list")
    public void the_user_directed_to_traversal_page_of_linked_list() {
        lsp.directed_to_traversal_page_of_linked_list();
    }
    @When("The user clicks Insertion button")
    public void the_user_clicks_insertion_button() {
        lsp.clicks_insertion_button();
    }

    @Then("The user should be directed to Insertion of Linked List Page")
    public void the_user_should_be_directed_to_insertion_of_linked_list_page() {
        lsp.directed_to_insertion_of_linked_list_page();
    }
    @When("The user clicks the Deletion button")
    public void the_user_clicks_the_deletion_button() {
        lsp.clicks_the_deletion_button();
    }

    @Then("The user should be directed to Deletion of Linked List Page")
    public void the_user_should_be_directed_to_deletion_of_linked_list_page() {
        lsp.directed_to_deletion_of_linked_list_page();
    }
    @When("The user clicks Practice Questions button")
    public void the_user_clicks_practice_questions_button() {
        lsp.clicks_practice_questions_button();

    }

    @Then("The user should be directed to Practice page")
    public void the_user_should_be_directed_to_practice_page() {
        //lsp.directed_to_practice_page();
        lsp.gettitle();
        lsp.signout();
    }


}


