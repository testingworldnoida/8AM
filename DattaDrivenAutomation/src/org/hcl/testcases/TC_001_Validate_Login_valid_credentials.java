package org.hcl.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hcl.base.CreateDriver;
import org.hcl.pages.LoginPage;
import org.hcl.testdata.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_Validate_Login_valid_credentials extends CreateDriver{
	
	
	@Test(dataProviderClass=TestData.class,  dataProvider="dp1")
	public void tcase1(String uname, String pass) throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		Thread.sleep(3000);
	}
	
	

}
