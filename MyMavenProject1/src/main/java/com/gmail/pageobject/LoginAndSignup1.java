package com.gmail.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndSignup1 {        // means signup(create account) bhi aur login bhi ek hi class mein bta diye hain//
                                       // ek page pr jo kuch h wo sb ek class m rahega//
	                                 // jitne alag alag pages dikhenge unki alag-alag class bnegi aur usme unke ander ki functionalities(As methods) likhe jayenge jaise neeche kiya h//
	public WebDriver driver;
	public String passwordText;
	public String passwordMismatchAlert;
	public String userStatus;

	public LoginAndSignup1() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		this.driver = new ChromeDriver();

	}

	public void createAccountForPersonalUse(String firstname, String lastname, String username, String pwd) {

		driver.findElement(By.xpath("//span[contains(.,'Create account')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'For my personal use')]")).click();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("Username")).sendKeys(username);
		driver.findElement(By.name("Passwd")).sendKeys(pwd);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		passwordText = driver.findElement(By.name("ConfirmPasswd")).getText();
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();

	}

	public void createAccountForPersonalUseWithWrongPassword(String firstname, String lastname, String username,
			String pwd) {

		driver.findElement(By.xpath("//span[contains(.,'Create account')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'For my personal use')]")).click();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("Username")).sendKeys(username);
		driver.findElement(By.name("Passwd")).sendKeys(pwd);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(pwd + "abc");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		passwordMismatchAlert = driver.findElement(By.xpath("//div[@jsname=\"B34EJ\"]//span")).getText();   // locator for error message(Use 8 characters or more for your password)
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();

	}

	public void verifyPhoneNumber(String mobileNumber, String code) {

		driver.findElement(By.id("phoneNumberId")).sendKeys(mobileNumber);
		driver.findElement(By.name("code")).sendKeys(code);         // locator for verification code section
		driver.findElement(By.xpath("//span[text()=\"Verify\"]")).click();
	}

	public void loginWithValidCredentials(String username, String pwd) {
         driver.findElement(By.name("identifier")).sendKeys(username);
         driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
         driver.findElement(By.name("Passwd")).sendKeys(pwd);
         driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
         userStatus = driver.findElement(By.xpath("//h1")).getText();
	}

	public void loginWithInValidCredentials() {

	}

}

