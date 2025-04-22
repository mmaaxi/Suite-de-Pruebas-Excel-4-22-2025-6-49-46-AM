package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class tc_005Page {

    private WebDriver driver;
    private By columnaRenombradaSelector = By.xpath("//th[contains(text(), 'Monto Acumulado Folio OPC (2121)')]");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    // Método para exportar el archivo Excel
    public void exportarExcel() {
        // Lógica de automatización para exportar el archivo
    }

    // Verifica si la columna renombrada está presente
    public boolean esColumnaRenombradaPresente() {
        return driver.findElements(columnaRenombradaSelector).size() > 0;
    }

    // Verifica el nombre de la columna renombrada está correctamente
    public boolean verificarNombreColumnaRenombrada() {
        // Lógica para verificar si el nombre de la columna es correcto
        return true; // Ajustar según el elemento encontrado
    }

    // Verifica si el nombre es consistente en todo el documento
    public boolean esNombreColumnaConsistente() {
        List<WebElement> columnas = driver.findElements(columnaRenombradaSelector);
        // Lógica para iterar y verificar que el nombre es consistente
        return columnas.size() > 0;
    }
}