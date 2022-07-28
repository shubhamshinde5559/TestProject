package facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class first_p {

	@FindBy (xpath="//input[@type='text']") private WebElement Username; 
	@FindBy (xpath="//input[@type='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement Loginbutton;
	
	}
