package TestNGBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IntroductionToTestNG {

	// open url ==> login ==> logout  ==> 3 
	// for every action  ==> seprate method ==> method name should be relavant to your action.
	
	// defaulut execution ==> login==> logout ==> openurl
	
	
	
	@Test (priority = 2)
	public void login() {
		System.out.println("login is sucessful");
		Reporter.log("login is sucessful");
	}
	
	@Test (priority = 3)
	public void logout() {
		System.out.println("logout is sucessful");
		Reporter.log("logout is sucessful");
	}
	
	@Test (priority = 1)
	 public void openurl() {
		 System.out.println("Url is opened");
		 Reporter.log("Browser is launched");
		 Reporter.log("Url is opened");
	 }
	
	
}
