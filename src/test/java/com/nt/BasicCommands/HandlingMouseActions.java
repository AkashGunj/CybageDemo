package com.nt.BasicCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(4000);
		
		Actions  act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//img[@alt=\"Make My Trip\"]"))).click().perform();
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
