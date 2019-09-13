import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import io.cucumber.java.en.*;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import main.java.GenericPage;
import pages.pageAccueil;
import pages.pageLogin;
import pages.pageQuetes;

public class P000839_48c extends GenericPage {
	
    private String userMail = "student-793@odyssey.com";
    private String userPassword = "Wild&Code&School*793";
	private String xpathLogin = "//a[contains(@href,'login')]";
    
    
	@Given("^Le Chrome est ouvert sur le site \"https://test-odyssey.wildcodeschool.com/\"$")
	public void chromeEstOuvert(){
        ouvrirNavigateur("chrome");
        driver.manage().window().maximize(); 
        Boolean siteOuvert = driver.findElement(By.xpath(xpathLogin)).isDisplayed();
        Assert.assertTrue(siteOuvert);
	}
	
	@Given("^Le Firefox est ouvert sur le site \"https://test-odyssey.wildcodeschool.com/\"$")
	public void firefoxEstOuvert(){
        ouvrirNavigateur("firefox");
        driver.manage().window().maximize();
        Boolean siteOuvert = driver.findElement(By.xpath(xpathLogin)).isDisplayed();
        Assert.assertTrue(siteOuvert);
    }

	@And("^je suis connecté avec les identifiants IDStudent et MDPStudent$")
	public void connecterUtilisateur() {
        boolean connexionReussie;
        
        pageLogin pLogin = new pageLogin();
        connexionReussie = pLogin.seConnecter(driver, userMail, userPassword);
        Assert.assertTrue(connexionReussie);
    }

	@When("^je sélectionne l'onglet quête$")
	public void selectionOngletQuete() {
	    pageAccueil pAccueil = new pageAccueil();
	    pAccueil.clickQuete();
	    
	}

	@Then("je peux voir les quêtes")
	public void pageQueteOK() {
		pageQuetes pQuete = new pageQuetes();
	    pQuete.verificationAffichagePageQuete(driver);
	}
	
	@After
	public void close_P00839_48c(Scenario scenario) {
		if (driver!=null) {
			driver.close();
		}
	}
}
