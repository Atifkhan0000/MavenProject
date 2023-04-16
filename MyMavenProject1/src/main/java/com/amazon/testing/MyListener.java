package com.amazon.testing;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class MyListener implements IRetryAnalyzer{                 // ITestListener is a testNG listener

	 private int retryCount = 0;
	 private int maxRetryCount = 3;
	// Below method returns 'true' if the test method has to be re-tried else 'false' 
	public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {      
	            retryCount++;
	            return true;
	        }
	        return false;
	    }
}
