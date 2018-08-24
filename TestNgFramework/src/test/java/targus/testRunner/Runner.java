package targus.testRunner;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import targus.resusableTests.CommonFunctionality;
import utility.ConfigFileUtil;
import utility.GetScreenshot;
import utility.SelectBrowser;

public class Runner {

	ExtentHtmlReporter htmlReporter;
	protected ExtentReports extent;
	public static ExtentTest logger;

	@BeforeSuite
	public void testCase1() {

		if (ConfigFileUtil.Environment().equalsIgnoreCase("dev")) {
			
			SelectBrowser.BrowserandURL(ConfigFileUtil.TargusURLAddressDEV(), ConfigFileUtil.Browser());

		}else if(ConfigFileUtil.Environment().equalsIgnoreCase("sit")) {
			SelectBrowser.BrowserandURL(ConfigFileUtil.TargusURLAddressSIT(), ConfigFileUtil.Browser());
		}

		//SelectBrowser.BrowserandURL(ConfigFileUtil.TargusURLAddressDEV(), ConfigFileUtil.Browser());
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/STMExtentReportforTargus.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "OMPROMPT");
		extent.setSystemInfo("Environment", "DEV Environment");
		extent.setSystemInfo("Author", "Ankit Kansal");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Targus Suite");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
		logger = extent.createTest("Login Test Case ");
		CommonFunctionality.LoginPage(ConfigFileUtil.TargusNormalUSername(), ConfigFileUtil.TargusNormalPassword());
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = GetScreenshot.Capture(SelectBrowser.driver, "ScreenshotName");
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			logger.fail("SnapShotBelow:" + logger.addScreenCaptureFromPath(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			// logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}

	}

	@AfterSuite
	public void endReport() {
		SelectBrowser.BrowserTearDown();
		extent.flush();
	}

}
