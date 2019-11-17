package com.capgemini.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resource/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElement(By.xpath(""));
		driver.switchTo().frame(driver.findElement(By.className("")));
		Actions actions = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath(""));
		WebElement drop = driver.findElement(By.id(""));
		actions.dragAndDrop(drag, drop).perform();
	}

}
