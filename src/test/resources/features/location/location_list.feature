Feature: Validaciones en Location list

  Scenario: Verificar que la opcion 'Location list' redireccione la lista de locaciones
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que no se puede caracteres especiales en el campo location
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And set field 'location' with special chars
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que no se puede agregar una location sin longitude
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And select any country
    And set name of location
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
    And click on option 'Add' to add new location
    And set field 'Longitud' with letters
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que al presionar el boton submit valide que country este seleccionado
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And click on Add button
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que no se puede agregar una location sin latitude
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And select any country
    And set name of location
    And set field 'Latitude'
    And click on Add button
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que el campo 'Farsi' no permita numeros y caracteres especiales
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And set field 'Farsi' with special chars and numbers
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que el campo 'Russian' no permita numeros y caracteres especiales
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And set field 'Russian' with special chars and numbers
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que el campo 'French' no permita numeros y caracteres especiales
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Location' in left panel
    And click on option 'Location list'
    And click on option 'Add' to add new location
    And set field 'French' with special chars and numbers
    And click 'Logout' button on 'Header' page