package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAutomate {


	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver=new ChromeDriver();
		
		
		
		
			
	}
	
	@Test
	public void AutomateLogin() throws InterruptedException
	{
		driver.get("http://psrwin.infogloballink.com/psrtest/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("br1user");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Igt@1234");
		
		driver.findElement(By.xpath("//*[@id='login']")).click();
		
		
		
		
	}
}
