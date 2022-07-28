package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Usermanual {

	@FindBy (xpath="//a[@title='Utilities']") private WebElement Utilities;
	
	public Usermanual(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void  UserM() {
		Utilities.click();
	}
	
}
