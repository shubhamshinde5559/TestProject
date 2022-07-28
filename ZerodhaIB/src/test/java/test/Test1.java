package test;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import zerodha.Usermanual;
import zerodha.bulletin;
import zerodha.feed;
import zerodha.home;
import zerodha.login;
import zerodha.login2;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions opt =new ChromeOptions();
        opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		login log = new login(driver);
		
		log.enterUN();
		log.enterPWD();
		log.Clickbutton();
		
		Thread.sleep(3000);
		
		login2 log2 = new login2 (driver);
		log2.enterPin();
		log2.Continue();
		
		Thread.sleep(3000);

		home hom = new home(driver);
		hom.PN();
		//hom.UN();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		String CWID = al.get(1);          
		driver.switchTo().window(CWID);
		
		Usermanual User = new Usermanual(driver);
		User.UserM();
		
		//Set<String> id = driver.getWindowHandles();
	//	ArrayList<String> al1 = new ArrayList<String>(id);
		//String CWID1 = al.get(2);          
		//driver.switchTo().window(CWID1);
		
		
	    bulletin Bultt = new bulletin(driver);
	    Bultt.Bultn();
	    
	    feed Fd = new feed(driver);
	    Fd.FD();
	    
	    
	    
		//driver.close();
		
		
		
		
		
	}
	
	
	
}
