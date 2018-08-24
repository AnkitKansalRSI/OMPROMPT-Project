package targus.pageLocators;

import org.openqa.selenium.By;

public class OrderHistoryPageLocators {
	
	public static By orderHistoryButton=By.xpath("//span[contains(text(),'Order History')]");
	public static By orderNumberTextbox=By.xpath("//th[contains(@class,'m-ordernumber-col')]//following-sibling::input[contains(@class,'ui-column-filter ng-untouched')]");
	public static By statusText=By.xpath("//td[@class='m-status-col']//span[@class='ui-cell-data']");
	public static By viewLabel=By.xpath("//th[contains(@class,'m-viewOrderClass ui-state-default')]//following-sibling::span[contains(text(),'View')]");
	public static By orderHistorytext=By.xpath("//h1[contains(text(),'Order History')]");
	public static By viewButton=By.xpath("//span[@class='ui-cell-data']//i");
	public static By RequestByText=By.xpath("//td[@class='m-requestby-col']//child::span[2]");
	
	
	

}
