package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;
import locators.locators1;

public class learnLog4j extends Config{

	locators1 loc = new locators1();

	@Test
	public void fbRadioButtonTest (){

		APPLICATION_LOGS.debug("Testing facebook radioButton");
		String radioButtonPath = "//input[@type='radio']";
		List <WebElement> radioButtons = driver.findElements(By.xpath(radioButtonPath));
		int totalRadioButton = radioButtons.size();
		System.out.println("there are total of: " + totalRadioButton + " radio buttons");
		APPLICATION_LOGS.debug("Total radioButtons are: "+totalRadioButton);
		// select male
		radioButtons.get(1).click();
		APPLICATION_LOGS.debug("Radio button test is done");
	}
	
	@Test
	public void fbFirstNameBoxTest(){
		APPLICATION_LOGS.debug("Testing facebook first name field");
		typeByXpath (loc.firstNameLocator, "test");
		APPLICATION_LOGS.debug("Testing facebook FName ended");
		
	}
}
