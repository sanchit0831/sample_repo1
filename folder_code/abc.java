package com.abc.www;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("https://demowebshop.tricentis.com/");
		
		// By.className , By.id , By.name
		
		// WebElement <-- class that comes with org.openqa.selenium
		WebElement regBtn = d1.findElement(By.className("ico-register"));
		regBtn.click();
		Thread.sleep(1500);
		
		WebElement genderBtn = d1.findElement(By.id("gender-female"));
		genderBtn.click();
		Thread.sleep(1500);
		
		WebElement nameTxt = d1.findElement(By.name("FirstName"));
		nameTxt.sendKeys("Kamla");
		Thread.sleep(1500);
		
		WebElement lastNameTxt = d1.findElement(By.id("LastName"));
		lastNameTxt.sendKeys("Jackson");
		Thread.sleep(1500);
		
		WebElement emailTxt = d1.findElement(By.id("Email"));
		emailTxt.sendKeys("kjackson123@gmail.com");
		Thread.sleep(1500);
		
		WebElement passwordTxt = d1.findElement(By.id("Password"));
		passwordTxt.sendKeys("kjackson123");
		Thread.sleep(1500);
		
		WebElement conpasswordTxt = d1.findElement(By.id("ConfirmPassword"));
		conpasswordTxt.sendKeys("kjackson123");
		Thread.sleep(1500);
		
		WebElement subBtn = d1.findElement(By.id("register-button"));
		subBtn.click();	
	}
}
