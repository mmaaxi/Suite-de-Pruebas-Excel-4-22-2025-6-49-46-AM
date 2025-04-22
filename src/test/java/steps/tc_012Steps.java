package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_012Page;

public class tc_012Steps {
    tc_012Page page = new tc_012Page();

    @Given("El documento Excel es exportado correctamente")
    public void elDocumentoExcelEsExportadoCorrectamente() {
        Assert.assertTrue("El Excel no se ha exportado correctamente", page.esExportadoCorrectamente());
    }

    @When("Verifico la inserción de la columna 'Status Pago Código'")
    public void verificoLaInserciónDeLaColumnaStatusPagoCódigo() {
        page.verificarInsercionColumnaStatusPagoCodigo();
    }

    @Then("La columna 'Status Pago Código' se inserta correctamente a la derecha de 'Fecha de Pago'")
    public void laColumnaStatusPagoCódigoSeInsertaCorrectamenteADerechaDeFechaDePago() {
        Assert.assertTrue("La columna 'Status Pago Código' no está insertada correctamente", page.isColumnaStatusPagoCodigoCorrecta());
    }

    @Then("El campo 'Status Pago Código' está vacío y listo para implementación futura")
    public void elCampoStatusPagoCódigoEstaVacioYListoParaImplementacionFutura() {
        Assert.assertTrue("El campo 'Status Pago Código' no está vacío", page.isCampoStatusPagoCodigoVacio());
    }
}