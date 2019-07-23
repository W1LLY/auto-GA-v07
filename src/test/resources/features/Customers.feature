Feature: Validaciones de la pagina de login

  Scenario: Cargar pagina de Customers Settings
    Given I load page of Dashboard
    And expand 'Account' option and Customer settings on 'Left Panel' page
    And add new Customer
