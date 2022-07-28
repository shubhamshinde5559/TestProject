package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feed {
    @FindBy (xpath="//a[@title='Subscribe to RSS feed']") private WebElement FD; 


 public feed (WebDriver driver) {
 PageFactory.initElements(driver, this);

}
 public void FD() {
	 FD.click();
 }


}


//a[@title='Subscribe to RSS feed']