package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest(alwaysRun = true)
	public void openDB() {
		System.out.println("Database is opened");
	}
	
	@AfterTest(alwaysRun = true)
	public void closeDB() {
		System.out.println("Database is closed");
	}
	
	
	@ BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(groups = "smoke")
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test (groups ="functional")
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test(groups = {"functional", "regression"})
	public void Test3() {
		System.out.println("Test3");
	}
}
