# language: en
Feature: P000839-44a PC_CandidatureKO

#----------------------------- Scenario 1----------------------------- 
		
Scenario Outline: PC-Verifier formulaire avec prenom invalide.
	Given je suis sur le formulaire d'inscription  sur le navigateur chrome
	And j'ai selectionne la langue Francais
	When je selectionne le titre  <titre>
	And je saisis le prenom INVALIDE <prenom>
	And je saisis le nom <nom>
	And je choisis l'indicatif du pays <ind>
	And je saisis le numero de telephone  <téléphone>
	And je selectionne la  formation "Web and mobile dev..."
	And je choisis le campus <campus>
	And je choisis la session "2019 sept"
	And je saisis l'adresse mail <mail>
	And je saisis  le mot de passe "WCSmotdepasse"
	And je clique sur le bouton JE CREE MON COMPTE
	Then  un popup d'erreur s'affiche avec le type d'erreur
		
Examples:
|	titre	|	nom	    |	prénom	|	ind	|	téléphone	|	campus  	  |	mail                      	|
|	Mr	  |	DUPONT	|	-vide-  |	FRA	|	683090909	|	Nantes  	| dupontalain@yopmail.com   	|
|	Mme	  |	DUPONT	|	123899  |	FRA	|	683090909	|	Nantes  	| dupontalain@yopmail.com   	|

