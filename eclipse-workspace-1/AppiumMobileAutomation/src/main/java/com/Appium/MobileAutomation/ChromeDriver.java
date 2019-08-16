package com.Appium.MobileAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class ChromeDriver {



	
 	WebDriver driver;
 	
    @BeforeTest
	public void setUP() {
		
    	System.setProperty("webdriver.chrome.driver", "/Users/malaybiswal/Downloads/chromedriver");
    	driver  =  (WebDriver)new ChromeDriver();
    	driver.get("http://www.facebook.com");
	}
    

}
