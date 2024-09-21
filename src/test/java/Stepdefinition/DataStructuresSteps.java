package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.DataStructures;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.textui.TestRunner;

public class DataStructuresSteps extends TestRunner{
    DataStructures ds = new DataStructures();
    
@When("user clicks Getting Started button in DataStructures module")
public void user_clicks_getting_started_button_in_data_structures_module() {
    ds.user_click_getstartlink();
    
}

@Then("user should be directed to DataStructures overview Page")
public void user_should_be_directed_to_data_structures_overview_page() {
     
}
@When("user clicks Time Complexity")
public void user_clicks_time_complexity() {
    ds.user_click_timecomplex();
}

@Then("user is redirected to Time Complexity page")
public void user_is_redirected_to_time_complexity_page() {
    
}

@Given("The user is in a try here page having  tryEditor with a Run button to test")
public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
    ds.try_here();
    
}
@Then("Theuser should be able to enter the correct code in the tryEditor{string}")
public void theuser_should_be_able_to_enter_the_correct_code_in_the_try_editor(String validcode) {
    ds.enter_vaild_code(validcode);
}
@When("The user clicks the run button")
public void the_user_clicks_the_run_button() {
    ds.runbutton();
}
@Then("user should be presented with the run")
public void user_should_be_presented_with_the_run() {
    ds.output_display();
			String output= ds.output_display();
			  System.out.println("output of code :"+ output);
}
@When("The user runs the code in tryEditor with invalid input for Time Complexity in DataStructures page")
public void the_user_runs_the_code_in_try_editor_with_invalid_input_for_time_complexity_in_data_structures_page() {
    ds.invalid_code("invalidcode");
}
@Then("The user should be presented with an alert window")
public void the_user_should_be_presented_with_an_alert_window() {
    ds.error();
    //	Alert alert=driver.switchTo().alert();
    //	alert.accept();
    // System.out.println(" error message : " + alert);
    
}



@Given("The user is on the Data Structures Introduction Page")
public void the_user_is_on_the_data_structures_introduction_page() {
    //dsp.user_isin_datastruct_intropage();
	//    driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");

   
}
@When("The user clicks on the Practice Questions button")
public void the_user_clicks_on_the_practice_questions_button() {
    ds.click_practiceques();
		//WebElement practiceques=driver.findElement(By.xpath("//*[@id=\"content\"]/a"));
  //practiceques.click(); 
}
@Then("The user should be redirected to the Practice Questions Page")
public void the_user_should_be_redirected_to_the_practice_questions_page() {
 ds.gettitle();
  ds.signout();   
}
//@Then("capture the screenshot")
//public void capture_the_screenshot() throws Exception {
//			dsp.capture_screenshot();
////TakesScreenshot screenshot=(TakesScreenshot) driver;
////	
////	File source=screenshot.getScreenshotAs(OutputType.FILE);
////	File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\practicequespage.png");
////	FileHandler.copy(source,destination);
//}






@When("The user clicks on the DataStructures Introduction dropdown")
public void the_user_clicks_on_the_data_structures_introduction_dropdown() {
    
}
@Then("The modules in the dropdown should be displayed")
public void the_modules_in_the_dropdown_should_be_displayed() {
    
}
@When("The user clicks on the Stack module")
public void the_user_clicks_on_the_stack_module() {
    
}
@Then("The user should be redirected to the Stack module")
public void the_user_should_be_redirected_to_the_stack_module() {
    
}
@When("The user clicks on the Queue module")
public void the_user_clicks_on_the_queue_module() {
    
}
@Then("The user should be redirected to the Queue module")
public void the_user_should_be_redirected_to_the_queue_module() {
    
}
@When("The user clicks on the Linked List module")
public void the_user_clicks_on_the_linked_list_module() {
    
}
@Then("The user should be redirected to the Linked List module")
public void the_user_should_be_redirected_to_the_linked_list_module() {
    
}
@When("The user clicks on the Tree module")
public void the_user_clicks_on_the_tree_module() {
    
}
@Then("The user should be redirected to the Tree module")
public void the_user_should_be_redirected_to_the_tree_module() {
    
}
@When("The user clicks on the Graph module")
public void the_user_clicks_on_the_graph_module() {
   
}
@Then("The user should be redirected to the Graph module")
public void the_user_should_be_redirected_to_the_graph_module() {
   
}

@Given("open Ds-Algo portal")
public void open_ds_algo_portal() {
 
}




@When("The user enters incomplete code in the tryEditor")
public void the_user_enters_incomplete_code_in_the_try_editor() {
    
}


}