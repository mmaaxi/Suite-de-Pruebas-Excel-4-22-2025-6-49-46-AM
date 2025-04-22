Feature: Validar columna 'IVA exento'

  Scenario: Exportar documento y verificar columna 'IVA exento'
    Given I am on the main page
    When I export the document to Excel
    Then The document should be exported without issues
    When I check for the 'IVA exento' column in the Excel file
    Then The 'IVA exento' column should appear in the correct location
    And The amounts in this column should be VAT exempt