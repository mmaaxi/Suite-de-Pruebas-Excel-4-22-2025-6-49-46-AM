package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("^I am on the main page$")
    public void iAmOnTheMainPage() {
        page.navigateToMainPage();
    }
    
    @When("^I export the document to Excel$")
    public void iExportTheDocumentToExcel() {
        page.exportToExcel();
    }

    @Then("^The document should be exported without issues$")
    public void theDocumentShouldBeExportedWithoutIssues() {
        Assert.assertTrue(page.isExportSuccessful());
    }

    @When("^I check for the 'IVA exento' column in the Excel file$")
    public void iCheckForTheIVAExentoColumnInTheExcelFile() {
        page.checkForIVAExentoColumn();
    }

    @Then("^The 'IVA exento' column should appear in the correct location$")
    public void theIVAExentoColumnShouldAppearInTheCorrectLocation() {
        Assert.assertTrue(page.isIVAExentoColumnPresent());
    }
    
    @Then("^The amounts in this column should be VAT exempt$")
    public void theAmountsInThisColumnShouldBeVATExempt() {
        Assert.assertTrue(page.areAmountsVATExempt());
    }
}