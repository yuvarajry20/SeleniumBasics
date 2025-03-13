package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElementActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement bohsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions action=new Actions(driver);
//		action.moveToElement(bohsmenuElement).perform();
//		WebElement option2=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
//		action.moveToElement(option2).click().build().perform();
//		WebElement searchfield=driver.findElement(By.xpath("//input[@name='q']"));
//		action.contextClick(searchfield).perform();
		WebElement jqueryui=driver.findElement(By.linkText("jqueryui"));
		action.keyDown(Keys.CONTROL).moveToElement(jqueryui).click().keyUp(Keys.CONTROL).build().perform();

	}
}
