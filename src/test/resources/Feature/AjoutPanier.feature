#Author: Boughamoura Amira
Feature: Ajout panier

  Scenario: ajout produit au panier
    Given admin accede ala page produit
    When admin click sur le boutton ajout panier du produit "Humidificateur Xiaomi 2 Lite"
    Then le produit "Humidificateur Xiaomi 2 Lite" est ajoute au panier
