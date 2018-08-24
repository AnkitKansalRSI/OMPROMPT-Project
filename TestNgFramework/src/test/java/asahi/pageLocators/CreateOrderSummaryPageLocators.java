package asahi.pageLocators;

import org.openqa.selenium.By;

public class CreateOrderSummaryPageLocators {
	
	
	public static By SoldToText=By.xpath("//label[contains(text(),'Sold To')]//following-sibling::div");
	public static By RequestByText=By.xpath("//label[contains(text(),'Request By')]//following-sibling::div");
	public static By PurchaseOrderText=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[2]/create-order-summary/div/div[1]/div/div[1]/div[3]/div");
	public static By RequestedDeliveryDate=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[2]/create-order-summary/div/div[1]/div/div[1]/div[4]/div");
	public static By TransportTypeText=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[2]/create-order-summary/div/div[1]/div/div[1]/div[5]/div");
	public static By ShipToText=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[2]/create-order-summary/div/div[1]/div/div[1]/div[6]/div");
	public static By DeliveryInstructionsText=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[2]/create-order-summary/div/div[1]/div/div[2]/div/div");
	public static By TotalQuantityText=By.xpath("//label[contains(text(),'Total Quantity')]");
	public static By PlaceOrderButton=By.xpath("//button[@id='confirm']");
	public static By YesButton=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/p-confirmdialog/div/div[3]/button[1]/span[2]");
	public static By OrderSubmissionWindow=By.xpath("//span[contains(text(),'Order Submission')]");

}
