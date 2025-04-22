Feature: Validar incorporación de columna 'Folio de Pago'

  Scenario: Verificar columna 'Folio de Pago' en archivo exportado
    Given el usuario ha exportado el reporte 'Claim Accounting Report' a Excel
    When se revisa la estructura del archivo
    Then el archivo se genera correctamente
    And la columna 'Folio de Pago' aparece justo a la derecha de 'Folio Pre solicitud'
    And el nombre de la columna es 'Folio de Pago' sin errores