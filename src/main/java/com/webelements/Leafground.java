package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0bw305ev5bvjj17m0cjssv2jx28843155.node0");
		driver.manage().window().maximize();
		WebElement typename=driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
		typename.sendKeys("Yuvaraj"+Keys.ENTER);
		WebElement country=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
		country.sendKeys(", India"+Keys.ENTER);
		WebElement textboxisdisabled=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']"));
		System.out.println(textboxisdisabled.isEnabled());
		WebElement cleartext=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
		cleartext.clear();
		WebElement retrievetext=driver.findElement(By.xpath("//*[@value='My learning is superb so far.']"));
//		System.out.println(retrievetext.getText());
		retrievetext.clear();
		retrievetext.sendKeys("hi yuvaraj"+Keys.ENTER);
		String text=retrievetext.getAttribute("value");
		System.out.println(text);
		WebElement typeemail=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt99']"));
		typeemail.sendKeys("2k21cse187@kiot.ac.in"+Keys.ENTER);
		typeemail.sendKeys(Keys.TAB+"hi i am yuvaraj. cse department");
		typeemail.sendKeys("hi i am yuvaraj. cse department"+Keys.ENTER);
		WebElement errormsg=driver.findElement(By.xpath("//*[@id='j_idt106:thisform:age']"));
		errormsg.sendKeys(Keys.ENTER);
		WebElement click=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt113']"));
		System.out.println(click.getLocation());
		WebElement cc=driver.findElement(By.xpath("//*[@id='j_idt106:float-input']"));
		cc.click();
		System.out.println(click.getLocation());
//		WebElement name=driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_input']"));
//		name.sendKeys("yuvaraj"+Keys.ENTER);
//		WebElement dropdown=driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_hinput']"));
//		Select ss=new Select(dropdown);
//		ss.selectByIndex(3);
		WebElement dob = driver.findElement(By.name("j_idt106:j_idt116_input"));
		dob.sendKeys("03/07/2003"+Keys.TAB);
		WebElement cs = driver.findElement(By.name("j_idt106:j_idt118_input"));
		cs.sendKeys("1"+Keys.ENTER);
		WebElement cs1 = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[1]"));
		cs1.click();
		WebElement s2 = driver.findElement(By.name("j_idt106:j_idt116_input"));
		s2.sendKeys("1"+Keys.TAB);
		WebElement s3 = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt120\"]/span"));
		for (int i = 1; i <= 15 ; i++) {
            s3.sendKeys(Keys.ARROW_RIGHT);
        }
		WebElement key = driver.findElement(By.name("j_idt106:j_idt122"));
		key.click();
		System.out.println(key.isDisplayed());
		Thread.sleep(3000);
//		driver.quit();
	}

}
