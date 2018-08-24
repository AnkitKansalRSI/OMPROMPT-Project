package targus.pageLocators;

import org.openqa.selenium.By;

import targus.testCases.TargusTestCases;

public class CreateOrderPageLocators extends TargusTestCases {	
	
	public static By createOrderButton=By.xpath("//span[contains(text(),'Create Order')]");
	public static By dateClickButton=By.xpath("//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']");
	public static By calendarWindow=By.xpath("//button[contains(@class,'ui-datepicker-trigger')]//following-sibling::div[contains(@class,'ui-datepicker')]");
	public static By RightClickButton=By.xpath("//a[@class='ui-datepicker-next ui-corner-all']");
	public static By deliveryAddressTextBox=By.xpath("//input[@id='shipToDeliveryAddress']");
	public static By deliveryCityTextBox=By.xpath("//input[@id='shipToDeliveryCity']");
	public static By deliveryPostCodeTextBox=By.xpath("//input[@id='shipToDeliveryPostCode']");
	public static By CountrydropdownButton=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[1]/div/form/div[1]/div[1]/div[4]/dynamic-elements/div/div/p-dropdown/div/div[3]");
	public static By CountryLabel=By.xpath("//p-dropdown[@ng-reflect-name='shipToCountry']/div[1]//child::label");
	public static By CountrySelectionTextBox=By.xpath("/html/body/div[3]/div[1]/input");
	public static By ClickonCountry=By.xpath("/html/body/div[3]/div[2]/ul/li/span");
	public static By ConsigneeNameTextBox=By.xpath("//input[@id='shipToConsigneeName']");
	public static By BrandDropDownButton=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[1]/div/form/div[1]/div[1]/div[9]/dynamic-elements/div/div/p-dropdown/div/div[3]/span");
	public static By BrandTextBoxSelection=By.xpath("/html/body/div[4]/div[1]/input");
	public static By ClickonBrand=By.xpath("/html/body/div[4]/div[2]/ul/li");
	public static By ApproverDropDown=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[1]/div/form/div[1]/div[1]/div[10]/dynamic-elements/div/div/p-dropdown/div/div[3]/span");
	public static By ApproverTextBoxSelection=By.xpath("/html/body/div[5]/div[1]/input");
	public static By ClickonApprover=By.xpath("/html/body/div[5]/div[2]/ul/li");
	public static By ReasonOnRequestDropdownButton=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/div[1]/div/form/div[1]/div[1]/div[11]/dynamic-elements/div/div/p-dropdown/div/div[3]/span");
	public static By ReasonOnRequestFiltertextBox=By.xpath("/html/body/div[6]/div[1]/input");
	public static By CLickontheReasonRequestSelection=By.xpath("/html/body/div[6]/div[2]/ul/li/span");
	public static By TargusProductCodeDropDown=By.xpath("//*[@id=\"view-table\"]/div[2]/div/p-datatable/div/div[2]/table/tbody/tr/td[3]/span[2]/p-dropdown/div/div[2]");
	public static By TargusProductCodeFilterText=By.xpath("/html/body/div[7]/div[1]/input");
	public static By TargusProductCodeTextBox=By.xpath("/html/body/div[7]/div[1]/input");
	public static By TargusProductCodeSelection=By.xpath("/html/body/div[7]/div[2]/ul/li[1]");
	public static By QuantityTextBox=By.xpath("//input[@step='1']");
    public static By SubMitButton=By.xpath("//button[contains(text(),'Submit Order')]");
    public static By placeOrderButton=By.xpath("//button[@id='confirm']");
    public static By ConfirmationYesButton=By.xpath("/html/body/app/main/pages/div/div/order-entry/create-order/p-confirmdialog/div/div[3]/button[1]/span[2]");
    public static By GetOrderNumber=By.xpath("//label[@class='element-label'][contains(text(),'Purchase Order #')]//following-sibling::div");
    public static By ConsigneePhoneNo=By.xpath("//textarea[@id='deliveryInstruction']");
    public static By CreateOrderText=By.xpath("//h1[contains(text(),'Create Order')]");
    public static By OrderValuetext=By.xpath("//span[@class='spanTotalOrderValue']");
    public static By BrandLabel=By.xpath("//p-dropdown[@ng-reflect-name='brand']/div[1]//child::label");
    public static By ApproverLabel=By.xpath("//p-dropdown[@ng-reflect-name='approver']/div[1]//child::label");
    public static By reasonforRequestLabel=By.xpath("//p-dropdown[@ng-reflect-name='orderReason']/div[1]//child::label");
    public static By TargusProductCodeLabel=By.xpath("//p-dropdown[@ng-reflect-name='ProductCode_0']/div[1]//child::label");
    public static By descriptionLabel=By.xpath("//p-dropdown[@ng-reflect-name='Desc_0']/div[1]//child::label");
    public static By Costtext=By.xpath("//span[text()='Cost']//following-sibling::span[@class='ui-cell-data']");
    public static By LineTotalText=By.xpath("//span[text()='Line Total']//following-sibling::span[@class='ui-cell-data']");
    public static By OrderIDText=By.xpath("//input[@id='orderNumber']");
    
    
    
			
	
	
	
	
	
	
	
	
	
	

}
