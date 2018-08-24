package asahi.resuableMethodsForModules;

import asahi.pageObjects.CreateOrderSummaryPageObject;
import asahi.resusableTests.ResuableClass;
import asahi.testCases.AsahiTestCases;
import utility.SelectBrowser;

public class AsahiSamplesmethods extends AsahiTestCases {

	public static void GetMethods() {
		
		soldTo=ResuableClass.GetText(CreateOrderSummaryPageObject.SoldToText(SelectBrowser.driver),SelectBrowser.driver);
		requestBy=ResuableClass.GetText(CreateOrderSummaryPageObject.RequestByText(SelectBrowser.driver),SelectBrowser.driver);
		purchaseOrder=ResuableClass.GetText(CreateOrderSummaryPageObject.PurchaseOrderText(SelectBrowser.driver),SelectBrowser.driver);
		requestedDeliveryDate=ResuableClass.GetText(CreateOrderSummaryPageObject.RequestedDeliveryDate(SelectBrowser.driver),SelectBrowser.driver);
		transportType=ResuableClass.GetText(CreateOrderSummaryPageObject.TransportTypeText(SelectBrowser.driver),SelectBrowser.driver);
		shipTo=ResuableClass.GetText(CreateOrderSummaryPageObject.ShipToText(SelectBrowser.driver),SelectBrowser.driver);
		deliveryInstructions=ResuableClass.GetText(CreateOrderSummaryPageObject.DeliveryInstructionsText(SelectBrowser.driver),SelectBrowser.driver);
		quantity=ResuableClass.GetText(CreateOrderSummaryPageObject.TotalQuantityText(SelectBrowser.driver),SelectBrowser.driver);

	}
}
