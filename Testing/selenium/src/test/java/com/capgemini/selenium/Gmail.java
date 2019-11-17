package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resource/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the URL
		driver.get("https://www.gmail.com");
		//enter the valid username
		driver.findElement(By.id("identifierId")).sendKeys("mayuri281197@gmail.com");
		//click on next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//enter the valid password
		driver.findElement(By.name("password")).sendKeys("mayu281197");
		//driver.findElement(By.xpath("//span[text()='password']")).sendKeys("mayu281197");
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("mayu281197");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		  //click on login
		  //driver.findElement(By.xpath("//span[text()='Login']")).click();
		 


	}

}
