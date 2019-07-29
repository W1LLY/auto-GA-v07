Feature: Validaciones en Location list

  Scenario: Verificar que no se puede ingresar numeros en el campo Country
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And set field 'Country' with numbers
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que no se puede caracteres especiales en el campo location
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And set field 'location' with special chars
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que no se puede agregar una location sin latitud
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And set field 'Longitud'
    And click on Add button
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que se carga el formulario al editar una location
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option edit in list locations
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que el campo de longitud no permita ingresar letras
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And set field 'Longitud' with letters
    And click 'Logout' button on 'Header' page