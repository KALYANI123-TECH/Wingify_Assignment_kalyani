package com.wingify.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.wingify.objrepo.LoginObjectRepo;

public class LoginPage extends LoginObjectRepo {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyLoginSucessfull() {
		username.sendKeys("Kalyani");
		password.sendKeys("kalyani123");
		loginbtn.click();
	}

	public void verifyPasswordError() {
		username.sendKeys("Kalyani");
		password.sendKeys("123");
		loginbtn.click();
	}

	public void verifyUsernameError() {
		username.sendKeys("Kal");
		password.sendKeys("kalyani123");
		loginbtn.click();
	}

	public void verifyLoginFail() {
		username.sendKeys("user");
		password.sendKeys("123");
		loginbtn.click();
	}

	public void verifyBlankCredetials() {
		loginbtn.click();
	}

	public void verifyBlankUsernameValidPassword() {
		password.sendKeys("kalyani123");
		loginbtn.click();
	}

	public void verifyBlankUsernameInvalidPassword() {
		password.sendKeys("123");
		loginbtn.click();
	}

	public void verifyBlankPasswordValidUsername() {
		username.sendKeys("Kalyani");
		loginbtn.click();
	}

	public void verifyBlankPasswordInalidUsername() {
		username.sendKeys("user");
		loginbtn.click();
	}

	public void verifyTwitterLink() {
		twitterlink.click();
	}

	public void verifyFacebookLink() {
		facebooklink.click();
	}

	public void verifyLinkedinLink() {
		linkedinlink.click();
	}

	public void verifyRememberCheckbox() {
		username.sendKeys("Kalyani");
		password.sendKeys("kalyani123");	
		rememberme.click();
		loginbtn.click();
	}
}
