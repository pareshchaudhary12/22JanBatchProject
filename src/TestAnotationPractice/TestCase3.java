package TestAnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	@BeforeTest
	public void openDB() {
		System.out.println("Database is opened before starting of 1st testcase");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Database is closed after ending of 2nd testcase");
	}
	
	
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(priority = 1)
	public void m1() {
		System.out.println("This is method m1 from testcase 1");
	}
	
	@Test(priority = 2)
	public void m2() {
		System.out.println("This is method m2 from testcase 1");
	}
	
	@Test(priority = 3)
	public void m3() {
		System.out.println("This is method m3 from testcase 1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
