package com.amazon.testing;

import org.testng.annotations.Test;

public class Test6 {

	@Test
	public void signup() {
		System.out.println("Test2 : signing up");
	}
	
	
	@Test(dependsOnMethods = "signup", groups= {"e2e","regression"})
	public void login() {
		System.out.println("Test2 : login");
	}
	
	
	@Test(dependsOnMethods = "login", groups= {"e2e","regression"})
	public void homepage() {
		System.out.println("Test2 : homepage");
	}
	
	
	@Test(dependsOnMethods = "homepage", groups= {"e2e","regression"})
	public void shoecategory() {
		System.out.println("Test2 : shoecategory");
	}
	
	
	@Test(dependsOnMethods = "shoecategory", groups= {"e2e","regression"})
	public void productDP() {
		System.out.println("Test2 : productDP");
	}
	
	
	@Test(dependsOnMethods = "productDP", groups= {"e2e","regression"})
	public void shippingdetails() {
		System.out.println("Test2 : shippingdetails");
	}
	
	
}
