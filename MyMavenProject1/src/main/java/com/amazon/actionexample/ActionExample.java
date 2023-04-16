package com.amazon.actionexample;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;           

public class ActionExample {
	
	static WebDriver driver;
	static WebDriverWait wait; 

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();   // these steps we added with chrome version...111 because it has some problem
		options.addArguments("--remote-allow-origins=*");  // this step also we add 
		                                              // otherwise normally we donot use these two steps.
		driver= new ChromeDriver(options);
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));   // every .5sec check
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		draggable();
	    //droppable();
		//resizable();
		//selectable();
		//sortable();               
		//accordion();
		//autocomplete();
		//button();
		//checkboxradio();        
		//controlgroup();
		//datepicker();
		//menu();
		//progressbar();
		//selectmenu();
		//slider();
		//spinner();
		//tabs();
		//tooltip();
		//addClass();
		//effect();
		//coloranimation();
		//easing();
		//hide();
		//position();
		//widgetfactory();
		
		
}
	
public static void draggable() {
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
	    WebElement source=driver.findElement(By.id("draggable"));
        Actions	action	=new Actions(driver);
        action.dragAndDropBy(source, 100, 100).build().perform();
	}
	
public static void droppable() {
		
	    driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement target=driver.findElement(By.id("droppable"));
        Actions	action	=new Actions(driver);
        action.dragAndDrop(source, target).build().perform();
        
} 

public static void resizable() {
	
    driver.findElement(By.linkText("Resizable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")));
    WebElement source=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
    Actions	action	=new Actions(driver);
    action.dragAndDropBy(source, 100, 100).build().perform();
    
    
}

public static void selectable() throws InterruptedException {
	
    driver.findElement(By.linkText("Selectable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Item 3']")));
	WebElement source=driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement source1=driver.findElement(By.xpath("//li[text()='Item 4']"));
	 Actions action	=new Actions(driver);
	 action.dragAndDrop(source, source1).build().perform();
    
    
 }
    

public static void sortable() {
	
	driver.findElement(By.linkText("Sortable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions actions = new Actions(driver);
	WebElement one = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
	WebElement three = driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
	WebElement two = driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
	WebElement six = driver.findElement(By.xpath("//ul[@id='sortable']/li[6]"));
	actions.dragAndDrop(one, three).dragAndDrop(six, two).build().perform();
}

// normally run #but with action not run //
public static void accordion() {
	
    driver.findElement(By.linkText("Accordion")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='ui-id-3']")));
	driver.findElement(By.xpath("//h3[@id='ui-id-3']")).click();
}

public static void autocomplete() {
	
/*	driver.findElement(By.linkText("Autocomplete")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tags']")));
	    driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Ap");
	                  
	                  */
	    
	                        //or

driver.findElement(By.linkText("Autocomplete")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tags']")));
    WebElement source=driver.findElement(By.xpath("//input[@id='tags']"));
    Actions	action	=new Actions(driver);
    action.click(source).sendKeys("Ap").build().perform();                     
    
}  

public static void button() {
	
    driver.findElement(By.linkText("Button")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='A button element']")));
	WebElement source=driver.findElement(By.xpath("//button[text()='A button element']"));
	WebElement source2=driver.findElement(By.xpath("//input[@type='submit']"));
	Actions action	=new Actions(driver);
	action.click(source).moveToElement(source2).doubleClick().build().perform();
	
}
   //not done //
public static void checkboxradio() throws InterruptedException {
	
    driver.findElement(By.linkText("Checkboxradio")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='radio-1']")));
	WebElement source=driver.findElement(By.xpath("//label[@for='radio-1']"));
	WebElement source2=driver.findElement(By.xpath("//label[@for='checkbox-1']"));
	WebElement source3=driver.findElement(By.xpath("//label[@for='checkbox-nested-4']"));
	Actions action	=new Actions(driver);
	action.click(source).build().perform();
	
}

public static void controlgroup() {
	
    driver.findElement(By.linkText("Controlgroup")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='car-type-button']")));
	WebElement source=driver.findElement(By.xpath("//span[@id='car-type-button']"));
	WebElement source2=driver.findElement(By.xpath("//div[@id='ui-id-4']"));
	Actions action	=new Actions(driver);
	action.click(source).moveToElement(source2).build().perform();
	
	
}

public static void datepicker() {
	
    driver.findElement(By.linkText("Datepicker")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
	WebElement source=driver.findElement(By.id("datepicker"));
	Actions action	=new Actions(driver);
	action.click(source).build().perform();
	
	
}
  
public static void menu() throws InterruptedException {
	
    driver.findElement(By.linkText("Menu")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-9']")));
	WebElement source=driver.findElement(By.xpath("//div[@id='ui-id-9']"));
	WebElement source2=driver.findElement(By.xpath("//div[@id='ui-id-13']"));
	WebElement source3=driver.findElement(By.xpath("//div[@id='ui-id-16']"));
	Actions action	=new Actions(driver);
	action.moveToElement(source).perform();
	Thread.sleep(500);                     // thread will go to the waiting chember for 500ms // 
	action.moveToElement(source2).perform();
	Thread.sleep(500);
	action.moveToElement(source3).perform();
	
	
}

public static void progressbar() throws InterruptedException {
	
    driver.findElement(By.linkText("Progressbar")).click();
    driver.findElement(By.linkText("Custom Label")).click();
    Thread.sleep(1000);
    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
}

public static void selectmenu() throws InterruptedException {
	
    driver.findElement(By.linkText("Selectmenu")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='speed-button']")));
	driver.findElement(By.xpath("//span[@id='speed-button']")).click();
	
}


public static void slider() {
	
    driver.findElement(By.linkText("Slider")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@tabindex='0']")));
    WebElement source=driver.findElement(By.xpath("//span[@tabindex='0']"));
    Actions	action	=new Actions(driver);
    action.dragAndDropBy(source, 300, 0).build().perform();
    
}

public static void spinner() {
	
    driver.findElement(By.linkText("Spinner")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@role='button']")));
    WebElement source=driver.findElement(By.xpath("//a[@role='button']"));
    Actions	action	=new Actions(driver);
    action.click(source).build().perform();

}

public static void tabs() {
	
    driver.findElement(By.linkText("Tabs")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Nunc tincidunt']")));
    WebElement source=driver.findElement(By.xpath("//a[text()='Nunc tincidunt']"));
    WebElement source1=driver.findElement(By.xpath("//a[text()='Proin dolor']"));
    WebElement source2=driver.findElement(By.xpath("//a[text()='Aenean lacinia']"));
    Actions	action	=new Actions(driver);
    action.click(source).build().perform();
    action.moveToElement(source1).click(source1).build().perform();
    action.moveToElement(source2).click(source2).build().perform();
}

public static void tooltip() {
	
    driver.findElement(By.linkText("Tooltip")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("age")));
    WebElement source=driver.findElement(By.id("age"));
    Actions	action	=new Actions(driver);
    action.click(source).sendKeys("12").build().perform();

}

public static void addClass() {
	
    driver.findElement(By.linkText("Add Class")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Run Effect']")));
    WebElement source=driver.findElement(By.xpath("//button[text()='Run Effect']"));
    Actions	action	=new Actions(driver);
    action.click(source).build().perform();
    
    
}
// not done //
public static void effect() throws InterruptedException {
	
    driver.findElement(By.linkText("Effect")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='effects']")));
	WebElement source=driver.findElement(By.xpath("//select[@name='effects']"));
	WebElement source1=driver.findElement(By.xpath("//option[@value='highlight']"));
	WebElement source2=driver.findElement(By.xpath("//button[text()='Run Effect']"));
	Actions	action	=new Actions(driver);
	action.click(source).build().perform();
	
}	
	
public static void coloranimation() throws InterruptedException {
	
    driver.findElement(By.linkText("Color Animation")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Toggle Effect']")));
    WebElement source=driver.findElement(By.xpath("//button[text()='Toggle Effect']"));
    Actions	action	=new Actions(driver);
    action.click(source).build().perform();
    Thread.sleep(2000);
    action.click(source).build().perform();
    
}


public static void easing() throws InterruptedException {
	
    driver.findElement(By.linkText("Easing")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='overflow: hidden;']")));
    WebElement source=driver.findElement(By.xpath("//div[@style='overflow: hidden;']"));
    Actions	action	=new Actions(driver);
    action.click(source).build().perform();
    
}

public static void hide() throws InterruptedException {
	
    driver.findElement(By.linkText("Hide")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='effectTypes']")));
	WebElement source=driver.findElement(By.xpath("//select[@id='effectTypes']"));
	WebElement source1=driver.findElement(By.xpath("//option[text()='Highlight']"));      // how to run this part
	WebElement source2=driver.findElement(By.xpath("//button[text()='Run Effect']"));
	Actions	action	=new Actions(driver);
	action.click(source);
	Thread.sleep(2000);
	action.moveToElement(source2).click(source2).build().perform();  
}	
	
// position (not done)//
   

// widget factory not done //
public static void widgetfactory() throws InterruptedException {
	
    driver.findElement(By.linkText("Widget Factory")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='change']")));
	WebElement source=driver.findElement(By.xpath("//button[text()='change']"));
	WebElement source2=driver.findElement(By.xpath("//button[text()='change']"));
	WebElement source3=driver.findElement(By.xpath("//button[text()='change']"));
	Actions action	=new Actions(driver);
	action.click(source).perform();
	Thread.sleep(500);
	action.moveToElement(source2).click(source2).build().perform();
	Thread.sleep(500);
	action.moveToElement(source3).click(source3).build().perform();

}




}