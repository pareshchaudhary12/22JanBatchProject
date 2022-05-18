package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAnotationPractice {
	
	// login ==> profile page ==> homepage ==> notificationpage ==> logout.
	
	@BeforeClass
	public void login() {
		System.out.println("Login");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("Logout");
	}
	
	@Test (priority = 2)
	public void homepage() {
		System.out.println("Homepage Testing");
	}
	
	@Test (priority = 3)
	public void notificationpage() {
		System.out.println("Notification page Testing");
	}
	
	@Test (priority = 1)
	public void profilepage() {
		System.out.println("Profile page testing");
	}
	
}
