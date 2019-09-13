package pages;

import org.junit.Assert;
import org.omg.CORBA.RepositoryIdHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import gherkin.deps.com.google.gson.annotations.Until;
import main.java.GenericPage;


public class pageQuetes extends GenericPage {

	private By xpathQueteExist = By.xpath("//h2[contains(text(), 'Toutes les quêtes disponibles')]");
	
	public void verificationAffichagePageQuete (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Boolean pageQueteExist = wait.until(ExpectedConditions.elementToBeClickable(xpathQueteExist)).isDisplayed();
		Assert.assertTrue(pageQueteExist);
		
		/*final String titleWebPage = driver.getTitle();
		
		Boolean pageQueteExist;
		if (titleWebPage.contains("Toutes les quêtes disponibles")) {
			pageQueteExist = true;
			System.out.println("C'est la bonne page.");
		}	
		else {
			pageQueteExist = false;
			System.out.println("Vérifier la page, ce n'est pas la page 'Toutes les quêtes disponibles'.");
		}
		return pageQueteExist;*/
	}
	
}
