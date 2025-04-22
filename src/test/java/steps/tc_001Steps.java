package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import org.junit.Assert;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("^El documento Excel 'Claim Accounting Report' es exportado$")
    public void exportarDocumentoExcel() {
        page.exportarExcel();
    }

    @When("^Verifico la fórmula aplicada en la columna C$")
    public void verificarFormulaColumnaC() {
        page.verificarFormulaColumnaC();
    }

    @Then("^La clave en la columna C debe ser generada correctamente$")
    public void validarClaveGenerada() {
        boolean esClaveCorrecta = page.esClaveGeneradaCorrecta();
        Assert.assertTrue("La clave en la columna C no es correcta", esClaveCorrecta);
    }

    @Then("^Debe cumplir con el formato y datos esperados$")
    public void validarFormatoYDatos() {
        boolean cumpleFormato = page.cumpleFormatoYDatos();
        Assert.assertTrue("El formato y/o los datos no son los esperados", cumpleFormato);
    }
}