package targus.resusableTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import extensions.ElementExtensions;
import targus.pageLocators.CreateOrderPageLocators;
import targus.pageObjects.CreateOrderSummaryPageObject;
import targus.pageObjects.Create_OrderPageObject;
import targus.pageObjects.LoginPageObject;
import targus.testRunner.Runner;
import utility.SelectBrowser;
import utility.Synchronization;

public class CommonFunctionality extends Runner {
	
	private static List<WebElement> allvalue = null;

	public static void CalendarFunc() throws InterruptedException {
		List<WebElement> enabledDates = Create_OrderPageObject.CalendarWindow(SelectBrowser.driver).findElements(By
				.xpath("//a[not(contains(@class,'ui-state-disabled'))][not(contains(@class,'ui-paginator-element'))][(contains(@class,'ui-state-default'))]"));

		if (enabledDates.size() == 0) {
			ElementExtensions.ClickOnIt(Create_OrderPageObject.RightClickButton(SelectBrowser.driver));
			enabledDates = Create_OrderPageObject.CalendarWindow(SelectBrowser.driver).findElements(By.xpath(
					"//a[not(contains(@class,'ui-state-disabled'))][not(contains(@class,'ui-paginator-element'))][(contains(@class,'ui-state-default'))]"));
			// Thread.sleep(1000);
			enabledDates.get(0).click();
			Thread.sleep(5000);
		} else if (enabledDates.size() > 0) {
			enabledDates = Create_OrderPageObject.CalendarWindow(SelectBrowser.driver).findElements(By.xpath(
					"//a[not(contains(@class,'ui-state-disabled'))][not(contains(@class,'ui-paginator-element'))][(contains(@class,'ui-state-default'))]"));
			// Thread.sleep(1000);
			enabledDates.get(0).click();
			Thread.sleep(5000);
		}
	}

	public static void submitButtonFunc() {
		ElementExtensions.ClickOnIt(Create_OrderPageObject.SubMitButton(SelectBrowser.driver));
	}
	
	public static void placeOrderButtonFunc() {
		ElementExtensions.ClickOnIt(CreateOrderSummaryPageObject.placeOrderButton(SelectBrowser.driver));
	}
	
	public static void yesButtonFunc() {
		ElementExtensions.ClickOnIt(Create_OrderPageObject.ConfirmationYesButton(SelectBrowser.driver));
	}

	
	
	public static List<WebElement> dropDownvalues() {
		allvalue=SelectBrowser.driver.findElements(By.xpath("//ul[contains(@class,'ui-dropdown-items')]//child::span[not(contains(text(),'Select Country'))]"));
		return allvalue;
	}
	
	public static void LoginPage(String Username, String Password) {
		Assert.assertTrue(SelectBrowser.driver.getTitle().contains("Supply Chain"));
		Synchronization.VisibleElement(SelectBrowser.driver, By.xpath("//input[@id='inputEmail3']"));		
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Application has been Launched Successfully", ExtentColor.GREEN));
		ElementExtensions.EnterText(LoginPageObject.Username(SelectBrowser.driver), Username);
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Username successfully", ExtentColor.GREEN));
		
		ElementExtensions.EnterText(LoginPageObject.Password(SelectBrowser.driver), Password);
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Password successfully", ExtentColor.GREEN));
		Synchronization.ClickableElement(SelectBrowser.driver,By.xpath("//button[@type='submit']"));
		ElementExtensions.ClickOnIt(LoginPageObject.SignIn_Button(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the SignIn button", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.createOrderButton);
		//Assert.assertTrue(SelectBrowser.driver.getCurrentUrl().contains("dashboard"));
		logger.log(Status.PASS, MarkupHelper.createLabel("User has been logged in Successfully", ExtentColor.GREEN));		
	}
	
}

