package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBaseParent;

public class HomePageTestClass extends TestBaseParent {
	HomePage search;
	@Test
	public void TestCase1()
	{
		search = new HomePage();
		search.enterTextInSearchBar();
	}
	
}
