package targus.resuableMethodsForModules;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import targus.pageLocators.CreateOrderPageLocators;
import targus.pageObjects.Create_OrderPageObject;
import targus.pageObjects.OrderHistorySummaryPageObject;
import targus.resusableTests.ResuableClass;
import targus.testCases.TargusTestCases;
import utility.SelectBrowser;
import utility.Synchronization;

public class TargusSamplesmethods extends TargusTestCases {

	public static void AssertionsforClone() {

		Assert.assertTrue(Create_OrderPageObject.DeliveryAddressTextBox(SelectBrowser.driver).getAttribute("value")
				.equals(deliveryAddress), "Delivery Address not Correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Delivery Address has been Cloned Successfully", ExtentColor.GREEN));		
		Assert.assertTrue(Create_OrderPageObject.DeliveryCityTextBox(SelectBrowser.driver).getAttribute("value")
				.equals(deliveryCity), "Delivery City not Correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Delivery City has been Cloned Successfully", ExtentColor.GREEN));	
		Assert.assertTrue(Create_OrderPageObject.DeliveryPostCodeTextBox(SelectBrowser.driver).getAttribute("value")
				.equals(deliveryCode), "Delivery Post Code not Correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Delivery PostCode has been Cloned Successfully", ExtentColor.GREEN));	
		Assert.assertTrue(Create_OrderPageObject.CountryLabel(SelectBrowser.driver).getText().equals(CountrySel),
				"Country is not selected Correctly");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Country has been cloned successfully", ExtentColor.GREEN));	
		Assert.assertTrue(Create_OrderPageObject.ConsigneeNameTextBox(SelectBrowser.driver).getAttribute("value")
				.equals(consigneeName), "Consignee name is not Correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Consignee Name has been cloned successfully", ExtentColor.GREEN));	
		Assert.assertTrue(Create_OrderPageObject.BrandLabel(SelectBrowser.driver).getText().equals(brand),
				"Brand Name is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Brand Label has been cloned successfully", ExtentColor.GREEN));	
		Assert.assertTrue(Create_OrderPageObject.ApproverLabel(SelectBrowser.driver).getText().equals(approver),
				"Approver Name is not Correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Approver has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(
				Create_OrderPageObject.reasonforRequestLabel(SelectBrowser.driver).getText().equals(ReasonforRequest),
				"Reason for Request is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Reason For Request has been Cloned Successfully", ExtentColor.GREEN));
		Assert.assertTrue(Create_OrderPageObject.ConsigneePhoneNo(SelectBrowser.driver).getAttribute("value")
				.equals(consigneephone), "Consignee Phone is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Consignee Phone has been Cloned Successfully", ExtentColor.GREEN));
		Synchronization.VisibleElement(SelectBrowser.driver, CreateOrderPageLocators.TargusProductCodeDropDown);
		Assert.assertTrue(
				Create_OrderPageObject.TargusProductCodeLabel(SelectBrowser.driver).getText().equals(TargusProductCode),
				"Targus Product Code is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Targus Product Code has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(Create_OrderPageObject.DescriptionLabel(SelectBrowser.driver).getText().equals(description),
				"Description Text is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Description has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(
				Create_OrderPageObject.QuantityTextBox(SelectBrowser.driver).getAttribute("value").equals(Quantitytext),
				"Quantity is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Quantity Field has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(Create_OrderPageObject.costText(SelectBrowser.driver).getText().equals(Cost),
				"Cost is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Cost Text has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(Create_OrderPageObject.LineTotalText(SelectBrowser.driver).getText().equals(LineTotal),
				"Line Total Value is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Line Total Field has been cloned successfully", ExtentColor.GREEN));
		Assert.assertTrue(Create_OrderPageObject.OrderValuetext(SelectBrowser.driver).getText().equals(orderValue),
				"Order Value is not correct");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Order Value has been cloned successfully", ExtentColor.GREEN));
		Assert.assertFalse(Create_OrderPageObject.SubMitButton(SelectBrowser.driver).isEnabled(),
				"SubMit Button is enabled ");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Submit Button is disabled", ExtentColor.GREEN));
		Assert.assertFalse(
				Create_OrderPageObject.OrderIDText(SelectBrowser.driver).getAttribute("value").equals(orderID),
				"Order ID are not Equal");
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Order ID is not equal", ExtentColor.GREEN));

	}

	public static void AssertionsforViewOrder() {
		Assert.assertEquals(soldTo, ResuableClass
				.GetText(OrderHistorySummaryPageObject.soldTotext(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Sold To has been verified", ExtentColor.GREEN));
		Assert.assertEquals(requestBy, ResuableClass
				.GetText(OrderHistorySummaryPageObject.RequestByText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Request By Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(orderID, ResuableClass
				.GetText(OrderHistorySummaryPageObject.purchaseOrderText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Purchase Order Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(ReasonforRequest, ResuableClass.GetText(
				OrderHistorySummaryPageObject.reasonforRequestText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Reason For Request Text has been verified", ExtentColor.GREEN));
		//Assert.assertEquals(requestDate, ResuableClass
			//	.GetText(OrderHistorySummaryPageObject.RequestDateText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Request Date Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(requestedDeliveryDate, ResuableClass.GetText(
				OrderHistorySummaryPageObject.requestedDeliveryDate(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Request Delivery Date Text has been verified", ExtentColor.GREEN));		
		Assert.assertEquals(consigneeName, ResuableClass
				.GetText(OrderHistorySummaryPageObject.consigneeName(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Consignee Name Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(deliveryAddress, ResuableClass
				.GetText(OrderHistorySummaryPageObject.deliverAddressText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Delivery Address Text has been verified", ExtentColor.GREEN));		
		Assert.assertEquals(deliveryCity, ResuableClass
				.GetText(OrderHistorySummaryPageObject.deliverCity(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Delievery City Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(deliveryCode, ResuableClass
				.GetText(OrderHistorySummaryPageObject.deliveryPostCode(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Delivery Post Code Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(approver, ResuableClass
				.GetText(OrderHistorySummaryPageObject.approverText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Approver Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(brand, ResuableClass.GetText(OrderHistorySummaryPageObject.BrandText(SelectBrowser.driver),
				SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Brand Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(consigneephone, ResuableClass
				.GetText(OrderHistorySummaryPageObject.consigneePhone(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Consignee Phone Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(TargusProductCode, ResuableClass.GetText(
				OrderHistorySummaryPageObject.targusProductCodeText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Targus Product Code Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(description, ResuableClass
				.GetText(OrderHistorySummaryPageObject.descriptionText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Description Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(Quantitytext, ResuableClass
				.GetText(OrderHistorySummaryPageObject.Quantitytext(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Quanity Text has been verified", ExtentColor.GREEN));
		Assert.assertEquals(Cost, ResuableClass.GetText(OrderHistorySummaryPageObject.CostText(SelectBrowser.driver),
				SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("CostText has been verified", ExtentColor.GREEN));
		Assert.assertEquals(LineTotal, ResuableClass
				.GetText(OrderHistorySummaryPageObject.LineTotalText(SelectBrowser.driver), SelectBrowser.driver));
		logger.log(Status.INFO, MarkupHelper
				.createLabel("Line Total Text has been verified", ExtentColor.GREEN));
	}

}
