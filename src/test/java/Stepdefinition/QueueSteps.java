package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.QueuePage;
import Runner.TestRunner;

public class QueueSteps {
    QueuePage qp=new QueuePage();
    @When("user clicks on the {string} button in Queue pane or select Queue item from drop down menu")
    public void user_clicks_on_the_button_in_queue_pane_or_select_queue_item_from_drop_down_menu(String string) {
        qp.getstarted_queue();
    }

    @Then("user is redirected to Queue Data Structure page")
    public void user_is_redirected_to_queue_data_structure_page() {
        String queuetitle=qp.gettitle();
        System.out.println("Current Url"+queuetitle);
    }

    @When("The user clicks Implementation of Queue in Python link")
    public void the_user_clicks_implementation_of_queue_in_python_link() {
        qp.implementation_of_queue();
    }

    @Then("The user is redirected to Implementation of Queue in Python page")
    public void the_user_is_redirected_to_implementation_of_queue_in_python_page() {

    }
    @Given("User is on Implementation of Queue in Python page")
    public void user_is_on_implementation_of_queue_in_python_page() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);
    }
    @Given("User is on Implementation using collections page")
    public void user_is_on_implementation_using_collections_page() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);
    }
    @When("The user clicks on Implementation using collections.deque link")
    public void the_user_clicks_on_implementation_using_collections_deque_link() {
        qp.implementation_using_collections();
    }

    @Then("user is redirected to Implementation using collections.deque page")
    public void user_is_redirected_to_implementation_using_collections_deque_page() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("The user clicks on Implementation using array link")
    public void the_user_clicks_on_implementation_using_array_link() {
        qp.implementation_using_array();
    }

    @Then("user is redirected to Implementation using array page")
    public void user_is_redirected_to_implementation_using_array_page() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);
    }
    @Given("User is on Implementation using array page")
    public void user_is_on_implementation_using_array_page() {

    }

    @When("The user clicks on Queue Operations link")
    public void the_user_clicks_on_queue_operations_link() {
        qp.queue_op();
    }

    @Then("user is redirected to Queue Operations page")
    public void user_is_redirected_to_queue_operations_page() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);

    }
    @Given("user is on Queue Operations page")
    public void user_is_on_queue_operations_page() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user clicks on Practice Questions link")
    public void user_clicks_on_practice_questions_link() {
        qp.practice_questions();
    }

    @Then("user is redirected to Practice Questions")
    public void user_is_redirected_to_practice_questions() {
        String title=qp.gettitle();
        System.out.println("Title of current page:"+ title);
        qp.signout();
    }
}