package com.amazon.testing;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TabSwitchingExample {

	WebDriver driver=null;
	WebDriverWait wait=null;
	String parentwindowname = null;
	
	@Parameters ("browser")
	@BeforeClass                                          
	public void beforeClass(@Optional("chrome") String browser) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();   // these steps we added with chrome version...111 because it has some problem
		options.addArguments("--remote-allow-origins=*");  // this step also we add 
		                                                  // otherwise normally we donot use these two steps.
		
		 DesiredCapabilities cap = new DesiredCapabilities();
		
		
		if(browser.equalsIgnoreCase("chrome")){
			
			ChromeOptions options1 = new ChromeOptions();
			options1.addArguments("-incognito");
			options1.setAcceptInsecureCerts(true);           
			// options.setBrowserVersion("104.0.5112.102");
		    cap.setCapability(ChromeOptions.CAPABILITY, options1);
		}
		else if(browser.equalsIgnoreCase("firefox")){
			
			FirefoxOptions options1 = new FirefoxOptions();
			options1.setAcceptInsecureCerts(true);           
			options1.setBinary("c:/downloads");               
		    cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options1);
		}
		else{
			
			throw new Exception();
		}
		
	// driver= new RemoteWebDriver(new URL("http://localhost:4444"), cap);
	driver= new ChromeDriver(options);
    wait= new WebDriverWait(driver,Duration.ofSeconds(10));        
	driver.get("https://www.w3schools.com/html/");
	driver.manage().window().maximize();
	parentwindowname = driver.getWindowHandle();   //1  
	
}
	
	@AfterClass                                           
	public void afterClass() {
		System.out.println("Close all the resource at the end of all TCs execution in the class");
		driver.quit();
	}

	
	
	@Test(groups ="regression")
	public void testWindowTabSwitching() {
		
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Set<String>tabs=driver.getWindowHandles();   // 2
		tabs.remove(parentwindowname);               // 1
		String childtab=(String) tabs.toArray()[0];
		driver.switchTo().window(childtab);            // switch to new tab
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));    //  again switch to frame
		String heading=driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(heading, "This is a Heading");
		
		driver.switchTo().window(parentwindowname);
		String parentpagetag =driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(parentpagetag, "HTML Tutorial");
		
	}
	
	
	
}
