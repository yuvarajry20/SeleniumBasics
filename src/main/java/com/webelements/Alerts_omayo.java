package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_omayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement SimpleAlert=driver.findElement(By.id("alert1"));
		SimpleAlert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement PromptAlert=driver.findElement(By.id("prompt"));
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("Yuvaraj");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement ConfirmationAlert=driver.findElement(By.id("confirm"));
		ConfirmationAlert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
