Feature: Validaciones de la pagina de extras

  Scenario: Cargar pagina PHP Travels y mostrar extras
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    When click 'extras' link on 'Left Panel' page