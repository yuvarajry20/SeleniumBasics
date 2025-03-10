package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver drive = new ChromeDriver();
		drive.get("https://demoqa.com/radio-button");
		drive.manage().window().maximize();
		 WebElement yes = drive.findElement(By.cssSelector("label[for='yesRadio']"));
         WebElement impressive = drive.findElement(By.cssSelector("label[for='impressiveRadio']"));
         WebElement no = drive.findElement(By.cssSelector("label[for='noRadio']"));
        
         System.out.println("Radio Button Options:");
         System.out.println(yes.getText());
         System.out.println(impressive.getText());
         System.out.println(no.getText());
       
         WebElement yes1 = drive.findElement(By.id("yesRadio"));
         boolean firstradio = yes1.isSelected();
         Thread.sleep(3000);
         if(firstradio) {
        	 System.out.println("First button is selected!");
         }else {
        	 System.out.println("First button is  not selected");
         }
         Thread.sleep(3000);
         String selected;
         if (firstradio) {
             impressive.click();
             selected = impressive.getText();
         } else {
             yes.click();
             selected = yes.getText();
         }
         System.out.println("Selected Button Value: " + selected);

         drive.quit();
	}

}
