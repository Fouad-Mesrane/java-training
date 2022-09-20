package fileHandling.fileHandling;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcelFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\fouad\\IdeaProjects\\JavaTrial2\\Java\\TestFile2.xlsx");
        FileInputStream fi = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fi);
        Sheet sheet = workbook.getSheet("SheetExample");
        Row row1= sheet.getRow(0);

        for (int i = 0; i<row1.getLastCellNum();i++){
           Cell cell = row1.getCell(i);

           switch (cell.getCellType()){
               case STRING -> {
                   System.out.println(cell.getStringCellValue());

               }
               case NUMERIC -> {
                   System.out.println(cell.getNumericCellValue());

               }
               case BLANK -> System.out.println("--Blank Cell--");
           }
        }
    }


}
