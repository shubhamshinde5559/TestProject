package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bulletin {

	@FindBy  (xpath="//a[@href='https://zerodha.com/marketintel/Bulletin/']") private WebElement Bult;
	


   public bulletin (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void Bultn() {
	Bult.click();
}
  

}