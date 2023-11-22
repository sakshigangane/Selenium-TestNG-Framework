package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.baseClass;
import com.Resources.constant;

import pageObjectModel.HomePageObject;
import pageObjectModel.LoginPageObject;

public class LoginTestCases extends baseClass {
	@Test
	public void verifyLogin() throws IOException {
		
		HomePageObject hop=new HomePageObject(driver);
		hop.ClickOnMyAccount().click();
		hop.ClickOnLogin().click();
		
		
		
		LoginPageObject Lpo = new LoginPageObject(driver);
		Lpo.enteremail().sendKeys(RegesterTestCases.randomEmail);
		Lpo.enterpassword().sendKeys(constant.password);
		Lpo.ClickOnSubmit().click();
	}
	}
	
	