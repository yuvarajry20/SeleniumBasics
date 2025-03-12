package com.webelements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbasics {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/select.xhtml");
		WebElement UIAutomation=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropdown=new Select(UIAutomation);
		List<WebElement> list1=dropdown.getOptions();
		System.out.println("The dropdown options size: "+list1.size());
		for(WebElement is: list1) {
			System.out.println("The drop down options are: "+is.getText());
		}
		List<String> list2=new ArrayList<>();
		for(WebElement options:list1) {
			list2.add(options.getText());
		}
		Collections.sort(list2);
		System.out.println(list2);
		boolean multiple=dropdown.isMultiple();
		System.out.println("The multiple options available: "+multiple);
		dropdown.selectByVisibleText("Puppeteer");
		dropdown.selectByIndex(1);
		driver.close();
	}
}
