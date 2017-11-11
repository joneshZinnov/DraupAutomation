package PageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.thoughtworks.selenium.webdriven.commands.CaptureScreenshotToString;

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
	 * This method is used to click on universe link.
	 */
	public void ClickOnUniverseLinkOnLandingPage() throws IOException, InterruptedException {
		
		help.Buttonclick(help.readObjectLocator("ClickOnUniverseLink"));
		 log.info("clicked on universe link");
		

	}
	
	/*
	 * This method is used to verify universe landing page objects.
	 */
	public void verifyInOpportunity_Table_AccountHeader() throws IOException, InterruptedException {
		
		String accounttext = AcccountHeader();

		try {

			Assert.assertEquals(accounttext,
					"ACCOUNT");
		}

		catch (AssertionError e) {
			
			throw e;
		}
		
	}

	
	public String AcccountHeader() throws IOException {

		String verifyAccoutHeadertext = help.readObjectLocator("TableAccoutHeader").getText();

		System.out.println(verifyAccoutHeadertext);
		return verifyAccoutHeadertext;

		//return verifyAccoutHeadertext;
	}


}
