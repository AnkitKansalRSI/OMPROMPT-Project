package asahi.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import asahi.pageLocators.CreateOrderPageLocators;
import asahi.pageLocators.CreateOrderSummaryPageLocators;
import asahi.pageLocators.OrderHistoryPageLocators;
import asahi.pageLocators.OrderHistorySummaryPageLocators;
import asahi.pageObjects.CreateOrderPageObject;
import asahi.pageObjects.CreateOrderSummaryPageObject;
import asahi.pageObjects.OrderHistoryPageObjects;
import asahi.pageObjects.OrderHistorySummaryPageObjects;
import asahi.resuableMethodsForModules.AsahiSamplesmethods;
import asahi.resusableTests.CommonFunctionality;
import asahi.resusableTests.ResuableClass;
import asahi.testRunner.Runner;
import extensions.ElementExtensions;
import utility.ConfigFileUtil;
import utility.SelectBrowser;
import utility.Synchronization;

public class AsahiTestCases extends Runner {

	protected static String soldTo, requestBy, purchaseOrder, requestedDeliveryDate, transportType, shipTo,
			deliveryInstructions, quantity = null;

	@BeforeTest
	public void LoginFunc() {
		logger = extent.createTest("Login Test Case ");
		CommonFunctionality.LoginPage(ConfigFileUtil.AsahiNormalUserName(), ConfigFileUtil.AsahiNormalPassword());

	}

	@Test(priority = 1)
	public void CreateOrderFunc() throws InterruptedException {

		logger = extent.createTest("Order Creation Test Case for Asahi");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.CreateOrderButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Create Order Link", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ShiptoLabel);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ShiptoDropDown(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ShipToTexttoEnter);
		ElementExtensions.EnterText(CreateOrderPageObject.ShiptoSelection(SelectBrowser.driver),
				"Reil Dixon Ltd (Altham)-302213");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ShiptoClick(SelectBrowser.driver));
		ElementExtensions.ClickOnIt(CreateOrderPageObject.DateClick(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Date Picker", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.calendarWindow);
		CommonFunctionality.CalendarFunc();
		logger.log(Status.INFO, MarkupHelper.createLabel("Selected a Date", ExtentColor.GREEN));
		ElementExtensions.EnterText(CreateOrderPageObject.DeliveryInstructionTextBox(SelectBrowser.driver),
				"Omprompt Instructions");
		logger.log(Status.INFO, MarkupHelper.createLabel("Delivery Instructions Added", ExtentColor.GREEN));
				
		
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickUpDropdownButton1);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickUpDropdownButton1(SelectBrowser.driver));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickupinputBox1);
		ElementExtensions.EnterText(CreateOrderPageObject.KegPickupinputBox1(SelectBrowser.driver),"Kozel(50L)");		
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickupClick1(SelectBrowser.driver));
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has added the 1st Keg Pickup ", ExtentColor.GREEN));
		
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.plusSign1);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.plusSign1(SelectBrowser.driver));
		
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the 1st + sign ", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickUpDropdownButton2);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickUpDropdownButton2(SelectBrowser.driver));		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickupinputBox2);
		ElementExtensions.EnterText(CreateOrderPageObject.KegPickupinputBox2(SelectBrowser.driver),"Peroni(50L)");		
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickupClick2(SelectBrowser.driver));
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has added the 2nd Keg Pickup ", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.plusSign2);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.plusSign2(SelectBrowser.driver));
		
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the 2nd + sign ", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickUpDropdownButton3);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickUpDropdownButton3(SelectBrowser.driver));		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickupinputBox3);
		ElementExtensions.EnterText(CreateOrderPageObject.KegPickupinputBox3(SelectBrowser.driver),"Peroni(30L)");		
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickupClick3(SelectBrowser.driver));
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has added the 3rd Keg Pickup ", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.plusSign3);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.plusSign3(SelectBrowser.driver));
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the 3rd + sign ", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickUpDropdownButton4);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickUpDropdownButton4(SelectBrowser.driver));		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.KegPickupinputBox4);
		ElementExtensions.EnterText(CreateOrderPageObject.KegPickupinputBox4(SelectBrowser.driver),"Pilsner(30L)");		
		ElementExtensions.ClickOnIt(CreateOrderPageObject.KegPickupClick4(SelectBrowser.driver));
		
		
		logger.log(Status.INFO, MarkupHelper.createLabel("User has added the 4th Keg Pickup ", ExtentColor.GREEN));		
		
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ProductCodeDropDown);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ProductCodeDropDown(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ProductCodeTextBox);
		ElementExtensions.EnterText(CreateOrderPageObject.ProductCodeTextBox(SelectBrowser.driver), "LE50B2001");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ProductCodeSelect(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("1st Product Code has been successfully selected by user", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.UOMDropDown);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.UOMDropDown(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.UOMFilterTextBox);
		ElementExtensions.EnterText(CreateOrderPageObject.UOMFilterTextBox(SelectBrowser.driver), "Pallet(55)");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.UOMSelection(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("1st UOM Code has been successfully selected by user", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.tablePlusSign1);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.tablePlusSign1(SelectBrowser.driver));
		
		
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ProductCodeDropDown1);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ProductCodeDropDown1(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ProductCodeTextBox1);
		ElementExtensions.EnterText(CreateOrderPageObject.ProductCodeTextBox1(SelectBrowser.driver), "PN30K01LB");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ProductCodeSelect1(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("2nd Product Code has been successfully selected by user", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.UOMDropDown1);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.UOMDropDown1(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.UOMFilterTextBox1);
		ElementExtensions.EnterText(CreateOrderPageObject.UOMFilterTextBox1(SelectBrowser.driver), "Pallet(24)");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.UOMSelection1(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("2nd UOM Code has been successfully selected by user", ExtentColor.GREEN));
		
		Synchronization.VisibleElement(SelectBrowser.driver,CreateOrderPageLocators.tablePlusSign2);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.tablePlusSign2(SelectBrowser.driver));
		
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ProductCodeDropDown2);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ProductCodeDropDown2(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ProductCodeTextBox2);
		ElementExtensions.EnterText(CreateOrderPageObject.ProductCodeTextBox2(SelectBrowser.driver), "PU30K01");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.ProductCodeSelect2(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("3rd Product Code has been successfully selected by user", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.UOMDropDown2);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.UOMDropDown2(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.UOMFilterTextBox2);
		ElementExtensions.EnterText(CreateOrderPageObject.UOMFilterTextBox2(SelectBrowser.driver), "KEG(1)");
		ElementExtensions.ClickOnIt(CreateOrderPageObject.UOMSelection2(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("3rd UOM Code has been successfully selected by user", ExtentColor.GREEN));		
		
		
		
		Synchronization.ClickableElement(SelectBrowser.driver, CreateOrderPageLocators.SubmitOrderButton);
		ElementExtensions.ClickOnIt(CreateOrderPageObject.SubmitOrderButton(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Submit Button has been Clicked Successfully", ExtentColor.GREEN));

		AsahiSamplesmethods.GetMethods();

		Assert.assertTrue(CreateOrderSummaryPageObject.TotalQuantityText(SelectBrowser.driver).isDisplayed(),
				"Total Quantity is not getting displayed");

		Synchronization.ClickableElement(SelectBrowser.driver, CreateOrderSummaryPageLocators.PlaceOrderButton);
		ElementExtensions.ClickOnIt(CreateOrderSummaryPageObject.PlaceOrderButton(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Place Button has been Clicked Successfully", ExtentColor.GREEN));
		Assert.assertTrue(CreateOrderSummaryPageObject.OrderSubmissionWindow(SelectBrowser.driver).isDisplayed(),
				"Order Submission is not getting displayed");
		ElementExtensions.ClickOnIt(CreateOrderSummaryPageObject.YesButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Yes has been Clicked Successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);
		ResuableClass.MessageValidation(SelectBrowser.driver, purchaseOrder);
		System.out.println(purchaseOrder);
		logger.log(Status.INFO, MarkupHelper.createLabel("Order Has been created successfully", ExtentColor.GREEN));

		//////////////////////////////// Order
		//////////////////////////////// History////////////////////////////////////////////////////////////

		logger = extent.createTest("Order History Test Case for Asahi");
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.OrderHistoryButton);
		ElementExtensions.ClickOnIt(OrderHistoryPageObjects.OrderHistoryButton(SelectBrowser.driver));
		Thread.sleep(2000);
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the Order History Button successfully",
				ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.OrderNumber);		
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Order History Page has been loaded successfully", ExtentColor.GREEN));
		System.out.println("abcd");
		Synchronization.VisibleElement(SelectBrowser.driver,OrderHistoryPageLocators.OrderNumberTextBox);	
		System.out.println("jhfskdf");
		
		ElementExtensions.ClickOnIt(OrderHistoryPageObjects.OrderNumberTextBox(SelectBrowser.driver));
		Thread.sleep(5000);
		ElementExtensions.EnterText(OrderHistoryPageObjects.OrderNumberTextBox(SelectBrowser.driver), purchaseOrder);
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Purchase Order Number Successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.oneRecord);
		Assert.assertTrue(OrderHistoryPageObjects.RecordsAvailability(SelectBrowser.driver).getText().equals("1"),
				"Not Only 1 record is getting displayed");
		logger.log(Status.INFO, MarkupHelper.createLabel("Only 1 record is getting displayed", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver,OrderHistoryPageLocators.orderStatusText);
		Assert.assertTrue(OrderHistoryPageObjects.orderStatusText(SelectBrowser.driver).getText().equals("Order - Sent to supplier"));
		logger.log(Status.INFO, MarkupHelper.createLabel("Order Status is getting displayed", ExtentColor.GREEN));
		
		Assert.assertTrue(OrderHistoryPageObjects.EyeButton(SelectBrowser.driver).isDisplayed(),
				"View Eye is not getting displayed");
		logger.log(Status.INFO, MarkupHelper.createLabel("View Eye button is getting displayed", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(OrderHistoryPageObjects.EyeButton(SelectBrowser.driver));

		////////////////////////////// Clone
		////////////////////////////// Functionality////////////////////////////////////////////////////////

		logger = extent.createTest("Clone Test Case for Asahi");

		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistorySummaryPageLocators.soldTotext);
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the Clone Button", ExtentColor.GREEN));
		Assert.assertEquals(soldTo, ResuableClass
				.GetText(OrderHistorySummaryPageObjects.soldTotext(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(requestBy, ResuableClass
				.GetText(OrderHistorySummaryPageObjects.requestByText(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(purchaseOrder, ResuableClass
				.GetText(OrderHistorySummaryPageObjects.purchaseOrderText(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(requestedDeliveryDate, ResuableClass.GetText(
				OrderHistorySummaryPageObjects.requestedDeliveryDate(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(shipTo, ResuableClass
				.GetText(OrderHistorySummaryPageObjects.shipTotext(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(transportType, ResuableClass
				.GetText(OrderHistorySummaryPageObjects.transportTypeText(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(deliveryInstructions, ResuableClass.GetText(
				OrderHistorySummaryPageObjects.DeliveryInstruactions(SelectBrowser.driver), SelectBrowser.driver));
		Assert.assertEquals(quantity, ResuableClass
				.GetText(OrderHistorySummaryPageObjects.TotalQuantityText(SelectBrowser.driver), SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistorySummaryPageLocators.CloneButton);
		ElementExtensions.ClickOnIt(OrderHistorySummaryPageObjects.CloneButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the Clone Button", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ShiptoDropDownButton);

		System.out.println(CreateOrderPageObject.shipTotextLabel(SelectBrowser.driver).getText());

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.shipTotextLabel);
		Assert.assertTrue(CreateOrderPageObject.shipTotextLabel(SelectBrowser.driver).getText()
				.equals("Reil Dixon Ltd (Altham)-302213"));
		logger.log(Status.INFO, MarkupHelper.createLabel("Ship To has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(CreateOrderPageObject.DeliveryInstructionTextBox(SelectBrowser.driver).getAttribute("value")
				.equals("Omprompt Instructions"));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Description Text has been cloned successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.productCodetext);
		Assert.assertTrue(CreateOrderPageObject.productCodetext(SelectBrowser.driver).getText().equals("LE50B2001"));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Product Code Text has been cloned successfully", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(CreateOrderPageObject.DateClick(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Date Picker", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.calendarWindow);
		CommonFunctionality.CalendarFunc();
		Assert.assertTrue(CreateOrderPageObject.SubmitOrderButton(SelectBrowser.driver).isEnabled());
		logger.log(Status.INFO, MarkupHelper.createLabel("Submit Button is enabled button", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(CreateOrderPageObject.SubmitOrderButton(SelectBrowser.driver));
		AsahiSamplesmethods.GetMethods();
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderSummaryPageLocators.PlaceOrderButton);
		ElementExtensions.ClickOnIt(CreateOrderSummaryPageObject.PlaceOrderButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Place Order Button is enabled button", ExtentColor.GREEN));
		Assert.assertTrue(CreateOrderSummaryPageObject.OrderSubmissionWindow(SelectBrowser.driver).isDisplayed());
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Order Submission Window is getting displayed", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(CreateOrderSummaryPageObject.YesButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the Yes Button", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);
		ResuableClass.MessageValidation(SelectBrowser.driver, purchaseOrder);
		logger.log(Status.INFO, MarkupHelper.createLabel("Purchase Order has been created successfully", ExtentColor.GREEN));

	}

}
