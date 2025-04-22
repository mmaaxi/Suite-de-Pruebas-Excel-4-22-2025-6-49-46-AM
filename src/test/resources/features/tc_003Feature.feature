Feature: Validar actualización de campos en columna 'estado'

  Scenario: Validar actualización de campos en columna 'estado'
    Given que el usuario tiene acceso a la aplicación
    When el usuario exporta el documento Excel
    Then el archivo se exporta correctamente

    When el usuario revisa la columna 'estado' en el Excel
    Then los valores y formato han sido actualizados según las especificaciones del requerimiento

    When el usuario compara con datos de referencia proporcionados en figura 3
    Then la actualización cumple con la descripción de la HU