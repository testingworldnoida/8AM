package org.hcl.assertions;

import org.openqa.selenium.WebDriver;

public class Verify {

	public boolean validatePageURL(WebDriver driver, String expURL)
	{
		boolean result=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			result=true;
		}
		return result;
	}
	
}
