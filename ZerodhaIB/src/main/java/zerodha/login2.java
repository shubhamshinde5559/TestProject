package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {

	@FindBy (xpath= "//input[@id='pin']") private WebElement PIN;
	
	@FindBy (xpath= "//button[@type='submit']") private WebElement Continue;
	
	public login2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin() {
		PIN.sendKeys("123456");
	}
	public void Continue() {
		Continue.click();
	}
}
