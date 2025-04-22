package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("^el usuario está en la página de Claim Accounting$")
    public void usuarioEnPaginaDeClaimAccounting() {
        page.navigateToClaimAccountingPage();
    }

    @When("^el usuario exporta el Excel 'Claim Accounting Report'$")
    public void exportarExcelClaimAccountingReport() {
        page.exportExcelReport();
    }

    @Then("^el Excel se exporta exitosamente$")
    public void verificarExitoExportacionExcel() {
        assertTrue("El archivo Excel no se exportó correctamente.", page.isExcelExportSuccessful());
    }

    @When("^el usuario verifica la nueva columna titulada 'Monto acumulado Folio Reserva 5401'$")
    public void verificarNuevaColumna() {
        assertTrue("La columna 'Monto acumulado Folio Reserva 5401' no se encontró en la posición correcta.", page.isNewColumnInserted());
    }

    @Then("^la columna se inserta inmediatamente a la derecha de 'Monto \\(reserva\\)'$")
    public void verificarInsercionCorrecta() {
        assertTrue("La columna no se insertó correctamente a la derecha de 'Monto (reserva)'.", page.isColumnInsertedCorrectly());
    }

    @When("^el usuario valida la fórmula de la celda$")
    public void validarFormulaCelda() {
        assertTrue("La fórmula de la celda no es correcta.", page.isCellFormulaValid());
    }

    @Then("^la fórmula opera correctamente en cálculos dinámicos$")
    public void verificarOperacionDinamicaFormula() {
        assertTrue("La fórmula no opera correctamente en cálculos dinámicos.", page.isFormulaOperatingCorrectly());
    }
}