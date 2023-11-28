package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import com.Resources.baseClass;
import com.Resources.commonMethod;
import com.Resources.constant;

import pageObjectModel.HomePageObject;
import pageObjectModel.RegistreationPageObject;

public class RegesterTestCases extends baseClass {
	public static String randomEmail="";

	//you can genrate random data by facked,
	//
	public String generateRandomEmail() {
		return System.currentTimeMillis()+"@gmail.com";
	}

	@Test
	public void verifyValidRegistration() throws IOException {
		
		randomEmail=generateRandomEmail();
		
		RegistreationPageObject rpo = new RegistreationPageObject(driver);		
		rpo.enterFirstName().sendKeys(constant.Firstname);
		rpo.enterLastName().sendKeys(constant.lasttname);
		rpo.enteremail().sendKeys(randomEmail);
		rpo.entertelephone().sendKeys(constant.telephone);
		rpo.enterpassword().sendKeys(constant.password);
		rpo.enterconfirmpassword().sendKeys(constant.Conformpassword);
		rpo.enternewsletter().click();
		rpo.entercheckbox().click();
		rpo.entersubmit().click();

		/*SoftAssert sa=new SoftAssert();
		String successUrl=constant.successUrl;
     sa.assertEquals(driver.getCurrentUrl(), successUrl);
	sa.assertAll();*/
		commonMethod.handleAssertions(driver.getCurrentUrl(), constant.successUrl);
	
	}
	
	@Test
	public void verifyInvalidRegistration() throws IOException, InterruptedException {
		Thread.sleep(5000);

		HomePageObject hop=new HomePageObject(driver);	
		hop.ClickOnMyAccount().click();
		hop.ClickOnRegester().click();
		
		
		RegistreationPageObject rpo = new RegistreationPageObject(driver);
		rpo.enterFirstName().sendKeys("");
		rpo.enterLastName().sendKeys("");
		rpo.enteremail().sendKeys("");
		rpo.entertelephone().sendKeys("");
		rpo.enterpassword().sendKeys("");
		rpo.enterconfirmpassword().sendKeys("");
		rpo.enternewsletter().click();
	//	rpo.entercheckbox().click();
		rpo.entersubmit().click();
		
		
		/*SoftAssert sa=new SoftAssert();
		
		String firstNameErrorMsg =constant.Firstname;
		String lastNameErrorMsg=constant.lasttname;	
				
		sa.assertEquals(rpo.CaptureFirstNameErrorMsg().getText(),firstNameErrorMsg);
		sa.assertEquals(rpo.CaptureLastNameErrorMsg().getText(),lastNameErrorMsg);
		sa.assertAll();*/
		
		commonMethod.handleAssertions(rpo.CaptureFirstNameErrorMsg(), constant.firstNameErrorMsg);
		commonMethod.handleAssertions(rpo.CaptureLastNameErrorMsg(), constant.lastNameErrorMsg);

		
	}
}
