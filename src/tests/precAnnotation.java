package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class precAnnotation {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println(" @beforeSuite --- before suite start");
		// Database (DB) Connection
		// Capture the suite start time
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println(" @afterSuite --- After suite end");
		// Database (DB) Connection close
		// Capture the suite end time
	}

	@BeforeClass
	public void beforeClass(){
		System.out.println(" @beforeClass --- before Class start");

	}

	@AfterClass
	public void afterClass(){
		System.out.println(" @afterClass --- after Class END");

	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("@beforeTest - Should run b4 all the test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("@afterTest - Should run after all the test");
	}
	
	
	@BeforeMethod 
	public void beforeMethod(){
		System.out.println("@beforeMethod - Before EACH Test method will execute");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("@afterMethod - After EACH Test");
	}

		
	@Test
	public void mytest (){
		System.out.println("@Test - My TEST Method/Function");
	}
	
	@Test
	public void mytest2 (){
		System.out.println("@Test - My TEST 2 Method/Function");
	}
}
