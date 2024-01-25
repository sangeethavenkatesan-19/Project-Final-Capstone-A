package seleniumTestNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	
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
	
	@Test(description = "add product number 201,301")
	public void addProduct() throws InterruptedException {
		driver.manage().window().maximize();
		
		//login inside the spring app
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("sangeethahemavenkat@gmail.com");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Sangeetha104065*#");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		button.click();
		//login is completed
		
		//adding a product to cart = product id = 301
		Thread.sleep(2000);
		WebElement shoe1 = driver.findElement(By.xpath("//*[@id=\"cart301\"]"));
		shoe1.click();

		//going back to home page
		WebElement home = driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a"));
		home.click();
		
		// adding delay 
		Thread.sleep(2000);
		
		//adding a product to cart = product id = 201
		Thread.sleep(2000);
		WebElement shoe2 = driver.findElement(By.xpath("//*[@id=\"cart201\"]"));
		shoe2.click();
		//add to cart completed
		
		String expectedTitle = "";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
}