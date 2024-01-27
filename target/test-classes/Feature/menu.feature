#Author: Boughamoura Amira
Feature: consultation des menus du homepage

  Background: 
    Given admin est ala page Home

  Scenario Outline: verification des menu du page home 
    When admin hover le menu "Smart Home " and hover on "Maison connectée"
    And admin click sur le submenu "Maison connectée"
    Then admin redirigé vers la page de produit "Maison connectée"

   

      
   