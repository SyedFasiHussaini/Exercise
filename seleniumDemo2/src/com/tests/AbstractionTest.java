package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractionTest {

	WebDriver driver;
	public static void main(String[] args) 
	{
		AbstractionTest abstractionTest= new AbstractionTest();
		abstractionTest.login();
		abstractionTest.goToAdmin();
		abstractionTest.selectUserRole();
		
		
		//abstractionTest.logout();
		
	}

	public void login() 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shussaini7\\eclipse-webApps-workspace\\seleniumDemo2\\src\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		//driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String s=driver.getTitle();
		//driver.close();
		System.out.println("Title of the website is "+s);
	}
	
	public void logout() {
		//WebDriver driver= new ChromeDriver();
		driver.findElement(By.linkText("Welcome sarfaraz")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public void goToAdmin() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	public void selectUserRole() {
		Select dropdown=new Select(driver.findElement(By.id("searchSystemUser_userType")));
		dropdown.selectByVisibleText("ESS");
	}
	
		
	}

