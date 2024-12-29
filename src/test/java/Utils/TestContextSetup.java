package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {

	public TestBase testBase;
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	
	

	public TestContextSetup()  throws IOException {
		this.testBase = new TestBase();
		this.pageObjectManager=new PageObjectManager(testBase.InitializeDriver());
		
		
	}

}
