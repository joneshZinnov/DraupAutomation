package PageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import DataProvider.ReadExcelData;
import utility.Library;

public class DraupContendersPageObjects {

	Logger contendersPageLog = Logger.getLogger("Contenders Page Logs");
	WebDriver driverContenders;
	ExtentReports reportContenders;
	ExtentTest testContenders;
	Library contendersAccess = new Library();
	
	ReadExcelData contendersSheet = new ReadExcelData("./TestData/Locators.xlsx");
	
	public DraupContendersPageObjects(WebDriver driverContenders, ExtentTest testContenders) {
		
		this.driverContenders = driverContenders;
		this.testContenders = testContenders;
		driverContenders.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void clickOnContenders() throws IOException {
		
		contendersAccess.Buttonclick(contendersAccess.readObjectLocator("clickOnContender"));
		contendersPageLog.info("Clicked on Contenders Link");
	}
	
	
	
}
