package com.amazon.testing;


import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Remoteexecution {
	
	WebDriver driver=null;
	WebDriverWait wait=null;
	String parentwindowname = null;
	
	@Parameters ("browser")
	@BeforeClass                                          
	public void beforeClass(@Optional("chrome") String browser) throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		if(browser.equalsIgnoreCase("chrome")){
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			options.setAcceptInsecureCerts(true);           
			// options.setBrowserVersion("104.0.5112.102");
			cap.setCapability(ChromeOptions.CAPABILITY, options);
		}
		else if(browser.equalsIgnoreCase("firefox")){
			
			FirefoxOptions options = new FirefoxOptions();
			options.setAcceptInsecureCerts(true);           
			options.setBinary("c:/downloads");               
			cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		}
		else{
			
			throw new Exception();
		}
		
	driver= new RemoteWebDriver(new URL("http://localhost:4444"), cap);
    wait= new WebDriverWait(driver,Duration.ofSeconds(10));        
	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	parentwindowname = driver.getWindowHandle();
	
}
	
	@AfterClass                                           
	public void afterClass() {
		System.out.println("Close all the resource at the end of all TCs execution in the class");
		driver.quit();
	}

	
	
	@Test(priority=1, groups ="regression")
	public void draggable() {
		
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
	    WebElement source=driver.findElement(By.id("draggable"));
        Actions	action	=new Actions(driver);
        action.dragAndDropBy(source, 100, 100).build().perform();
	}
	
	@Test(priority=2, groups ="regression")
	public void droppable() {
		
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement target=driver.findElement(By.id("droppable"));
        Actions	action	=new Actions(driver);
        action.dragAndDrop(source, target).build().perform();
        
	}
	
	@Test(priority=3, groups ="regression")
	public void menu() throws InterruptedException {
		
		driver.switchTo().window(parentwindowname);
	    driver.findElement(By.linkText("Menu")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-9']")));
		WebElement source=driver.findElement(By.xpath("//div[@id='ui-id-9']"));
		WebElement source2=driver.findElement(By.xpath("//div[@id='ui-id-13']"));
		WebElement source3=driver.findElement(By.xpath("//div[@id='ui-id-16']"));
		Actions action	=new Actions(driver);
		action.moveToElement(source).perform();
		Thread.sleep(500);
		action.moveToElement(source2).perform();
		Thread.sleep(500);
		action.moveToElement(source3).perform();
		
		
		
	}
		   
	
	
}
