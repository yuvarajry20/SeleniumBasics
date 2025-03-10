package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		WebElement redcheckbox=driver.findElement(By.xpath("//*[@value='red']"));
		System.out.println(redcheckbox.isEnabled());
		System.out.println(redcheckbox.isSelected());
		WebElement operaradiobutton=driver.findElement(By.xpath("//*[@value='Opera']"));
		System.out.println(operaradiobutton.isSelected());
		driver.quit();
	}

}
