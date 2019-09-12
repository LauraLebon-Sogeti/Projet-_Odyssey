package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import cucumber.api.java.en.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import main.resources.GenericPage;

public class P000839_46 extends GenericPage {
	
	
	private String urlSite = "https://test-odyssey.wildcodeschool.com";
	private String userMail = "student-889@odyssey.com";
	private String userPassword = "Wild&Code&School*889";
	
	@Given("^Chrome est ouvert sur le site test-odyssey en francais$")
	public void ouvrirNavigateur(){
		System.out.println(System.getProperty("user.dir") +"\\chromedriver71.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\chromedriver71.exe");
		driver = new ChromeDriver();
		
		driver.get(urlSite); 
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
	}
	
	@And("^Je suis connecte avec les identifiants etudiant-889$")
	public void connecterUtilisateur() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_email")));
		driver.findElement(By.id("user_email")).sendKeys(userMail);
		driver.findElement(By.id("user_password")).sendKeys(userPassword);
		driver.findElement(By.name("commit")).click();
	}
	
	@When("^La page d'accueil est affichee$")
	public void verifierAffichage() {
		
	}
	
	@Then("^Je peux voir mes expeditions$")
	public void verifierExpedition() {
		Boolean expeditionsExist = driver.findElement(By.xpath("//*[contains(@class,'expedition-wrapper')]")).isDisplayed();
		Assert.assertTrue(expeditionsExist);
	}
}
