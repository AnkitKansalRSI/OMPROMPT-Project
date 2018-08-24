package targus.testCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import extensions.ElementExtensions;
import targus.pageLocators.ApproverPageLocators;
import targus.pageLocators.CreateOrderPageLocators;
import targus.pageLocators.CreateOrderSummaryPageLocators;
import targus.pageLocators.OrderHistoryPageLocators;
import targus.pageLocators.OrderHistorySummaryLocators;
import targus.pageLocators.PurchaseOrderReqStatusLocators;
import targus.pageObjects.ApproverPageObject;
import targus.pageObjects.CreateOrderSummaryPageObject;
import targus.pageObjects.Create_OrderPageObject;
import targus.pageObjects.OrderHistorySummaryPageObject;
import targus.pageObjects.OrderHistory_PageObject;
import targus.pageObjects.PurchaseReqOrderStatusPageObjects;
import targus.pageObjects.Purchase_RequisitionpageObject;
import targus.resuableMethodsForModules.TargusSamplesmethods;
import targus.resusableTests.CommonFunctionality;
import targus.resusableTests.ResuableClass;
import targus.testRunner.Runner;
import utility.ConfigFileUtil;
import utility.SelectBrowser;
import utility.Synchronization;

public class TargusTestCases extends Runner {

	protected static String orderID, orderValue, soldTo, requestBy, purchaseOrder, ReasonforRequest, requestDate,
			requestedDeliveryDate, consigneeName, deliveryAddress, deliveryCity, deliveryCode, approver, brand,
			consigneephone, TargusProductCode, description, Quantitytext, Cost, LineTotal, CountryName, cloneOrderID,
			statusForOrder, ApproverOrderValueText, num, POReqOrder, PageTextforPO, TotalOrderValueText,
			TotalValueforStatusScreen = null;

	double orderExactValue = 500.0000;

	protected static String CountrySel, Quantit = null;
	static ArrayList<String> ordersList = new ArrayList<String>();
	static ArrayList<String> OrderStatusList = new ArrayList<String>();
	static ArrayList<String> CloneOrderList = new ArrayList<String>();

	@DataProvider(name = "CountryCodeAuthenticationandQuantity")
	public static Object[][] Country() {

		return new Object[][] { { "Germany", "26" }, { "Azerbaijan Republic", "20" }, { "United Kingdom", "26" } };

	}

	@DataProvider(name = "OrdersDataProvider")
	public static Object[][] ordersData() {
		Object[][] orders = new Object[ordersList.size()][];
		for (int i = 0; i < ordersList.size(); i++) {
			orders[i] = new Object[1];
			orders[i][0] = ordersList.get(i);
		}
		return orders;
	}

	@DataProvider(name = "OrderStatusDataProvider")
	public static Object[][] ordersStatusData() {
		Object[][] ordersStatus = new Object[OrderStatusList.size()][];
		for (int i = 0; i < ordersList.size(); i++) {
			ordersStatus[i] = new Object[1];
			ordersStatus[i][0] = ordersList.get(i);
		}
		return ordersStatus;
	}

	@DataProvider(name = "CloneOrdersDataProvider")
	public static Object[][] CloneordersData() {
		Object[][] cloneorders = new Object[CloneOrderList.size()][];
		for (int i = 0; i < CloneOrderList.size(); i++) {
			cloneorders[i] = new Object[1];
			cloneorders[i][0] = CloneOrderList.get(i);
		}
		return cloneorders;
	}

	@Test(priority = 1, enabled = true)
	public void PurchaseRequisitionPage() throws InterruptedException {
		logger = extent.createTest("Purchase Requisition Creation Test Case ");
		ElementExtensions.ClickOnIt(Purchase_RequisitionpageObject.PurchaseReqButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("User has clicked on the Purchase Requesition Button sucessfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver,
				By.xpath("//textarea[@ng-reflect-name='internalComments']"));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Purchase Requisition Page has been successfully loaded", ExtentColor.GREEN));
		ElementExtensions.EnterText(Purchase_RequisitionpageObject.InternalCommentsTextBox(SelectBrowser.driver),
				"jahfsgfdjsgfjkd");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered internal Comments Successfully", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(Purchase_RequisitionpageObject.SupplierDropDown(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver,
				By.xpath("//input[contains(@class,'ui-dropdown-filter')]"));
		ElementExtensions.EnterText(Purchase_RequisitionpageObject.SupplierText(SelectBrowser.driver),
				"Arval Ltd-200218");

		// Synchronization.VisibleElement(SelectBrowser.driver,By.xpath("//li[contains(@class,
		// 'ui-dropdown-item')]"));
		/*
		 * Synchronization.VisibleElement(SelectBrowser.driver, By.xpath(
		 * "//li[contains(@class,'dropdown-item ui-corner-all')]//following-sibling::span[contains(text(),'OmPrompt')]"
		 * ));
		 */

		Synchronization.VisibleElement(SelectBrowser.driver,
				By.xpath("//li[contains(@class,'dropdown-item ui-corner-all')]//following-sibling::span"));
		// Thread.sleep(20000);

		ElementExtensions.ClickOnIt(Purchase_RequisitionpageObject.Supplier_Click(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Supplier Code has been selected successfully", ExtentColor.GREEN));

		ElementExtensions.EnterText(Purchase_RequisitionpageObject.EmailIDTextBox(SelectBrowser.driver),
				"accounts@omprompt.com");

		Synchronization.VisibleElement(SelectBrowser.driver, By.xpath("//input[@name='supplierreference']"));

		ElementExtensions.EnterText(Purchase_RequisitionpageObject.SupplierRefrenceText(SelectBrowser.driver), "ABCD");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Supplier Reference Text has been entered successfully", ExtentColor.GREEN));
		ElementExtensions.EnterText(Purchase_RequisitionpageObject.SupplierComments(SelectBrowser.driver),
				"sfghdsfjsgfddfj");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Supplier Comments has been entered successfully", ExtentColor.GREEN));
		ElementExtensions.ClickonListElement(Purchase_RequisitionpageObject.GLDropDown(SelectBrowser.driver), 2);
		logger.log(Status.INFO, MarkupHelper.createLabel("GL Drop Down has been clicked", ExtentColor.GREEN));
		ElementExtensions.ClickonListElement(Purchase_RequisitionpageObject.GLTextSelection(SelectBrowser.driver), 3);
		logger.log(Status.INFO, MarkupHelper.createLabel("GL Text has been Selected", ExtentColor.GREEN));
		ElementExtensions.EnterText(Purchase_RequisitionpageObject.LineItems_Description(SelectBrowser.driver),
				"dhfgsdfjksgfdsfgdksjf");
		logger.log(Status.INFO, MarkupHelper.createLabel("Description has been Entered", ExtentColor.GREEN));
		ElementExtensions.EnterText(Purchase_RequisitionpageObject.LineItems_Price(SelectBrowser.driver), "23.9");
		logger.log(Status.INFO, MarkupHelper.createLabel("Price has been entered successfully", ExtentColor.GREEN));
		ElementExtensions.EnterText(Purchase_RequisitionpageObject.LineItems_Quantity(SelectBrowser.driver), "63.220");
		logger.log(Status.INFO, MarkupHelper.createLabel("Quantity has been entered successfully", ExtentColor.GREEN));

		TotalOrderValueText = ResuableClass
				.GetText(Purchase_RequisitionpageObject.TotalOrderValue(SelectBrowser.driver), SelectBrowser.driver);
		ElementExtensions.ClickOnIt(Purchase_RequisitionpageObject.SubmitRequestButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on Submit Request", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(Purchase_RequisitionpageObject.ConfirmationWindowYes(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);
		// String number=ResuableClass.GetPORequestNumber(SelectBrowser.driver);
		String GMessage = ResuableClass.GetText(Purchase_RequisitionpageObject.GrowelMessageText(SelectBrowser.driver),
				SelectBrowser.driver);

		POReqOrder = GMessage.substring(49);
		System.out.println("Growel Message==>" + GMessage + "Lenghth" + GMessage.substring(49));
		System.out.println(TotalOrderValueText);
		ResuableClass.MessageValidation(SelectBrowser.driver, POReqOrder);
		logger.log(Status.PASS, MarkupHelper.createLabel("PO has been submitted successfully", ExtentColor.GREEN));

	}

	@Test(priority = 2, dependsOnMethods = "PurchaseRequisitionPage")
	public void PurchaseRequisitionStatusforApproval() throws InterruptedException {

		logger = extent.createTest("Purchase Requisition Status Test Case ");
		Synchronization.VisibleElement(SelectBrowser.driver, PurchaseOrderReqStatusLocators.PurchaseReStatusButton);
		ElementExtensions.ClickOnIt(PurchaseReqOrderStatusPageObjects.PurchaseReStatusButton(SelectBrowser.driver));
		Thread.sleep(2000);
		System.out.println("Order Status");
		Synchronization.VisibleElement(SelectBrowser.driver, PurchaseOrderReqStatusLocators.SupplierNameText);
		PageTextforPO = "Purchase Order Status";
		Assert.assertTrue(
				PurchaseReqOrderStatusPageObjects.PurchaseOrderReqPageText(SelectBrowser.driver).isDisplayed());
		Assert.assertTrue(PurchaseReqOrderStatusPageObjects.PurchaseOrderReqPageText(SelectBrowser.driver).getText()
				.equalsIgnoreCase(PageTextforPO));
		logger.log(Status.PASS, MarkupHelper.createLabel("Purchase Order Status Label is getting displayed Correctly ",
				ExtentColor.GREEN));
		logger.log(Status.PASS,
				MarkupHelper.createLabel("Purchase Order Status Page has been loaded successfully", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(PurchaseReqOrderStatusPageObjects.RequestNumberInputBox(SelectBrowser.driver));
		Thread.sleep(2000);
		ElementExtensions.EnterText(PurchaseReqOrderStatusPageObjects.RequestNumberInputBox(SelectBrowser.driver),
				POReqOrder);
		Synchronization.VisibleElement(SelectBrowser.driver, PurchaseOrderReqStatusLocators.oneRecord);
		System.out.println(PurchaseReqOrderStatusPageObjects.TotalRecords(SelectBrowser.driver).getText());
		Assert.assertTrue(PurchaseReqOrderStatusPageObjects.TotalRecords(SelectBrowser.driver).getText().equals("1"));
		logger.log(Status.PASS, MarkupHelper.createLabel("One Order has been displaying", ExtentColor.GREEN));
		TotalValueforStatusScreen = ResuableClass
				.GetText(PurchaseReqOrderStatusPageObjects.TotalValue(SelectBrowser.driver), SelectBrowser.driver);
		Assert.assertEquals(ResuableClass.removeComma(TotalOrderValueText),
				ResuableClass.RemoveCurrency(TotalValueforStatusScreen));
		logger.log(Status.PASS, MarkupHelper
				.createLabel("Total Order Value is matching with the order value created under PO", ExtentColor.GREEN));
		Assert.assertTrue(PurchaseReqOrderStatusPageObjects.OrderStatusText(SelectBrowser.driver).getText()
				.equalsIgnoreCase("Pending for approval"));
		logger.log(Status.PASS,
				MarkupHelper.createLabel("Order Status Text is displaying as Pending for Approval", ExtentColor.GREEN));
		Assert.assertEquals(POReqOrder,
				PurchaseReqOrderStatusPageObjects.RequestNo(SelectBrowser.driver).getText().substring(1));
		logger.log(Status.PASS, MarkupHelper.createLabel("Request Number is displaying correctly", ExtentColor.GREEN));
		Assert.assertTrue(PurchaseReqOrderStatusPageObjects.RequestNo(SelectBrowser.driver).isEnabled());
		ElementExtensions.ClickOnIt(PurchaseReqOrderStatusPageObjects.RequestNo(SelectBrowser.driver));
		logger.log(Status.PASS,
				MarkupHelper.createLabel("User has successfully clicked on the Request No.", ExtentColor.GREEN));
		
		System.out.println(SelectBrowser.driver.findElement(By.xpath("//h1[text()='Purchase Request Enquiry']")).getText());
		Synchronization.VisibleElement(SelectBrowser.driver,By.xpath("//h1[text()='Purchase Request Enquiry']"));
		
	}

	@Test(priority = 3, dataProvider = "CountryCodeAuthenticationandQuantity")
	public void TargusSamples(String CountrySelect, String Quantity) throws InterruptedException {
		CountrySel = CountrySelect;
		Quantit = Quantity;
		logger = extent.createTest("Order Creation Test Case for -->" + CountrySelect);
		Thread.sleep(2000);
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.createOrderButton);
		ElementExtensions.ClickOnIt(Create_OrderPageObject.CreateOrderButton(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Create Order Link", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.deliveryAddressTextBox);
		Assert.assertTrue(Create_OrderPageObject.CreateOrderText(SelectBrowser.driver).isDisplayed(),
				"Create Order Page is not displaying as expected");
		ElementExtensions.EnterText(Create_OrderPageObject.DeliveryAddressTextBox(SelectBrowser.driver),
				"OmPrompt Limited, 67 Innovation Drive");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Delivery Address Successfully", ExtentColor.GREEN));
		ElementExtensions.EnterText(Create_OrderPageObject.DeliveryCityTextBox(SelectBrowser.driver), "Abingdon");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Delivery City Successfully", ExtentColor.GREEN));
		ElementExtensions.EnterText(Create_OrderPageObject.DeliveryPostCodeTextBox(SelectBrowser.driver), "OX14 4RQ");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Delivery POSTCODE Successfully", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(Create_OrderPageObject.CountrydropdownButton(SelectBrowser.driver));
		ElementExtensions.EnterText(Create_OrderPageObject.CountrySelectionTextBox(SelectBrowser.driver),
				CountrySelect);
		ElementExtensions.ClickOnIt(Create_OrderPageObject.ClickonCountry(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has selected the Country  Successfully", ExtentColor.GREEN));

		ElementExtensions.EnterText(Create_OrderPageObject.ConsigneeNameTextBox(SelectBrowser.driver),
				"B2B Brands | Mr. Tester Test");
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the ConsigneeName  Successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.dateClickButton);
		ElementExtensions.ClickOnIt(Create_OrderPageObject.DateClick(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Date Picker", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.calendarWindow);

		CommonFunctionality.CalendarFunc();
		logger.log(Status.INFO, MarkupHelper.createLabel("Selected a Date", ExtentColor.GREEN));

		ElementExtensions.ClickOnIt(Create_OrderPageObject.BrandDropDownButton(SelectBrowser.driver));
		ElementExtensions.EnterText(Create_OrderPageObject.BrandTextBoxSelection(SelectBrowser.driver),
				"Targus Branded");
		ElementExtensions.ClickOnIt(Create_OrderPageObject.ClickonBrand(SelectBrowser.driver));

		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has Selected the Brand Successfully", ExtentColor.GREEN));

		ElementExtensions.ClickOnIt(Create_OrderPageObject.ApproverDropDown(SelectBrowser.driver));
		ElementExtensions.EnterText(Create_OrderPageObject.ApproverTextBoxSelection(SelectBrowser.driver),
				"Ankit Kansal");
		ElementExtensions.ClickOnIt(Create_OrderPageObject.ClickonApprover(SelectBrowser.driver));

		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has Selected the Approver Successfully", ExtentColor.GREEN));

		ElementExtensions.ClickOnIt(Create_OrderPageObject.ReasonOnRequestDropdownButton(SelectBrowser.driver));
		ElementExtensions.EnterText(Create_OrderPageObject.ReasonOnRequestFiltertextBox(SelectBrowser.driver),
				"External Event");

		ElementExtensions.ClickOnIt(Create_OrderPageObject.CLickontheReasonRequestSelection(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("User has Selected the reason On Request Value successfully",
				ExtentColor.GREEN));

		ElementExtensions.EnterText(Create_OrderPageObject.ConsigneePhoneNo(SelectBrowser.driver),
				"+44 (0) 1235 436 000. This is a test order | created by OmPrompt Tester.");

		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Consignee Phone No. successfully", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.TargusProductCodeDropDown);
		ElementExtensions.ClickOnIt(Create_OrderPageObject.TargusProductCodeDropDown(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.TargusProductCodeFilterText);

		ElementExtensions.EnterText(Create_OrderPageObject.TargusProductCodeTextBox(SelectBrowser.driver), "CN600");
		ElementExtensions.ClickOnIt(Create_OrderPageObject.TargusProductCodeSelection(SelectBrowser.driver));
		

		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has Selected the Targus Product Code successfully", ExtentColor.GREEN));

		ElementExtensions.EnterText(Create_OrderPageObject.QuantityTextBox(SelectBrowser.driver), Quantity);

		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has entered the Quantity successfully", ExtentColor.GREEN));

		orderValue = ResuableClass.GetText(Create_OrderPageObject.OrderValuetext(SelectBrowser.driver),
				SelectBrowser.driver);

		System.out.println(orderValue);		
		
		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {			
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
			System.out.println("Exception====>"+e);
		}
		
		
		
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.SubMitButton);
		CommonFunctionality.submitButtonFunc();

		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the Submit Button ", ExtentColor.GREEN));

		orderID = ResuableClass.GetText(Create_OrderPageObject.GetOrderNumber(SelectBrowser.driver),
				SelectBrowser.driver);
		ordersList.add(orderID);
		System.out.println(orderID);

		soldTo = ResuableClass.GetText(CreateOrderSummaryPageObject.soldTotext(SelectBrowser.driver),
				SelectBrowser.driver);
		requestBy = ResuableClass.GetText(CreateOrderSummaryPageObject.RequestByText(SelectBrowser.driver),
				SelectBrowser.driver);
		purchaseOrder = ResuableClass.GetText(CreateOrderSummaryPageObject.purchaseOrderText(SelectBrowser.driver),
				SelectBrowser.driver);
		ReasonforRequest = ResuableClass
				.GetText(CreateOrderSummaryPageObject.reasonforRequestText(SelectBrowser.driver), SelectBrowser.driver);
		requestDate = ResuableClass.GetText(CreateOrderSummaryPageObject.RequestDateText(SelectBrowser.driver),
				SelectBrowser.driver);
		requestedDeliveryDate = ResuableClass.GetText(
				CreateOrderSummaryPageObject.requestedDeliveryDate(SelectBrowser.driver), SelectBrowser.driver);
		consigneeName = ResuableClass.GetText(CreateOrderSummaryPageObject.consigneeName(SelectBrowser.driver),
				SelectBrowser.driver);
		deliveryAddress = ResuableClass.GetText(CreateOrderSummaryPageObject.deliverAddressText(SelectBrowser.driver),
				SelectBrowser.driver);
		deliveryCity = ResuableClass.GetText(CreateOrderSummaryPageObject.deliverCity(SelectBrowser.driver),
				SelectBrowser.driver);
		deliveryCode = ResuableClass.GetText(CreateOrderSummaryPageObject.deliveryPostCode(SelectBrowser.driver),
				SelectBrowser.driver);
		approver = ResuableClass.GetText(CreateOrderSummaryPageObject.approverText(SelectBrowser.driver),
				SelectBrowser.driver);
		brand = ResuableClass.GetText(CreateOrderSummaryPageObject.BrandText(SelectBrowser.driver),
				SelectBrowser.driver);
		consigneephone = ResuableClass.GetText(CreateOrderSummaryPageObject.consigneePhone(SelectBrowser.driver),
				SelectBrowser.driver);
		TargusProductCode = ResuableClass.GetText(
				CreateOrderSummaryPageObject.targusProductCodeText(SelectBrowser.driver), SelectBrowser.driver);
		description = ResuableClass.GetText(CreateOrderSummaryPageObject.descriptionText(SelectBrowser.driver),
				SelectBrowser.driver);
		Quantitytext = ResuableClass.GetText(CreateOrderSummaryPageObject.Quantitytext(SelectBrowser.driver),
				SelectBrowser.driver);
		Cost = ResuableClass.GetText(CreateOrderSummaryPageObject.CostText(SelectBrowser.driver), SelectBrowser.driver);
		LineTotal = ResuableClass.GetText(CreateOrderSummaryPageObject.LineTotalText(SelectBrowser.driver),
				SelectBrowser.driver);

		System.out.println("Values are" + soldTo + requestBy + purchaseOrder + ReasonforRequest + requestDate
				+ requestedDeliveryDate + consigneeName + deliveryAddress + deliveryCity + deliveryCode + approver
				+ brand + consigneephone + TargusProductCode + description + Quantitytext + Cost + LineTotal);	
		
		

		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {

			
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
			System.out.println("Exception==>" + e);
		}

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderSummaryPageLocators.placeOrderButton);
		CommonFunctionality.placeOrderButtonFunc();
		logger.log(Status.INFO,
				MarkupHelper.createLabel("User has clicked on the place Order button ", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ConfirmationYesButton);
		CommonFunctionality.yesButtonFunc();

		logger.log(Status.INFO, MarkupHelper.createLabel("User has clicked on the Yes Button ", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);

		ResuableClass.MessageValidation(SelectBrowser.driver, orderID);

		logger.log(Status.INFO, MarkupHelper.createLabel("Order has been Verified", ExtentColor.GREEN));

		logger.log(Status.INFO,
				MarkupHelper.createLabel("Sample Order has been created successfully", ExtentColor.GREEN));

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		logger = extent.createTest("Order history Test Case for " + CountrySelect);
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.orderHistoryButton);
		ElementExtensions.ClickOnIt(OrderHistory_PageObject.orderHistoryButton(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.orderNumberTextbox);
		Assert.assertTrue(OrderHistory_PageObject.orderHistorytext(SelectBrowser.driver).isDisplayed(),
				"Order History Page is not displaying as expected");
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Order History", ExtentColor.GREEN));
		Assert.assertTrue(OrderHistory_PageObject.Viewlabel(SelectBrowser.driver).isDisplayed(),
				"View Label is not displayed");
		logger.log(Status.INFO, MarkupHelper.createLabel("View Label Button is getting displayed", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.gridBody);
		ElementExtensions.ClickOnIt(OrderHistory_PageObject.orderNumberTextbox(SelectBrowser.driver));
		Thread.sleep(5000);
		ElementExtensions.EnterText(OrderHistory_PageObject.orderNumberTextbox(SelectBrowser.driver), orderID);
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.oneRecord);
		Assert.assertTrue(OrderHistory_PageObject.RecordsAvailability(SelectBrowser.driver).getText().equals("1"),
				"Record is not displaying correctly");
		logger.log(Status.INFO, MarkupHelper.createLabel("Only 1 Record has been found", ExtentColor.GREEN));

		System.out.println(orderValue);

		if (Double.valueOf(orderValue) > orderExactValue) {
			Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.statusText);
			Assert.assertTrue(ElementExtensions.IsDisplayed(OrderHistory_PageObject.statusText(SelectBrowser.driver)),
					"Status Text is not Visible");
			System.out.println("Printed1");
			Assert.assertTrue(ResuableClass
					.GetText(OrderHistory_PageObject.statusText(SelectBrowser.driver), SelectBrowser.driver)
					.equals("Request - Pending Approval"), "Status Text is not correct");
			System.out.println("Printed2");
			statusForOrder = ResuableClass.GetText(OrderHistory_PageObject.statusText(SelectBrowser.driver),
					SelectBrowser.driver);
			System.out.println(statusForOrder);
			OrderStatusList.add(statusForOrder);
			logger.log(Status.INFO, MarkupHelper.createLabel("Order has been sent for approval ", ExtentColor.GREEN));

		} else {
			Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.statusText);
			Assert.assertTrue(ElementExtensions.IsDisplayed(OrderHistory_PageObject.statusText(SelectBrowser.driver)),
					"Status Text is not Visible");
			System.out.println("Printed3");
			Assert.assertTrue(ResuableClass
					.GetText(OrderHistory_PageObject.statusText(SelectBrowser.driver), SelectBrowser.driver)
					.equals("Order - Sent to supplier"), "Status Text is not correct");
			System.out.println("Printed4");
			statusForOrder = ResuableClass.GetText(OrderHistory_PageObject.statusText(SelectBrowser.driver),
					SelectBrowser.driver);
			System.out.println(statusForOrder);
			OrderStatusList.add(statusForOrder);
			logger.log(Status.INFO, MarkupHelper.createLabel("Order has been to supplier", ExtentColor.GREEN));

		}

		ElementExtensions.ClickOnIt(OrderHistory_PageObject.viewButton(SelectBrowser.driver));
		System.out.println("Clicked");
		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {

			
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
			System.out.println("Exception==>" + e);
		}
		
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistorySummaryLocators.CloneButton);
		Assert.assertTrue(
				ElementExtensions.IsDisplayed(OrderHistorySummaryPageObject.cloneButton(SelectBrowser.driver)),
				"Clone Button is not displaying correctly");
		logger.log(Status.INFO, MarkupHelper.createLabel("View Button Clicked", ExtentColor.GREEN));
		TargusSamplesmethods.AssertionsforViewOrder();

		logger.log(Status.INFO, MarkupHelper.createLabel(
				"All the values are compared correctly after clicking on the view Button", ExtentColor.GREEN));

		////////////////////////////////////// Clone
		////////////////////////////////////// Functionality//////////////////////////////////////////////////////////////

		logger = extent.createTest("Clone Test Case for " + CountrySelect);
		ElementExtensions.ClickOnIt(OrderHistorySummaryPageObject.cloneButton(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.deliveryAddressTextBox);
		TargusSamplesmethods.AssertionsforClone();
		logger.log(Status.INFO, MarkupHelper.createLabel("Submit Button is not enabled", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(Create_OrderPageObject.DateClick(SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Date Picker", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.calendarWindow);
		CommonFunctionality.CalendarFunc();
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Date", ExtentColor.GREEN));

		Assert.assertTrue(Create_OrderPageObject.SubMitButton(SelectBrowser.driver).isEnabled(),
				"Submit Button is not disabled");
		logger.log(Status.INFO, MarkupHelper.createLabel("Submit Button is enabled now", ExtentColor.GREEN));
		
		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {
			
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
			System.out.println("Exception==>" + e);
		}		

		ElementExtensions.ClickOnIt(Create_OrderPageObject.SubMitButton(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Clicked on the Submit button successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderSummaryPageLocators.purchaseOrderText);
		cloneOrderID = ResuableClass.GetText(CreateOrderSummaryPageObject.purchaseOrderText(SelectBrowser.driver),
				SelectBrowser.driver);
		System.out.println(cloneOrderID);
		CloneOrderList.add(cloneOrderID);
		
		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {

			
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
			System.out.println("Exception==>" + e);
		}		
		
		ElementExtensions.ClickOnIt(Create_OrderPageObject.placeOrderButton(SelectBrowser.driver));
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Clicked on the place Order button successfully", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.ConfirmationYesButton);
		logger.log(Status.INFO, MarkupHelper.createLabel("Clicked on the Yes Button", ExtentColor.GREEN));
		ElementExtensions.ClickOnIt(Create_OrderPageObject.ConfirmationYesButton(SelectBrowser.driver));
		Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);
		ResuableClass.MessageValidation(SelectBrowser.driver, cloneOrderID);
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Cloned Order ID has been created successfully", ExtentColor.GREEN));

		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistoryPageLocators.orderHistoryButton);
		ElementExtensions.ClickOnIt(OrderHistory_PageObject.orderHistoryButton(SelectBrowser.driver));
		System.out.println(ordersList);
		System.out.println(OrderStatusList);
		System.out.println(CloneOrderList);
	}

	@Test(priority = 4, dataProvider = "OrdersDataProvider", dependsOnMethods = "TargusSamples")
	public void testApproval(String orderscreated) throws InterruptedException {

		logger = extent.createTest("Approval Order Test Case " + orderscreated);
		SelectBrowser.BrowserandURL(ConfigFileUtil.ApproverURL() + orderscreated, ConfigFileUtil.Browser());
		CommonFunctionality.LoginPage(ConfigFileUtil.ApproverUSername(), ConfigFileUtil.ApproverPassword());
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Approver has been logged in successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistorySummaryLocators.soldToText);
		System.out.println("Statustext==>" + statusForOrder);
		ApproverOrderValueText = ResuableClass.GetText(ApproverPageObject.OrderValueText(SelectBrowser.driver),
				SelectBrowser.driver);
		System.out.println("Order Value==>" + ApproverOrderValueText.substring(13));
		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {

			System.out.println("Exception==>" + e);
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
		}		
		Assert.assertEquals(orderscreated, ResuableClass
				.GetText(OrderHistorySummaryPageObject.purchaseOrderText(SelectBrowser.driver), SelectBrowser.driver));
		
		if (Double.valueOf(ApproverOrderValueText.substring(13)) > orderExactValue) {
			System.out.println("Entry");
			Assert.assertTrue(ApproverPageObject.ApproveButton(SelectBrowser.driver).isEnabled(),
					"Approve Button is not enabled");
			logger.log(Status.INFO, MarkupHelper.createLabel("Approve Button is enabled", ExtentColor.GREEN));
			Assert.assertTrue(ApproverPageObject.RejectButton(SelectBrowser.driver).isEnabled(),
					"Reject Button is not enabled");
			logger.log(Status.INFO, MarkupHelper.createLabel("Reject Button is enabled", ExtentColor.GREEN));
			System.out.println("Entry2");
			Synchronization.ClickableElement(SelectBrowser.driver, ApproverPageLocators.ApproveButton);
			ElementExtensions.ClickOnIt(ApproverPageObject.ApproveButton(SelectBrowser.driver));
			Synchronization.VisibleElement(SelectBrowser.driver, ApproverPageLocators.OrderApprovalConfirmationYES);
			ElementExtensions.ClickOnIt(ApproverPageObject.YesButton(SelectBrowser.driver));
			Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);
			ResuableClass.MessageValidation(SelectBrowser.driver, orderscreated);
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Order has been Approved Successfully", ExtentColor.GREEN));

		} else {
			System.out.println("Entry 3");
			Assert.assertFalse(ApproverPageObject.ApproveButton(SelectBrowser.driver).isEnabled(),
					"Approve Button is enabled");
			logger.log(Status.INFO, MarkupHelper.createLabel("Approve Button is not enabled", ExtentColor.GREEN));
			Assert.assertFalse(ApproverPageObject.RejectButton(SelectBrowser.driver).isEnabled(),
					"Approve Button is enabled");

			logger.log(Status.INFO, MarkupHelper.createLabel("Reject Button is not enabled", ExtentColor.GREEN));
			logger.log(Status.INFO, MarkupHelper.createLabel("Order Cannot be approved", ExtentColor.GREEN));

		}
		SelectBrowser.driver.close();
	}

	@Test(priority = 5, dataProvider = "CloneOrdersDataProvider", dependsOnMethods = "TargusSamples", enabled = true)
	public void testRejectforOrders(String CloneOrderID) {
		logger = extent.createTest("Reject Order Test Case " + CloneOrderID);
		SelectBrowser.BrowserandURL(ConfigFileUtil.ApproverURL() + CloneOrderID, ConfigFileUtil.Browser());
		CommonFunctionality.LoginPage(ConfigFileUtil.ApproverUSername(), ConfigFileUtil.ApproverPassword());
		logger.log(Status.INFO,
				MarkupHelper.createLabel("Approver has been logged in successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, OrderHistorySummaryLocators.soldToText);
		ApproverOrderValueText = ResuableClass.GetText(ApproverPageObject.OrderValueText(SelectBrowser.driver),
				SelectBrowser.driver);
		System.out.println("Order Value==>" + ApproverOrderValueText.substring(13));
		try {

			Assert.assertTrue(CreateOrderSummaryPageObject.CurrencyLabel(SelectBrowser.driver).isDisplayed(),
					"Currency Label is not getting displayed");
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is getting displayed ", ExtentColor.GREEN));
		} catch (Exception e) {

			System.out.println("Exception==>" + e);
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Currency Label is not getting displayed ", ExtentColor.GREEN));
		}
		

		Assert.assertEquals(CloneOrderID, ResuableClass
				.GetText(OrderHistorySummaryPageObject.purchaseOrderText(SelectBrowser.driver), SelectBrowser.driver));
		if (Double.valueOf(ApproverOrderValueText.substring(13)) > orderExactValue) {
			System.out.println("Entry");
			Assert.assertTrue(ApproverPageObject.ApproveButton(SelectBrowser.driver).isEnabled(),
					"Approve Button is not enabled");
			logger.log(Status.INFO, MarkupHelper.createLabel("Approve Button is enabled", ExtentColor.GREEN));
			Assert.assertTrue(ApproverPageObject.RejectButton(SelectBrowser.driver).isEnabled(),
					"Reject Button is not enabled");
			logger.log(Status.INFO, MarkupHelper.createLabel("Reject Button is enabled", ExtentColor.GREEN));
			System.out.println("Entry2");
			Synchronization.ClickableElement(SelectBrowser.driver, ApproverPageLocators.RejectButton);
			ElementExtensions.ClickOnIt(ApproverPageObject.RejectButton(SelectBrowser.driver));
			Synchronization.VisibleElement(SelectBrowser.driver, ApproverPageLocators.RejectWindow);
			ElementExtensions.EnterText(ApproverPageObject.ReasonforRejectInput(SelectBrowser.driver),
					"Order Not Created");
			Synchronization.ClickableElement(SelectBrowser.driver, ApproverPageLocators.RejectButtonWindow);
			ElementExtensions.ClickOnIt(ApproverPageObject.RejectButtonWindow(SelectBrowser.driver));
			Synchronization.VisibleElement(SelectBrowser.driver, ResuableClass.GrowelMessage);
			ResuableClass.MessageValidation(SelectBrowser.driver, CloneOrderID);
			logger.log(Status.INFO,
					MarkupHelper.createLabel("Order has been Rejected Successfully", ExtentColor.GREEN));
		}

		else {
			System.out.println("Entry 3");
			Assert.assertFalse(ApproverPageObject.ApproveButton(SelectBrowser.driver).isEnabled(),
					"Approve Button is enabled");
			logger.log(Status.INFO, MarkupHelper.createLabel("Approve Button is not enabled", ExtentColor.GREEN));
			Assert.assertFalse(ApproverPageObject.RejectButton(SelectBrowser.driver).isEnabled(),
					"Approve Button is enabled");

			logger.log(Status.INFO, MarkupHelper.createLabel("Reject Button is not enabled", ExtentColor.GREEN));
			logger.log(Status.INFO, MarkupHelper.createLabel("Order Cannot be approved", ExtentColor.GREEN));
		}

		SelectBrowser.driver.close();

	}

}
