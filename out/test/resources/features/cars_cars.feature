Feature: Validaciones de la pagina cars

  Scenario: Cargar pagina admi and mostrar cars
    Given I load page admi
    And click 'CARS' link over 'left panel' page
    When click 'CARS' sub link over 'left panel' page