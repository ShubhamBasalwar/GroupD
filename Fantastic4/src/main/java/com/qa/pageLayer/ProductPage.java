package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBaseParent;

public class ProductPage extends TestBaseParent{
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement logo;
	String ExpL = "";
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogo()
	{
		boolean actL = logo.isDisplayed();
		System.out.println(actL);
		if(actL==true)
		{
			System.out.println(logo.getText());
		}
		else
		{
			System.out.println("test case failed");
		}
	}

}
