package TestAnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4 {
	
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	
	@Test(priority = 4)
	public void m4() {
		System.out.println("This is method m4 from testcase 2");
	}
	
	@Test(priority = 5)
	public void m5() {
		System.out.println("This is method m5 from testcase 2");
	}
	
	@Test(priority = 6)
	public void m6() {
		System.out.println("This is method m6 from testcase 2");
	}
	
}
