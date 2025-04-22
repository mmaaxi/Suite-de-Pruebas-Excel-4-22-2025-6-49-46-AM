Feature: Validar columna 'Status Pago Código' en Excel exportado

  Scenario: Exportar documento excel y validar columna 'Status Pago Código'
    Given El documento Excel es exportado correctamente
    When Verifico la inserción de la columna 'Status Pago Código'
    Then La columna 'Status Pago Código' se inserta correctamente a la derecha de 'Fecha de Pago'
    And El campo 'Status Pago Código' está vacío y listo para implementación futura