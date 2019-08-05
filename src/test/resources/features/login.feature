Feature: Validactiones de la pagina de Login

  Scenario: Validar "Login php travel" label en la pagina de LOGIN
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page

  Scenario: Cargar Pagina PHP Travel
    Given I load PHP travels
    And set my credencials at 'Login php travel' page
    And click 'Location' link on 'Left Panel' page

  #  Background: Load main page


  Scenario: Cargar Pagina PHP Travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Logout' button on 'Header' page

  Scenario: Validar "Login" label en la pagina de LOGIN
    And fill "test@test.com" email field on 'Login' page
    And fill "test@test.com" password field on 'Login' page
    Then verify the "LOGIN" label button is displayed on 'Login' page
    And click 'Logout' button on 'Header' page

  Scenario Outline: Validar "Login" label en la pagina de LOGIN multiples scenarios
    Given I load PHP travels
    And fill "<email>" email field on 'Login' page
    And fill "<password>" password field on 'Login' page
    Then verify the "<login label>" label button is displayed on 'Login' page

    Examples:
      | email          | password       | login label |
      | test1@test.com | test1@test.com | LOGIN       |
      | test2@test.com | test2@test.com | LOGIN       |

  Scenario Outline: Validar "Login" label en la pagina de LOGIN multiples scenarios 2
    Given I load PHP travels
    And fill "<email>" email field on 'Login' page
    And fill "<password>" password field on 'Login' page
    Then verify the "<login label>" label button is displayed on 'Login' page

    Examples:
      | email          | password       | login label |
      | test3@test.com | test3@test.com | LOGIN       |

  Scenario: Reading entries
    Given I load PHP travels
    And fill email field using json file on 'Login' page