package com.myEcom.pom;

import org.openqa.selenium.support.PageFactory;

import com.myEcom.base.BaseClass;

public class CreateNewAccountPage extends BaseClass {
	
	public CreateNewAccountPage(){
		
		PageFactory.initElements(driver, this);
	}
	public String validateTitle(){
		
		String title =driver.getTitle();
		return title;
		
	}
	
}
