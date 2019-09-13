
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
		private static WebDriver driver;
		
	        private String urlSite;
	        private By dropDownLangue = By.xpath("//*[@id=\"app\"]/div[3]/div/div[1]");
	        private By itemFrancais = By.xpath("//a[contains(text(),'Fr')]");
	        private By titre = By.xpath("//div[contains(@class,'ui fluid dropdown selection')]//i[@class='dropdown icon']");
	        private By titreMr = By.xpath("//div[@class='item active selected'][contains(text(),'Mr')]");
	        private By titreMme = By.xpath("//div[@class='item active selected'][contains(text(),'Mme')]");
	        private By prenom = By.xpath("/html/body/div/div[2]/section[2]/form/div[1]/div[2]/div/input");
	        private By nom = By.xpath("//input[@id='user_lastname']");
	        private By indicatif = By.xpath("//div[@class='ui label selection dropdown']//i[@class='dropdown icon']");
	        private By indFrance = By.xpath("//div[contains(text(),'FRA')]");
	        private By telephone = By.xpath("//input[@id='user_phone']");
	        private By mail = By.id("user_email");
	        private By motDePasse = By.className("password");
	        private By formation = By.xpath("//div[@id='course-group']//i[@class='dropdown icon']");
	        private By formationDev = By.xpath("//div[contains(text(),'Web et mobile')]");
	        private By campus= By.xpath("//div[@id='campus-field']//i[@class='dropdown icon']");
	        private By campusVille= By.xpath("//div[@class='item active selected'][contains(text(),'Nantes')]");
	        private By session= By.xpath("//div[@id='session-field']//i[@class='dropdown icon']");
	        private By sessionMars2020 = By.xpath("//div[contains(text(),'2020 Mars')]");
	        private By btnReveler = By.xpath("//a[@class='toggle']");
	        private By btnCreationCompte = By.xpath("//input[@name='commit']");
	        private By popUpErreur = By.xpath("//div[contains(@class,'ui alert icon')]");
	        private By erreurPrenom = By.xpath("//li[contains(text(),'Firstname')]");
	        
        
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
	            
	            driver = new ChromeDriver();
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	        }
	        
	        @When("^le navigateur firefox est ouvert$")
	        public void ouvrirFirefox() {
	        	driver = new FirefoxDriver();
	            verifierNavigateur();
	        }
	        
	        public void verifierNavigateur() {
	            AssertJUnit.assertTrue(driver != null);
	        }
	        
	        @When("^je tape URL du site$")
	        public void lancerSite() {
	        	driver.get(urlSite);
	        }
	        
	        @Then("^la page accueil de Odyssey est affichee$")
	        public void verifierAffichagePage() {
	            String titrePage = driver.getTitle();
	            AssertJUnit.assertTrue(titrePage.contains("Odyssey"));
	        }
	        
	        @Given("^je suis sur le formulaire inscription  sur le navigateur chrome$")
	       public void formulaireInscription() {
	            recupererUrl();
	        	ouvrirChrome();
	        	lancerSite();
	        	verifierAffichagePage();
/*	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(dropDownLangue));
	    	    wait.until(ExpectedConditions.elementToBeClickable(dropDownLangue));
	        	driver.findElement(dropDownLangue).click(); 
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(itemFrancais));
	    		wait.until(ExpectedConditions.elementToBeClickable(itemFrancais));
	        	driver.findElement(itemFrancais).click();
*/	        	          
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(prenom));
	    		wait.until(ExpectedConditions.elementToBeClickable(prenom));
	    		
	        }

	        @When ("^je selectionne le titre Mr$")
	        public void selectionTitreMr() {
	        	WebDriverWait wait = new WebDriverWait(driver, 10);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(titre));
	    		wait.until(ExpectedConditions.elementToBeClickable(titre));
	        	driver.findElement(titre).click();
	        	
	        	driver.findElement(titreMr).click();
	        	
	          }
	        
	        @When("^je selectionne le titre Mme$")
	        public void selectionTitreMme() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(titre));
	    		wait.until(ExpectedConditions.elementToBeClickable(titre));
	        	driver.findElement(titre).click();
	        	driver.findElement(titreMme).click();
	          }
	        
	        
	        @Given("^je saisis le prenom INVALIDE 123899$")
	        public void saisiePrenomInvalid1() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(prenom));
	    		wait.until(ExpectedConditions.elementToBeClickable(prenom));
	    		driver.findElement(prenom).clear();
		    	driver.findElement(prenom).sendKeys("123899");
	        }
	        
	        @Given("^je saisis le prenom INVALIDE -vide-$")
	        public void saisiePrenomInvalid2() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(prenom));
	    		wait.until(ExpectedConditions.elementToBeClickable(prenom));
	            saisirChamp(prenom,"");
	        }
	        
	        @And ("^je saisis le nom DUPONT$")
	        public void saisieNom_DUPONT() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(nom));
	    		wait.until(ExpectedConditions.elementToBeClickable(nom));
	            saisirChamp(nom,"DUPONT");
	        }
	        
	        @And ("^je choisis indicatif du pays FRA$")
	        public void saisieIndicatif() {
	        	driver.findElement(indicatif).click();
	        	driver.findElement(indFrance).click();            
	        }
	                
	        @And ("^je saisis le numero de telephone  683090909$")
	        public void saisieTelephone() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(telephone));
	    		wait.until(ExpectedConditions.elementToBeClickable(telephone));
	            saisirChamp(telephone,"683090909");
	        }
	        
	        @And ("^je selectionne la  formation Web and mobile dev..$")
	        public void saisieFormation() {
	        	driver.findElement(formation).click();
	        	driver.findElement(formationDev).click();      
	        }
	        
	        @And("^je choisis le campus Nantes$")
	        public void saisieCampus() {
	        	driver.findElement(campus).click();
	        	driver.findElement(campusVille).click();      
	        }    
	        
	        @And("^je choisis la session mars 2020$")
	        public void saisieSession() {
	            driver.findElement(session).click();
	            driver.findElement(sessionMars2020).click();         
	        }
	        
	        @And ("^je saisis adresse mail dupontalain@yopmail.com$")
	        public void saisieMail() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(mail));
	    		wait.until(ExpectedConditions.elementToBeClickable(mail));
	            saisirChamp(mail,"dupontalain@yopmail.com");
	        }
	                
	        @And ("^je saisis le mot de passe WCSmotdepasse$")
	        public void saisieMotDePasse() {
	        	WebDriverWait wait = new WebDriverWait(driver, 60);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(motDePasse));
	    		wait.until(ExpectedConditions.elementToBeClickable(motDePasse));
	            saisirChamp(motDePasse,"WCSmotdepasse");
	        }
	        @And("^je clique sur le bouton JE CREE MON COMPTE")
	        public void creerCompte() {
	        	driver.findElement(btnCreationCompte).click();
	        }    
	        
	    
	        @Then ("^un popup erreur est affiche avec le type erreur$")
	        public void verifierPopUpErreur() {
	        	driver.findElement(popUpErreur).isDisplayed();
	            String messageErreur = driver.findElement(erreurPrenom).getText();
	            Assert.assertNull("pas de message d'erreur sur le prénom", messageErreur);
	        }
	        
	    public static void saisirChamp(By champ,String valeur) {
	    	driver.findElement(champ).clear();
	    	driver.findElement(champ).sendKeys(valeur);
	    }
	    
	}


