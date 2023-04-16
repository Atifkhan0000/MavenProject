package com.amazon.testing;

import org.testng.annotations.Test;

public class Test5 {

	
	@Test(groups= {"sanity","homepage","regression"})
	public void signup() {
		System.out.println("Test1 : signing up");
	}
	
	@Test(groups= {"sanity","homepage","regression"})
	public void login() {
		System.out.println("Test1 : login");
	}
	
	@Test(groups= {"sanity","homepage","regression"})
	public void homepage() {
		System.out.println("Test1 : homepage");
	}
	
	@Test(groups= {"sanity","homepage","regression"})
	public void mobilecategory() {
		System.out.println("Test1 : mobilecategory");
	}
	
	@Test(groups= {"sanity","homepage","regression"})
	public void productDP() {
		System.out.println("Test1 : productDP");
	}
	
	@Test(groups= {"sanity","homepage","regression"}) 
	public void shippingdetails() {
		System.out.println("Test1 : shippingdetails");
	}
	
	
}


