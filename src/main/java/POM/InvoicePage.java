package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
//Declaration
	//address of Invoice WebElement
	@FindBy(xpath="//input[@name='downloadInvoic']")
	private WebElement InvoiceBtn;
	
	//initilzation
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void InvoiceButton() {
		InvoiceBtn.click();
	}
}
