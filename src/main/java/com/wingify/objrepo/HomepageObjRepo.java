package com.wingify.objrepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageObjRepo {

	@FindBy(id = "amount")
	public WebElement amount;
	
	@FindBy(xpath = "//table[@id = \"transactionsTable\"]//td[5]")
	public List<WebElement> listofelement;
}
