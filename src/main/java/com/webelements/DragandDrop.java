package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement box1=driver.findElement(By.id("box1"));
		WebElement box2=driver.findElement(By.id("box101"));
		Actions action=new Actions(driver);
		action.clickAndHold(box1).moveToElement(box2).release().build().perform();
//		action.dragAndDrop(box1, box2);
		String actualcolor=box2.getCssValue("color");
		String expectedcolor="rgba(0, 0, 0, 1)";
		if(actualcolor.equals(expectedcolor)) {
			System.out.println("The color is matched!");
			System.out.println("Actual color: "+actualcolor);
			System.out.println("Expected color: "+expectedcolor);
		}else {
			System.out.println("The color is not matched!");
			System.out.println("Actual color: "+actualcolor);
			System.out.println("Expected color: "+expectedcolor);
		}
		
		
	}

}
