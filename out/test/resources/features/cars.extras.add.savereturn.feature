Feature: Validaciones de la apgina extras

  Scenario: Cargar Pagina de extras ADD
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    When click 'extras' link on 'Left Panel' page'