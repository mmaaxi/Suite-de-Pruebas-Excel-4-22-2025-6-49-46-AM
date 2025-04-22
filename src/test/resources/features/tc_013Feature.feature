Feature: Validar renombramiento de columna 'Status de Pago'

  Scenario: Renombramiento de columna 'Status de Pago'
    Given que el usuario exporta el Excel 'Claim Accounting Report'
    When el archivo se genera correctamente
    Then el documento debe mostrar la columna renombrada como 'Descripción Status Pago'
    And el cambio debe ser consistente en las etiquetas de la columna