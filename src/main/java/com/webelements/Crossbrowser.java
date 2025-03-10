package com.webelements;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Crossbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser: ");
		browser=sc.next();
		if(browser.equals("chrome")) {
			WebDriver drive = new ChromeDriver();
			drive.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
			drive.manage().window().maximize();
		}else if(browser.equals("edge")) {
			WebDriver driver = new EdgeDriver();
			driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
			driver.manage().window().maximize();
		}
	}

}
