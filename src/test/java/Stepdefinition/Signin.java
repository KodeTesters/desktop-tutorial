package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Pages.SigninPage;
import Runner.TestRunner;

public class Signin {

	SigninPage sign = new SigninPage();
	static String username;
	static String password;
	static String message;
	Boolean isRequired;
	//String Excelpath = getexcelfilepath();
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		LoggerLoad.info("User is on Sigin Page");
        sign.login_page();
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {

			ExcelReader reader = new ExcelReader();

			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/Login.xlsx", sheetname);

			username = testdata.get(rownumber).get("username");

			password = testdata.get(rownumber).get("password");

			message = testdata.get(rownumber).get("expectedresult");

			LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

			if (username != null || password != null)

				sign.doLogin(username, password);

		}
	

	@Then("click login button")
	public void click_login_button() {
		LoggerLoad.info("User clicks on login button");
		LoggerLoad.info("Expected Message - Excel Sheet :  " + message);
		String msg = sign.click_login();
		LoggerLoad.info("Actual Message :  " + msg);
		System.out.println("Message:"+ msg);
		assertEquals(msg, message);
	}
	@Then("User clicks signout link")
	public void user_clicks_signout_link() {
	   sign.signout();
	}

}