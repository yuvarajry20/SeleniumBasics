package com.webelements;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentWindow);
		Set<String> allWindowhandles=driver.getWindowHandles();
		System.out.println("count of window: "+allWindowhandles.size());
		driver.findElement(By.id("windowButton")).click();
		Set<String> newAllWindowhandles=driver.getWindowHandles();
		System.out.println("New count of window: "+newAllWindowhandles.size());
		String Parenthandle=driver.getWindowHandle();
		System.out.println("Parent window: "+Parenthandle);
		Iterator<String> iterator=newAllWindowhandles.iterator();
		String mainWindow=iterator.next();
		String childWindow=iterator.next();
		System.out.println("Parent window: "+mainWindow);
		System.out.println("Child window: "+childWindow);
		driver.switchTo().window(childWindow);
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("Child title: "+ text.getText());
		driver.close();
		driver.switchTo().window(Parenthandle);
		System.out.println("Parent title: "+driver.getTitle());
		driver.quit();
	}

}
