package com.webelements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoWindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentWindow);
		driver.findElement(By.id("selenium143")).click();
//		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		System.out.println("Window Handle count: "+allWindowHandles.size());
		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
//                WebElement heading = driver.findElement(By.xpath("//h3"));
//                System.out.println("Pop : " + heading.getText());
			String text=driver.findElement(By.xpath("//a[contains(text(),'What is Selenium?')]")).getText();
			System.out.println(text);
			break;
			}
		}
		driver.switchTo().window(parentWindow);
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Page One')]")).getText();
		System.out.println(text1);
		
	}

}
