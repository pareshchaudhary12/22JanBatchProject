package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	String Str1 = "Hello"; //Actual 
	String Str2 = "Hi"; 	//expected
	// Assert:- use to verify sceraios.  
	// static methods  ==> hard assert ==> classname.methoname.
	
	
	// 1. Assert Equals():- if exp == actual
	
	@Test
	public void test1() {
		Assert.assertEquals(Str1, Str2);   // fail
	}
	
	// 2. Assert Not Equals :-
	
	@Test
	public void test2() {
		Assert.assertNotEquals(Str1, Str2); // pass.
	}
	
	//3. AssertNull:- tc will pass if provided data  is null.
	
	@Test
	public void test3() {
		Assert.assertNull(Str1);  // fail 
	}
	
	//3. AssertNot Null:- tc will pass if provided data  is  not null.
	@Test
	public void test4() {
		Assert.assertNotNull(Str2);   // pass 
	}
}
