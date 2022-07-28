package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test 
	public void test() {
		System.out.println("test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	
	
}
