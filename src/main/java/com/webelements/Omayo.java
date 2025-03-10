package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.selenium.dev/selenium/web/dynamic.html");
		drive.manage().window().maximize();
//		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement dropdown=drive.findElement(By.xpath("//button[@class='dropbtn']"));
//		dropdown.click();
//		WebElement click=drive.findElement(By.xpath("//a[text()='Flipkart']"));
//		click.click();
		WebElement clickbtn=drive.findElement(By.xpath("//input[@value='Add a box!']"));
		clickbtn.click();
		WebElement red=drive.findElement(By.xpath("//div[@class='redbox']"));
		System.out.println(red.getDomAttribute("class"));
		drive.quit();
	}
}
