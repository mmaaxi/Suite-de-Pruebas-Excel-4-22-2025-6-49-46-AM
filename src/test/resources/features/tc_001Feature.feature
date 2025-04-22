Feature: Validar generación de llave en Excel

  Scenario: Verificar generación de llave en la columna C
    Given El documento Excel 'Claim Accounting Report' es exportado
    When Verifico la fórmula aplicada en la columna C
    Then La clave en la columna C debe ser generada correctamente
    And Debe cumplir con el formato y datos esperados