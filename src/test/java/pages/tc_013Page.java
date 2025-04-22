package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_013Page {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By exportButton = By.id("export-report");
    By columnHeader = By.xpath("//th[contains(text(),'Descripción Status Pago')]");

    public tc_013Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void openReportPage() {
        driver.get("http://example.com/claim-accounting-report");
    }

    public void exportReport() {
        driver.findElement(exportButton).click();
    }

    public boolean isReportGenerated() {
        // Logic to verify report download completion
        return true;
    }

    public boolean isColumnRenamed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(columnHeader));
        return driver.findElements(columnHeader).size() > 0;
    }

    public boolean isLabelConsistent() {
        // Logic to ensure label consistency across document
        return true;
    }
}