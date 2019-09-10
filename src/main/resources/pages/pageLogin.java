package main.resources.pages;

import org.openqa.selenium.By;

import main.resources.GenericPage;


public class pageLogin extends GenericPage{
	//variables
	private By email_user = By.id("email_user");
	private By user_password = By.id("user_password");
	private By btn_cnx = By.className("commit");
	
	//fonctions de base
	public void cliquerBtnSeConnecter() {
		driver.findElement(btn_cnx).click();
	}

}
