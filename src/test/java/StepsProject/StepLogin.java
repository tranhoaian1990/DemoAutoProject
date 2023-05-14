package StepsProject;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class StepLogin {
	
	@Steps
	private LoginScenarioSteps loginSteps;
	@Given("Access login page")
	public void accessLoginPage() {
		loginSteps.open_url();
	}
	@When("Input user name: {string} and  password: {string}")
	public void inputLogin(String user, String pass) {
		loginSteps.inputLogin(user, pass);
	}
	@And("User login")
	public void userLogin(){
		loginSteps.login();
		
	}
	@Then("Login success")
	public void login_success() {
		assertEquals(loginSteps.loginMess(), "Welcome tranhoaian");
	}
	@Then("Confirm error message: {string}")
	public void confirm_error_message(String mess) throws InterruptedException {
		Thread.sleep(1000);
		assertEquals(loginSteps.errorMess(), mess);	
	}
	@And("Close page")
	public void close_page_alert() {
		loginSteps.acceptAlert();
	}
	
		
}
