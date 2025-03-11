package com.webelements;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Explicit {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5)); 
driver.manage().window().maximize(); 
driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
//WebElement reveal=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='reveal']")));
WebElement reveal=driver.findElement(By.xpath("//input[@id='reveal']"));
reveal.click();
WebElement revealed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='revealed']")));
//WebElement revealed=driver.findElement(By.xpath("//input[@id='revealed']"));
revealed.sendKeys("hi yuvaraj");
String text=revealed.getDomProperty("value");
System.out.println(text);
driver.quit();
}
}
