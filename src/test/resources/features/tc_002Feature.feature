Feature: Validate 'Estado Código' Column

  Scenario: Export and verify 'Estado Código' column in the report
    Given the user exports the Claim Accounting Report
    When the Excel document is exported
    Then the export should succeed without errors
    
    And the user verifies the presence of the 'Estado Código' column
    When a new column is added to the right of column I
    Then the 'Estado Código' column should appear in the correct position

    And the user checks the header of the 'Estado Código' column
    When the header of the column is inspected
    Then the header should be 'Estado Código' without alterations