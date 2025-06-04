package com.abc.www;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("https://demowebshop.tricentis.com/");
		
		// WebElement <-- class that comes with org.openqa.selenium
		WebElement e1 = d1.findElement(By.className("ico-register"));
		System.out.println("Element Tag is: " + e1.getTagName());
		System.out.println("Element Text is: "+ e1.getText());
		
		// Selenium should click on register button
		Thread.sleep(1500); // code will for 1500 milliseconds
		e1.click();
	}
}
