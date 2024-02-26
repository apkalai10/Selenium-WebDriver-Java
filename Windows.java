package pack5;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	


	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().minimize(); //minimize the current window.
		driver.manage().window().maximize(); //maximize the current window.
		driver.manage().window().fullscreen(); //fullscreen the current window.
		
		Dimension size = new Dimension(100, 30);
		driver.manage().window().setSize(size); //Set the size of the current window.
		
		Point position = new Point(100, 30);
		driver.manage().window().setPosition(position); //Set the position of the current window.


		driver.get("https://www.google.com/");
		
		
		Dimension sizes = driver.manage().window().getSize(); //Get the size of the current window.
		int w = sizes.getWidth();
		int h = sizes.getHeight();
		System.out.println(w+ "&" +h);
		
		Point point = driver.manage().window().getPosition(); //Get the position of the current window,relative to the upper left corner of the screen.
		int x = point.getX();
		int y = point.getY();
		System.out.println(x+ "&" +y);
		
		driver.close();

	}

}
