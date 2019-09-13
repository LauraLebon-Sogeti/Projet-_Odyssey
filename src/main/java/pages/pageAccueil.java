package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.GenericPage;

public class pageAccueil extends GenericPage{
	
	private By xpathPopUpConnexion = By.xpath("//i[contains(@class, 'close icon')]");
	private By xpathQueteAccueil = By.xpath("//div[contains(@class, 'menu')]/a[contains(@href, 'quests')]");
	
	public void popUpConnexionPresent () {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(xpathPopUpConnexion));
		driver.findElement(xpathPopUpConnexion).click();
		
	}
	
	public void clickQuete () {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(xpathQueteAccueil));
		driver.findElement(xpathQueteAccueil).click();
	}
	
}
