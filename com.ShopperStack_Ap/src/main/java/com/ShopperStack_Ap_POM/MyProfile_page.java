package com.ShopperStack_Ap_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile_page {
	
	public MyProfile_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myaddressbtn;

	public WebElement getMyaddressbtn() {
		return myaddressbtn;
	}
	
}
