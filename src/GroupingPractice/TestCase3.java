package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

	@ BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(groups = "smoke")
	public void Test7() {
		System.out.println("Test7");
	}
	
	@Test(groups ="functional")
	public void Test8() {
		System.out.println("Test8");
	}
	
	@Test (groups = {"functional", "regression"})
	public void Test9() {
		System.out.println("Test9");
	}
	
}
