package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utils.TestBase;
import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	TestContextSetup testContextSetup;
	WebDriver driver;
	TestBase testBase;
	
	public Hooks (TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Before
	public void beforeScenarion () {
	System.out.println("Initializing Chrome Driver");
	}
	@After
	public void afterScenario() throws IOException {
		if(testContextSetup.testBase.driver!=null) {
			testContextSetup.testBase.driver.quit();
			System.out.println("Browser closed successfully, Thank you Harikrishna");
		}
		else {
			System.out.println("HI");
		}
		
		
	}
}
