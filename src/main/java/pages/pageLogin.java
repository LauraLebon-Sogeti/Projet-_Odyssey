package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.GenericPage;


public class pageLogin extends GenericPage{
	//variables
	private By user_email = By.id("user_email");
	private By user_password = By.id("user_password");
	private By btn_cnx = By.name("commit");
	
	//Connexion au site avec user_email et user_password
	public boolean seConnecter(WebDriver driver, String userMail, String userPassword) {
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(user_email));
		wait.until(ExpectedConditions.elementToBeClickable(user_email));
		driver.findElement(user_email).clear();
		driver.findElement(user_email).sendKeys(userMail);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(user_password));
		wait.until(ExpectedConditions.elementToBeClickable(user_password));
		driver.findElement(user_password).clear();		
		driver.findElement(user_password).sendKeys(userPassword);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_cnx));
		wait.until(ExpectedConditions.elementToBeClickable(btn_cnx));
		driver.findElement(btn_cnx).click();
		
		Boolean connexionReussie = driver.findElement(By.xpath("//*[contains(text(),'Connecté avec succès.')]")).isDisplayed();
		return connexionReussie;
	}
	
}
