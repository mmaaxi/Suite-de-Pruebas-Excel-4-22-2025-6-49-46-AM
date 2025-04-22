Feature: Validar incorporación de columna 'Folio Pre solicitud'

  Scenario: Validar la generación de reporte y presencia de nueva columna en Excel
    Given el usuario ha exportado el reporte Excel
    When el reporte es generado sin errores
    And se verifica la presencia de nueva columna 'Folio Pre solicitud' derecha de 'Ramo'
    Then la columna 'Folio Pre solicitud' está presente y etiquetada correctamente