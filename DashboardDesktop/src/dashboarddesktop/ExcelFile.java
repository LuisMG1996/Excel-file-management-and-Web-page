/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddesktop;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.openxml4j.opc.OPCPackage;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author lmontesg
 */
public class ExcelFile{
    
    String filePath;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    /**
     *
     * @param path
     * @exception if a file cannot be found, load or read
     */
    public ExcelFile(String path){
        filePath = path;
        try {
            File file = new File(filePath);
            OPCPackage opcPackage = OPCPackage.open(file.getAbsoluteFile());
            workbook = new XSSFWorkbook(opcPackage);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            System.out.println("Error en carga o lectura de archivo " + e);
        }
    }
    
    public int countRows(String value){
        int count;
        Row row;
        Cell cell;
        //--------
        count = 0;
     
        //Search across the "A" column if some cell value match with value   
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++){
            row = sheet.getRow(rowIndex);
            if(row != null){
                cell = row.getCell(0);
                if (cell.getStringCellValue().compareTo(value) == 0) count++;
            }
        }
        System.out.println("Celdas con " + value + "son " + count);
        return count;
    }
    
}
