package asahi.pageLocators;

import org.openqa.selenium.By;

public class CreateOrderPageLocators {
	
	
	public static By CreateOrderButton=By.xpath("//span[contains(text(),'Create Order')]");
	public static By PageText=By.xpath("//li[@class='breadcrumb-item active' and text()='Create Order']");
	public static By ShiptoDropDownButton=By.xpath("//p-dropdown[@ng-reflect-name='shipTo']//div//child::div//span");
	public static By ShipToTexttoEnter=By.xpath("/html[1]/body[1]/div[3]/div[1]/input[1]");
	public static By ShipToClick=By.xpath("/html/body/div[3]/div[2]/ul/li/span");
	public static By ShiptoLabel=By.xpath("//label[@for='shipTo']");
	public static By dateClick=By.xpath("//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']");
	public static By calendarWindow=By.xpath("//button[contains(@class,'ui-datepicker-trigger')]//following-sibling::div[contains(@class,'ui-datepicker')]");	
	public static By RightClickButton=By.xpath("//a[@class='ui-datepicker-next ui-corner-all']");
	public static By DeliveryInstructionTextBox = By.xpath("//textarea[@id='deliveryInstruction']");
	public static By ProductCodeDropDown = By.xpath("//p-dropdown[@ng-reflect-name='ProductCode_0']//div//child::span");
	public static By ProductCodeTextBox = By.xpath("/html/body/div[7]/div[1]/input");
	public static By ProductCodeSelect = By.xpath("/html/body/div[7]/div[2]/ul/li");
	public static By UOMDropDown = By.xpath("//p-dropdown[@ng-reflect-name='UOM_0']//div//child::span");
	public static By UOMFilterTextBox = By.xpath("/html/body/div[9]/div[1]/input");
	public static By UOMSelection = By.xpath("/html/body/div[9]/div[2]/ul/li");
	public static By SubmitOrderButton=By.xpath("//button[text()='Submit Order']");
	public static By shipTotextLabel=By.xpath("//p-dropdown[@ng-reflect-name='shipTo']/div[1]//child::label");
	public static By productCodetext=By.xpath("//p-dropdown[@ng-reflect-name='ProductCode_0']//div[1]//child::label");
	public static By descriptionText=By.xpath("//p-dropdown[@ng-reflect-name='Desc_0']//div[1]//child::label");
	public static By UOMText=By.xpath("//p-dropdown[@ng-reflect-name='UOM_0']//div[1]//child::label");
	
	////////////////////////////Keg Locators///////////////////////////////////////////////////////////////////////////////
	public static By KegPickUpDropdownButton1=By.xpath("//p-dropdown[@ng-reflect-name='pickupBrand-0']//div//child::span");
	public static By KegPickUpDropdownButton2=By.xpath("//p-dropdown[@ng-reflect-name='pickupBrand-1']//div//child::span");
	public static By KegPickUpDropdownButton3=By.xpath("//p-dropdown[@ng-reflect-name='pickupBrand-2']//div//child::span");
	public static By KegPickUpDropdownButton4=By.xpath("//p-dropdown[@ng-reflect-name='pickupBrand-3']//div//child::span");
		
	
	public static By KegPickupinputBox1=By.xpath("/html/body/div[5]/div[1]/input");
	public static By KegPickupinputBox2=By.xpath("/html/body/div[10]/div[1]/input");
	public static By KegPickupinputBox3=By.xpath("/html/body/div[11]/div[1]/input");
	public static By KegPickupinputBox4=By.xpath("/html/body/div[12]/div[1]/input"); 
	
	
	public static By KegPickupClick1=By.xpath("/html/body/div[5]/div[2]/ul/li");
	public static By KegPickupClick2=By.xpath("/html/body/div[10]/div[2]/ul/li");
	public static By KegPickupClick3=By.xpath("/html/body/div[11]/div[2]/ul/li");
	public static By KegPickupClick4=By.xpath("/html/body/div[12]/div[2]/ul/li");
	
	public static By plusSign1=By.xpath("//p-scrollpanel//div//div[1]/div/div[2]/div[2]//child::i[1]");
	public static By minusSign1=By.xpath("//p-scrollpanel//div//div[1]/div/div[2]/div[2]//child::i[2]");
	public static By plusSign2=By.xpath("//p-scrollpanel//div//div[1]/div/div[4]/div[2]//child::i[1]");
	public static By minusSign2=By.xpath("//p-scrollpanel//div//div[1]/div/div[4]/div[2]//child::i[2]");
	public static By plusSign3=By.xpath("//p-scrollpanel//div//div[1]/div/div[6]/div[2]//child::i[1]");
	public static By minusSign3=By.xpath("//p-scrollpanel//div//div[1]/div/div[6]/div[2]//child::i[2]");
	public static By plusSign4=By.xpath("//p-scrollpanel//div//div[1]/div/div[8]/div[2]//child::i[1]");
	public static By minusSign4=By.xpath("//p-scrollpanel//div//div[1]/div/div[8]/div[2]//child::i[2]");
	
	
	public static By tablePlusSign1=By.xpath("//p-datatable/div/div[2]/table//child::tbody/tr[1]/td[1]/span[2]/button/span[1]");
	public static By tablePlusSign2=By.xpath("//p-datatable/div/div[2]/table//child::tbody/tr[2]/td[1]/span[2]/button/span[1]");
	public static By tablePlusSign3=By.xpath("//p-datatable/div/div[2]/table//child::tbody/tr[3]/td[1]/span[2]/button/span[1]");
	
	
	public static By ProductCodeDropDown1 = By.xpath("//p-dropdown[@ng-reflect-name='ProductCode_1']//div//child::span");
	public static By ProductCodeTextBox1 = By.xpath("/html/body/div[14]/div[1]/input");
	public static By ProductCodeSelect1 = By.xpath("/html/body/div[14]/div[2]/ul/li");
	public static By UOMDropDown1 = By.xpath("//p-dropdown[@ng-reflect-name='UOM_1']//div//child::span");
	public static By UOMFilterTextBox1 = By.xpath("/html/body/div[16]/div[1]/input");
	public static By UOMSelection1 = By.xpath("/html/body/div[16]/div[2]/ul/li");
	
	public static By ProductCodeDropDown2 = By.xpath("//p-dropdown[@ng-reflect-name='ProductCode_2']//div//child::span");
	public static By ProductCodeTextBox2 = By.xpath("/html/body/div[18]/div[1]/input");
	public static By ProductCodeSelect2 = By.xpath("/html/body/div[18]/div[2]/ul/li");
	public static By UOMDropDown2 = By.xpath("//p-dropdown[@ng-reflect-name='UOM_2']//div//child::span");
	public static By UOMFilterTextBox2 = By.xpath("/html/body/div[20]/div[1]/input");
	public static By UOMSelection2 = By.xpath("/html/body/div[20]/div[2]/ul/li");

}
