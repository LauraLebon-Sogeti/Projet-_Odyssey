# language: en

Feature: P000839-48c : PC - Ajout de commentaires 

Scenario Outline: PC - Ajout de commentaires
	Given Le <Navigateur> est ouvert sur le site "https://test-odyssey.wildcodeschool.com/"
  And je suis connecté avec les identifiants IDStudent et MDPStudent
  When je sélectionne l'onglet quête
  Then je peux voir les quêtes
  Examples:
  | Navigateur |
  | Chrome     |
  | Firefox    |  