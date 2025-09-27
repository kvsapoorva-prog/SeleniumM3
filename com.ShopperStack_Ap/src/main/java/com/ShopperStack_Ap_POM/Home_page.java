package com.ShopperStack_Ap_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath = "//span[contains(@class, 'BaseBadge-badge')]")
	@FindBy(xpath ="(//div[contains(@class, 'MuiAvatar-root MuiAvatar-circular ')])[1]")
	private WebElement accountsettingsbtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myprofilebtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "//button[@aria-label='close']")
	private WebElement closeBtn;

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getAccountsettingsbtn() {
		return accountsettingsbtn;
	}

	public WebElement getMyprofilebtn() {
		return myprofilebtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	

}
