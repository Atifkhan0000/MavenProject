
/*
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite" parallel="methods" thread-count="5">
	  <test name="Test1">
	  <parameter name="browser" value="chrome"></parameter>    
	  <groups>
	  <run>
	  <include name="e2e"></include>     <!-- <include name="regression"></include> -->
	  </run>
	  </groups>
	  <classes>
	  <class name="com.amazon.testing.Test1"></class>
	  <class name="com.amazon.testing.Test2"></class>
	  <class name="com.amazon.testing.Test3"></class>
	  <class name="com.amazon.testing.Test4"></class> 
	  </classes>
	  </test> <!-- Test -->           
	  
	  
	  <test name="Test2">
	  <parameter name="browser" value="firefox"></parameter>
	  <groups>
	  <run>
	  <include name="e2e"></include>     <!-- <include name="regression"></include> -->
	  </run>
	  </groups>
	  <classes>
	  <class name="com.amazon.testing.Test1"></class>
	  <class name="com.amazon.testing.Test2"></class>
	  <class name="com.amazon.testing.Test3"></class>
	  <class name="com.amazon.testing.Test4"></class> 
	  </classes>
	  </test> <!-- Test -->                     
	  
	 
	  <test name="Test3">
	  <parameter name="browser" value="IE"></parameter>
	  <groups>
	  <run>
	  <include name="e2e"></include>     <!-- <include name="regression"></include> -->
	  </run>
	  </groups>
	  <classes>
	  <class name="com.amazon.testing.Test1"></class>
	  <class name="com.amazon.testing.Test2"></class>
	  <class name="com.amazon.testing.Test3"></class>
	  <class name="com.amazon.testing.Test4"></class> 
	  </classes>
	  </test> <!-- Test -->
	  
	</suite> <!-- Suite -->

	
}

*/