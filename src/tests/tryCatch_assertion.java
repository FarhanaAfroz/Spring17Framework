package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tryCatch_assertion {
	// Aim for this class
	// Assert -- act vs exp 
	// try then catch

	WebDriver driver; 

	@BeforeMethod
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasan\\workspace\\Spring17Framework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test ()
	public void tryCatchTesting(){
		String expValue = "a";
		String actValue = "b";
		try {
			Assert.assertEquals(actValue, expValue);
		} catch (Throwable t){
			System.err.println("Act vs Exp not matching" + t);
		}
	}

	@Test ()
	public void assertRightThere(){
		String expValue = "a";
		String actValue = "b";
		Assert.assertEquals(actValue, expValue);
		// Selenium code

	}
	@Test ()
	public void learnAssertion(){
		String expValue = "Sign Ups";
		String actValue = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/h2")).getText();
		
		
		try {
			Assert.assertEquals(actValue, expValue);
		} catch (Throwable t){
			System.err.println("Act vs Exp not matching" + t);
		}

		// Selenium code

	}

	@AfterMethod
	public void afterMethod (){
		driver.close();
		driver.quit();

	}



}
