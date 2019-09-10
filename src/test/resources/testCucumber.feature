Feature: exempleCucumber

Scenario Outline: tests connexion Odyssey
	Given j'ai url du site
	And le navigateur <navigateur> est ouvert
	When je tape URL du site
	Then la page accueil de Odyssey est affichee
	
Examples:
	| navigateur | 
	| firefox |
	| chrome    | 	
		