package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame_Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement iFrameElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrameElement);
		String Frame_1=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by locator:"+Frame_1);
		driver.switchTo().defaultContent();
		String mainPage=driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		System.out.println("Back To Main Page: "+mainPage);
		driver.switchTo().frame(3);
		String frame_2=driver.findElement(By.id("sampleHeading")).getText();
//		String frame_2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sampleHeading"))).getText();
		System.out.println("Switch by Index: "+frame_2);
		driver.quit();
		
	}

}
