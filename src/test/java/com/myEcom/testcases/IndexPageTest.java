package com.myEcom.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myEcom.base.BaseClass;
import com.myEcom.pom.IndexPagePom;
import com.myEcom.pom.ProductListingPagePom;
import com.myEcom.pom.SignInPagePom;

public class IndexPageTest extends BaseClass {
	
	IndexPagePom indexPagePom = new IndexPagePom();
	SignInPagePom signInPagePom;
	ProductListingPagePom productListingPagePom;
	
	@BeforeMethod
	public void setUp() {
		loadApplication();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void validateLogo() {
		indexPagePom = new IndexPagePom();
		boolean res = indexPagePom.validateLogo();
		Assert.assertTrue(res);
	}	
	
	@Test
	public void validateclickOnSignInButton(){
		
		indexPagePom = new IndexPagePom();
		indexPagePom.clickOnSignInButton();
		
	}
	@Test
	public void validateSendKeysToSearchBox(){
		
		indexPagePom = new IndexPagePom();
		indexPagePom.sendKeysToSearchBox();
	} 
	
	@Test
	public void validatePageHeading(){
		
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignInButton();
		String pageHeading = signInPagePom.pageHeading();
		Assert.assertEquals(pageHeading, "AUTHENTICATION");
	} 
	@Test
	public void validateTitleOfPage(){
		
		indexPagePom = new IndexPagePom();
		productListingPagePom = indexPagePom.sendKeysToSearchBox();
		String title = productListingPagePom.getTitle();
		Assert.assertEquals(title, "Search - My Store");
		
	}
}
