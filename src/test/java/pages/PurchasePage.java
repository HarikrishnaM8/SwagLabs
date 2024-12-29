package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
	
	WebDriver driver;

	@FindBy(xpath = "//div[@class='product_label']")
	WebElement getTitleOfThePage;

	@FindBy(xpath = "//div[@id='shopping_cart_container']//a")
	WebElement ClickOnCart;

	@FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
	WebElement AddTocart;

	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	WebElement checkOutItem;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement detailsName;

	@FindBy(xpath = "//input[@id='last-name']")
	WebElement detailsLastName;

	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement detailsPostalCode;

	@FindBy(xpath = "//div[@class='summary_value_label']")
	WebElement shippingvalue;

	@FindBy(xpath = "//div[@class='summary_info_label']")
	WebElement shippingName;

	@FindBy(xpath = "//div[@class='summary_subtotal_label']")
	WebElement PriceItemValue;
	@FindBy(xpath = "//div[@class='summary_tax_label']")
	WebElement PriceItemTaxTotal;
	@FindBy(xpath = "//div[@class='summary_total_label']")
	WebElement PriceItemTotal;

	@FindBy(xpath = "//a[@class='btn_action cart_button']")
	WebElement Finish;

	@FindBy(xpath = "//input[@class='btn_primary cart_button']")
	WebElement ContinueButton;

	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement FinalMessage;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void getPageTitle() {
		String pageTitle = getTitleOfThePage.getText();
		System.out.println(pageTitle);

	}

	public void selectItemFromProduct(String itemName) {

		String dynamicXpath = "//div[@class='inventory_item_name' and text()='" + itemName + "']";
		driver.findElement(By.xpath(dynamicXpath)).click();

	}

	public void addToCart() {
		AddTocart.click();
		ClickOnCart.click();

	}

	public void checkOutItem() {
		checkOutItem.click();
	}

	public void shippingDetails(String s1, String s2, String s3) {
		detailsName.sendKeys(s1);
		detailsLastName.sendKeys(s2);
		detailsPostalCode.sendKeys(s3);
		ContinueButton.click();
	}

//	
	public void paymentVerification() {

		String s1 = PriceItemValue.getText();
		String s2 = PriceItemTaxTotal.getText();
		String s3 = PriceItemTotal.getText();
		System.out.println(s1 + s2 + s3);

	}

	public void finishPurchaseItem() {
		Finish.click();

	}

	public String verifyfinalMessage() {

		return FinalMessage.getText();
	}
}
