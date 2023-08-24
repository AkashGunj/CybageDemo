package com.nt.BasicCommands;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreeShot {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/#");
		
		TakesScreenshot scrn = (TakesScreenshot)driver;
		File screen1= scrn.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen1,new File(".//Screenshot/First.png"));
		
		driver.quit();
		
	}

}
