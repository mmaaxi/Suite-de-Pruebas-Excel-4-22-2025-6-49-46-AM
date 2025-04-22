import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;
import java.io.FileInputStream;

public class tc_011Page {

    WebDriver driver;
    private String excelFilePath = "path/to/ClaimAccountingReport.xlsx";

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportReport() {
        // Código para automatizar el proceso de exportación del reporte
    }

    public boolean isFileGenerated() {
        File file = new File(excelFilePath);
        return file.exists();
    }

    public boolean isColumnPresentInCorrectPosition() {
        try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);
            for (Cell cell : headerRow) {
                if ("Folio Pre solicitud".equals(cell.getStringCellValue())) {
                    Cell nextCell = headerRow.getCell(cell.getColumnIndex() + 1);
                    return "Folio de Pago".equals(nextCell.getStringCellValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getColumnName() {
        try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);
            for (Cell cell : headerRow) {
                if ("Folio de Pago".equals(cell.getStringCellValue())) {
                    return cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}