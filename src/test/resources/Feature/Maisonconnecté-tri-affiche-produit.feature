#Author: Boughamoura Amira
Feature: Maison connecté

  Background: 
    Given admin accéde ala page maison connecté

  Scenario: Maison connecté et tri
    When admin selectionne un tri "Tri par tarif décroissant"
    Then page des produits trié est affichés

  Scenario: page produit
    When admin click sur le produit "Humidificateur Xiaomi 2 Lite"
    Then la page de produit est afiché
