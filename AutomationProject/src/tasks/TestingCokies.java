package tasks;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestingCokies {
	

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		
			//http://psrwin.infogloballink.com/psrtest/psr
	}
	
	@Test
	public void cookies()
	{
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("size of cookies" + cookies.size());
		//driver.quit();
	}
}
