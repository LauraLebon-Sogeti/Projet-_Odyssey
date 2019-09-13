# language: en
Feature: P000839-44a PC_CandidatureKO

#----------------------------- Scenario 1----------------------------- 
		
Scenario: PC-Verifier formulaire avec prenom invalide.
	Given je suis sur le formulaire inscription  sur le navigateur chrome
	And je saisis le prenom INVALIDE -vide-
	And je saisis le nom DUPONT
	And je saisis le numero de telephone  683090909
	And je saisis adresse mail dupontalain@yopmail.com
	And je saisis le mot de passe WCSmotdepasse
	And je clique sur le bouton JE CREE MON COMPTE
	Then  un popup erreur est affiche avec le type erreur
		
