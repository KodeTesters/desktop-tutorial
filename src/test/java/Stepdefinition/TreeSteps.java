package Stepdefinition;

import Pages.TreePage;
import org.openqa.selenium.JavascriptExecutor;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TreeSteps {
    TreePage tree= new TreePage();

    //	 @TS_tree_01
    @Given("user  on  home page after logged in")
    public void user_on_home_page_after_logged_in() {
        //tree.the_user_redirected_to_homepage();
        tree.get_url();
    }

    @When("user clicks Getting Started button on tree pane")
    public void user_clicks_getting_started_button_on_tree_pane() {
        tree.clicks_getting_started_button_on_tree_pane();
    }

    @Then("user redirected to tree Page")
    public void user_redirected_to_tree_page() {
        tree.redirected_to_tree_page();
    }
    //@TS_tree_02
    @Given("user on Tree page after logged in")
    public void user_on_tree_page_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/");
    }

    @When("user clicks on Overview of Trees link")
    public void user_clicks_on_overview_of_trees_link() {
        tree.clicks_on_overview_of_trees_link();
    }

    @Then("user directed to Overview of Trees Page")
    public void user_directed_to_overview_of_trees_page() {
        //tree.directed_to_overview_of_trees_page();
        tree.gettitle();
    }
    @Given("user is on  tree page after logged in")
    public void user_is_on_tree_page_after_logged_in() {
        //tree.tree_page_after_logged_in();
    }

    @When("user clicks on Terminologies button")
    public void user_clicks_on_terminologies_button() {
        tree.clicks_on_terminologies_button();
    }

    @Then("user redirected to Terminologies of tree Page")
    public void user_redirected_to_terminologies_of_tree_page() {
        //tree.redirected_to_terminologies_of_tree_page();
        tree.gettitle();
    }
    @Given("The user is on the tree page after logged in")
    public void the_user_is_on_the_tree_page_after_logged_in() {
        // tree.on_the_tree_page_after_logged_in();

    }

    @When("The user clicks on the Types of Trees button")
    public void the_user_clicks_on_the_types_of_trees_button() {
        tree.clicks_on_the_types_of_trees_button();
    }

    @Then("The user should be directed to the Types of Trees of tree Page")
    public void the_user_should_be_directed_to_the_types_of_trees_of_tree_page() {
        //tree.directed_to_the_types_of_trees_of_tree_page();
        tree.gettitle();
    }
    @Given("user in Tree page after logged in")
    public void user_in_tree_page_after_logged_in() {
        tree.in_tree_page_after_logged_in();
    }

    @When("user clicks on Tree Traversals button")
    public void user_clicks_on_tree_traversals_button() {
        tree.clicks_on_tree_traversals_button();
    }

    @Then("user directed to Tree Traversals of tree Page")
    public void user_directed_to_tree_traversals_of_tree_page() {
        //tree.directed_to_tree_traversals_of_tree_page();
        tree.gettitle();
    }
    @When("user clicks Traversal illustration button")
    public void user_clicks_traversal_illustration_button() {
        tree.clicks_traversal_illustration_button();
    }

    @Then("user directed to Traversals-Illustration of tree Page")
    public void user_directed_to_traversals_illustration_of_tree_page() {
        //tree.directed_to_traversals_illustration_of_tree_page();
        tree.gettitle();
    }
    // @TS_tree_15
    @Given("user in traversal illustration after logged in")
    public void user_in_traversal_illustration_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/traversals-illustration/");
    }
    @When("user clicks binary trees button")
    public void user_clicks_binary_trees_button() {
        tree.clicks_binary_trees_button();
    }

    @Then("user directed to Binary Trees of tree Page")
    public void user_directed_to_binary_trees_of_tree_page() {
        //tree.directed_to_binary_trees_of_tree_page();
        tree.gettitle();
    }
    // @TS_tree_18
    @Given("user in binary trees after logged in")
    public void user_in_binary_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/binary-trees/");
    }
    @When("user clicks types of binary trees button")
    public void user_clicks_types_of_binary_trees_button() {
        tree.clicks_types_of_binary_trees_button();
    }

    @Then("user directed to Types of Binary Trees of tree Page")
    public void user_directed_to_types_of_binary_trees_of_tree_page() {
        //tree.directed_to_types_of_binary_trees_of_tree_page();
        tree.gettitle();
    }
    @When("user clicks Implementation in Python button")
    public void user_clicks_implementation_in_python_button() {
        tree.clicks_implementation_in_python_button();
    }

    @Then("user directed to Implementation in Python of tree Page")
    public void user_directed_to_implementation_in_python_of_tree_page() {
        //ree.directed_to_implementation_in_python_of_tree_page();
        tree.gettitle();
    }
    @When("user clicks binary tree traversals button")
    public void user_clicks_binary_tree_traversals_button() {
        tree.clicks_binary_tree_traversals_button();
    }
    @Then("user directed to Binary Tree Traversals of tree Page")
    public void user_directed_to_binary_tree_traversals_of_tree_page() {
        //tree.directed_to_binary_tree_traversals_of_tree_page();
        tree.gettitle();
    }
    @When("user clicks Implementation of Binary Trees button")
    public void user_clicks_implementation_of_binary_trees_button() {
        tree.clicks_implementation_of_binary_trees_button();
    }
    @Then("user directed to Implementation of Binary Trees of tree Page")
    public void user_directed_to_implementation_of_binary_trees_of_tree_page() {
        //tree.directed_to_implementation_of_binary_trees_of_tree_page();
        tree.gettitle();
    }
    @When("user clicks Applications of Binary Trees button")
    public void user_clicks_applications_of_binary_trees_button() {
        tree.clicks_applications_of_binary_trees_button();
    }
    @Then("user directed to Applications of Binary Trees of tree Page")
    public void user_directed_to_applications_of_binary_trees_of_tree_page() {
        //tree.directed_to_applications_of_binary_trees_of_tree_page();
        tree.gettitle();
    }

    @When("user clicks Binary Search Trees button")
    public void user_clicks_binary_search_trees_button() {
        tree.clicks_binary_search_trees_button();
    }
    @Then("user directed to Binary Search Trees of tree Page")
    public void user_directed_to_binary_search_trees_of_tree_page() {
        //tree.directed_to_binary_search_trees_of_tree_page();
        tree.gettitle();
    }
    @When("user clicks Implementation of BST button")
    public void user_clicks_implementation_of_bst_button() {
        tree.clicks_implementation_of_bst_button();
    }
    @Then("user directed to Implementation of BST of tree Page")
    public void user_directed_to_implementation_of_bst_of_tree_page() {
        //tree.directed_to_implementation_of_bst_of_tree_page();
        tree.gettitle();
    }
    @Given("user in Implementation of BST after logged in")
    public void user_in_implementation_of_bst_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
    }
    @When("The user clicks Practice Questions button of tree page")
    public void the_user_clicks_practice_questions_button_of_tree_page() {
        tree.clicks_practice_questions_button_of_tree_page();
        tree.signout();
    }

}