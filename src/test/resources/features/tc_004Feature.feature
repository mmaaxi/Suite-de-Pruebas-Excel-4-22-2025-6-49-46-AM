Feature: Validar columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Validar columna 'Monto acumulado Folio Reserva 5401'
    Given el usuario está en la página de Claim Accounting
    When el usuario exporta el Excel 'Claim Accounting Report'
    Then el Excel se exporta exitosamente
    When el usuario verifica la nueva columna titulada 'Monto acumulado Folio Reserva 5401'
    Then la columna se inserta inmediatamente a la derecha de 'Monto (reserva)'
    When el usuario valida la fórmula de la celda
    Then la fórmula opera correctamente en cálculos dinámicos