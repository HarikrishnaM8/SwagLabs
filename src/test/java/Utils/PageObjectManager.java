package Utils;

import org.openqa.selenium.WebDriver;

import pages.PurchasePage;


public class PageObjectManager {
	

	PurchasePage purchasePage;
	WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public PurchasePage getPurchasePage() {
		purchasePage = new PurchasePage(driver);
		return purchasePage;

	}
}
