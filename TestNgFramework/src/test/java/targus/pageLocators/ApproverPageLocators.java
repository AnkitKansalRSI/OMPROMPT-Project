package targus.pageLocators;

import org.openqa.selenium.By;

public class ApproverPageLocators {
	
	public static By ApproveButton=By.xpath("//button[@id='confirm']");
	public static By RejectButton=By.xpath("//button[text()='Reject']");
	public static By OrderApprovalConfirmationYES=By.xpath("/html/body/app/main/pages/div/div/order-entry/order-approval/create-order-summary/div/p-confirmdialog/div/div[3]/button[1]");
	public static By OrderApprovalConfirmationNo=By.xpath("/html/body/app/main/pages/div/div/order-entry/order-approval/create-order-summary/div/p-confirmdialog/div/div[3]/button[2]");
	public static By OrderValueText=By.xpath("//label[contains(text(),'Total Value')]");
	public static By RejectWindow=By.xpath("//span[text()='Reason for rejection?']");
	public static By ReasonforRejectInput=By.xpath("//div[@class='ui-inputgroup']//following-sibling::textarea");
	public static By RejectButtonWindow=By.xpath("//div[@class='ui-dialog-content ui-widget-content']//following-sibling::button[@type='button'][contains(text(),'Reject')]");
	

}
