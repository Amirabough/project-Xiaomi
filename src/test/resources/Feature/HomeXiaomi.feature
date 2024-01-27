#Author: Boughamoura Amira

Feature: accéder à Xiaomi home page

  
  Scenario: accéder ala pageHome
    Given admin acceder ala pageHome
    When admin saisir URL
    Then page home "Boutique"  est affiché