
	import static org.testng.AssertJUnit.assertNull;
import org.testng.AssertJUnit;
	import static org.testng.AssertJUnit.assertNull;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	import org.junit.*;
	import io.cucumber.java.en.*;
	import io.cucumber.core.api.Scenario;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;



	public class P000839_44a extends GenericPage {
		protected static WebDriver driver2;
	        
	        private String urlSite;
	        private By lienSeConnecter = By.xpath("//a[contains(text(),'Se connecter')]");
	        private By dropDownLangue = By.xpath("//div[@class='ui item dropdown active visible']//i[@class='dropdown icon']");
	        private By itemFrancais = By.xpath("//a[contains(text(),'Français')]");
	        private By titre = By.xpath("//div[@class='ui fluid dropdown selection active visible']//i[@class='dropdown icon']");
	        private By titreMr = By.xpath("//div[@class='item active selected'][contains(text(),'Mr')]");
	        private By titreMme = By.xpath("//div[@class='item active selected'][contains(text(),'Mme')]");
	        private By prenom = By.xpath("//input[@id='user_firstname']");
	        private By nom = By.xpath("//input[@id='user_lastname']");
	        private By indicatif = By.xpath("//div[@class='ui label selection dropdown']//i[@class='dropdown icon']");
	        private By indFrance = By.xpath("//div[contains(text(),'FRA')]");
	        private By telephone = By.xpath("//input[@id='user_phone']");
	        private By mail = By.xpath("//input[@id='user_mail']");
	        private By motDePasse = By.xpath("//input[@id='user_password']");
	        private By formation = By.xpath("//div[@id='course-group']//i[@class='dropdown icon']");
	        private By formationDev = By.xpath("//div[contains(text(),'Web et mobile')]");
	        private By campus= By.xpath("//div[@id='campus-field']//i[@class='dropdown icon']");
	        private By campusVille= By.xpath("//div[@class='item active selected'][contains(text(),'Nantes')]");
	        private By session= By.xpath("//div[@id='session-field']//i[@class='dropdown icon']");
	        private By sessionMars2020 = By.xpath("//div[contains(text(),'2020 Mars')]");
	        private By btnReveler = By.xpath("//a[@class='toggle']");
	        private By btnCreationCompte = By.xpath("//input[@name='commit']");
	        private By popUpErreur = By.xpath("/div[@class='ui alert icon message transition visible']");
	        private By erreurPrenom = By.xpath("//li[contains(text(),'Prénom')]");
	        
        
	        public String recupererUrl(){
	            urlSite = "https://test-odyssey.wildcodeschool.com";
	            AssertJUnit.assertTrue(urlSite == "https://test-odyssey.wildcodeschool.com");
	            return urlSite;
	        }
	        
	        @When("^le navigateur chrome est ouvert$")
	        public void ouvrirChrome() {
	            System.out.println(System.getProperty("user.dir") +"\\chromedriver71.exe");
	            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
	            //System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\chromedriver71.exe");
	            
	            driver2 = new ChromeDriver();
	            WebDriverWait wait = new WebDriverWait(driver2, 10);
	        }
	        
	        @When("^le navigateur firefox est ouvert$")
	        public void ouvrirFirefox() {
	        	driver2 = new FirefoxDriver();
	            verifierNavigateur();
	        }
	        
	        public void verifierNavigateur() {
	            AssertJUnit.assertTrue(driver2 != null);
	        }
	        
	        @When("^je tape URL du site$")
	        public void lancerSite() {
	        	driver2.get(urlSite);
	        }
	        
	        @Then("^la page accueil de Odyssey est affichee$")
	        public void verifierAffichagePage() {
	            String titrePage = driver2.getTitle();
	            AssertJUnit.assertTrue(titrePage.contains("Odyssey"));
	        }
	        
	        @Given("^je suis sur le formulaire d'inscription  sur le navigateur chrome$")
	       public void formulaireInscription() {
	            recupererUrl();
	        	ouvrirFirefox();
	        	lancerSite();
	        	verifierAffichagePage();
	        	driver2.findElement(dropDownLangue).click();
	        	driver2.findElement(itemFrancais).click();
	        	driver2.findElement(lienSeConnecter).click();            
	        }

	        @When ("^je selectionne le titre Mr$")
	        public void selectionTitreMr() {
	        	WebDriverWait wait = new WebDriverWait(driver2, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(titre));
	    		wait.until(ExpectedConditions.elementToBeClickable(titre));
	        	driver2.findElement(titre).click();
	        	
	        	driver2.findElement(titreMr).click();
	        	
	          }
	        
	        @When("^je selectionne le titre Mme$")
	        public void selectionTitreMme() {
	        	WebDriverWait wait = new WebDriverWait(driver2, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(titre));
	    		wait.until(ExpectedConditions.elementToBeClickable(titre));
	        	driver2.findElement(titre).click();
	        	driver2.findElement(titreMme).click();
	          }
	        
	        @And("^je saisis le prenom INVALIDE 123899$")
	        public void saisiePrenomInvalid1() {
	        	WebDriverWait wait = new WebDriverWait(driver2, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(prenom));
	    		wait.until(ExpectedConditions.elementToBeClickable(prenom));
	            saisirChamp(prenom,"123899");
	        }
	        
	        @And("^je saisis le prenom INVALIDE -vide-$")
	        public void saisiePrenomInvalid2() {
	        	WebDriverWait wait = new WebDriverWait(driver2, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(prenom));
	    		wait.until(ExpectedConditions.elementToBeClickable(prenom));
	            saisirChamp(prenom,"");
	        }
	        
	        @And ("^je saisis le nom DUPONT$")
	        public void saisieNom_DUPONT() {
	            saisirChamp(nom,"DUPONT");
	        }
	        
	        @And ("^je choisis l'indicatif du pays FRA$")
	        public void saisieIndicatif() {
	        	driver2.findElement(indicatif).click();
	        	driver2.findElement(indFrance).click();            
	        }
	                
	        @And ("^je saisis le numero de telephone  683090909$")
	        public void saisieTelephone() {
	            saisirChamp(telephone,"683090909");
	        }
	        
	        @And ("^je selectionne la  formation \"Web and mobile dev..$")
	        public void saisieFormation() {
	        	driver2.findElement(formation).click();
	        	driver2.findElement(formationDev).click();      
	        }
	        
	        @And("^je choisis le campus Nantes$")
	        public void saisieCampus() {
	        	driver2.findElement(campus).click();
	        	driver2.findElement(campusVille).click();      
	        }    
	        
	        @And("^je choisis la session mars 2020$")
	        public void saisieSession() {
	            driver2.findElement(session).click();
	            driver2.findElement(sessionMars2020).click();         
	        }
	        
	        @And ("^je saisis l'adresse mail dupontalain@yopmail.com$")
	        public void saisieMail() {
	            saisirChamp(mail,"dupontalain@yopmail.com");
	        }
	                
	        @And ("^je saisis le mot de passe WCSmotdepasse$")
	        public void saisieMotDePasse() {
	            saisirChamp(motDePasse,"WCSmotdepasse");
	        }
	        @And("^je clique sur le bouton JE CREE MON COMPTE")
	        public void creerCompte() {
	        	driver2.findElement(btnCreationCompte).click();
	        }    
	        
	    
	        @Then ("^une popup d'erreur s'affiche avec le type d'erreur$")
	        public void verifierPopUpErreur() {
	        	driver2.findElement(popUpErreur).isDisplayed();
	            String messageErreur = driver2.findElement(erreurPrenom).getText();
	            Assert.assertNull("pas de message d'erreur sur le prénom", messageErreur);
	        }
	        
	    public static void saisirChamp(By champ,String valeur) {
	    	driver2.findElement(champ).clear();
	    	driver2.findElement(champ).sendKeys(valeur);
	    }
	    
	}


