package com.amazon.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Test3 {
	
/*	
	@BeforeMethod                                                    // har method se phle chalega
	public void beforeMethod() {
		System.out.println("Load or clean before each method execution");
	}
	
	
	@AfterMethod                                                      // har method ke baad chalega
	public void aferMethod() {
		System.out.println("Unload resource after each method execution");
	}
	
*/	
	@Test(priority=1)
	public void signup() {
		System.out.println("Test3 : signing up");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Test3 : login");
	}
	
	@Test(priority=3)
	public void homepage() {
		System.out.println("Test3 : homepage");
	}
	
	@Test(priority=4)
	public void bookscategory() {
		System.out.println("Test3 : bookscategory");
	}
	
	@Test(priority=5)                                      // @Test(priority=5, enabled = true/false)
	public void productDP() {
		System.out.println("Test3 : productDP");
	}
	
	@Test(priority=6)                                         
	public void shippingdetails() {
		System.out.println("Test3 : shippingdetails");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
