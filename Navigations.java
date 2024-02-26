package pack5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
			URL url = new URL("https://msme.gov.in/"); 
			driver.navigate().to(url);//used to go to the particular website but it maintains the browser history and cookies--parameter as URL
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		
		driver.navigate().to("https://msme.gov.in/"); //it's used to go to the particular website but it maintains the browser history and cookies--parameter as String
		driver.navigate().back(); //moves back a single page in our browser’s history
		driver.navigate().forward(); //moves forward one page in our browser’s history.
		driver.navigate().refresh();  //method refreshes the current page thereby reloading all WebElements
		

	}

}
