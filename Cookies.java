package pack5;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//A cookie is a small piece of data sent from a website and stored on the user’s computer. 
		//Cookies also recognize users returning to a website and loading the previously stored information. 
		//cookies store the user’s identity and track the user’s journey through the website’s pages.
		
		      driver.get("https://demo.guru99.com/test/cookie/selenium_cookie.php");
		
		
		      System.out.println("--------------------getCookies()--------------------------------");
		      Set<Cookie> cookie = driver.manage().getCookies();
		      for (Cookie cookie2 : cookie) {
			  System.out.println("getCookies: Name "+cookie2.getName()+" Value "+cookie2.getValue()
			  +" Domain "+cookie2.getDomain()+" Path "+cookie2.getPath()
			  +" Expiry "+cookie2.getExpiry()+" Samesite "+cookie2.getSameSite()
					  );
		      }
		
		      System.out.println("--------------------getCookieNamed()--------------------------------");
		      System.out.println("getCookieNamed: "+driver.manage().getCookieNamed("Selenium"));
		
		      System.out.println("--------------------addCookie()--------------------------------");
		      Cookie cook = new Cookie("arvind", "ap123");
		      driver.manage().addCookie(cook);
		      System.out.println("addcookie: "+driver.manage().getCookieNamed("arvind"));
		
		
		
		
		      System.out.println("--------------------deleteCookie()--------------------------------");
		      Cookie cooks = new Cookie("Selenium", "abc123");
	          driver.manage().deleteCookie(cooks);
		      Set<Cookie> cookies = driver.manage().getCookies();
			  for (Cookie cookie3 : cookies) {
			  System.out.println("deleteCookie: "+cookie3.getName());
			  }
		
		
			 System.out.println("--------------------deleteCookieNamed()--------------------------------");
		     driver.manage().deleteCookieNamed("arvind");
		     Set<Cookie> cookiess = driver.manage().getCookies();
		     for (Cookie cookie4 : cookiess) {
			 System.out.println("deleteCookieNamed: "+cookie4.getName());
		     }
		
		   
		     System.out.println("--------------------deleteAllCookies()--------------------------------");
		     driver.manage().deleteAllCookies();
		     Set<Cookie> cookiesss = driver.manage().getCookies();
		     System.out.println("deleteallcookies "+cookiesss.size());
		
		
		
		     driver.close();

	}

}
