package targus.pageLocators;

import org.openqa.selenium.By;

public class CreateOrderSummaryPageLocators {
	
	public static By soldToText=By.xpath("//label[@class='element-label'][contains(text(),'Sold To')]//following-sibling::div");
	public static By RequestByText=By.xpath("//label[@class='element-label'][contains(text(),'Request By')]//following-sibling::div");
	public static By purchaseOrderText=By.xpath("//label[@class='element-label'][contains(text(),'Purchase Order #')]//following-sibling::div");
	public static By reasonforRequestText=By.xpath("//label[@class='element-label'][contains(text(),'Reason for Request')]//following-sibling::div");
	public static By RequestDateText=By.xpath("//label[@class='element-label'][contains(text(),'Request Date')]//following-sibling::div");
	public static By requestedDeliveryDate=By.xpath("//label[@class='element-label'][contains(text(),'Requested Delivery Date')]//following-sibling::div");
	public static By consigneeName=By.xpath("//label[@class='element-label'][contains(text(),'Consignee Name')]//following-sibling::div");
	public static By deliverAddressText=By.xpath("//label[@class='element-label'][contains(text(),'Delivery Address')]//following-sibling::div");
	public static By deliverCity=By.xpath("//label[@class='element-label'][contains(text(),'Delivery City')]//following-sibling::div");
	public static By deliveryPostCode=By.xpath("//label[@class='element-label'][contains(text(),'Delivery PostCode')]//following-sibling::div");
	public static By approverText=By.xpath("//label[@class='element-label'][contains(text(),'Approver')]//following-sibling::div");
	public static By BrandText=By.xpath("//label[@class='element-label'][contains(text(),'Brand')]//following-sibling::div");
	public static By consigneePhone=By.xpath("//label[@class='element-label'][contains(text(),'Consignee Phone Number & Special Instructions')]//following-sibling::div");
	public static By targusProductCodeText=By.xpath("//div[@class='summary-line-items']//td[1]//child::span");
	public static By descriptionText=By.xpath("//div[@class='summary-line-items']//td[2]//child::span");
	public static By Quantitytext=By.xpath("//div[@class='summary-line-items']//td[3]//child::span");
	public static By CostText=By.xpath("//div[@class='summary-line-items']//td[4]//child::span");
	public static By LineTotalText=By.xpath("//div[@class='summary-line-items']//td[5]//child::span");
	public static By totalOrderValueText=By.xpath("//label[contains(text(),'Total Order')]");
	public static By totalQuanitytext=By.xpath("//label[contains(text(),'Total Quantity')]");
	public static By placeOrderButton=By.xpath("//button[@id='confirm']");
	public static By CuurencyLabel=By.xpath("//label[text()='Currency: GBP']");
	

}
