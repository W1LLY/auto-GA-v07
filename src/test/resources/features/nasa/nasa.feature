Feature: Validaciones en la pagina Nasa API

  Scenario Outline: Validar elements in page Nasa API
    Given I load page Nasa API
    And click on Nasa API 'Listing'
    And click on Nasa API 'Listing'
    And click on 'Earth' on left panel
    And click on option 'Imagery'
    And get content of Imagery
    Then verify the "<content>" content on 'Imagery' page

    Examples:
      | content                                          |
      | GET https://api.nasa.gov/planetary/earth/imagery |