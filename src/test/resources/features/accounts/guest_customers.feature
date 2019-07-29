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