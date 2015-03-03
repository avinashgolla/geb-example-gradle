import geb.Module
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory

class MenuModule extends Module{

    def getCellValue(String path, String sheetName,
                                      int rowNum, int cellNum) {

        FileInputStream fis = new FileInputStream(path)
        Workbook wb = WorkbookFactory.create(fis)
        Sheet sh = wb.getSheet(sheetName)
        String cellValue = sh.getRow(rowNum).getCell(cellNum).getStringCellValue()
        return cellValue


    }



}
