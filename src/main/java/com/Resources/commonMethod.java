package com.Resources;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class commonMethod {

	public static void handleAssertions(WebElement webElement,String expectedUrl){
		SoftAssert sa=new SoftAssert();
     sa.assertEquals(webElement,expectedUrl);
	sa.assertAll();
	
		
		
		
		
		
	}
}
