package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    
    WebDriver driver;
    tc_010Page page;

    @Given("el usuario ha exportado el reporte Excel")
    public void exportarReporteExcel() {
        page = new tc_010Page(driver);
        page.exportarReporte();
    }

    @When("el reporte es generado sin errores")
    public void validarGeneracionReporte() {
        Assert.assertTrue(page.isReporteGeneradoSinErrores());
    }

    @When("se verifica la presencia de nueva columna 'Folio Pre solicitud' derecha de 'Ramo'")
    public void verificarColumnaFolioPreSolicitud() {
        Assert.assertTrue(page.isColumnaFolioPreSolicitudPresente());
        Assert.assertTrue(page.isColumnaFolioPreSolicitudEnPosicionCorrecta());
    }

    @Then("la columna 'Folio Pre solicitud' está presente y etiquetada correctamente")
    public void confirmarColumnaPresenteYEtiquetada() {
        Assert.assertTrue(page.isColumnaFolioPreSolicitudEtiquetadaCorrectamente());
    }
}