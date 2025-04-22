package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_009Page;
import utils.ExcelUtils;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();
    ExcelUtils excelUtils = new ExcelUtils();

    @Given("el documento Excel modificado está abierto")
    public void abrirDocumentoExcel() {
        excelUtils.abrirDocumentoModificado();
    }

    @When("exporto el archivo Excel modificado")
    public void exportarArchivoExcel() {
        Assert.assertTrue(page.exportarArchivoExcel());
    }

    @Then("el documento intermedio se genera correctamente")
    public void verificarDocumentoGenerado() {
        Assert.assertTrue(excelUtils.verificarGeneracionIntermedia());
    }

    @When("reviso la celda de 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void revisarCeldaFormula() {
        String formulaActual = page.obtenerFormulaCelda();
        Assert.assertEquals("=Z4+AD5+AE5+AH5+AC5+AB5+AM5", formulaActual);
    }

    @When("realizo cálculos de validación con valores de muestra")
    public void realizarCalculosValidacion() {
        Assert.assertTrue(page.realizarCalculosValidacion());
    }

    @Then("el resultado del cálculo coincide con lo esperado")
    public void validarResultadoCalculo() {
        Assert.assertTrue(page.verificarResultadoEsperado());
    }
}