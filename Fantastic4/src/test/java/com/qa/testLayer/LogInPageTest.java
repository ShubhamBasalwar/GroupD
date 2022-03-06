package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBaseParent;

public class LogInPageTest extends TestBaseParent{
	LoginPage signIn;
	@Test
	public void LoginFunctionality()
	{
		signIn = new LoginPage();
		signIn.verifySignInButton();
		signIn.setEmailAddress();
		signIn.verifyCreateAnAccountButton();
	}

}
