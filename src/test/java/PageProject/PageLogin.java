package PageProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.Alert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;


@DefaultUrl("https://www.demoblaze.com")

public class PageLogin extends PageObject {
	private WebDriver driver = getDriver();
	
	@FindBy(id="logout2") WebElement logoutpage;
	@FindBy(id= "login2") WebElement loginpage;
	@FindBy(id= "loginusername") WebElement loginusername;
	@FindBy(id= "loginpassword") WebElement loginpassword;
	@FindBy(xpath="//button[contains(text(),'Log in')]") WebElement loginbutton;
	@FindBy(xpath="//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[1]") WebElement closebutton;
	@FindBy(linkText = "Welcome tranhoaian") WebElement message;
	
	
	public PageLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout() {
		logoutpage.click();
	}

	public void input_login(String username,String password) {
		loginpage.click();
		loginusername.clear();
		loginusername.sendKeys(username);
		loginpassword.clear();
		loginpassword.sendKeys(password);
	}
	

	
	public void login_button() {
		loginbutton.click();
	}
	
	public void close_button() {
		closebutton.click();
	}

	public String error_message() {
		return getDriver().switchTo().alert().getText();  
	}
	public String login_mess() {
		return message.getText();
	}
	public void accept_alert() {
		getDriver().switchTo().alert().accept();
	}

}
