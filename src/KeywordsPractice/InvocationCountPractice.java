package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login is successful");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout is successful");
	}
	
	@Test (priority = 1)
	public void HomepageTest() {
		System.out.println("Home page is tested");
	}
	
	@Test(priority = 2 , invocationCount = 5)
	public void ProfilePageTest() {
		System.out.println("Profile Page is tested");
	}
	
	
	
	
}
