package com.wingify.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectRepo {

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "log-in")
	public WebElement loginbtn;

	@FindBy(xpath = "//div[@class = \"auth-box-w\"]/div[3]")
	public WebElement errormessage;

	@FindBy(xpath = "//div[@class= \"alert alert-warning\"]")
	public WebElement passAlert;

	@FindBy(xpath = "//div[@class = \"alert alert-warning\"]")
	public WebElement userAlert;

	@FindBy(xpath = "//div[@class = \"buttons-w\"]/div[2]/a[1]/img")
	public WebElement twitterlink;

	@FindBy(xpath = "//div[@class = \"buttons-w\"]/div[2]/a[2]/img")
	public WebElement facebooklink;

	@FindBy(xpath = "//div[@class = \"buttons-w\"]/div[2]/a[3]/img")
	public WebElement linkedinlink;

	@FindBy(xpath = "//input[@class = \"form-check-input\"]")
	public WebElement rememberme;

}
