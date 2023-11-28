package com.Resources;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class commonMethod {

	public static void handleAssertions(String actulUrl,String expectedUrl){
		SoftAssert sa=new SoftAssert();
     sa.assertEquals(actulUrl,expectedUrl);
	sa.assertAll();
	
		
		
		
		
		
	}

	public static void handleAssertions(WebElement captureFirstNameErrorMsg, String firstNameErrorMsg) {
		// TODO Auto-generated method stub
		
	}
}
