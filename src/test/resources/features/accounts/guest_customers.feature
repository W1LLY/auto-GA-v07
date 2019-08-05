Feature: Validaciones de la pagina de Guest Customers

  Scenario: Verificar que se puede acceder a Guest Customers
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'GuestCustomers'
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que se puede agregar un nuevo Guest Customer
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'GuestCustomers'
    And click on add new Customer
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que no se puede agregar un nuevo Guest Customer sin datos
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'GuestCustomers'
    And click on add new Customer
    And click on 'Submit' button
    And click 'Logout' button on 'Header' page

  Scenario: Verificar que el campo FirstName es requerido
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click on option 'Accounts' in left panel
    And click on option 'GuestCustomers'
    And click on add new Customer
    And set lastName in form
    And set email in form
    And set password in form
    And select Country in form
    And click on 'Submit' button
    And click 'Logout' button on 'Header' page