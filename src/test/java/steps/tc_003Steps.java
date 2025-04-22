import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_003Steps {

    private tc_003Page page;

    @Given("que el usuario tiene acceso a la aplicación")
    public void usuarioTieneAcceso() {
        // Código para validar el acceso a la aplicación
    }

    @When("el usuario exporta el documento Excel")
    public void exportarDocumentoExcel() {
        page.exportarExcel();
    }

    @Then("el archivo se exporta correctamente")
    public void verificarExportacion() {
        Assert.assertTrue(page.verificarExportacionCorrecta());
    }

    @When("el usuario revisa la columna 'estado' en el Excel")
    public void revisarColumnaEstado() {
        page.revisarColumnaEstado();
    }

    @Then("los valores y formato han sido actualizados según las especificaciones del requerimiento")
    public void verificarActualizacionValoresFormato() {
        Assert.assertTrue(page.verificarActualizacionValoresFormato());
    }

    @When("el usuario compara con datos de referencia proporcionados en figura 3")
    public void compararDatosReferencia() {
        page.compararConDatosFigura3();
    }

    @Then("la actualización cumple con la descripción de la HU")
    public void verificarCumplimientoHU() {
        Assert.assertTrue(page.verificarCumplimientoHU());
    }
}