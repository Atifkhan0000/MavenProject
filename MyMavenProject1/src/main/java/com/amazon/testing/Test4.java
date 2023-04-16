package com.amazon.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4 {
	
/*
	
   @BeforeClass                                          // saare test cases se phle chalega
    public void beforeClass() {
    	System.out.println("Loading all pre-requisites before launching TCs");          // ye dono testng report ka part nhi honge
    }
 
	
	@AfterClass                                           // sbse baad mein chalega (saare test cases ke baad)
	public void afterClass() {
		System.out.println("Close all the resource at the end of all TCs execution in the class");
	}

*/   
    
	@Test(invocationCount = 10)
	public void saysomething() {
		System.out.println("Hello");
	}
	
}



/*

@parameter("browser")
@BeforeClass                                          // saare test cases se phle chalega
 public void beforeClass(String browser) {
 	System.out.println("Loading all pre-requisites before launching TCs");             // ye dono testng report ka part nhi honge
 }

	
	@AfterClass                                           // sbse baad mein chalega (saare test cases ke baad)
	public void afterClass() {
		System.out.println("Close all the resource at the end of all TCs execution in the class");
	}

*/   
 