package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBaseParent;

public class LoginPage extends TestBaseParent {
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement sign_in;
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email_addr;
	@FindBy(id="SubmitCreate")
	private WebElement Create;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void verifySignInButton()
	{
		sign_in.click();
	}
	public void setEmailAddress()
	{
		email_addr.sendKeys("monikajadhav3505@gmail.com");
	}
	public void verifyCreateAnAccountButton()
	{
		Create.click();
	}
}
