import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import cucumber.api.java.en.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class fonctionsCucumber {
	
	public WebDriver driver;
	private String urlSite;
	
	@Before
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^j'ai url du site$")
	public String recupererUrl(){
		urlSite = "https://odyssey.wildcodeschool.com";
		Assert.assertTrue(urlSite == "https://odyssey.wildcodeschool.com");
		return urlSite;
	}

	@When("^le navigateur est ouvert$")
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
