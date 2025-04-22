package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();
    
    @Given("El usuario está en la página de exportación de Excel")
    public void usuario_en_pagina_exportacion_excel() {
        page.navegarAPaginaDeExportacion();
    }

    @When("El usuario exporta el Excel modificado")
    public void usuario_exporta_excel_modificado() {
        page.exportarExcelModificado();
    }

    @Then("La exportación se realiza correctamente")
    public void exportacion_realizada_correctamente() {
        Assert.assertTrue(page.verificarExportacionExitosa());
    }

    @When("El usuario verifica la columna 'IVA retenido' en el Excel exportado")
    public void usuario_verifica_columna_iva_retenido() {
        page.confirmarColumnaIVA();
    }

    @Then("La columna 'IVA retenido' está en la posición esperada")
    public void columna_iva_retenido_posicion_esperada() {
        Assert.assertTrue(page.verificarPosicionColumnaIVA());
    }

    @When("El usuario verifica los valores de IVA retenido en el Excel")
    public void usuario_verifica_valores_iva_retenido() {
        page.verificarValoresIVA();
    }

    @Then("Los valores de IVA retenido coinciden con los montos calculados")
    public void valores_iva_coinciden_montos_calculados() {
        Assert.assertTrue(page.verificarValoresCorrectos());
    }
}