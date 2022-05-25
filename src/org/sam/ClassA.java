package org.sam;

import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClassA  {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\SampleProject\\driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

     driver.get("https://www.google.co.in/");
     
    
}
}
