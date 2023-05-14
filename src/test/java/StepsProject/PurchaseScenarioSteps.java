package StepsProject;

import org.openqa.selenium.WebDriver;

import PageProject.PageBuy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PurchaseScenarioSteps extends ScenarioSteps{
	private PageBuy  pagebuy = new PageBuy(getDriver());
	
	@Step
	public void open_purchase_page() {
		pagebuy.open();
	}
	
	@Step
	public void choseItem(String type, String item) {
		pagebuy.chose_item(type, item);
	}
	@Step
	public String compareDescription() {
		return pagebuy.find_description();
	}
	@Step
	public void addCart() {
		pagebuy.add_to_cart();
	}
	@Step
	public String addCartSuccess() {
		return pagebuy.add_to_cart_success();
	}
	@Step
	public void addCartComplete() {
		pagebuy.add_co_cart_complete();
	}
	@Step
	public void cartPage() {
		pagebuy.cart_button();
	}
	@Step 
	public String orderAccept(String item) {
	
		return pagebuy.place_order_accept_item(item);
	}
	@Step
	public void placeOrder(String name, String card) {
		pagebuy.place_order(name, card);
	}
	@Step
	public void purchaseComplete() {
		pagebuy.place_order_complete();
	}
	@Step
	public void removeItem() {
		pagebuy.remove_item();
	}
	@Step
	public String checkItem(String item) {
		return pagebuy.check_item(item);
	}
	

}
