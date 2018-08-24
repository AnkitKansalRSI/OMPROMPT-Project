package asahi.pageLocators;

import org.openqa.selenium.By;

public class OrderHistorySummaryPageLocators {
	
	public static By orderSummaryText=By.xpath("//h2[contains(text(),'Order Summary')]");
	public static By soldTotext=By.xpath("//label[contains(text(),'Sold To')]//following-sibling::div");
	public static By requestByText=By.xpath("//label[contains(text(),'Request By')]//following-sibling::div");
	public static By purchaseOrderText=By.xpath("//label[contains(text(),'Purchase Order #')]//following-sibling::div");
	public static By requestedDeliveryDate=By.xpath("//label[contains(text(),'Requested Delivery Date')]//following-sibling::div");
	public static By shipTotext=By.xpath("/html/body/app/main/pages/div/div/order-entry/order-entry-history/create-order-summary/div/div[1]/div/div[1]/div[5]/div");
	public static By transportTypeText=By.xpath("/html/body/app/main/pages/div/div/order-entry/order-entry-history/create-order-summary/div/div[1]/div/div[1]/div[6]/div");
	public static By DeliveryInstruactions=By.xpath("//label[contains(text(),'Delivery Instructions')]//following-sibling::div");
	public static By TotalQuantityText=By.xpath("//label[contains(text(),'Total Quantity')]");
	public static By CloneButton=By.xpath("//button[@id='confirm']");
	

}
