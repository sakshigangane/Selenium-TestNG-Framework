package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class baseClass {

	public WebDriver driver;

	public void intializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\data.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("edgeDriver")) {

			driver = new EdgeDriver();
		}
}
	@BeforeClass
	public void launchBrowser() throws IOException {
		intializeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}
}
