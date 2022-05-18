package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnotationsPractice {

	// login ==> homepage ==> logout
	// login ==> notification ==> logout
	// login ==> profilepage ==> logout
	
	// code rewriting ==> maintaince ==> reduced the code length ==> method duplicay.
	
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	
	@AfterMethod
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
