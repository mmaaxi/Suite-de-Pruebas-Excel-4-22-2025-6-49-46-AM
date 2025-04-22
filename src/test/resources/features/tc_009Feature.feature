Feature: Validar actualización de fórmula en 'Monto Acumulado Folio OPC (2121)'

  Scenario: Comprobar la actualización y validación de la fórmula en el Excel exportado
    Given el documento Excel modificado está abierto
    When exporto el archivo Excel modificado
    Then el documento intermedio se genera correctamente
    When reviso la celda de 'Monto Acumulado Folio OPC (2121)'
    Then la fórmula incluye "=Z4+AD5+AE5+AH5+AC5+AB5+AM5"
    When realizo cálculos de validación con valores de muestra
    Then el resultado del cálculo coincide con lo esperado