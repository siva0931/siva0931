package org.sam;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	
	
//	private void condition() {
		
//	for(int i = 100;i>=0;i - 5) {
//		System.out.println(i);

//		}

	
//	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\SampleProject\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.amazon.in/");
		WebElement searchbox = driver2.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone");
		
		
		}

	}
		


	
	
