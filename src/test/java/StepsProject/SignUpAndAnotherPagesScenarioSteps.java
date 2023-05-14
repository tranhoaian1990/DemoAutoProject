package StepsProject;

import PageProject.PageSignUpAndAnotherPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignUpAndAnotherPagesScenarioSteps extends  ScenarioSteps {
	private PageSignUpAndAnotherPages pagesignup = new PageSignUpAndAnotherPages(getDriver());
	
	@Step
	public void open_url() {
		pagesignup.open();
	}
	
	@Step
	public void inputSignup(String username, String pass) {
		pagesignup.input_signup(username, pass);
	}
	
	@Step
	public void signup() {
		pagesignup.signup_button();
	}
	@Step
	public String errorMess() {
		return pagesignup.error_message();
	}
	@Step
	public void acceptAlert() {
		pagesignup.accept_alert();
	}
	@Step
	public void clickContact() {
		pagesignup.click_contact();
	}
	@Step
	public void fillContact() {
		pagesignup.fill_contact();
	}
	@Step
	public String messLabel() {
		return pagesignup.mess_label();
	}
	@Step
	public void about_us() {
		pagesignup.click_about_us();
	}
	@Step
	public void click_play() throws InterruptedException {
		pagesignup.click_play_button();
	}
	@Step
	public void click_pause() {
		pagesignup.click_pause_button();
	}
	@Step
	public void click_close() {
		pagesignup.click_close_button();
	}
	

}
