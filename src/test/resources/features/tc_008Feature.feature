Feature: Validar columna 'IVA retenido'

  Scenario: Exportar Excel y confirmar la columna 'IVA retenido'
    Given El usuario está en la página de exportación de Excel
    When El usuario exporta el Excel modificado
    Then La exportación se realiza correctamente

    And El usuario verifica la columna 'IVA retenido' en el Excel exportado
    Then La columna 'IVA retenido' está en la posición esperada

    And El usuario verifica los valores de IVA retenido en el Excel
    Then Los valores de IVA retenido coinciden con los montos calculados