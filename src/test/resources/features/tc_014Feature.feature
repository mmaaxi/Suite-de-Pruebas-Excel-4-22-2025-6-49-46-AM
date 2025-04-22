Feature: Validación de la modificación de fórmula en 'IVA Acumulado'

  Scenario: Exportar Excel modificado y verificar fórmula y cálculo

    Given el usuario está en la página de exportación de Excel
    When el usuario exporta el documento de Excel modificado
    Then el documento de Excel se genera correctamente

    When el usuario verifica la fórmula de la columna 'IVA Acumulado'
    Then la fórmula incorpora todos los tipos de IVA necesarios y excluye IVA retenido

    When el usuario valida el cálculo con datos de prueba conocidos
    Then el resultado del cálculo coincide con la expectativa del requerimiento