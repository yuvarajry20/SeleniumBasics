package com.webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement multi=driver.findElement(By.xpath("//select[@id='multi']"));
		Select select=new Select(multi);
		List<WebElement> list1=select.getOptions();
		System.out.println("The dropdown options size: "+list1.size());
		for(WebElement is: list1) {
			System.out.println("The drop down options are: "+is.getText());
		}
		select.selectByVisibleText("Eggs");
		select.selectByVisibleText("Onion gravy");
		List<WebElement> list2=select.getAllSelectedOptions();
		System.err.println("The dropdown options size: "+list2.size());
		for(WebElement is: list2) {
			System.out.println("The drop down options are: "+is.getText());
		}
		select.deselectByIndex(0);
		select.deselectAll();
		driver.close();
}
}
