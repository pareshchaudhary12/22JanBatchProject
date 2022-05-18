package KeywordsPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNGBasics.MethodAnotationsPractice;

public class DependsonMethodExample {

	// depth ==> criteria
	
	@Test (priority = 1)
	 public void openurl() {
		 System.out.println("Url is opened");
		 Reporter.log("Browser is launched");
		 Reporter.log("Url is opened");
	 }
	
	@Test (priority = 2 , dependsOnMethods = "openurl")
	public void login() {
		System.out.println("login is sucessful");
		Reporter.log("login is sucessful");
	}
	
	@Test (priority = 3 , dependsOnMethods = {"openurl","login"})
	public void logout() {
		System.out.println("logout is sucessful");
		Reporter.log("logout is sucessful");
	}
	
	
	
	
	
	
	
}
