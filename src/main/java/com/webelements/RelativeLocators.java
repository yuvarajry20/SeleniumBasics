package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drive.manage().window().maximize();
//		WebElement loginbutton=drive.findElement(By.xpath("//button[contains(text(),'Login')]"));
//		String loginbtntxt=loginbutton.getText();
//		System.out.println(loginbtntxt);
//		WebElement submitbutton=drive.findElement(with(By.tagName("button")).toLeftOf(loginbutton));
//		String submittxt=submitbutton.getText();
//		System.out.println(submittxt);
//		WebElement registerbutton=drive.findElement(with(By.tagName("button")).toRightOf(loginbutton));
//		String registertxt=registerbutton.getText();
//		System.out.println(registertxt);
		Thread.sleep(3000);
		WebElement username=drive.findElement(By.xpath("//label[text()='Username']"));
		WebElement usernamebox=drive.findElement(with(By.tagName("input")).below(username));
		usernamebox.sendKeys("Admin");
		WebElement password=drive.findElement(By.xpath("//label[text()='Password']"));
		Thread.sleep(5000);
		WebElement passwordbox=drive.findElement(with(By.tagName("input")).near(password));
		passwordbox.sendKeys("admin123");
		WebElement login=drive.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		WebElement forgot=drive.findElement(with(By.tagName("p")).below(login));
		System.out.println(forgot.getText());
		login.click();
		Thread.sleep(3000);
		WebElement logout=drive.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//i"));
		logout.click();
//		Thread.sleep(3000);
		WebElement logdown=drive.findElement(with(By.xpath("//a[@class='oxd-userdropdown-link'][contains(text(),'Logout')]")).below (logout));
		logdown.click();
//		drive.quit();
	}
}
