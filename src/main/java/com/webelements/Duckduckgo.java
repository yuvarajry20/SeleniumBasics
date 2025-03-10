package com.webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Duckduckgo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://duckduckgo.com/");
		drive.manage().window().maximize();
		String expectedTitle = "DuckDuckGo - Protection. Privacy. Peace of mind.";
        String actualTitle = drive.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed.");
        } else {
            System.out.println("Title verification failed.");
        }

		WebElement searchbox=drive.findElement(By.xpath("//*[@class='searchbox_searchbox__bfbmv']"));
		
		if(searchbox.isDisplayed()) {
			System.out.println("Search box is displayed!");
		}else {
			System.out.println("Search box is not displayed!");
		}
		WebElement type=drive.findElement(By.xpath("//*[@id='searchbox_input']"));
		type.sendKeys("java selenium"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement verifytype=drive.findElement(By.xpath("//*[@class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk']"));
		String text=verifytype.getText();
//		System.out.println(text);
		if(text.contains("Selenium")) {
			System.out.println("type in search box is verified!");
		}else {
			System.out.println("type in search box is not verified!");
		}
		drive.quit();
	}
}
