package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shussaini7\\eclipse-webApps-workspace\\seleniumDemo\\src\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); // WebDriver is an interface & ChromeDriver is a class which implements WebDriver
		
		// To launch the Application on the browser
		
		driver.get("https://www.videolan.org/index.html");
		
		// To maximize the browser
		
		driver.manage().window().maximize();
		
		// title
		
		System.out.println("Title of the browser is "+driver.getTitle());
		
		// Close the browser
		
		driver.close();
	}

}
