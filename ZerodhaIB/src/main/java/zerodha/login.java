package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
//step 1 for declare variable globally (data members)
	
	@FindBy (xpath="//input[@type='text']") private WebElement Username; 
	@FindBy (xpath="//input[@type='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement Loginbutton;
	
//step 2 for initializtion of global data member
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	//step 3 for method creation
	
	public void enterUN() {
		
		Username.sendKeys("WEP644");
		}
	
public void enterPWD() {
		
		password.sendKeys("XYZ12345");
}
public void Clickbutton() {
	
	Loginbutton.click();
}}