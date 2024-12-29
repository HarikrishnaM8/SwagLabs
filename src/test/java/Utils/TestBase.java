package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	 public WebDriver driver;
	
	public WebDriver InitializeDriver() throws IOException {
		this.driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "src\\test\\Resources\\chromedriver.exe");
		
		String path="src\\test\\Resources\\Application.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String applicationUrl=prop.getProperty("url");
		driver.navigate().to(applicationUrl);
		
		String userName=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().window().maximize();
		
		
		return driver;
		
		
		
	}
	
	
	
	
	

}
