package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page reportPage = new tc_002Page();

    @Given("the user exports the Claim Accounting Report")
    public void theUserExportsTheClaimAccountingReport() {
        reportPage.navigateToClaimAccountingReport();
    }

    @When("the Excel document is exported")
    public void theExcelDocumentIsExported() {
        reportPage.exportReport();
    }

    @Then("the export should succeed without errors")
    public void theExportShouldSucceedWithoutErrors() {
        reportPage.verifyExportSuccess();
    }

    @When("a new column is added to the right of column I")
    public void aNewColumnIsAdded() {
        reportPage.insertEstadoCodigoColumn();
    }

    @Then("the 'Estado Código' column should appear in the correct position")
    public void theEstadoCodigoColumnShouldAppearInTheCorrectPosition() {
        reportPage.verifyEstadoCodigoColumnPosition();
    }

    @When("the header of the column is inspected")
    public void theHeaderOfTheColumnIsInspected() {
        reportPage.inspectColumnHeader();
    }

    @Then("the header should be 'Estado Código' without alterations")
    public void theHeaderShouldBeEstadoCodigoWithoutAlterations() {
        reportPage.verifyColumnHeader();
    }
}