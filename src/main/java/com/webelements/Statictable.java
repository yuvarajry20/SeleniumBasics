package com.webelements;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> heads=driver.findElements(By.tagName("thead"));
		for(int i=0;i<heads.size();i++) {
			System.out.println(heads.get(i).getText());
		}
		System.out.println("The size of heads: "+heads.size());
		System.out.println();
		List<WebElement> tbody=driver.findElements(By.tagName("tbody"));
		for(int i=0;i<tbody.size();i++) {
			System.out.println(tbody.get(i).getText());
		}
		System.out.println("The size of table body: "+tbody.size());
		System.out.println();
		List<WebElement> firstrow=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]//td"));
		for(int i=0;i<firstrow.size();i++) {
			System.out.println(firstrow.get(i).getText());
		}
		System.out.println("The size of first row: "+firstrow.size());
		System.out.println();
		List<WebElement> Secondrow=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[2]//td[3]"));
		for(int i=0;i<Secondrow.size();i++) {
			System.out.println(Secondrow.get(i).getText());
		}
		System.out.println();
		List<WebElement> SpecificColoumn=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[1]"));
		for(int i=0;i<SpecificColoumn.size();i++) {
			System.out.println(SpecificColoumn.get(i).getText());
		}
		System.out.println();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int r=rows.size();
		
		List<WebElement> coloumns=driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td"));
		int c=coloumns.size();
		for (int j = 0; j < c; j++) {
            String col = driver.findElement(By.xpath("//table[@id='table1']//tr[1]/th[" + (j + 1) + "]")).getText();
            System.out.print(col + " "); 
        }
        System.out.println();
		for(int i=0;i<r-1;i++) {
			for(int j=0;j<c;j++) {
				 String t = driver.findElement(By.xpath("//table[@id='table1']//tr[" + (i + 1) + "]/td[" + (j + 1) + "]")).getText();
	                System.out.print(t + " ");
			}
			System.out.println();
		}
	}

}
