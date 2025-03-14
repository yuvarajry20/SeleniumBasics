package com.webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement clickmeIframe=driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(clickmeIframe);
		WebElement clickme=driver.findElement(By.id("Click"));
		clickme.click();
		driver.switchTo().defaultContent();
		WebElement nestedClickmeIframe=driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(nestedClickmeIframe);
		WebElement nested1=driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		driver.switchTo().frame(nested1);
		WebElement nestedClickme=driver.findElement(By.id("Click"));
		nestedClickme.click();
		driver.switchTo().defaultContent();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int framecount=frames.size();
		System.out.println("No of frames: "+framecount);
	}

}
