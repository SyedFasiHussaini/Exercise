package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shussaini7\\eclipse-webApps-workspace\\seleniumDemo\\src\\driver\\chromedriver.exe");
	
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setHeadless(true);
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://amarok.kde.org/"); // To launch the browser

		driver.manage().window().maximize();
		
		System.out.println(" Title of the browser is "+driver.getTitle());
		
		// Close the browser
		
		driver.close();
	}

}
