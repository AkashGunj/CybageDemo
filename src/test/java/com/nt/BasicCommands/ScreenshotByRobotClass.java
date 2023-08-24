package com.nt.BasicCommands;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.dom.model.Rect;

public class ScreenshotByRobotClass {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/#");
		
		Robot robot = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage img = robot.createScreenCapture(rect);
		ImageIO.write(img,"png",new File(System.getProperty("user.dir")+"//Screenshot/second.png"));
		
		
		driver.quit();
		
		
	}

}
