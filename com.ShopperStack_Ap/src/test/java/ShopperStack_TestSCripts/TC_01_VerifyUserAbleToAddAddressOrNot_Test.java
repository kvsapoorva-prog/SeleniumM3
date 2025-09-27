package ShopperStack_TestSCripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_Ap_POM.Addressform_page;
import com.ShopperStack_Ap_POM.MyAddress_page;
import com.ShopperStack_Ap_POM.MyProfile_page;

import ShopperStack_GenericUtility.BaseTest;

public class TC_01_VerifyUserAbleToAddAddressOrNot_Test extends BaseTest {

	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);
		homepage.getAccountsettingsbtn().click();
		homepage.getMyprofilebtn().click();

		MyProfile_page myprofile = new MyProfile_page(driver);
		myprofile.getMyaddressbtn().click();

		MyAddress_page myaddress = new MyAddress_page(driver);
		myaddress.getAddAddressbtn().click();

		Addressform_page addressform = new Addressform_page(driver);
		addressform.getName().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addressform.getHouseno().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addressform.getStreet().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		addressform.getLandmark().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));

		WebDriverUtility.selectByvalue(addressform.getCountry(), fileUtility.readDataFromPropertyFile("country"));
		WebDriverUtility.selectByvalue(addressform.getState(), fileUtility.readDataFromPropertyFile("state"));
		WebDriverUtility.selectByvalue(addressform.getCity(), fileUtility.readDataFromPropertyFile("city"));

		addressform.getPincode().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addressform.getPhonenumber().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addressform.getAddaddressbtn().click();
		homepage.getCloseBtn().click();

		Thread.sleep(2000);
		WebDriverUtility.captureWebPageScreenshot(driver);

	}

}
