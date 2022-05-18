package Pom_PagefactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {

	// All the test cases ==> call the verifications 
	// launch the browser==> hit the url ==> set up the browser configuration ==> @ BeforeClass
	// single test ==> all verification methods ==> @ Test
	// close the browser==> @ Afterclass
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (98)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		
		RegistrationPage rgpage = new RegistrationPage(driver);
		rgpage.clickFacebookSignupLink();
		rgpage.verifyRegistrationPageFblogo();
		rgpage.verifyRegistrationPageAlreadyAccount();
		rgpage.setRegistrationPageFirstName("ABC");
		rgpage.setRegistrationPageLastName("PQR");
		rgpage.setRegistrationPageMobileEmail("1234567890");
		rgpage.setRegistrationPagePassword("ABC@12345");
		rgpage.setRegistrationPageBirthDay();
		rgpage.setRegistrationPageBirthMonth();
		rgpage.setRegistrationPageBirthYear();
		rgpage.setsetRegistrationPageGender("MALE");
		rgpage.clickRegistrationPageSubmitBtn();
		
	}
	
	@Test
	public void FacebookRegistrationPageTest_Negative() {
		
		RegistrationPage rgpage = new RegistrationPage(driver);
		rgpage.clickFacebookSignupLink();
		rgpage.verifyRegistrationPageFblogo();
		rgpage.verifyRegistrationPageAlreadyAccount();
		rgpage.setRegistrationPageFirstName("lmn");
		rgpage.setRegistrationPageLastName("pqr");
		rgpage.setRegistrationPageMobileEmail("");
		rgpage.setRegistrationPagePassword("ABC@12345");
		rgpage.setRegistrationPageBirthDay();
		rgpage.setRegistrationPageBirthMonth();
		rgpage.setRegistrationPageBirthYear();
		rgpage.setsetRegistrationPageGender("MALE");
		rgpage.clickRegistrationPageSubmitBtn();
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
