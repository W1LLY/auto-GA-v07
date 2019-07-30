Feature: Validaciones de la pagina de cars settings

  Scenario: Tab General de pagina de Cars Settings
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Cars' in Left Panel
    And click on Cars Settings
    Then write new dates in form
    And click 'Logout' button on 'Header' page

  Scenario: Tab Types de Cars Settings crear Type sin datos
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Cars' in Left Panel
    And click on Cars Settings
    And click on tab 'Types' of 'Cars Settings'
    And click on 'Add' in list types
    And set new name on 'Form Type'
    And click on 'Add' in form create new Type
    And click on tab 'Types' of 'Cars Settings'
    And click 'Logout' button on 'Header' page

  Scenario: Tab Types de Cars Settings eliminar un type
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Cars' in Left Panel
    And click on Cars Settings
    And click on tab 'Types' of 'Cars Settings'
    Then click on icon X from something type in list types
    And click on option Aceptar in panel dialog
    And click on tab 'Types' of 'Cars Settings'
    And click 'Logout' button on 'Header' page

  Scenario: Ordenar la lista de Types de acuerdo al nombre
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Cars' in Left Panel
    And click on Cars Settings
    And click on tab 'Types' of 'Cars Settings'
    And click on 'Name' in list of types
    And click 'Logout' button on 'Header' page

  Scenario: Mostrar el formulario de edicion de un Type
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Cars' in Left Panel
    And click on Cars Settings
    And click on tab 'Types' of 'Cars Settings'
    And click on icon of edition in any type of list
    And click on Close button
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que se carga la lista de Payment methods
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Cars' in Left Panel
    And click on Cars Settings
    And click on tab 'Payment Method' of 'Cars Settings'
    And click 'Logout' button on 'Header' page