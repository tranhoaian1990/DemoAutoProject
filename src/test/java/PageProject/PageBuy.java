package PageProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com")
public class PageBuy extends PageObject{
	private WebDriver driver = getDriver();
	
	WebElement groupitembutton;
	WebElement itemclick;
	@FindBy(xpath = "//strong[contains(text(),'Product description')]") WebElement description;
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]") WebElement addtocartbutton;
	@FindBy(id = "cartur") WebElement cartbutton;
	@FindBy(xpath = "//button[contains(text(),'Place Order')]") WebElement placeorderbutton;
	@FindBy(id = "name") WebElement nametextbox;
	@FindBy(id = "country") WebElement countrytextbox;
	@FindBy(id = "city") WebElement citytextbox;
	@FindBy(id = "card") WebElement cardtextbox;
	@FindBy(id = "month") WebElement monthtextbox;
	@FindBy(id = "year") WebElement yeartextbox;
	@FindBy(xpath = "//button[contains(text(),'Purchase')]") WebElement purchasebutton;
	@FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]") WebElement purchasetitle;
	@FindBy(xpath = "//button[contains(text(),'OK')]") WebElement purchasecomplete;
	WebElement title;
	WebElement remove;
	String check;
	public PageBuy(WebDriver driver) {
		this.driver = driver;
	}
	public void chose_item(String type, String item) {
		groupitembutton= find(By.xpath("//a[contains(text(),'"+type+"')]"));
		groupitembutton.click();
		itemclick= find(By.xpath("//a[contains(text(),'"+ item+"')]"));
		
		itemclick.click();
		
	}
	public String check_item(String item) {
		 return check = find(By.linkText("'"+item+"'")).getText();
	}
	public void remove_item() {
		remove = find(By.linkText("Delete"));
		remove.click();
	}
	public String find_description() {
		return description.getText();
	}
	public void add_to_cart() {
		addtocartbutton.click();
	}
	public String add_to_cart_success() {
		return getDriver().switchTo().alert().getText();
	}
	public void add_co_cart_complete() {
		getDriver().switchTo().alert().accept();
	}
	public void cart_button() {
		cartbutton.click();
	}
	public String place_order_accept_item(String itemname) {
		 title = find(By.xpath("//td[contains(text(),'"+itemname+"')]"));
		return title.getText();
	}
	
	public void place_order(String name, String card) {
		placeorderbutton.click();
		nametextbox.clear();
		nametextbox.sendKeys(name);
		countrytextbox.clear();
		countrytextbox.sendKeys("country");
		citytextbox.clear();
		citytextbox.sendKeys("city");
		cardtextbox.clear();
		cardtextbox.sendKeys(card);
		monthtextbox.clear();
		monthtextbox.sendKeys("month");
		yeartextbox.clear();
		yeartextbox.sendKeys("year");
		purchasebutton.click();
		
	}
	public void place_order_complete() {
		assertEquals(purchasetitle.getText(), "Thank you for your purchase!");
		purchasecomplete.click();
	}


}
