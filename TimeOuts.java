package pack5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOuts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicitlyWait is applied to all the web elements in the script
		     //a) implicitlyWait()
		     //b) pageLoadTimeout()
		     //c) setScriptTimeout()
		
		
		//--implicitlyWait()
		//set the amount of time the driver should wait when searching for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		
		
		
		//--pageLoadTimeout()
		//Set the amount of time to wait for a page load to complete before throwing an error
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		
		
		//--setScriptTimeout()
		//set the amount of time to wait for an asynchronous script to finish execution before throwing an error
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
		
		
		
		//--getImplicitWaitTimeout()
		//get the amount of time the driver should wait when searching for an element if it is not immediately present.
		Duration gettime = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(gettime);
		
		//--getPageLoadTimeout()
		//get the amount of time to wait for a page load to complete before throwing an error
		Duration pagetime = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(pagetime);
		
		//--getScriptTimeout()
		//get the amount of time to wait for an asynchronous script to finish execution before throwing an error
		Duration asytime = driver.manage().timeouts().getScriptTimeout();
		System.out.println(asytime);
		
		
		driver.close();

	}

}
