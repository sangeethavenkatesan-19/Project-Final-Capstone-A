package seleniumTestNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	String siteUrl = "http://localhost:9010/";
	String driverPath = "drivers/windows/chromedriver.exe";	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();  
	}

	@Test(description = "login user")
	public void loginUser() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("sangeethahemavenkat@gmail.com");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Sangeetha104065*#");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		button.click();

		// adding delay 
		Thread.sleep(2000);
		
		String expectedTitle = "";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
}