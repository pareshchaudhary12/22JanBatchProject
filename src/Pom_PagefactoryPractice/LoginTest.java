package Pom_PagefactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	// launch the browser==> hit the url ==> browser configuration
	// test ==> facebook login page
	// close the browser.
	
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (98)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@Test
	public void FacebookLoinPageTest() {
		
		LoginPage LP = new LoginPage(driver);
		LP.verifyFacebookLoginPageLogo();
		LP.verifyFacebookLoginPageTagline();
		LP.verifyFacebookLoginPageForgotPasswordLink();
		LP.verifyFacebookLoginPageCreateNewAccBtn();
		LP.verifyFacebookLoginPageFooterLinkSize();
		LP.setFacebookLoginPageUserName();
		LP.setFacebookLoginPagePassword();
		LP.clickFacebookLoginPageLoginBtn();
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
