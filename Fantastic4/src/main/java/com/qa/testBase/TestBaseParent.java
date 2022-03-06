package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseParent {
	public static WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
 public void driverProperties(String browser)
 {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	 }
	 else if(browser.equalsIgnoreCase("opera"))
	 {
		 WebDriverManager.operadriver().setup();
		 driver = new OperaDriver();
	 }
	 else 
	 {
		 System.out.println("Enter appropriate input");
	 }
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("http://automationpractice.com/index.php");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
