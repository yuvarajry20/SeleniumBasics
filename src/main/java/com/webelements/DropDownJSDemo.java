package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownJSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement option2=driver.findElement(By.xpath("//select"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='lowestprice'", option2);
//		driver.findElement(By.xpath("//select")).sendKeys("lowestprice");
		WebElement ele=driver.findElement(By.xpath("//select"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		WebElement customOption=driver.findElement(By.xpath("//option[text()='Lowest to highest']"));
		customOption.click();
	}          

}
