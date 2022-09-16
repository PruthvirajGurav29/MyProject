package com.myEcom.pom;

import org.openqa.selenium.support.PageFactory;

import com.myEcom.base.BaseClass;

public class ProductListingPagePom extends BaseClass {
	
	public ProductListingPagePom(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		
		String title = driver.getTitle();
		return title;
	}

}
