package com.webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getlinks {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String plt = driver.findElement(By.partialLinkText("OrangeHRM")).getText();
        System.out.println("Text of the partial link: " + plt);

        
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + linkList.size());
        
        for (WebElement link : linkList) {
        	System.out.println(link.getText() + " -> " + link.getAttribute("href"));
        }
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123"+Keys.ENTER);
            WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
            if (dashboard.isDisplayed()) {
                System.out.println("Login Successful");
            }else {
            	System.out.println("Login failed");
        } 
            List<WebElement> linList = driver.findElements(By.tagName("a"));
            System.out.println("Total Links: " + linList.size());
            
            for (WebElement link : linList) {
            	System.out.println(link.getText() + " -> " + link.getAttribute("href"));
        
	}
            driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).click();  
            driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']//li[4]")).click();
            

}
}
