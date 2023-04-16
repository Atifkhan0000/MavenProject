package com.amazon.testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TakeScreenShot {

	@Test
	public void testscreenshot() throws IOException {
		
	WebDriver driver=null;
	WebDriverWait wait=null;
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();   // these steps we added with chrome version...111 because it has some problem
	options.addArguments("--remote-allow-origins=*");  // this step also we add 
	                                                  // otherwise normally we donot use these two steps.
	driver= new ChromeDriver(options);

	wait= new WebDriverWait(driver,Duration.ofSeconds(10));        
	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	

	driver.findElement(By.linkText("Droppable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
    WebElement source=driver.findElement(By.id("draggable"));
    WebElement target=driver.findElement(By.id("droppable"));
    Actions	action	=new Actions(driver);
    action.dragAndDrop(source, target).build().perform();
    

// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		String fileWithPath = "./Downloads/image-1.jpeg";        // destination path //
		// now put this destination path to DestFile object
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);



}
}

		

		
		
			
	

	
		