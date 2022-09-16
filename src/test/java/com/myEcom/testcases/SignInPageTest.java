package com.myEcom.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myEcom.base.BaseClass;
import com.myEcom.pom.CreateNewAccountPage;
import com.myEcom.pom.IndexPagePom;
import com.myEcom.pom.SignInPagePom;
import com.myEcom.utility.ExcelSheetHandle;

import net.bytebuddy.asm.Advice.AssignReturned;



public class SignInPageTest extends BaseClass {
	
	ExcelSheetHandle data = new ExcelSheetHandle(); 
	IndexPagePom indexPagePom;
	SignInPagePom signInPagePom; 
	CreateNewAccountPage createNewAccountPage;
	
	@BeforeMethod
	public void setup()
	{
		loadApplication();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
/*	@Test
	public void login() throws EncryptedDocumentException, FileNotFoundException, IOException{
		
	Sheet sh =	data.getSheet(data.getExcelFile(), "login");
	Map<String, Object> logindata = data.getExcelSheetData(sh);
	indexPagePom = new IndexPagePom();
	signInPagePom = indexPagePom.clickOnSignInButton();
	signInPagePom.setLoginText((String)logindata.get("username"), (String)logindata.get("password"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}  
	
	@Test
	public void createAccountEmail() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException{
		
		Sheet sh =	data.getSheet(data.getExcelFile(), "login");
		Map<String, Object> logindata = data.getExcelSheetData(sh);
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignInButton();
		signInPagePom.setCreateAccountEmail((String)logindata.get("username"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	} */
	@Test
	public void getTitle() {
		
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignInButton();
		createNewAccountPage = signInPagePom.setCreateAccountEmail("bcd@xyz.com");
		String title = createNewAccountPage.validateTitle();
		Assert.assertEquals(title, "Login - My Store");
		
		
	}

}
