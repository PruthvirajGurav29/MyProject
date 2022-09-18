package com.myEcom.pom;



import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myEcom.base.BaseClass;

public class SignInPagePom extends BaseClass {
	
	public SignInPagePom()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email_create")
	WebElement emailidCreate;
	
	@FindBy(xpath = "//input[@name='email_create']")
	WebElement submit;
	
	@FindBy(id = "newsletter-input")
	WebElement newsLetterTextBox;
	
	@FindBy(name = "submitNewsletter")
	WebElement newsletterSubmitButton;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement pageHeading;
	
	@FindBy(id = "email")
	WebElement loginEmail;
	
	@FindBy(id = "passwd")
	WebElement loginPassword;
	
	
	public String pageHeading(){
		
		String heading = pageHeading.getText();
		return heading;
	}
	
	public void setLoginText(String username, String password){
		
		loginEmail.sendKeys(username);
		loginPassword.sendKeys(password);
	}
	
	public CreateNewAccountPage setCreateAccountEmail(String username){
		
		emailidCreate.sendKeys(username);
		
		submit.click();
		return new CreateNewAccountPage();
	}
	
}
