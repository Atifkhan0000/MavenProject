package com.amazon.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
/*
 	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test method");
		
	}
		
		@AfterTest
		public void aftertest() {
		System.out.println("After Test method");	
	
	}

*/	
		
	@Test
	public void signup() {
		System.out.println("Test2 : signing up");
	}
	
	
	@Test(dependsOnMethods = "signup")
	public void login() {
		System.out.println("Test2 : login");
	}
	
	
	@Test(dependsOnMethods = "login")
	public void homepage() {
		System.out.println("Test2 : homepage");
	}
	
	
	@Test(dependsOnMethods = "homepage")
	public void shoecategory() {
		System.out.println("Test2 : shoecategory");
	}
	
	
	@Test(dependsOnMethods = "shoecategory")
	public void productDP() {
		System.out.println("Test2 : productDP");
	}
	
	
	@Test(dependsOnMethods = "productDP")
	public void shippingdetails() {
		System.out.println("Test2 : shippingdetails");
	}
	
	
}
