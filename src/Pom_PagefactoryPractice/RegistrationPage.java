package Pom_PagefactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {

	// xpaths and verification methods ==> testng
	
	// 1. declaration ==> maintain the xpaths and replace findelement by ==> @Findby
	// 2. initialization ==> pagefactory class ==> initelements method
	// 3. usage. ==> define user action specific verification  methods.
	
	// driver.findelement(by.xpah("expression"));
	
	// delclaration. ===> object repository ==> all objects are placed
	
	@FindBy (xpath = "//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
	@FindBy (xpath = "//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy (xpath = "//a[@title='Sign up for Facebook']") private WebElement singuplink;
	@FindBy (xpath = "//input[@name='email']") private WebElement firstname;
	@FindBy (name = "lastname") private WebElement surname;
	@FindBy (name = "reg_email__") private WebElement mob_email;
	@FindBy (name = "reg_passwd__") private WebElement password;
	@FindBy (name = "birthday_day") private WebElement birthday;
	@FindBy (name = "birthday_month") private WebElement birthmonth;
	@FindBy (name = "birthday_year") private WebElement birthyear;
	@FindBy (xpath = "//input[@value='2']") private WebElement gender_male;
	@FindBy (xpath = "//input[@value='1']") private WebElement gender_female;
	@FindBy (name = "websubmit") private WebElement submitbtn;
	
	
	
	// initialization ==> declare class constructor with public access
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// usage
	// ================================================= Static Member ==================================================
	public void clickFacebookSignupLink() {
		singuplink.click();
		Reporter.log("clickFacebookSignupLink", true);
	}
	
	public void verifyRegistrationPageFblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "The facebook logo on registration page is not displyed");
		Reporter.log("verifyRegistrationPageFblogo", true);
	}
	
	public void verifyRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"Already having an account option is not displayed");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
		Reporter.log("verifyRegistrationPageAlreadyAccount", true);
	}
	
	// ==================================================== Dynamic Member =======================================================
	public void setRegistrationPageFirstName(String fname) {
		firstname.sendKeys(fname);
		Reporter.log("setRegistrationPageFirstName", true);
	}
	
	public void setRegistrationPageLastName(String lname) {
		surname.sendKeys(lname);
		Reporter.log("setRegistrationPageLastName", true);
	}
	
	public void setRegistrationPageMobileEmail(String mobNo) {
		mob_email.sendKeys(mobNo);
		Reporter.log("setRegistrationPageMobileEmail", true);
	}
	
	public void setRegistrationPagePassword(String pwd) {
		password.sendKeys(pwd);
		Reporter.log("setRegistrationPagePassword", true);
	}
	
	public void setRegistrationPageBirthDay() {
		Assert.assertTrue(birthday.isDisplayed(),"Birthday is not displayed");
		Assert.assertFalse(birthday.isSelected());
		Select bday = new Select(birthday);
		bday.selectByVisibleText("19");
		Reporter.log("setRegistrationPageBirthDay", true);
	}
	
	public void setRegistrationPageBirthMonth() {
		Assert.assertTrue(birthmonth.isDisplayed(),"birthmonth is not displayed");
		Assert.assertFalse(birthmonth.isSelected());
		Select bmonth = new Select(birthmonth);
		bmonth.selectByVisibleText("Mar");
		Reporter.log("setRegistrationPageBirthMonth", true);
	}
	
	public void setRegistrationPageBirthYear() {
		Assert.assertTrue(birthyear.isDisplayed(),"birthyear is not displayed");
		Assert.assertFalse(birthyear.isSelected());
		Select byear = new Select(birthyear);
		byear.selectByVisibleText("1974");
		Reporter.log("setRegistrationPageBirthYear", true);
	}
	
	
	public void setsetRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}
		Reporter.log("setsetRegistrationPageGender", true);
	}
	
	public void clickRegistrationPageSubmitBtn() {
		submitbtn.click();
		Reporter.log("clickRegistrationPageSubmitBtn", true);
	}
	
}
