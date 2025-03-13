package com.webelements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentWindow);
		driver.findElement(By.id("j_idt88:new")).click();
		Set<String> handlecount=driver.getWindowHandles();
		if(handlecount.size()>1) {
			System.out.println("The new Window Opens");
		}else {
			System.out.println("The new Window is not Opened");
		}
		driver.switchTo().window(parentWindow);
		 WebElement open = driver.findElement(By.xpath("//span[text()='Close Windows']"));
	        open.click();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                
	                driver.close();  
	            }
	        }
	        driver.switchTo().window(parentWindow);
	        WebElement multipletabs=driver.findElement(By.xpath("//span[text()='Open Multiple']"));
	        multipletabs.click();
	        Set<String> multiple=driver.getWindowHandles();
	        System.out.println("Windows Opened: "+multiple.size());
	        for (String window : multiple) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                
	                driver.close();  
	            }
	        }
//	        WebElement delay=Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Open with delay']")));
//	        delay.click();
	        
	}

}
