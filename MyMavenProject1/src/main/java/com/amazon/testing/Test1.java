package com.amazon.testing;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
	
/*	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite method");
	}
	         
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite method");
	}
*/
	@Test
	public void signup() {
		System.out.println("Test1 : signing up");
		Reporter.log("Test1 : signing up");             // Reporter.log (TestNg ki ek class hai)  
		Reporter.log("Test1 : click on button after sign up");              // yhi steps likhe aa jayenge line se
	}
	
	@Test
	public void login() {
		System.out.println("Test1 : login");
	}
	
	@Test
	public void homepage() {
		System.out.println("Test1 : homepage");
	}
	
	@Test
	public void mobilecategory() {
		System.out.println("Test1 : mobilecategory");
	}
	
	@Test
	public void productDP() {
		System.out.println("Test1 : productDP");
	}
	
	@Test
	public void shippingdetails() {
		System.out.println("Test1 : shippingdetails");
	}
	
	
}
