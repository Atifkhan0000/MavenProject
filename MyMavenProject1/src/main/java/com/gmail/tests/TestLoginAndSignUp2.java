package com.gmail.tests;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.util.LoadWebDriver;
import com.gmail.pageobject.LoginAndSignup2;

public class TestLoginAndSignUp2 {

	WebDriver driver;
	WebDriverWait wait;
	String parentwindowname = null;
	LoginAndSignup2 loginSignup2;
	LoadWebDriver loaddriver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browser) throws InterruptedException {
		// TODO Auto-generated method stub
	    
	    loginSignup2 = new LoginAndSignup2(browser);
	    loaddriver = new LoadWebDriver();
	    this.driver = loaddriver.getWebDriver(browser);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Define
//		driver.get("http://gmail.com/");
//		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
	     driver.quit();
	}
	
	@Test(groups ="regression")
	public void testLoginForPersonalAccount() {
		
		loginSignup2.createAccountForPersonalUse("Sachin","Tendulkar","Sachin@123", "Password@123");
		Assert.assertEquals(loginSignup2.passwordText, "Password@123");
		loginSignup2.verifyPhoneNumber("88888272727", "767949");
		Assert.assertEquals(loginSignup2.userStatus, "Successfully Created");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Sachin Profile page");
		
	}
	

}

