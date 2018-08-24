package asahi.pageLocators;

import org.openqa.selenium.By;

public class OrderHistoryPageLocators {

	
	public static By EyeButton=By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr[1]//td[@class='m-viewOrderClass']//child::span[2]");
	public static By OrderNumberTextBox=By.xpath("//th[contains(@class,'m-ordernumber-col')]//child::input[@type='text']");
	public static By OrderHistoryButton=By.xpath("//span[contains(text(),'Order History')]");
	public static By orderStatusText=By.xpath("//td[@class='m-status-col']//following-sibling::span[@class='ui-cell-data']");
	public static By OrderNumber=By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr[1]//td[3]//child::span[2]");
	
}
