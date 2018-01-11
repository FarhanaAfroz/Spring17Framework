package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.Config;
import locators.locators1;
import utils.Xls_Reader;

public class ReadWriteUsingXL extends Config {

	// in this class we will be learning how to read data from excel file
	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//data.xlsx");
	locators1 loc  = new locators1();


	@Test
	public void readFromXl (){

		// getCellData(String sheetName,String colName,int rowNum)
		// sheetName = "testData"
		// colName = "firstName"
		// rowNum =  2

		typeByXpath (loc.emailLoc, xl.getCellData("testData", "email", 2));

	};

	@Test
	public void writeIntoXl(){
		String actText = driver.findElement(By.xpath(loc.signUpTextLoc)).getText();
		xl.setCellData("testData", "textTest", 2, actText);
	}

}
