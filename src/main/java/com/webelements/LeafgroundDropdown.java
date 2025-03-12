package com.webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafgroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement UIAutomation=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		List<WebElement> list1=UIAutomation.findElements(By.tagName("option"));
		System.out.println("The dropdown options size: "+list1.size());
		for(int i=0;i<list1.size();i++) {
			System.out.println("The drop down options are: "+list1.get(i).getText());
		}
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).getText().contains("Selenium")) {
				list1.get(i).click();
				System.out.println("Clicked: "+list1.get(i).getText());
				break;
			}
		}
		WebElement countrylabel = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
        countrylabel.click();
        WebElement countryselect = driver.findElement(By.xpath("//ul[@id='j_idt87:country_items']"));
        List<WebElement> options = countryselect.findElements(By.tagName("li"));
		System.out.println("Options size: "+options.size());
		for(int i=0;i<options.size();i++) {
			System.out.println("The drop down options are: "+options.get(i).getText());
		}
		for(int i=0;i<options.size();i++) {
			if(options.get(i).getText().contains("Brazil")) {
				options.get(i).click();
				System.out.println("Clicked: "+options.get(i).getText());
				break;
			}
		}
		WebElement cityLabel=driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]"));
		cityLabel.click();
		 WebElement cities=driver.findElement(By.xpath("//div[@class='card']//div//div//div[@id='j_idt87:city']//label['Salvador']"));
		 cities.click();
		 System.out.println(cities.isSelected());
		 driver.close();
	}

}
