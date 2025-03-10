package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SparIndia {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sparindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement search=driver.findElement(By.xpath("//div[@class='text-[#6E7672] text-[12px] font-[700]'][contains(text(),'Search')]"));
		search.click();
		WebElement currentLocation=driver.findElement(By.xpath("//div[@class='text-brand-dark text-[14px] pl-1 font-semibold']"));
		System.out.println(currentLocation.getText());
		driver.quit();
	}

}
