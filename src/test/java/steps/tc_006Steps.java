package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;
import org.junit.Assert;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();
    
    @Given("el usuario ha exportado el archivo Excel")
    public void elUsuarioHaExportadoElArchivoExcel() {
        page.exportarExcel();
    }

    @When("el archivo Excel es exportado correctamente")
    public void elArchivoEsExportadoCorrectamente() {
        Assert.assertTrue(page.verificarArchivoExportado());
    }

    @Then("se verifica que la columna 'IVA 0%' aparezca en el lugar especificado")
    public void seVerificaColumnaIvaAparezca() {
        Assert.assertTrue(page.verificarColumnaIva0Presente());
    }

    @Then("se comprueba que los montos en la columna reflejen el IVA del 0% donde corresponda")
    public void comprobarMontosConIva0() {
        Assert.assertTrue(page.verificarMontosIva0Correctos());
    }
}