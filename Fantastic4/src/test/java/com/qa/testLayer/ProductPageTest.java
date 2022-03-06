package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.ProductPage;
import com.qa.testBase.TestBaseParent;

public class ProductPageTest extends TestBaseParent{
	ProductPage page;
	@Test
	public void verification()
	{
		page = new ProductPage();
		page.verifyLogo();
	}

}
