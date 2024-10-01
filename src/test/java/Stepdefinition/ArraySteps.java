package Stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.ArrayPage;

public class ArraySteps {
    ArrayPage ap = new ArrayPage();
    @When("user clicks on the {string} button in Array pane or select Array item from drop down menu")
    public void user_clicks_on_the_button_in_array_pane_or_select_array_item_from_drop_down_menu(String string) {
        // ap.getstarted_array();
        ap.dropdown_array();
    }

    @Then("user is redirected to Array Data Structure page")
    public void user_is_redirected_to_array_data_structure_page() {
        // ap.array_page();
    }
    @Given("user is on Array Data Structure page")
    public void user_is_on_array_data_structure_page() {
        ap.gettitle();
        //System.out.println("Title of current page:"+ title);
    }

    @When("The user clicks Arrays in Python link")
    public void the_user_clicks_arrays_in_python_link() {
        ap.arrays_on_python_link();
    }

    @Then("The user is redirected to Arrays in Python page")
    public void the_user_is_redirected_to_arrays_in_python_page() {
        ap.array_python_page();
    }
    @Given("User is on Arrays Using python page")
    public void user_is_on_arrays_using_python_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.array_python_page();
    }

    @When("The user clicks on Arrays Using List link")
    public void the_user_clicks_on_arrays_using_list_link() {

        ap.arrays_using_list();
    }

    @Then("user is redirected to Arrays Using List page")
    public void user_is_redirected_to_arrays_using_list_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }
    @Given("User is on Arrays Using List page")
    public void user_is_on_arrays_using_list_page() {
        ap.array_python_page();
    }

    @When("The user clicks on Basic Operations In List link")
    public void the_user_clicks_on_basic_operations_in_list_link() {
        ap.basic_operations();
    }

    @Then("user is redirected to Basic Operations In List page")
    public void user_is_redirected_to_basic_operations_in_list_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user clicks Try Here button in Basic Operations In List page")
    public void user_clicks_try_here_button_in_basic_operations_in_list_page() {
        ap.tryhere();
    }
    @Given("User is on Basic Operations In List Page")
    public void user_is_on_basic_operations_in_list_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.array_python_page();
    }

    @When("The user clicks on Applications of Array link")
    public void the_user_clicks_on_applications_of_array_link() {
        ap.applications_of_array();
    }

    @Then("user is redirected to Applications of Array page")
    public void user_is_redirected_to_applications_of_array_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }
    @Given("User is on Arrays on python Page")
    public void user_is_on_arrays_on_python_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.array_python_page();
    }

    @When("The user clicks on Practice Questions link")
    public void the_user_clicks_on_practice_questions_link() {
        ap.practice_questions();
    }

    @Then("user is redirected to practice page")
    public void user_is_redirected_to_practice_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        // ap.practice_page();
    }

    @Then("user clicks on Search the array link")
    public void user_clicks_on_search_the_array_link() {
        ap.search_the_array();
    }

    @Then("user is redirected to questions1 page")
    public void user_is_redirected_to_questions1_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user enters code {string} in questions1 page")
    public void user_enters_code_in_questions1_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
        ap.run_button();
    }

    @Then("An alert message should be displayed in questions1 page")
    public void an_alert_message_should_be_displayed_in_questions1_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);

    }

    @When("user clicks submit button in questions1 page")
    public void user_clicks_submit_button_in_questions1_page() {
        ap.submitbtn();

    }

    @Then("submission output is displayed on in questions1 page")
    public void submission_output_is_displayed_on_in_questions1_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
        ap.revertback();
    }

    @Given("The user is on the Practice page")
    public void the_user_is_on_the_practice_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.practice_page();
    }

    @When("The user clicks Max Consecutive Ones link")
    public void the_user_clicks_max_consecutive_ones_link() {
        ap.maxConsecOnes();
    }

    @Then("The user should be redirected to question2 page")
    public void the_user_should_be_redirected_to_question2_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user enters code {string} in questions2 page")
    public void user_enters_code_in_questions2_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
        ap.run_button();
    }

    @Then("An alert message should be displayed in questions2 page")
    public void an_alert_message_should_be_displayed_in_questions2_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
    }

    @When("user clicks submit button in questions2 page")
    public void user_clicks_submit_button_in_questions2_page() {
        ap.submitbtn();
    }

    @Then("submission output is displayed on in questions2 page")
    public void submission_output_is_displayed_on_in_questions2_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
        ap.revertback();
    }

    @Given("The user is on the Practice page for Find Numbers with Even Number of Digits")
    public void the_user_is_on_the_practice_page_for_find_numbers_with_even_number_of_digits() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.practice_page();
    }

    @When("The user clicks Find Numbers with Even Number of Digits link")
    public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
        ap.findnumbers();
    }

    @Then("The user should be redirected to questions3 page")
    public void the_user_should_be_redirected_to_questions3_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user enters code {string} in questions3 page")
    public void user_enters_code_in_questions3_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
        ap.run_button();
    }

    @Then("An alert message should be displayed in questions3 page")
    public void an_alert_message_should_be_displayed_in_questions3_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
    }

    @When("user clicks submit button in questions3 page")
    public void user_clicks_submit_button_in_questions3_page() {
        ap.submitbtn();
    }

    @Then("submission output is displayed on in questions3 page")
    public void submission_output_is_displayed_on_in_questions3_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
        ap.revertback();
    }

    @Given("The user is on the Practice page for Squares of a Sorted Array page")
    public void the_user_is_on_the_practice_page_for_squares_of_a_sorted_array_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.practice_page();
    }

    @When("user clicks Squares of  a Sorted Array link")
    public void user_clicks_squares_of_a_sorted_array_link() {
        ap.squaresSortedArray();
    }

    @Then("user is redirected to questions4 page")
    public void user_is_redirected_to_questions4_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user enters code {string} in questions4 page")
    public void user_enters_code_in_questions4_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
        ap.run_button();
    }

    @Then("An alert message should be displayed in questions4 page")
    public void an_alert_message_should_be_displayed_in_questions4_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
    }

    @When("user clicks submit button in questions4 page")
    public void user_clicks_submit_button_in_questions4_page() {
        ap.submitbtn();
    }

    @Then("submission output is displayed on in questions4 page")
    public void submission_output_is_displayed_on_in_questions4_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
        ap.revertback();
    }

    @Then("click signout for Array page")
    public void click_signout_for_array_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.practice_page();
        ap.signout();
    }


}