package StepsProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class StepSignUpAndAnotherPages {
	@Steps
	private SignUpAndAnotherPagesScenarioSteps signupSteps;
	
	@Given("Access signup page")
	public void accessSignupPage() {
		signupSteps.open_url();
	}
	@When("Input username: {string} and password: {string}")
	public void inputSignup(String user, String pass) {
		
		signupSteps.inputSignup(user, pass);
	}
	@And("User signup")
	public void userSignup() throws InterruptedException{
		signupSteps.signup();
		
	}
	@Then("Confirm signup error message: {string}")
	public void confirm_error_message(String mess) throws InterruptedException{
		Thread.sleep(2000);
//		WebDriver driver = null;
//		new WebDriverWait(driver, Duration.ofSeconds(60)).ignoring(NoAlertPresentException.class)
//        .until(ExpectedConditions.alertIsPresent());
		assertEquals(signupSteps.errorMess(),mess);	
	}
	@And("Close signup page")
	public void close_page_alert() {
		signupSteps.acceptAlert();
	}
	@Given("Access contact page")
	public void accessContactPage() {
		signupSteps.open_url();
	}
	@When("Open contact box")
	public void contactBox() {
		signupSteps.clickContact();
		assertEquals(signupSteps.messLabel(), "New message");
		
		
	}
	@Then("Fill in the contact fields")
	public void fillContactFields() {
		signupSteps.fillContact();
	}
	@And("Close contact box")
	public void closeContactBox() {
		assertEquals(signupSteps.errorMess(),"Thanks for the message!!");	
		signupSteps.acceptAlert();
	}
	@Given("Open about us box")
	public void accessAboutUsPage() {
		signupSteps.open_url();
		signupSteps.about_us();
		
	}
	@When("Click play button")
	public void clickplay() throws InterruptedException {
		signupSteps.click_play();
	}
	@Then("Click pause button")
	public void clickpause() {
		signupSteps.click_pause();
	}
	@And("Close about us box")
	public void clickclose() {
		signupSteps.click_close();
	}
}
