package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priorityTest {

	WebDriver driver; 
	
	@BeforeMethod
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasan\\workspace\\Spring17Framework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test (priority=1)
	public void assertIfUserLoggnedIn(){
		driver.get("https://www.google.com");
		System.out.println("Assert if user logged in or not");
	}
	
	@Test (priority=2)
	public void firstLogin(){
		driver.get("https://www.facebook.com");
		System.out.println("First need to login. Login is done");
	}
	
	@AfterMethod
	public void afterMethod (){
		driver.close();
		driver.quit();
		
	}
	
}
