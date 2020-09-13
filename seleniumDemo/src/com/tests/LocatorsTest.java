package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shussaini7\\eclipse-webApps-workspace\\seleniumDemo\\src\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");	    // Launch browser
		
		// Using ID
		// Syntax By.id("idvalue")
		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");     // Selenium is gonna enter Admin as username & 
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");  // admin123 as a password
//		driver.findElement(By.id("btnLogin")).click();				    // Also gonna hit on the button named login

		
		//Using xpath
	    // Syntax By.xpath("//tagname[@attribute='value']")
		
//		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		// Using cssSelectors
		// Syntax By.cssSelector("input#idvalue") or By.cssSelector("input.ClassName")
		
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		System.out.println("Title is "+driver.getTitle());
		
		// By is the Class name
		// If Selenium is not able to locate the element, we will get NoSuchElementException
		
	}

}
