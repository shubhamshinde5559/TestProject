package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {

	@FindBy (xpath="//span[text()='WEP644']") private WebElement ProfileName;
	@FindBy (xpath="(//a[@target='_blank'])[5]") private WebElement Usermanual;
	@FindBy (xpath="//span[text()='Orders']") private WebElement Orders;
	@FindBy (xpath="//span[text()='Holdings']") private WebElement Holdings;
	@FindBy (xpath="//span[text()='Positions']") private WebElement Positions;
	@FindBy (xpath="//span[text()='Funds']") private WebElement Funds;
	@FindBy (xpath="//span[text()='Apps']") private WebElement Apps;
	@FindBy (xpath="//a[@target='_self']") private WebElement Logout;
	@FindBy (xpath="//a[text()='Change user']") private WebElement Changeuser;
	@FindBy (xpath="(//span[@class='last-price up'])[2]") private WebElement Sensexvalue;

	
	public home (WebDriver driver) {   //(//span[@class='last-price up'])[1]
		PageFactory.initElements(driver, this);
	}
	public void PN() {
		ProfileName.click();
	}
	public void UM() {
		Usermanual.click();
	}
	public void OR() {
		Orders.click();
	}
	public void Hold() {
		Holdings.click();
	}
	public void Pos() {
		Positions.click();
	}
	public void Fu() {
		Funds.click();
	}
	public void Ap() {
	      Apps.click();
		}
	public void Log() {
	     Logout.click();
	}
	public void CU() {
     Changeuser.click();
	}
	public void SV() {
	     Sensexvalue.click();
}	}
		
		
		
