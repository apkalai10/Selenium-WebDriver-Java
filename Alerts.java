package pack5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		
	     WebElement	simplealert = driver.findElement(By.xpath("//input[@id='alertexamples']"));
	     WebElement confirmationalert = driver.findElement(By.xpath("//input[@id='confirmexample']"));
	     WebElement promptalert = driver.findElement(By.xpath("//input[@id='promptexample']"));
	     
	     try {
	     
	     wait.until(ExpectedConditions.visibilityOf(simplealert)).click();
	     wait.until(ExpectedConditions.alertIsPresent());
	     Alert alert = driver.switchTo().alert();
	     alert.accept(); //to click on the ‘OK’ button of the alert.
	     
	     }
	     catch(NoAlertPresentException ae)
	     {
	    	 System.out.println(ae.getMessage());
	     }
	     
	     
	     
	     try {
	     wait.until(ExpectedConditions.visibilityOf(confirmationalert)).click();
	     wait.until(ExpectedConditions.alertIsPresent());
	     Alert alert1 = driver.switchTo().alert();
	     System.out.println(alert1.getText());//To capture the alert message.
	     alert1.dismiss(); //to click on the 'cancel' button of the alert.
	     }
	     catch(NoAlertPresentException ae)
	     {
	    	 System.out.println(ae.getMessage());
	     }
	     
	     try {
	     wait.until(ExpectedConditions.visibilityOf(promptalert)).click();
	     wait.until(ExpectedConditions.alertIsPresent());
	     Alert alert2 = driver.switchTo().alert();
	     alert2.sendKeys("ARAVINTH");//To send some data to alert box.
	     alert2.accept();
	     }
	     catch(NoAlertPresentException ae)
	     {
	    	 System.out.println(ae.getMessage());
	     }

	}

}
