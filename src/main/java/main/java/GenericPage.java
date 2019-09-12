package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericPage {
	
	protected static WebDriver driver;
	protected static String urlSite = "https://test-odyssey.wildcodeschool.com";
	
	public void ouvrirNavigateur(String navigateur)  {
		if (navigateur == "chrome") {
			System.out.println(System.getProperty("user.dir") +"\\chromedriver71.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\chromedriver71.exe");
			driver = new ChromeDriver();		
			
		}
		if (navigateur == "firefox") {
			driver = new FirefoxDriver();
		}
		driver.get(urlSite);
	}
	
}
