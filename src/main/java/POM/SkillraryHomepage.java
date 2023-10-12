package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	//address of skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement searchicon;
	
	//address of cookies cross icon
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//initilization
	public SkillraryHomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void gearsbutton() {
		gearbtn.click();
	}
	public void skillrarydemoapplink() {
		skillrarydemoapp.click();
	}
	public void searchTextfield(String data) {
		searchTf.sendKeys(data);
	}
	public void searchIcon() {
		searchicon.click();
	}
	public void cookiesicon() {
		cookies.click();
	}
}
