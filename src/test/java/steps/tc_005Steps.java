package steps;

import pages.tc_005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("El usuario ha exportado el archivo Excel")
    public void elUsuarioHaExportadoElArchivoExcel() {
        page.exportarExcel();
    }

    @When("Revisa la columna originalmente denominada 'Monto Acumulado Folio OPC'")
    public void revisaLaColumnaOriginalmenteDenominada() {
        Assert.assertTrue(page.esColumnaRenombradaPresente());
    }

    @Then("La columna se muestra renombrada a 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void laColumnaSeMuestraRenombrada() {
        Assert.assertTrue(page.verificarNombreColumnaRenombrada());
    }

    @Then("El nombre de la columna es homogéneo y se aplica en todas las instancias")
    public void elNombreDeLaColumnaEsHomogeneo() {
        Assert.assertTrue(page.esNombreColumnaConsistente());
    }
}