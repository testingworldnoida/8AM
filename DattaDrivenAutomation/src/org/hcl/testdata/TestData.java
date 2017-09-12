package org.hcl.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="dp1")
	public static Object[][] testData() throws InvalidFormatException, IOException
	{
		File f = new File("E:\\MYTD.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook(f);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		int r =s1.getPhysicalNumberOfRows();
		Object [][] arr = new Object[r][2];
		for(int i=0;i<r;i++)
		{
			XSSFRow r1 = s1.getRow(i);
			XSSFCell c1 =r1.getCell(0);
			XSSFCell c2 =r1.getCell(1);
			arr[i][0]= c1.getStringCellValue();
			arr[i][1]= c2.getStringCellValue();
		}
		
		return arr;
		
	}
	
}
