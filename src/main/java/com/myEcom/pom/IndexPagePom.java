package com.myEcom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myEcom.base.BaseClass;

public class IndexPagePom extends BaseClass {
	
	public IndexPagePom(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//img[@class='img-responsive']")
	WebElement logo;
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signinButton;
	
	@FindBy(id = "search_query_top")
	WebElement searchProductbox;
	
	@FindBy(name = "submit_search")
	WebElement searchButton;

	public boolean validateLogo() {
	if(logo.isDisplayed()) {
		System.out.println("logo is available");
		return true;
	}
	else {
		return false;
	}
}	
	public SignInPagePom clickOnSignInButton() {
		
		signinButton.click();
		return new SignInPagePom();
	}
	
	public ProductListingPagePom sendKeysToSearchBox(){
		searchProductbox.sendKeys("Shirts");
		searchButton.click();
		
		return new ProductListingPagePom();
	}	
	
	
}
