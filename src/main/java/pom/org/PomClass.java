package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	
	public static WebDriver driver;

	public WebElement getDelivery_enter() {
		return delivery_enter;
	}

	public void setDelivery_enter(WebElement delivery_enter) {
		this.delivery_enter = delivery_enter;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	@FindBy(xpath = "//input[@placeholder='Enter your delivery address']")
	private WebElement delivery_enter;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement address;
	
	public WebElement getAllow() {
		return Allo;
	}

	public void setAllow(WebElement allow) {
		this.Allo = Allo;
	}

	@FindBy(xpath = "//button[@id='optInText']")
	private WebElement Allo;
	
	@FindBy(xpath = "//button[@data-label='Locate_Me']")
	private WebElement locate;
	
	public WebElement getLocate() {
		return locate;
	}

	public void setLocate(WebElement locate) {
		this.locate = locate;
	}

	public PomClass(WebDriver driver1)
	
	{
		this.driver=driver1;
		 PageFactory.initElements(driver, this);
		
	}	
	
}
