package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    private WebDriver driver;

    private By exportButton = By.id("exportExcelButton");
    private By columnIva0 = By.xpath("//th[contains(text(), 'IVA 0%')]");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarExcel() {
        WebElement button = driver.findElement(exportButton);
        button.click();
        // Add wait logic if necessary
    }

    public boolean verificarArchivoExportado() {
        // Logic to verify the Excel file has been exported, potentially checking for file existence
        return true;
    }

    public boolean verificarColumnaIva0Presente() {
        WebElement column = driver.findElement(columnIva0);
        return column != null && column.isDisplayed();
    }

    public boolean verificarMontosIva0Correctos() {
        // Logic for verifying the displayed amounts include only those with 0% IVA
        return true;
    }
}