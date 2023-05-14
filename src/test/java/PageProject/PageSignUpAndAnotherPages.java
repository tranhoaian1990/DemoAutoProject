package PageProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com")

public class PageSignUpAndAnotherPages extends PageObject{
//	public static void waitForElement(WebDriver driver, WebElement element) {
//	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
//	            .withTimeout(Duration.ofSeconds(30))
//	            .pollingEvery(Duration.ofMillis(500))
//	            .ignoring(NoSuchElementException.class);
//
//	    wait.until(ExpectedConditions.visibilityOf(element));
//	}
	private WebDriver driver = getDriver();
	
	
	
	@FindBy(id= "signin2") WebElement signuppage;
	@FindBy(id= "sign-username") WebElement signupusername;
	@FindBy(id= "sign-password") WebElement signuppassword;
	@FindBy(xpath="//button[contains(text(),'Sign up')]") WebElement signupbutton;
	
	@FindBy(xpath= "//a[contains(text(),'Contact')]" ) WebElement contactbutton;
	@FindBy(id= "recipient-email") WebElement contactemail;
	@FindBy(id= "recipient-name") WebElement contactname;
	@FindBy(id= "message-text") WebElement contactmessage;
	@FindBy(xpath= "//button[contains(text(),'Send message')]" ) WebElement sendmess;
	@FindBy(id= "exampleModalLabel") WebElement contactlabel;
	
	@FindBy(xpath= "//a[contains(text(),'About us')]" ) 
	WebElement aboutbutton;
	@FindBy(xpath= "/html/body/div[4]/div/div/div[2]/form/div/div/button" ) 
	WebElement playbutton;
	@FindBy(xpath= "/html/body/div[4]/div/div/div[2]/form/div/div/div[4]/button[1]") 
	WebElement pausebutton;
	@FindBy(xpath= "//body/div[@id='videoModal']/div[1]/div[1]/div[3]/button[1]") 
	WebElement closebutton;
	//    Alert a = getDriver().switchTo().alert();

	public PageSignUpAndAnotherPages(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	public void input_signup(String username,String password) {
		signuppage.click();
		signupusername.clear();
		signupusername.sendKeys(username);
		signuppassword.clear();
		signuppassword.sendKeys(password);
	}
	
	public void signup_button() {
		signupbutton.click();
	}
	public String error_message() {
//		new WebDriverWait(driver, Duration.ofSeconds(60)).ignoring(NoAlertPresentException.class)
//        .until(ExpectedConditions.alertIsPresent());
		
		return getDriver().switchTo().alert().getText();
		  
//		return  a.getText();
		
	}
	public void accept_alert() {
	
		getDriver().switchTo().alert().accept();
//		a.accept();
	}
	public void click_contact() {
		contactbutton.click();
	}
	public void fill_contact() {
		contactemail.clear();
		contactemail.sendKeys("tranhoaian@gmail.com");
		contactname.clear();
		contactname.sendKeys("tran hoai an");
		contactmessage.clear();
		contactmessage.sendKeys("Hello, have a good day");
		sendmess.click();
	}
	public String mess_label() {
		return contactlabel.getText();
	}
	
	public void click_about_us() {
		aboutbutton.click();
		
	}
	public void click_play_button() throws InterruptedException {
		playbutton.click();
		Thread.sleep(3000);
	}
	public void click_pause_button() {
		pausebutton.click();
	}
	public void click_close_button() {
		closebutton.click();
	}
}
