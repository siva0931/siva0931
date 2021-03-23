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
import org.openqa.selenium.interactions.Actions;

public class ClassA  {
public static void main(String[] args) throws InterruptedException, IOException {
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\SampleProject\\driver\\chromedriver.exe");
//     WebDriver driver = new ChromeDriver();
// To take screenshot     
//driver.get("https://www.amazon.in/");
//TakesScreenshot ts = (TakesScreenshot)driver;
//
//File desination = new File("C:\\Users\\Siva\\eclipse-workspace\\SampleProject\\lib\\commons-io-2.4.jar");
//
//File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//
//File tspic = new File("C:\\Users\\Siva\\eclipse-workspace\\SampleProject\\pics.amazonpic.png"); 
//
//FileUtils.copyFile(screenshotAs, tspic);
//



  // Our arr contains 8 elements
     int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
     Arrays.sort(arr);

     System.out.printf("Modified arr[] : %s",
             Arrays.toString(arr));

     
  // storing input in variable 
     int n = 4; 
     
     // create string array called names 
     String names[] 
         = { "Rahul", "Ajay", "Gourav", "Riya" }; 
     String temp; 
     for (int i = 0; i < n; i++) { 
         for (int j = i + 1; j < n; j++) { 
             
             // to compare one string with other strings 
             if (names[i].compareTo(names[j]) > 0) { 
                 // swapping 
                 temp = names[i]; 
                 names[i] = names[j]; 
                 names[j] = temp; 
             } 
         } 
     } 
     
     // print output array 
     System.out.println( 
         "The names in alphabetical order are: "); 
     for (int i = 0; i < n; i++) { 
         System.out.println(names[i]); 
         
         







}
	


}

}
