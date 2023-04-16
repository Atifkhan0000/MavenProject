package com.amazon.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test8 {
	

@Test(dataProvider="usercred")
public void login(String username, String password) {

System.out.println("username: "+username +" password: "+ password);
	
}


@DataProvider(name="usercred")
public Object[][] dataprovider(){

	Object[][] credentials = {{"rohit","pass123"},{"pooja","pass234"},{"sachin","pass456"}};
	
	return credentials;
}


}

// same test case runs multiple times with different data each time.
// we have three sets of data here that's Why test case run three times. 