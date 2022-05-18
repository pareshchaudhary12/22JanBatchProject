package Parameterization_CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowserTesting {
	WebDriver driver;
	// 1. chrome ==> hit the url ==> mange browser activities   (Behavioral/inputdomain)
	// 2. facebook url  ==> actual url and expected ==> assertion ==> imp scenario.
	// 3. Title of the facebook page
	// 4. username field
	// 5. password field
	// 6. login button.
	
	@Parameters("browser")
	@Test(priority = 1)
	public void CrossBrowserTesting(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (98)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong Browser Selected");
		}
		
			driver.get("https://www.facebook.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(priority = 2)
	public void verifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		Reporter.log("verifyCurrentUrl", true);
	}
	
	
	@Test(priority = 3)
	public void verifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		Reporter.log("verifyPageTitle", true);
	}
	
	@Test(priority = 4)
	public void verifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		Assert.assertTrue(username.isEnabled());
		username.sendKeys("ABC");
		Reporter.log("verifyUsernameField", true);
	}
	
	@Test(priority = 5)
	public void verifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("ABC@123456789");
		Reporter.log("verifyPasswordField", true);
	}
	
	@Test(priority = 6)
	public  void clickLoginButton() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(loginBtn.isEnabled());
		loginBtn.click();
		Reporter.log("clickLoginButton", true);
	}
	
	@Test(priority = 7)
	public void teardown() {
		driver.quit();
		Reporter.log("Browser is closed", true);
	}
}
