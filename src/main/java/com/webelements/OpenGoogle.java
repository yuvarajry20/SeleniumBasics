package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--headless");
//		WebDriver driver=new ChromeDriver(option);
//		driver.get("https://www.google.co.in/");
//		WebElement search_box=driver.findElement(By.name("q"));
//	    search_box.sendKeys("standard_user"+Keys.ENTER);
		
	    EdgeOptions op=new EdgeOptions();
	    op.addArguments("--headless");
	    WebDriver dri=new EdgeDriver(op);
		dri.get("https://www.google.co.in/");
//		WebElement search_box1=dri.findElement(By.name("q"));
//	    search_box1.sendKeys("standard_user"+Keys.ENTER);
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com");
//		driver.navigate().to("https://www.saucedemo.com");
//		WebElement gmaiil_link=driver.findElement(By.linkText("Gmail"));
//		gmaiil_link.click();
		dri.manage().window().maximize();
//		driver.get("https://e-commerce-expleo.atlassian.net/jira/software/projects/SCRUM/boards/1/backlog?epics=visible");
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.google.co.in/");
//		WebElement search_box=driver.findElement(By.name("user-name"));
//		search_box.sendKeys("standard_user"+Keys.ENTER);
//		
//		WebElement pass_box=driver.findElement(By.name("password"));
//		pass_box.sendKeys("secret_sauce"+Keys.ENTER);
//		
//		WebElement login=driver.findElement(By.name("login-button"));
//		login.click();
//		Thread.sleep(3000);
//		WebElement addcart=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
//		addcart.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
		String currenturl=dri.getCurrentUrl();
		String title=dri.getTitle();
//		driver.getPageSource();
		System.out.println("Title:"+title);
		System.out.println("current url:"+currenturl);
//		driver.close();
	}
}
