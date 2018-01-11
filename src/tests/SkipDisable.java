package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;

public class SkipDisable extends Config{
	
	// Aim for this class
	// =============================
	// skipping the test
	// Disable the test
	
	@Test ()
	public void goingToSkip(){
		System.out.println("This test has been skipped");
		throw new SkipException ("Skipping because this test is no longer needed!!");
		// selenium code
	
	}
	
	@Test (enabled=true)
	public void goingToDisable(){
		System.out.println("This test has been disabled");
	}
	
	

}
