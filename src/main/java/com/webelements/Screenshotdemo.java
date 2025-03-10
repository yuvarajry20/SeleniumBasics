package com.webelements;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://configureselenium.blogspot.com/");
		drive.manage().window().maximize();
//		TakesScreenshot ts=(TakesScreenshot)drive;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(source, new File("./Screenshots/selenium1"+System.currentTimeMillis()+".png"));
//		FileHandler.copy(source, new File("/Users/sevvelkaranpalanivetrivel/Desktop/EXPLEO"+System.currentTimeMillis()+"png"));
//		System.out.println("The screenshot is taken ");
		try {
			WebElement logo = drive.findElement(By.xpath("//h1"));
			File source = ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\yuvar\\Pictures\\Screenshots"+System.currentTimeMillis()+".png"));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		drive.quit();
	}
	
}
