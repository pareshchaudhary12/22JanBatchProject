package Pom_PagefactoryPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
		// object Repository.
		
		// Declaration.
		
		@FindBy (xpath ="//img[@class='fb_logo _8ilh img']") private WebElement login_fblogo;
		@FindBy (xpath ="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement login_taglinne;
		@FindBy (xpath ="//input[@name='email']") private WebElement username;
		@FindBy (xpath ="//input[@name='pass']") private WebElement password;
		@FindBy (xpath ="//button[@name='login']") private WebElement loginbtn;
		@FindBy (xpath ="//a[text()='Forgotten password?']") private WebElement forgotpassword;
		@FindBy (xpath ="//a[@data-testid='open-registration-form-button']") private WebElement createnewaccount;
		@FindBys({@FindBy (xpath ="//*[@id='pageFooterChildren']/ul/li")}) private List<WebElement> footerlinks;
		
		// initialization.
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		// Usage.
		
		public void verifyFacebookLoginPageLogo() {
			Assert.assertTrue(login_fblogo.isDisplayed(), "The facebook logo on login page is not displyed");
			Reporter.log("verifyFacebookLoginPageLogo",true);
		}
		
		public void verifyFacebookLoginPageTagline() {
			Assert.assertTrue(login_taglinne.isDisplayed(), "The facebook Tagline on login page is not displyed");
			Assert.assertEquals(login_taglinne.getText(), "Facebook helps you connect and share with the people in your life.");
			Reporter.log("verifyFacebookLoginPageTagline",true);
		}
		
		public void verifyFacebookLoginPageForgotPasswordLink() {
			Assert.assertTrue(forgotpassword.isDisplayed(), "The facebook forgot password option on login page is not displyed");
			Assert.assertEquals(forgotpassword.getText(), "Forgotten password?");
			Reporter.log("verifyFacebookLoginPageForgotPasswordLink",true);
		}
		
		public void verifyFacebookLoginPageCreateNewAccBtn() {
			Assert.assertTrue(createnewaccount.isDisplayed(), "The facebook Create New Account Button on login page is not displyed");
			Reporter.log("verifyFacebookLoginPageForgotPasswordLink",true);
		}
		
		public void verifyFacebookLoginPageFooterLinkSize() {
			Assert.assertEquals(footerlinks.size(), 30);
			for(int i=0;i<footerlinks.size();i++) {
				String indivisuallink = footerlinks.get(i).getText();
				System.out.println(indivisuallink);
				Reporter.log(indivisuallink);

			}
			Reporter.log("verifyFacebookLoginPageFooterLinkSize",true);
		}
		
		public void setFacebookLoginPageUserName() {
			Assert.assertTrue(username.isDisplayed(), "The facebook Username Field on login page is not displyed");
			username.sendKeys("PQL");
			Reporter.log("setFacebookLoginPageUserName",true);
		}
		
		public void setFacebookLoginPagePassword() {
			Assert.assertTrue(password.isDisplayed(), "The facebook Password Field on login page is not displyed");
			password.sendKeys("PQL@654977");
			Reporter.log("setFacebookLoginPagePassword",true);
		}
		
		public  void clickFacebookLoginPageLoginBtn() {
			Assert.assertTrue(loginbtn.isEnabled(), "The facebook Login Button on login page is not Enabled");
			loginbtn.click();
			Reporter.log("clickFacebookLoginPageLoginBtn",true);
		}
}
