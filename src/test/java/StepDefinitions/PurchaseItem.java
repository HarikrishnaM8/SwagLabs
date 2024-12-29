package StepDefinitions;

import org.testng.Assert;
import org.testng.asserts.Assertion;

import pages.PurchasePage;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class PurchaseItem {

	TestContextSetup testContextSetup;
	PurchasePage purchasePage;

	public PurchaseItem(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.purchasePage = testContextSetup.pageObjectManager.getPurchasePage();

	}

	@Given("user select a product from the list of Items {string}")
	public void user_select_a_product_from_the_list_of_items(String itemName) {

		purchasePage.getPageTitle();
		purchasePage.selectItemFromProduct(itemName);

	}

	@Given("user add the item to the cart")
	public void user_add_the_item_to_the_cart() {
		purchasePage.addToCart();
	}

	@Given("user checkout the item")
	public void user_checkout_the_item() {
		purchasePage.checkOutItem();

	}

	@Given("user enter valid information {string} and {string} and {string}")
	public void user_enter_valid_information_and_and(String firstName, String lastName, String postalCode) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(postalCode);
		purchasePage.shippingDetails(firstName, lastName, postalCode);

	}

	@Then("user finish the purchase of the item")
	public void user_finish_the_purchase_of_the_item() {
		purchasePage.paymentVerification();
		purchasePage.finishPurchaseItem();

	}

	@Then("verify the final message {string}")
	public void verify_the_final_message(String message) {
		String verifyMessage = purchasePage.verifyfinalMessage();
		Assert.assertEquals(message, verifyMessage);
		

	}
}
