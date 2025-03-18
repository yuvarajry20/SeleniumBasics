package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinjaJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement searchText=driver.findElement(By.xpath("//input[@name='search']"));
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		javaScriptSend(driver, searchText,"HP");
		javaScriptClick(driver, searchbutton);
		js.executeScript("history.go(0)");
		js.executeScript("window.scrollBy(500,500)");
		System.out.println(js.executeScript("return document.URL"));
		
	}
	public static void javaScriptSend(WebDriver driver,WebElement element,String text) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('search')[0].value='"+text+"'");
	}
	public static void javaScriptClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

}
