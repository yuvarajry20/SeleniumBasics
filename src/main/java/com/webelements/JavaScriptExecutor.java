package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
		driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("alert('Welcome')"); 
//		js.executeScript("document.getElementById('alert2').click()");
//		WebElement button1=driver.findElement(By.id("alert2"));
//		js.executeScript("arguments[0].click()",button1);
//		js.executeScript("document.getElementsByName('q')[0].value='Selenium'");
//		js.executeScript("document.getElementsByTagName('input')[0].click()");
		System.out.println(js.executeScript("return document.URL"));
//		javaScriptClick(driver, button1);
		WebElement button2=driver.findElement(By.name("q"));
		javaScriptClick(driver, button2);
		
		
	}
	public static void javaScriptClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", element);
		js.executeScript("document.getElementsByName('q')[0].value='Selenium'");
	}

}
