package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.locators1;
import values.values1;

public class test2 extends Config {
	
	locators1 	loc = new locators1();
	values1		val = new values1();
	
	@Test
	public void createFBAccountWith18less (){
		// verify the first name field
	 typeByXpath (loc.firstNameLocator, val.firstNameValue);
		
		// verify the last name field
		typeByXpath (loc.lastNameLocator, val.lastNameValue);
		
		// dropdown
		dropDownByXpath (loc.yyDropdownLoc, val.eighteenLessYearValue);
	}
	

}
