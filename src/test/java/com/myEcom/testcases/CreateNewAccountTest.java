package com.myEcom.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myEcom.base.BaseClass;
import com.myEcom.pom.CreateNewAccountPage;
import com.myEcom.pom.IndexPagePom;
import com.myEcom.pom.SignInPagePom;
import com.myEcom.utility.ExcelSheetHandle;

public class CreateNewAccountTest extends BaseClass{
	ExcelSheetHandle testData = new ExcelSheetHandle();
	SignInPagePom signInPagePom;
	IndexPagePom indexPagePom;
	CreateNewAccountPage createNewAccountPage;
	SignInPageTest signInPageTest = new SignInPageTest();
	
	
	@BeforeMethod
	public void setUp() {
		loadApplication();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	@Test
	public void validatePersonalInfo() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Sheet sh = testData.getSheet(testData.getExcelFile(), "login") ;
		Map<String, Object> logindata = testData.getExcelSheetData(sh);
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignInButton();
		createNewAccountPage = signInPagePom.setCreateAccountEmail((String)logindata.get("username"));
		//Thread.sleep(20);
		
		//String firstname =  (String)logindata.get("fname");
		//String lastname  =  (String)logindata.get("lname");
		//String password1  =  (String)logindata.get("password");
		//System.out.println((String)logindata.get("username"));
		
		Sheet sh1 = testData.getSheet(testData.getExcelFile(), "signup");
		
		System.out.println(sh1.getLastRowNum());
		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		Map<String, Object> logindata1 = testData.getExcelSheetData(sh);
	    createNewAccountPage =  createNewAccountPage.personalInformation((String)logindata1.get("fname"), (String)logindata1.get("lname"), (String)logindata1.get("password"));
		
	}

}
