package com.test.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverLaunch {

	
	@Test
	public static void test001() {
		
		for(int i=0; i<=10; i++) {
			System.out.println("Hellow GIT..." +i);
		}
	}
	
	@Test
	public static void test002() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	

}
