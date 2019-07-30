Feature: validacion de la pagina nasa

  Scenario: validar imagery
    Given cargar pagina nasa
    And Click opcion NASA API Listing
    And Click opcion NASA API Listing2
    And Click opcion Earth
    And Cick opcion Imagery
    And validar link
