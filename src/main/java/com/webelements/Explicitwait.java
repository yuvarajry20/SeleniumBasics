package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		 ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		driver.get("https://configureselenium.blogspot.com/");
		
		WebElement selenium=driver.findElement(By.xpath("//li[@aria-hidden=\"false\"]//a[@href='https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html'][contains(text(),'SELENIUM')]"));
		//WebElement totalviews=driver.findElement(By.cssSelector("#Stats1_totalCount"));
		//System.out.println(totalviews.getText());
		WebElement totalviews=driver.findElement(By.cssSelector("#Stats1_totalCount"));
		System.out.println(totalviews.getText());
				
		selenium.click();
		
		driver.navigate().refresh();	
		
		//totalviews=driver.findElement(By.cssSelector("#Stats1_totalCount"));
		totalviews=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Stats1_totalCount")));
		System.out.println(totalviews.getText());
		driver.close();
	}
}
