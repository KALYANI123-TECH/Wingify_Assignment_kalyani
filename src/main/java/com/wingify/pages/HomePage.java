package com.wingify.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.wingify.objrepo.HomepageObjRepo;

public class HomePage extends HomepageObjRepo {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyAmountHeader() {

		amount.click();
		
	}
}
