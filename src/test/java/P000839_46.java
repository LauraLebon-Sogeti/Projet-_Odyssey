

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

import main.java.GenericPage;
import pages.pageLogin;

public class P000839_46 extends GenericPage {
	
	private String urlSite = "https://test-odyssey.wildcodeschool.com";
	private String userMail = "student-889@odyssey.com";
	private String userPassword = "Wild&Code&School*889";
	
	@Given("^Chrome est ouvert sur le site test-odyssey en francais$")
	public void chromeEstOuvert(){
		ouvrirNavigateur("chrome");
		Boolean siteOuvert = driver.findElement(By.xpath("//a[contains(@href,'login')]")).isDisplayed();
		Assert.assertTrue(siteOuvert);
	}
	
	@And("^Je suis connecte avec les identifiants etudiant-889$")
	public void connecterUtilisateur() {
		boolean connexionReussie;
		
		pageLogin pLogin = new pageLogin();
		connexionReussie = pLogin.seConnecter(driver, userMail, userPassword);
		Assert.assertTrue(connexionReussie);
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
