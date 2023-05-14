package StepsProject;

import PageProject.PageLogin;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginScenarioSteps extends ScenarioSteps {
	private PageLogin page = new PageLogin(getDriver());
	
	@Step
	public void open_url() {
		page.open();
	}
	
	@Step
	public void inputLogin(String username, String pass) {
		page.input_login(username, pass);
	}
	
	@Step
	public void login() {
		page.login_button();
	}
	@Step
	public String loginMess() {
		return page.login_mess();
		
	}
	@Step
	public void close_login() {
		page.close_button();
	}
	@Step
	public String errorMess() {
		return page.error_message();
	}
	@Step
	public void acceptAlert() {
		page.accept_alert();
	}
}	
