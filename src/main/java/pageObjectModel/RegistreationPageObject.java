package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistreationPageObject {

	public WebDriver driver;

	private By firstName = By.xpath("//input[@name='firstname']");	
	private By lastName = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@type='email']");
	private By telephone = By.xpath("//input[@type='tel']");	
	private By password = By.xpath("(//input[@type='password'])[1]");	
	private By confirmpassword= By.xpath("(//input[@type='password'])[2]");	 
	private By newsletter=By.xpath("(//input[@type='radio'])[3]");	
	private By checkbox=By.xpath("//input[@type='checkbox']");
	private By submit=By.xpath("//input[@type='submit']");		
	private By CaptureFirstNameErrorMsg= By.xpath("(//div[@class='text-danger'])[1]");
	private By CaptureLastNameErrorMsg=By.xpath("(//div[@class='text-danger'])[2]");
	
	
	
	
	
	
	public RegistreationPageObject(WebDriver driver2) {		                                                //paramiterised constructure
		this.driver=driver2;
    }
	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement enterLastName() {
		return driver.findElement(lastName);
	}	
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement entertelephone() {
		return driver.findElement(telephone);
	}	
	public WebElement enterpassword() {
		return driver.findElement(password);
	}	
	public WebElement enterconfirmpassword() {
		return driver.findElement(confirmpassword);
	}
	public WebElement enternewsletter() {
		return driver.findElement(newsletter);
	}	
	public WebElement entercheckbox() {
		return driver.findElement(checkbox);
	}
	public WebElement entersubmit() {
		return driver.findElement(submit);
	}
	public WebElement CaptureFirstNameErrorMsg() {
		return driver.findElement(CaptureFirstNameErrorMsg);
	}
	public WebElement CaptureLastNameErrorMsg() {
		return driver.findElement(CaptureFirstNameErrorMsg);
	}
	

}
