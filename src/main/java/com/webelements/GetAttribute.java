package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement amz=driver.findElement(By.name("field-keywords"));
		System.out.println("name:"+amz.getDomAttribute("name"));
		System.out.println("class:"+amz.getDomAttribute("class"));
		System.out.println("value tb"+amz.getDomAttribute("tabindex"));
		System.out.println("type tb"+amz.getDomAttribute("type"));
		System.out.println("id tb"+amz.getDomAttribute("id"));
	}

}
