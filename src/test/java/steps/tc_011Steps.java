import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class tc_011Steps {

    WebDriver driver;
    tc_011Page page;

    @Given("el usuario ha exportado el reporte 'Claim Accounting Report' a Excel")
    public void exportarClaimAccountingReport() {
        page = new tc_011Page(driver);
        page.exportReport();
    }

    @When("se revisa la estructura del archivo")
    public void revisarEstructuraArchivo() {
        // La implementación se manejará dentro de los métodos de la clase Page
    }

    @Then("el archivo se genera correctamente")
    public void verificarArchivoGenerado() {
        Assert.assertTrue(page.isFileGenerated(), "El archivo Excel no fue generado correctamente.");
    }

    @Then("la columna 'Folio de Pago' aparece justo a la derecha de 'Folio Pre solicitud'")
    public void verificarColumnaFolioDePago() {
        Assert.assertTrue(page.isColumnPresentInCorrectPosition(), "La columna 'Folio de Pago' no está en la posición correcta.");
    }

    @Then("el nombre de la columna es 'Folio de Pago' sin errores")
    public void verificarNombreColumna() {
        Assert.assertEquals(page.getColumnName(), "Folio de Pago", "El nombre de la columna 'Folio de Pago' es incorrecto.");
    }
}