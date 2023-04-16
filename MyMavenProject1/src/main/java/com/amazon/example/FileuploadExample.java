package com.amazon.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileuploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();	
		options.addArguments("-incognito");
		WebDriverWait wait ; // Declare			
		WebDriver  driver = new ChromeDriver(options);			
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Define			
		driver.get("https://demo.guru99.com/test/upload/");			
		driver.manage().window().maximize();			
		driver.findElement(By.id("uploadfile_0")).sendKeys("./data/Examplefile.txt");
		
		
	}

}
