package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class OnlineTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\SampleProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String homewindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id=\"home\"]")).click();
		
		Set<String> newwindow = driver.getWindowHandles();
		
		for (String popup : newwindow) {
			driver.switchTo().window(popup);
			
		}
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
	
		driver.close();
		
		driver.switchTo().window(homewindow);
		
		WebElement multiwindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	multiwindow.click();
	
	int size = driver.getWindowHandles().size();
	System.out.println("Number of windows "+size);
	
	WebElement dntclose = driver.findElement(By.xpath("//*[@id=\"color\"]"));
	dntclose.click();
	Set<String> newwindowHandles = driver.getWindowHandles();
	for (String allwindows : newwindowHandles) {
		if (!allwindows.equals(homewindow)) {
			driver.switchTo().window(allwindows);
			driver.close();
			
		} 
	
	}
	
	
	
	
	
	
	
	
	}
}
