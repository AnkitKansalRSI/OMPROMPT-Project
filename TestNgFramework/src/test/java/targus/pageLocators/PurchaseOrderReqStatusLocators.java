package targus.pageLocators;

import org.openqa.selenium.By;

public class PurchaseOrderReqStatusLocators {
	
	
	public static By PurchaseReStatusButton=By.xpath("//span[text()='Purchase Order Status']");
	public static By SupplierNameText=By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr[1]//td[3]//span[2]");
	public static By RequestNumberInputBox=By.xpath("//th[@ng-reflect-klass='requestNumber']//following-sibling::input");
	public static By PurchaseOrderReqPageText=By.xpath("//h1[@class='al-title']");
	public static By TotalRecords=By.xpath("//span[text()='Total Records:']//following-sibling::span");
	public static By oneRecord=By.xpath("//div[@class='divTotalRecords']//span[text()='1']");
	public static By TotalValue=By.xpath("//td[@class='totalValueStyle']//span[@class='ui-cell-data']//child::span");
	public static By OrderStatusText=By.xpath("//td[@class='status']//span[@class='ui-cell-data']//child::span");
	public static By RequestNo=By.xpath("//td[@class='requestNumber']//span[@class='ui-cell-data']//child::span");
	
	
	

}
