package ShopperStack_TestSCripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShopperStack_Ap_POM.MyAddress_page;
import com.ShopperStack_Ap_POM.MyProfile_page;

import ShopperStack_GenericUtility.BaseTest;

public class TC_02_VerifyUserAbleToDeleteAddressOrNot_Te75st extends BaseTest{
	
	@Test
	public void deleteaddress() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		homepage.getAccountsettingsbtn().click();
		homepage.getMyprofilebtn().click();
		
		
		MyProfile_page myprofile = new MyProfile_page(driver);
		myprofile.getMyaddressbtn().click();
		
		MyAddress_page myAddress = new MyAddress_page(driver);
		Thread.sleep(2000);
		myAddress.getDeletebtn().click();
		myAddress.getYesbtn().click();
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebDriverUtility.captureWebPageScreenshot(driver);
	}

}
