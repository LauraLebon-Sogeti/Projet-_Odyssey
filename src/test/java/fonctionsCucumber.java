import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.*;
import io.cucumber.java.en.*;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class fonctionsCucumber extends GenericPage{
	
	private WebDriver driver;
	
	private String urlSite;

	@Before
	public void cucumberSetup(Scenario scenario) {
		//En cucumber, les before et after sont l� pour pouvoir g�rer les logs, plus que l'ouverture et la fermeture du navigateur
		    System.out.println("------------------------------");
		    System.out.println("Début du test - " + scenario.getName());
		    System.out.println("------------------------------");
	}
	
	@After
	public void teardown(Scenario scenario) {
		if (driver!=null) {
			driver.quit();
		}
	    System.out.println("------------------------------");
	    System.out.println(scenario.getName() + " Statut - " + scenario.getStatus());
	    System.out.println("------------------------------");
	}
	
	@Given("^j'ai url du site$")
	public String recupererUrl(){
		urlSite = "https://odyssey.wildcodeschool.com";
		Assert.assertTrue(urlSite == "https://odyssey.wildcodeschool.com");
		return urlSite;
	}

	@When("^le navigateur chrome est ouvert$")
	public void ouvrirChrome() {
		System.out.println(System.getProperty("user.dir") +"\\chromedriver71.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\chromedriver71.exe");
		
		driver = new ChromeDriver();
	}
	
	@When("^le navigateur firefox est ouvert$")
	public void ouvrirFirefox() {
		driver = new FirefoxDriver();
	}
	
	public void verifierNavigateur() {
		Assert.assertTrue(driver != null);

	}

	@When("^je tape URL du site$")
	public void lancerSite() {
		driver.get(urlSite);
	}
	
	@Then("^la page accueil de Odyssey est affichee$")
	public void verifierAffichagePage() {
		String titrePage = driver.getTitle();
		Assert.assertTrue(titrePage.contains("Odyssey"));
	}
}
