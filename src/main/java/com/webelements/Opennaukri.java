package com.webelements;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Opennaukri {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.get("https://www.naukri.com");
		driver.get("https://www.youtube.com/");
		WebElement element=driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']"));
		String text=element.getText();
		System.out.println("Text: "+text);
		String attribute=element.getDomProperty("href");
		System.out.println("href attribute:"+attribute);
		String color=element.getCssValue("color");
		System.out.println("CSS color: "+color);
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		System.out.println("Location: X="+x+", Y="+y);
		int width=element.getSize().getWidth();
		int height=element.getSize().getHeight();
		System.out.println("Size: width="+width+", Height="+height);
		try {
//			WebElement searchbutton=driver.findElement(By.cssSelector("div.yt-spec-touch-feedback-shape__fill"));
			WebElement searchbutton=driver.findElement(By.xpath("//*[@class=\"ytSearchboxComponentSearchButton ytSearchboxComponentSearchButtonDark\"]//span//div"));
			System.out.println("\n[2] search button");
			Thread.sleep(2000);
			System.out.println("Enabled:"+searchbutton.isEnabled());
			System.out.println("displayed:"+searchbutton.isDisplayed());
		}catch(Exception e) {
			System.out.println(e);
		}
//		TakesScreenshot sch;
//		sch= ((TakesScreenshot)driver);
//		File src=sch.getScreenshotAs(OutputType.FILE);
//		File dest=new File("Screenshot.png");
//		FileHandler.copy(src,dest);
		Robot robot=new Robot();
		Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
		Toolkit.getDefaultToolkit().getScreenSize(); 
		Rectangle rect=new Rectangle(scr_size);
		BufferedImage img=robot.createScreenCapture(rect);
		File dest=new File("screenshot1.png");
		ImageIO.write(img, "png", dest);
		driver.quit();
	}

}
