package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.locators1;
import values.values1;

public class test1 extends Config {
	
	locators1 	loc = new locators1();
	values1		val = new values1();
	
	@Test
	public void createFBAccountWith18plus (){
		// verify the first name field
		typeByXpath (loc.firstNameLocator, val.firstNameValue);
			
		// verify the last name field
		typeByXpath (loc.lastNameLocator, val.lastNameValue);
		
		// mobile number or email -- skip
		
		// enter new password
		typeById (loc.newPasswordLocator, val.newPassValue);
		
		// select Gender
		
		clickById (loc.femaleLocator);
		
		
		// dropdown
		//dropDownByXpath (loc.yyDropdownLoc, val.eighteenPlusYearValue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
