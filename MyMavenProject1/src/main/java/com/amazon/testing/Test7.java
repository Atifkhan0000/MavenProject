package com.amazon.testing;

import org.testng.annotations.Test;

public class Test7 {

	@Test(priority=1, groups={"regression","e2e"})        //@Test(description="signup with valid credentials",priority=1, groups={"regression","e2e"})
	public void signup() {
		System.out.println("Test3 : signing up");
	}
	
	@Test(priority=2, groups={"regression","e2e"})         // @Test(description="login successfully",priority=2, groups={"regression","e2e"})
	public void login() {
		System.out.println("Test3 : login");
	}
	
	@Test(priority=3, groups={"regression","e2e"})
	public void homepage() {
		System.out.println("Test3 : homepage");
	}
	
	@Test(priority=4, groups={"regression","e2e"})
	public void bookscategory() {
		System.out.println("Test3 : bookscategory");
	}
	
	@Test(priority=5, groups={"regression","e2e"})                                     
	public void productDP() {
		System.out.println("Test3 : productDP");
	}
	
	@Test(priority=6, groups={"regression","e2e"})                                         
	public void shippingdetails() {
		System.out.println("Test3 : shippingdetails");
	}

	
	
}
