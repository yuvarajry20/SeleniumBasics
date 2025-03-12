package com.webelements;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//div[contains(@class, 'toplinks')]//a[2]")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(15))
			       .pollingEvery(Duration.ofSeconds(1))
			       .ignoring(NoSuchElementException.class);

			   WebElement BSE_Sensex = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			     WebElement BSE_Bankex = driver.findElement(By.xpath("//*[@id='indmarquee']/div[1]/span[2]"));
			     return BSE_Bankex;
			     }
			   });
			   String Message = BSE_Sensex.getText(); 
			   System.out.println("Value of S&P BSE Bankex :"+Message);

	}
}
