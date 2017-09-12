package org.hcl.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CreateDriver {
	public WebDriver driver;
	@BeforeMethod
	public void generateDriverObject()
	{
	   ResourceBundle rb = ResourceBundle.getBundle("config");	
	   if(rb.getString("browser").equalsIgnoreCase("Chrome"))
			   {
		        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	            driver = new ChromeDriver();
	            System.out.println("Hello");
	            
	           
			   }
	   else if(rb.getString("browser").equalsIgnoreCase("firefox"))
	   		   {
		        System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
                driver = new FirefoxDriver();	
	           }
	   
	   driver.get(rb.getString("url"));
	}
	
	@AfterMethod
	public void closeDriverObject()
	{
		      driver.quit();
	}
	
}
