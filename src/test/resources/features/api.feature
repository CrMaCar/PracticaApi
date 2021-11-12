Feature: tpapi

  @Martin
  Scenario Outline: Crear project en Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And un id de workspace valido
    And un users id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Valido que los id no sean nulos
    Examples:
      | operation | entity    | jsonName          | status |
      | GET       | TIMEENTRY | getTimeEntryCrist | 200    |