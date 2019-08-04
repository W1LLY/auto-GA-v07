Feature: Validaciones en Accounts customers

  Scenario: Verificar que se muestran 25 elementos en la lista
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option twenty five in list
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que al Aceptar se elimina el customer seleccionado
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option delete in any customer of list
    And click on Aceptar in confirmation panel
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que al Cancelar no se elimina el customer seleccionado
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option delete in any customer of list
    And click on Cancelar in confirmation panel
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que al editar un customer se carga el formulario con los datos
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option edit in any customer of list
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que se carga el formulario para agregar un nuevo customer
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option 'Add'
    And click 'Logout' button on 'Header' page

  Scenario: Verificar si se muestra el mensaje de campos requeridos al agregar customer
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option 'Add'
    And click on button Add in form to create customer
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que se muestran 100 elementos en la lista
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option one hundred in list
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que al hacer click en eliminar se muestra el modal de confirmacion
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'Customers'
    And click on option delete in any customer of list
    And click 'Logout' button on 'Header' page