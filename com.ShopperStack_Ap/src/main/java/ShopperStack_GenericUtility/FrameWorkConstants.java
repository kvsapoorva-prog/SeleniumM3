package ShopperStack_GenericUtility;

public interface FrameWorkConstants {

	JavaUtility javautility = new JavaUtility();
	static final String propertyPath = "./src/test/resources/testData/shopperdata.properties";
	static final String excelPath = "./src/test/resources/testData/shopperdataexcel.xlsx";
	static final String screenshotPath = "./screenshot/"+ javautility.localDateAndTime() + ".png";
	static final String reportPath = "./reports/" + javautility.localDateAndTime() + ".html";
	
}
