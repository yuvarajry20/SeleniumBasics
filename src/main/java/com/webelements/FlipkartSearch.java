package com.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FlipkartSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("iPhone");

      
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
         WebElement search = driver.findElement(By.name("q"));
//        Thread.sleep(10000);

        search.clear();
//        searchBox.sendKeys(Keys.CONTROL+"a");
//        searchBox.sendKeys(Keys.BACK_SPACE);
        
        System.out.println("Search box has been cleared.");

    }
}