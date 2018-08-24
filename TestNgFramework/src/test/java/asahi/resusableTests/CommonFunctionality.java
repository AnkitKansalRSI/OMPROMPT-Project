package asahi.resusableTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import asahi.pageLocators.CreateOrderPageLocators;
import asahi.pageLocators.LoginPageLocators;
import asahi.pageObjects.CreateOrderPageObject;
import asahi.pageObjects.LoginPageObject;
import asahi.testRunner.Runner;
import extensions.ElementExtensions;

import utility.SelectBrowser;
import utility.Synchronization;




public class CommonFunctionality extends Runner {	
	

	public static void CalendarFunc() throws InterruptedException {
		List<WebElement> enabledDates = CreateOrderPageObject.CalendarWindow(SelectBrowser.driver).findElements(By
				.xpath("//a[not(contains(@class,'ui-state-disabled'))][not(contains(@class,'ui-paginator-element'))][(contains(@class,'ui-state-default'))]"));

		if (enabledDates.size() == 0) {
			ElementExtensions.ClickOnIt(CreateOrderPageObject.RightClickButton(SelectBrowser.driver));
			enabledDates = CreateOrderPageObject.CalendarWindow(SelectBrowser.driver).findElements(By.xpath(
					"//a[not(contains(@class,'ui-state-disabled'))][not(contains(@class,'ui-paginator-element'))][(contains(@class,'ui-state-default'))]"));
			// Thread.sleep(1000);
			enabledDates.get(0).click();
			Thread.sleep(5000);
		} else if (enabledDates.size() > 0) {
			enabledDates = CreateOrderPageObject.CalendarWindow(SelectBrowser.driver).findElements(By.xpath(
					"//a[not(contains(@class,'ui-state-disabled'))][not(contains(@class,'ui-paginator-element'))][(contains(@class,'ui-state-default'))]"));
			// Thread.sleep(1000);
			enabledDates.get(0).click();
			Thread.sleep(5000);
		}
	}
	
	public static void LoginPage(String Username, String Password) {
		Assert.assertTrue(SelectBrowser.driver.getTitle().contains("Supply Chain"));
		Synchronization.VisibleElement(SelectBrowser.driver, LoginPageLocators.UsernameTextBox);		
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Application has been Launched Successfully", ExtentColor.GREEN));
		ElementExtensions.EnterText(LoginPageObject.UserNameTextBox(SelectBrowser.driver),Username);
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Username successfully", ExtentColor.GREEN));
		
		ElementExtensions.EnterText(LoginPageObject.PasswordTextBox(SelectBrowser.driver), Password);
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Password successfully", ExtentColor.GREEN));
		Synchronization.ClickableElement(SelectBrowser.driver,LoginPageLocators.SignInButton);
		ElementExtensions.ClickOnIt(LoginPageObject.SignInButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the SignIn button", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.CreateOrderButton);
		Assert.assertTrue(SelectBrowser.driver.getCurrentUrl().contains("dashboard"));
		logger.log(Status.PASS, MarkupHelper.createLabel("User has been logged in Successfully", ExtentColor.GREEN));		
	}
	
	
}

