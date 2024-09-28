package Stepdefinition;

import Pages.TreePage;
import org.openqa.selenium.JavascriptExecutor;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TreeSteps extends DriverFactory{

    DriverFactory df=new DriverFactory();
    TreePage tree =new TreePage();

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
    // @TS_tree_02
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
    // @TS_tree_03
    @Given("user in overview of trees after logged in")
    public void user_in_overview_of_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
    }

    @When("user clicks Try Here button in  tree page")
    public void user_clicks_try_here_button_in_tree_page() {
        //tree.clicks_try_here_button_in_tree_page();
        tree.tryhere();
    }

    @Then("user redirected to tryEditor page with Run button")
    public void user_redirected_to_try_editor_page_with_run_button() {
        //tree.redirected_to_try_editor_page_with_run_button();
        tree.get_url();
    }
    //@TS_tree_05
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
    //TS_tree_06
    @Given("user in terminologies page after logged in")
    public void user_in_terminologies_page_after_logged_in() {
        // tree.in_terminologies_page_after_logged_in();
    }

    @When("user clicks Try Here button in Terminologies page")
    public void user_clicks_try_here_button_in_terminologies_page() {
        JavascriptExecutor jse = (JavascriptExecutor)getdriver();
        jse.executeScript("window.scrollBy(0,200)");
        this.user_clicks_try_here_button_in_tree_page();
    }

    @Then("user redirected to page having an tryEditor with a Run button to test")
    public void user_redirected_to_page_having_an_try_editor_with_a_run_button_to_test() {
        //tree.redirected_to_page_having_an_try_editor_with_a_run_button_to_test();
        tree.get_url();
    }

    //@TS_tree_08
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
    //@TS_tree_09
    @Given("user on types of trees after logged in")
    public void user_on_types_of_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
    }

    @When("user clicks Try Here button in  types of tree page")
    public void user_clicks_try_here_button_in_types_of_tree_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }

    //@TS_tree_11
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
    //@TS_tree_12
    @Given("user in tree traversals after logged in")
    public void user_in_tree_traversals_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/tree-traversals/");
    }

    @When("user clicks Try Here button in tree traversals page")
    public void user_clicks_try_here_button_in_tree_traversals_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    // @TS_tree_14
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
    @When("user clicks Try Here button in traversal illustration page")
    public void user_clicks_try_here_button_in_traversal_illustration_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }

    //TS_tree_17
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

    @When("user clicks Try Here button in binary tree page")
    public void user_clicks_try_here_button_in_binary_tree_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }

    //TS_tree_20
    @When("user clicks types of binary trees button")
    public void user_clicks_types_of_binary_trees_button() {
        tree.clicks_types_of_binary_trees_button();
    }

    @Then("user directed to Types of Binary Trees of tree Page")
    public void user_directed_to_types_of_binary_trees_of_tree_page() {
        //tree.directed_to_types_of_binary_trees_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_21
    @Given("user in types of binary trees after logged in")
    public void user_in_types_of_binary_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
    }

    @When("user clicks Try Here button in types of binary trees page")
    public void user_clicks_try_here_button_in_types_of_binary_trees_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_23
    @When("user clicks Implementation in Python button")
    public void user_clicks_implementation_in_python_button() {
        tree.clicks_implementation_in_python_button();
    }

    @Then("user directed to Implementation in Python of tree Page")
    public void user_directed_to_implementation_in_python_of_tree_page() {
        //ree.directed_to_implementation_in_python_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_24
    @Given("user in Implementation in Python after logged in")
    public void user_in_implementation_in_python_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
    }

    @When("user clicks Try Here button in implementation in python page")
    public void user_clicks_try_here_button_in_implementation_in_python_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_26
    @When("user clicks binary tree traversals button")
    public void user_clicks_binary_tree_traversals_button() {
        tree.clicks_binary_tree_traversals_button();
    }
    @Then("user directed to Binary Tree Traversals of tree Page")
    public void user_directed_to_binary_tree_traversals_of_tree_page() {
        //tree.directed_to_binary_tree_traversals_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_27
    @Given("user in Binary Tree Traversals after logged in")
    public void user_in_binary_tree_traversals_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/");
    }
    @When("user clicks Try Here button in binary tree traversals page")
    public void user_clicks_try_here_button_in_binary_tree_traversals_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_29
    @When("user clicks Implementation of Binary Trees button")
    public void user_clicks_implementation_of_binary_trees_button() {
        tree.clicks_implementation_of_binary_trees_button();
    }
    @Then("user directed to Implementation of Binary Trees of tree Page")
    public void user_directed_to_implementation_of_binary_trees_of_tree_page() {
        //tree.directed_to_implementation_of_binary_trees_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_30
    @Given("user in Implementation of Binary Trees after logged in")
    public void user_in_implementation_of_binary_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/");
    }
    @When("user clicks Try Here button in Implementation of Binary Trees page")
    public void user_clicks_try_here_button_in_implementation_of_binary_trees_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_32
    @When("user clicks Applications of Binary Trees button")
    public void user_clicks_applications_of_binary_trees_button() {
        tree.clicks_applications_of_binary_trees_button();
    }
    @Then("user directed to Applications of Binary Trees of tree Page")
    public void user_directed_to_applications_of_binary_trees_of_tree_page() {
        //tree.directed_to_applications_of_binary_trees_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_33
    @Given("user in Applications of Binary Trees after logged in")
    public void user_in_applications_of_binary_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/");
    }
    @When("user clicks Try Here button in Applications of Binary Trees page")
    public void user_clicks_try_here_button_in_applications_of_binary_trees_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_35
    @When("user clicks Binary Search Trees button")
    public void user_clicks_binary_search_trees_button() {
        tree.clicks_binary_search_trees_button();
    }
    @Then("user directed to Binary Search Trees of tree Page")
    public void user_directed_to_binary_search_trees_of_tree_page() {
        //tree.directed_to_binary_search_trees_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_36
    @Given("user in Binary Search Trees after logged in")
    public void user_in_binary_search_trees_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/binary-search-trees/");
    }
    @When("user clicks Try Here button in Binary Search Trees page")
    public void user_clicks_try_here_button_in_binary_search_trees_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_38
    @When("user clicks Implementation of BST button")
    public void user_clicks_implementation_of_bst_button() {
        tree.clicks_implementation_of_bst_button();
    }
    @Then("user directed to Implementation of BST of tree Page")
    public void user_directed_to_implementation_of_bst_of_tree_page() {
        //tree.directed_to_implementation_of_bst_of_tree_page();
        tree.gettitle();
    }
    //TS_tree_39
    @Given("user in Implementation of BST after logged in")
    public void user_in_implementation_of_bst_after_logged_in() {
        //getdriver().get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
    }
    @When("user clicks Try Here button in Implementation of BST page")
    public void user_clicks_try_here_button_in_implementation_of_bst_page() {
        this.user_clicks_try_here_button_in_tree_page();
    }
    //TS_tree_41
    @When("The user clicks Practice Questions button of tree page")
    public void the_user_clicks_practice_questions_button_of_tree_page() {
        tree.clicks_practice_questions_button_of_tree_page();
        tree.signout();
    }


}