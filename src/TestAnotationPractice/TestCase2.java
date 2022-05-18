package TestAnotationPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {

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
