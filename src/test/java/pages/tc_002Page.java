package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By exportButton = By.id("exportButtonID");
    private By estadoCodigoColumn = By.xpath("//th[text()='Estado Código']");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void navigateToClaimAccountingReport() {
        driver.get("http://example.com/claim-accounting-report");
    }

    public void exportReport() {
        driver.findElement(exportButton).click();
        // Additional code to handle file download
    }

    public void verifyExportSuccess() {
        // Logic to verify file download success
    }

    public void insertEstadoCodigoColumn() {
        // Logic to insert new column in the Excel file
    }

    public void verifyEstadoCodigoColumnPosition() {
        // Logic to verify the position of 'Estado Código' column
    }

    public void inspectColumnHeader() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(estadoCodigoColumn));
    }

    public void verifyColumnHeader() {
        String headerText = driver.findElement(estadoCodigoColumn).getText();
        assert headerText.equals("Estado Código");
    }
}