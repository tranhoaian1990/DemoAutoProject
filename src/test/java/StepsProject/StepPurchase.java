package StepsProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class StepPurchase {
	@Steps
	private PurchaseScenarioSteps purchase;
	
	@Given("Access purchase page")
	public void openPurchasePage() {
		purchase.open_purchase_page();
	}
	@When("Chose {string}, {string} and add to cart")
	public void item(String type, String item) throws InterruptedException {
		purchase.choseItem(type, item);
		assertEquals(purchase.compareDescription(),"Product description" );
		purchase.addCart();
		Thread.sleep(1000);
		assertEquals(purchase.addCartSuccess(), "Product added");
		purchase.addCartComplete();
	}
	@Then("Place order {string} with {string} and {string}")
	public void placeOrderSuccess(String item, String name, String card) throws InterruptedException {
		purchase.cartPage();
		Thread.sleep(3000);
		assertEquals(purchase.orderAccept(item), item);
		purchase.placeOrder(name, card);
	}
	@And("Closed page")
	public void closePage() {
		purchase.purchaseComplete();
	}
	@Then("Check {string} in cart and remove from cart")
	public void remove(String item) throws InterruptedException {
		purchase.cartPage();
		Thread.sleep(3000);
		assertEquals(purchase.orderAccept(item), item);
		purchase.removeItem();	
	}
//	@And("Check {string} and closed page")
//	public void check_item_in_cart(String item) {
//		assertEquals(purchase.checkItem(item), null);
//		
//		}
			
	}


