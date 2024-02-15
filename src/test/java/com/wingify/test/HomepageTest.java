package com.wingify.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wingify.pages.HomePage;
import com.wingify.pages.LoginPage;

public class HomepageTest extends TestBase {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;

	@BeforeMethod
	public void launchApplication() {
		driver = openBrowser();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);

	}

	@Test
	public void validateAmountHeader() throws InterruptedException {

		lp.verifyLoginSucessfull();
		Thread.sleep(2000);
		hp.verifyAmountHeader();
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='text-success' or @class='text-danger']"));

		WebElement ele1 = elements.get(0);
		System.out.println(ele1.getText());
		String numericString1 = ele1.getText().replaceAll("[^\\d.-]", "");
		double doubleValue1 = Double.parseDouble(numericString1);
		System.out.println(doubleValue1);

		WebElement ele2 = elements.get(1);
		System.out.println(ele2.getText());
		String numericString2 = ele2.getText().replaceAll("[^\\d.-]", "");
		double doubleValue2 = Double.parseDouble(numericString2);
		System.out.println(doubleValue2);

		WebElement ele3 = elements.get(2);
		System.out.println(ele3.getText());
		String numericString3 = ele3.getText().replaceAll("[^\\d.-]", "");
		double doubleValue3 = Double.parseDouble(numericString3);
		System.out.println(doubleValue3);

		WebElement ele4 = elements.get(3);
		System.out.println(ele4.getText());
		String numericString4 = ele4.getText().replaceAll("[^\\d.-]", "");
		double doubleValue4 = Double.parseDouble(numericString4);
		System.out.println(doubleValue4);

		WebElement ele5 = elements.get(4);
		System.out.println(ele5.getText());
		String numericString5 = ele5.getText().replaceAll("[^\\d.-]", "");
		double doubleValue5 = Double.parseDouble(numericString5);
		System.out.println(doubleValue5);

		WebElement ele6 = elements.get(5);
		System.out.println(ele6.getText());
		String numericString6 = ele6.getText().replaceAll("[^\\d.-]", "");
		double doubleValue6 = Double.parseDouble(numericString6);
		System.out.println(doubleValue6);

		boolean flag;

		if (doubleValue1 < doubleValue2 & doubleValue1 < doubleValue3 & doubleValue1 < doubleValue4
				& doubleValue1 < doubleValue5 & doubleValue1 < doubleValue6) {
			flag = true;

		} else {
			flag = false;

		}

		Assert.assertTrue(flag, "Values are not sorted");

		Reporter.log("Values are sorted", flag);
	}
}
