package PageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import DataProvider.ReadExcelData;
import TestScenarios.WebBaseClass;
import utility.Library;

public class UniversePageObjects{

	Logger log = Logger.getLogger("UniversePage");
	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	Library help = new Library();

	ReadExcelData readexcel = new ReadExcelData("./TestData/Locators.xlsx");

	public UniversePageObjects(WebDriver driver, ExtentTest test) {

		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	/*
	 * This method is used to verify universe landing page objects.
	 */
	public void UniverseLandingPage() throws IOException, InterruptedException {
		
		System.out.println(help.readConfigFile("WebURL", "frameworkConfig"));
		driver.get(help.readConfigFile("WebURL", "frameworkConfig"));
		log.info("open url");
		
		 help.Buttonclick(help.readObjectLocator("ClickOnUniverseLink"));
		 log.info("clicked on universe link");
		
		
		

	}

}
