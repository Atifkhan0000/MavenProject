package com.amazon.testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScrollDown {
	
	WebDriver driver=null;
	WebDriverWait wait=null;
	
	
	@Parameters ("browser")
	@BeforeClass                                          
	public void beforeClass(@Optional("chrome") String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.InternetExplorer.driver","./drivers/InternetExplorerdriver.exe");
			driver= new InternetExplorerDriver();
		}
		else{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
			
    wait= new WebDriverWait(driver,Duration.ofSeconds(10));        
	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	
	
}
	
	@AfterClass                                           
	public void afterClass() {
		System.out.println("Close all the resource at the end of all TCs execution in the class");
		driver.quit();
	}
	
	@Test(priority = 1 , groups ="regression")
	public void scrowDown() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;   // Convert web driver object type to JavascriptExecutor
		Thread.sleep(3000);
 		jse.executeScript("window.scrollBy(0,1700)");
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 		Thread.sleep(3000);
		WebElement helement = driver.findElement(By.id("mCSB_1_dragger_vertical"));
		jse.executeScript("arguments[0].scrollIntoView(true)", helement);
	//	jse.executeScript("arguments[0].scrollIntoView(true)", "window.scrollBy(0, -window.innerHeight );", helement);		
	}
	
	
	
}
