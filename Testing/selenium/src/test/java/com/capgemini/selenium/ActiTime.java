package com.capgemini.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resource/chromedriver.exe");
	}
	
	@Test
	public void testOne() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(5000);
		
		String expected="actiTIME - Enter Time-Track";
		String actual=driver.getTitle();
		
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

}
