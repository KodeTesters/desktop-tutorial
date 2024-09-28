package Stepdefinition;

import Pages.ArrayPage;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ArraySteps {
    ArrayPage ap=new ArrayPage();

    @Given("The user is on Signin page of DS Algo portal")
    public void the_user_is_on_signin_page_of_ds_algo_portal() {
        ap.signin_page();
    }

    @When("The user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String username, String password) {
        ap.valid_username_password(username, password);
    }

    @When("The user click on login button")
    public void the_user_click_on_login_button() {
        ap.login_button();
    }

    @Then("The user redirected to homepage")
    public void the_user_redirected_to_homepage() {
        ap.homepage_url();
    }

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

    @When("user clicks Try Here button in Arrays in Python page")
    public void user_clicks_try_here_button_in_arrays_in_python_page() {
        ap.tryhere();
    }

    @Then("user is redirected to a page having a TryEditor with Run button for Arrays on python")
    public void user_is_redirected_to_a_page_having_a_try_editor_with_run_button_for_arrays_on_python() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.tryeditor_page();
    }

    @When("user enters valid code {string} for Arrays on python page")
    public void user_enters_valid_code_for_arrays_on_python_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
    }

    @When("clicks Run button for Arrays on python page")
    public void clicks_run_button_for_arrays_on_python_page() {
        ap.run_button();
    }

    @Then("page displays output for Arrays on python page")
    public void page_displays_output_for_arrays_on_python_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
    }

    @Given("user is on tryEditor page for Arrays on python page")
    public void user_is_on_try_editor_page_for_arrays_on_python_page() {
        // ap.tryeditor_page();
    }

    @When("The user enters invalid python code {string} for Arrays on python page")
    public void the_user_enters_invalid_python_code_for_arrays_on_python_page(String invalidcode) throws Throwable {
        ap.invalid_code(invalidcode);
    }

    @Then("An alert message should be displayed for Arrays on python page")
    public void an_alert_message_should_be_displayed_for_arrays_on_python_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
        ap.revertback();
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

    @When("user clicks Try Here button in Arrays using List page")
    public void user_clicks_try_here_button_in_arrays_using_list_page() {
        ap.tryhere();
    }

    @Then("user is redirected to a page having a TryEditor with Run button Arrays using List")
    public void user_is_redirected_to_a_page_having_a_try_editor_with_run_button_arrays_using_list() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("user enters valid code {string} for Arrays Using List page")
    public void user_enters_valid_code_for_arrays_using_list_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
    }

    @When("clicks Run button for Arrays Using List page")
    public void clicks_run_button_for_arrays_using_list_page() {
        ap.run_button();
    }

    @Then("page displays output for Arrays Using List page")
    public void page_displays_output_for_arrays_using_list_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
    }

    @Given("user is on tryEditor page for Arrays Using List page")
    public void user_is_on_try_editor_page_for_arrays_using_list_page() {

    }

    @When("The user enters invalid python code {string} for Arrays Using List page")
    public void the_user_enters_invalid_python_code_for_arrays_using_list_page(String invalidcode) throws Throwable {
        ap.invalid_code(invalidcode);
    }

    @Then("An alert message should be displayed for Arrays Using List page")
    public void an_alert_message_should_be_displayed_for_arrays_using_list_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
        ap.revertback();
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

    @Then("user is redirected to a page having a TryEditor with Run button Basic Operations In List")
    public void user_is_redirected_to_a_page_having_a_try_editor_with_run_button_basic_operations_in_list() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
        ap.tryeditor_page();
    }

    @When("user enters valid code {string} for Basic Operations In List page")
    public void user_enters_valid_code_for_basic_operations_in_list_page(String validcode) {
        ap.editor_txtarea_validcode(validcode);
    }

    @When("clicks Run button for Basic Operations In List page")
    public void clicks_run_button_for_basic_operations_in_list_page() {
        ap.run_button();
    }

    @Then("page displays output for Basic Operations In List page")
    public void page_displays_output_for_basic_operations_in_list_page() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
    }

    @Given("user is on tryEditor page for Basic Operations In List page")
    public void user_is_on_try_editor_page_for_basic_operations_in_list_page() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);

    }

    @When("The user enters invalid python code {string} for Basic Operations In List page")
    public void the_user_enters_invalid_python_code_for_basic_operations_in_list_page(String invalidcode) throws Throwable {
        ap.invalid_code(invalidcode);

    }

    @Then("An alert message should be displayed for Basic Operations In List page")
    public void an_alert_message_should_be_displayed_for_basic_operations_in_list_page() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
        ap.revertback();
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

    @When("user clicks Try Here button in Applications of Arraypage")
    public void user_clicks_try_here_button_in_applications_of_arraypage() {
        ap.tryhere();
    }

    @When("user enters valid code {string} for Applications of Arraypage")
    public void user_enters_valid_code_for_applications_of_arraypage(String validcode) {
        ap.editor_txtarea_validcode(validcode);
    }

    @When("clicks Run button for Applications of Arraypage")
    public void clicks_run_button_for_applications_of_arraypage() {
        ap.run_button();
    }

    @Then("page displays output for Applications of Arraypage")
    public void page_displays_output_for_applications_of_arraypage() {
        String output= ap.output_display();
        System.out.println("output of code :"+ output);
    }

    @Given("user is on tryEditor page for Applications of Arraypage")
    public void user_is_on_try_editor_page_for_applications_of_arraypage() {
        String title=ap.gettitle();
        System.out.println("Title of current page:"+ title);
    }

    @When("The user enters invalid python code {string} for Applications of Arraypage")
    public void the_user_enters_invalid_python_code_for_applications_of_arraypage(String invalidcode) throws Throwable {
        ap.invalid_code(invalidcode);
    }

    @Then("An alert message should be displayed for Applications of Arraypage")
    public void an_alert_message_should_be_displayed_for_applications_of_arraypage() {
        String alertmsg =ap.alert_wrongcode();
        System.out.println("Alert message"+ alertmsg);
        ap.revertback();
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