package com.amazon.testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test9 {
	
	WebDriver driver=null;
	WebDriverWait wait=null;
	
	@Parameters ("browser")
	@BeforeClass                                          
	public void beforeClass(String browser) {
		
		
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
	System.out.println("Loading all pre-requisites before launching TCs"+ browser );   
	
}
	
	@AfterClass                                           
	public void afterClass() {
		System.out.println("Close all the resource at the end of each TCs ececution in the class");
		driver.close();
	}

	
	
	
	
	
	@Test(priority=1)
	public void signup() {
		System.out.println("Test3 : signing up");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Test3 : login");
	}
	
	@Test(priority=3)
	public void homepage() {
		System.out.println("Test3 : homepage");
	}
	
	@Test(priority=4)
	public void bookscategory() {
		System.out.println("Test3 : bookscategory");
	}
	
	@Test(priority=5)                                      
	public void productDP() {
		System.out.println("Test3 : productDP");
	}
	
	@Test(priority=6)                                         
	public void shippingdetails() {
		System.out.println("Test3 : shippingdetails");
	}

	
	
	
	
	
}
