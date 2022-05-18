package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {

	@ BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(groups = "smoke")
	public void Test4() {
		System.out.println("Test4");
	}
	
	@Test(groups ="functional")
	public void Test5() {
		System.out.println("Test5");
	}
	
	@Test (groups = {"functional", "regression"})
	public void Test6() {
		System.out.println("Test6");
	}
	
	
}
