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

import com.gmail.pageobject.LoginAndSignup1;

public class TestLoginAndSignUp1 {

	WebDriver driver;
	WebDriverWait wait;
	String parentwindowname = null;
	LoginAndSignup1 loginSignup1;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browser) throws InterruptedException {
		// TODO Auto-generated method stub
	    loginSignup1 = new LoginAndSignup1();
	    
	    this.driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Define
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
	     driver.quit();
	}
	
	@Test(groups ="regression")
	public void testLoginForPersonalAccount() {
		
		loginSignup1.createAccountForPersonalUse("Sachin","Tendulkar","Sachin@123", "Password@123");
		Assert.assertEquals(loginSignup1.passwordText, "Password@123");   // soft assertion means if password not matched still it executes further code//
		loginSignup1.verifyPhoneNumber("88888272727", "767949");                  // but in hard Assertion it stops on that step and not execute further code//
		Assert.assertEquals(loginSignup1.userStatus, "Successfully Created");
		
	}
	
	
}
