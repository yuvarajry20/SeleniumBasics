package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement calender=driver.findElement(By.id("datepicker"));
		calender.click();
//		calender.sendKeys("05/05/2025");
		String currentMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(currentMonth);
		String currentYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(currentYear);
		while (!(currentMonth.equals("April") && currentYear.equals("2025"))) {
		    driver.findElement(By.className("ui-datepicker-next")).click();
		    currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		    currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
	}

}
