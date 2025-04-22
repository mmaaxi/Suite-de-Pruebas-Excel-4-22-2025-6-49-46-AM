Feature: Validar renombramiento de columna 'Monto Acumulado Folio OPC'

  Scenario: Renombrar columna en documento exportado
    Given El usuario ha exportado el archivo Excel
    When Revisa la columna originalmente denominada 'Monto Acumulado Folio OPC'
    Then La columna se muestra renombrada a 'Monto Acumulado Folio OPC (2121)'
    And El nombre de la columna es homogéneo y se aplica en todas las instancias