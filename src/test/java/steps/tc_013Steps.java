package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_013Page;

public class tc_013Steps {

    tc_013Page claimAccountingReportPage = new tc_013Page();

    @Given("^que el usuario exporta el Excel 'Claim Accounting Report'$")
    public void exportClaimAccountingReport() {
        claimAccountingReportPage.openReportPage();
        claimAccountingReportPage.exportReport();
    }

    @When("^el archivo se genera correctamente$")
    public void verifyReportGenerated() {
        Assert.assertTrue(claimAccountingReportPage.isReportGenerated());
    }

    @Then("^el documento debe mostrar la columna renombrada como 'Descripción Status Pago'$")
    public void verifyColumnRenamed() {
        Assert.assertTrue(claimAccountingReportPage.isColumnRenamed());
    }

    @Then("^el cambio debe ser consistente en las etiquetas de la columna$")
    public void verifyColumnLabelConsistency() {
        Assert.assertTrue(claimAccountingReportPage.isLabelConsistent());
    }
}