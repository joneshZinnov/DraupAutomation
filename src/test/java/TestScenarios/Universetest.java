package TestScenarios;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import utility.Log;

public class Universetest extends WebBaseClass{
	
Logger log = Logger.getLogger("Universe");
	
	@Test(priority = 1)
	public void universeModuleLandingPage() throws IOException, InterruptedException {
		
		test = rep.startTest("Universe Module Started");

		Log.info("Test case universe module started");

		Universe.UniverseLandingPage();
		
		test.log(LogStatus.INFO, "click on universe tab");
	//  <class name="TestScenarios.Universetest"/>
	}
}
