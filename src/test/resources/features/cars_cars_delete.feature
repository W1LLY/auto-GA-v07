Feature: Validacion de la opcion delete car

  Scenario: Delete a car
    Given I have list of Cars
    And click 'Icon delete'
    And click 'Aceptar' on pop pup

