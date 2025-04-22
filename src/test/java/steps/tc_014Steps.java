package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import pages.tc_014Page;

public class tc_014Steps {

    tc_014Page page = new tc_014Page();

    @Given("el usuario está en la página de exportación de Excel")
    public void el_usuario_esta_en_la_pagina_de_exportacion_de_Excel() {
        page.navigateToExportPage();
    }

    @When("el usuario exporta el documento de Excel modificado")
    public void el_usuario_exporta_el_documento_de_Excel_modificado() {
        page.exportModifiedExcel();
    }

    @Then("el documento de Excel se genera correctamente")
    public void el_documento_de_Excel_se_genera_correctamente() {
        page.verifyExcelGeneration();
    }

    @When("el usuario verifica la fórmula de la columna 'IVA Acumulado'")
    public void el_usuario_verifica_la_formula_de_la_columna_IVA_Acumulado() {
        page.checkIvaFormula();
    }

    @Then("la fórmula incorpora todos los tipos de IVA necesarios y excluye IVA retenido")
    public void la_formula_incorpora_todos_los_tipos_de_IVA() {
        page.validateIvaFormulaContents();
    }

    @When("el usuario valida el cálculo con datos de prueba conocidos")
    public void el_usuario_valida_el_calculo_con_datos_de_prueba_conocidos() {
        page.validateCalculationWithTestData();
    }

    @Then("el resultado del cálculo coincide con la expectativa del requerimiento")
    public void el_resultado_del_calculo_coincide_con_la_expecativa_del_requerimiento() {
        page.verifyCalculationResults();
    }
}