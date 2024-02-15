package com.wingify.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.wingify.pages.LoginPage;

public class TestBase {

	public WebDriver driver;

	public WebDriver openBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		return driver;

	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();
	}

}
