package com.myEcom.pom;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement pageHeading;
	
	@FindBy(id = "uniform-id_gender1")
	WebElement title1;
	
	@FindBy(id = "uniform-id_gender2")
	WebElement title2;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement firstname;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "address1")
	WebElement address1;
	
	@FindBy(id = "address2")
	WebElement address2;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "postcode")
	WebElement zip;
	public CreateNewAccountPage personalInformation(String a, String b, String c) throws FileNotFoundException
	{
		//Sheet signup = logindata.getSheet(logindata.getEcxcelFile(), "signup");
		
		//Map<String, Object> testdata = logindata.getExcel1SheetData(signup);
		
		firstname.sendKeys(a);
		lastName.sendKeys(b);
		password.sendKeys(c);
		return new CreateNewAccountPage();
		
		
		
		/*String text = (String)testdata.get("title");
		if(text.equalsIgnoreCase("mr"))
		{
			title1.click();
		}
		else
		{
			title2.click();
		}*/
		/*
		firstName.sendKeys((String)testdata.get("fname"));
		
		lastName.sendKeys((String)testdata.get("lname"));
		
		password.sendKeys((String)testdata.get("password"));*/
		
		
		
	}
	
}
