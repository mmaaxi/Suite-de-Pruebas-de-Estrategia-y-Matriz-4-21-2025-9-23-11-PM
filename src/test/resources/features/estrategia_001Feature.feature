Feature: Prueba de Estrategia

  Scenario: Cargar la estrategia desde Google Sheets
    Given estoy en Google Sheets
    When cargo la estrategia
    Then la estrategia se carga correctamente