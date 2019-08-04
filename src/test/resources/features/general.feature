Feature: Validaciones de la pagina PHPTravels

  Scenario: Verificar expand cuando se hace click opcion CARS
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'Logout' button on 'Header' page

  Scenario: Verificar click opcion extras
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'EXTRAS' link on 'left panel'
    And click 'Logout' button on 'Header' page

  Scenario Outline: Verificar formulario edit
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'EXTRAS' link on 'left panel'
    And click 'Edit' link on icon 'right panel'
    And update "<name>" name field on 'form edit' page
    And update "<price>" price field on 'form edit' page
    And click 'SAVE&RETURN' button to save
    And click 'Logout' button on 'Header' page

    Examples:
      | name        | price |
      | update name | 85    |

  Scenario: Verificar formulario al haser click opcion ADD un car
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'EXTRAS' link on 'left panel'
    And click 'ADD' button añadir
    And click 'Logout' button on 'Header' page

  Scenario Outline: Verificar añadir un car
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'EXTRAS' link on 'left panel'
    And click 'ADD' button añadir
    And fill "<name>" name field on 'form add'
    And fill "<price>" price field on 'form add'
    And click 'SAVE&RETURN' button to save
    And click 'Logout' button on 'Header' page

    Examples:
      | name     | price |
      | new name | 89    |

  Scenario: Verificar 'extra eliminado' cuando se hace click opcion delete
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'EXTRAS' link on 'left panel'
    And click 'Icon delete'' link delete extras
    And Click opcion Accept ''pop pup''
    And click 'Logout' button on 'Header' page

  Scenario: Verificar 'Lista cars' click opcion CARS
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'CARS' link opcion cars-cars
    And click 'Logout' button on 'Header' page

  Scenario Outline: Vericar formulario edit car
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'CARS' link opcion cars-cars
    And click 'Icon edit' opcion edit car
    And fill "<carname>" field on formulario edit
    And click 'Logout' button on 'Header' page

    Examples:
      | carname         |
      | car name update |

  Scenario: verificar formulario delete car
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'CARS' link opcion cars-cars
    And click 'Icon delete' opcion delete car
    And click 'Acept' opcion on pop pup
    And click 'Logout' button on 'Header' page


  Scenario Outline: Verificar 'ADD' opcion add car
    Given I load PHPTravels
    And set credencials  on 'Login' page
    And click 'CARS' link on 'Left Panel'
    And click 'CARS' link opcion cars-cars
    And click 'ADD' link opcion add car
    And fill "<carname>" field on formulario edit
    And click 'Submit' button to add car
    And click 'Logout' button on 'Header' page

    Examples:
      | carname      |
      | new car name |