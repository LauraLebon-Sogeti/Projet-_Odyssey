# language: en
Feature: P000839-46 PC - Consulter mes expeditions

Scenario Outline: PC - Consulter mes expeditions
  
  Given <navigateur> est ouvert sur le site test-odyssey en francais
  And Je suis connecte avec les identifiants etudiant-889
  When La page d'accueil est affichee
  Then Je peux voir mes expeditions
  Examples:
  | navigateur |
  | Chrome     |