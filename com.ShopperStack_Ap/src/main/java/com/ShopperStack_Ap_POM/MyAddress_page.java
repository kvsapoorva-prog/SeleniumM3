package com.ShopperStack_Ap_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_page {

	public MyAddress_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressbtn;
	
	@FindBy(xpath = "(//span[contains(@class, 'MuiButton-startIcon')])[2]")
	private WebElement deletebtn;
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	private WebElement yesbtn;

	public WebElement getAddAddressbtn() {
		return addAddressbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getYesbtn() {
		return yesbtn;
	}
	
	
	
}
