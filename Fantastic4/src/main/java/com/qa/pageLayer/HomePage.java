package com.qa.pageLayer;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBaseParent;

public class HomePage extends TestBaseParent {
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search_bar;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	public void enterTextInSearchBar()
	{
		search_bar.sendKeys("summer dresses");
		search_bar.sendKeys(Keys.ENTER);
	}
	

}
