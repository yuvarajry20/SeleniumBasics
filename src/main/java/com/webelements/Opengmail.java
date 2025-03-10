package com.webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Opengmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASSHykojDCzTgmpJVOqENlxm3CB49dxWpjwGqHPXf238jGuOPDJZihnbFbyh2m4tcb5mpRTvJtjD&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S555981818%3A1740651148007322&ddm=1");
		driver.manage().window().maximize();
		
		WebElement search_box = driver.findElement(By.name("identifier"));
		search_box.sendKeys("2k21cse187@kiot.ac.in\n"+ ""+Keys.ENTER);
		
		Thread.sleep(5000);
		
		WebElement search_box1 = driver.findElement(By.name("Passwd"));
		search_box1.sendKeys("ry@YUVI20"+Keys.ENTER);
		
//		WebElement Addtocart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
//		//Thread.sleep(3000);
//		Addtocart.click();

	}

}
