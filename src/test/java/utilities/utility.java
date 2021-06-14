package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class utility {
	public static WebDriver driver;
	@Before
	public void driverSetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver= new ChromeDriver();
	}
		@After
		public void driverQuit()
		{
			driver.quit();
			
		}
		
		
	

}
