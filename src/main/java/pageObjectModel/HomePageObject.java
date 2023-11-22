package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	public WebDriver driver; // This driver is null

	 private By MyAccount = By.xpath("//i[@class='fa fa-user']");

	 private By Register = By.xpath("(//a[contains(text(),'Register')])[1]");

	 private By Login = By.xpath("(//a[contains(text(),'Login')])[1]");


	
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement ClickOnMyAccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement ClickOnRegester() {
		return driver.findElement(Register);
	}
	public WebElement ClickOnLogin() {
		return driver.findElement(Login);
	}

}
