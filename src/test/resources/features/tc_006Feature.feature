Feature: Validar columna 'IVA 0%'

  Scenario: Verificar presencia y ubicación correcta de la columna 'IVA 0%'

    Given el usuario ha exportado el archivo Excel
    When el archivo Excel es exportado correctamente 
    Then se verifica que la columna 'IVA 0%' aparezca en el lugar especificado
    And se comprueba que los montos en la columna reflejen el IVA del 0% donde corresponda