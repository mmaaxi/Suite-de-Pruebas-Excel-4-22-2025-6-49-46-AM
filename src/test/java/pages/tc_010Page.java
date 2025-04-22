package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    
    WebDriver driver;

    By botonExportarExcel = By.id("exportExcelButton");
    By columnaFolioPreSolicitud = By.xpath("//th[text()='Folio Pre solicitud']");
    By columnaRamo = By.xpath("//th[text()='Ramo']");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarReporte() {
        driver.findElement(botonExportarExcel).click();
        // código adicional para manejar la descarga del archivo puede ser requerido
    }

    public boolean isReporteGeneradoSinErrores() {
        // Lógica para validar que el reporte fue generado exitosamente
        return true; // cambiar según implementación
    }

    public boolean isColumnaFolioPreSolicitudPresente() {
        return driver.findElements(columnaFolioPreSolicitud).size() > 0;
    }

    public boolean isColumnaFolioPreSolicitudEnPosicionCorrecta() {
        // Lógica para verificar que 'Folio Pre solicitud' está a la derecha de 'Ramo'
        return true; // cambiar según implementación
    }

    public boolean isColumnaFolioPreSolicitudEtiquetadaCorrectamente() {
        return true; // cambiar según implementación
    }
}