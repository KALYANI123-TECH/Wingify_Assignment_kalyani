package com.wingify.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.wingify.pages.LoginPage;

public class LoginTest extends TestBase {

	WebDriver driver;
	LoginPage lp;

	@BeforeMethod
	public void launchApplication() {

		driver = openBrowser();
		lp = new LoginPage(driver);
	}

	@Test(priority = 1, enabled = false, description = "verify login with valid credentials")
	public void validate_Correct_Credential() {
		lp.verifyLoginSucessfull();
		AssertJUnit.assertEquals(driver.getTitle(), "Demo App");
	}

	@Test(priority = 2, enabled = false, description = "verify login with invalid password")
	public void validate_Invalid_Password() {

		lp.verifyPasswordError();
		AssertJUnit.assertEquals(driver.getTitle(), "Error Message");
	}

	@Test(priority = 3, enabled = false, description = "verify login with invalid username")
	public void validate_Invalid_Username() {

		lp.verifyUsernameError();
		AssertJUnit.assertEquals(driver.getTitle(), "Error Message");
	}

	@Test(priority = 4, enabled = false, description = "verify login with Invalid credentials")
	public void validate_Incorrect_Credential() {

		lp.verifyLoginFail();
		AssertJUnit.assertEquals(driver.getTitle(), "Error Message");
	}

	@Test(priority = 5, enabled = false, description = "verify login without username and password")
	public void validate_Empty_Credentials() throws InterruptedException {

		lp.verifyBlankCredetials();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(lp.errormessage.getText(), "Both Username and Password must be present");
	}

	@Test(priority = 6, enabled = false, description = "verify login with only valid password")
	public void validate_EmptyUsername_with_validPassword() throws InterruptedException {

		lp.verifyBlankUsernameValidPassword();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(lp.userAlert.getText(), "Username must be present");
	}

	@Test(priority = 7, enabled = false, description = "verify login with only Invalid password")
	public void validate_EmptyUsername_with_InvalidPassword() throws InterruptedException {

		lp.verifyBlankUsernameInvalidPassword();
		Thread.sleep(2000);
		SoftAssert softassert = new SoftAssert();
		AssertJUnit.assertEquals(lp.userAlert.getText(), "Username must be present");
		AssertJUnit.assertEquals(lp.userAlert.getText(), "Error Message - wrong password");
		softassert.assertAll();

	}

	@Test(priority = 8, enabled = false, description = "verify login with only valid username")
	public void validate_EmptyPassword_validUsername() throws InterruptedException {

		lp.verifyBlankPasswordValidUsername();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(lp.passAlert.getText(), "Password must be present");

	}

	@Test(priority = 9, enabled = false, description = "verify login with only Invalid username")
	public void validate_EmptyPassword_InvalidUsername() throws InterruptedException {

		lp.verifyBlankPasswordInalidUsername();
		Thread.sleep(2000);

		SoftAssert softassert = new SoftAssert();
		AssertJUnit.assertEquals(lp.passAlert.getText(), "Password must be present");
		AssertJUnit.assertEquals(lp.passAlert.getText(), "Error Message - wrong username");
		softassert.assertAll();

	}

	@Test(priority = 10, enabled = false, description = "verify Twiiter link of login page")
	public void validate_Twitter_Socialmedia_Link() throws InterruptedException {

		lp.verifyTwitterLink();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(driver.getTitle(), "Twitter login page");

	}

	@Test(priority = 11, enabled = false, description = "verify Facebook link of login page")
	public void validate_Facebook_Socialmedia_Link() throws InterruptedException {

		lp.verifyFacebookLink();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(driver.getTitle(), "Facebook login page");

	}

	@Test(priority = 12, enabled = false, description = "verify Linkedin link of login page")
	public void validate_Linkedin_Socialmedia_Link() throws InterruptedException {

		lp.verifyLinkedinLink();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(driver.getTitle(), "Linkedin login page");

	}

	@Test(priority = 13, enabled = true, description = "verify Rememberme checkbox of login page")
	public void validate_RememberMe_Checkbox() throws InterruptedException {

		lp.verifyRememberCheckbox();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(driver.getTitle(), "Demo App");

	}

}
