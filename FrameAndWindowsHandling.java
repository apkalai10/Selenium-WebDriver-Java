package com.utilities;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;


public class FrameAndWindowsHandling {
	
	@Test(enabled = false)
	public void windowhandling()
	{
		
	   ChromeOptions opt = new ChromeOptions();
	   opt.addArguments("--start-maximized");
       WebDriver driver = new ChromeDriver(opt);
       driver.get("https://www.leafground.com/window.xhtml");
        
       String parentwindow = driver.getWindowHandle();
         
       WebElement  close =  driver.findElement(By.xpath("//span[text()='Close Windows']"));
       close.click();
         
       Set<String> windows = driver.getWindowHandles();
       List<String> all = new ArrayList<String>(windows);
     
       driver.switchTo().window(all.get(3));
       System.out.println(driver.getTitle());
       
       driver.switchTo().window(all.get(2));
       driver.close();
       
       driver.switchTo().window(all.get(1));
       driver.close();
       
       driver.switchTo().window(parentwindow); 
		}
	
	@Test
	public void frame()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		WebElement frame0 = driver.findElement(By.xpath("//*[@src='default.xhtml']"));
		driver.switchTo().frame(frame0);
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		click.click();
		System.out.println(driver.findElement(By.xpath("//button[@id='Click']")).getText());
		
	    driver.switchTo().defaultContent();
	    
	    WebElement frame1 = driver.findElement(By.xpath("//*[@src='page.xhtml']"));
	    driver.switchTo().frame(frame1);
	    
	    driver.switchTo().frame("frame2");
	    WebElement click1 = driver.findElement(
			By.xpath("//*[@style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']"));
        click1.click();
        driver.switchTo().defaultContent();
     
	}
        
         
          
          

}

