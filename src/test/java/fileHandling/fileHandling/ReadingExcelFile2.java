package fileHandling.fileHandling;

import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ReadingExcelFile2 {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\fouad\\OneDrive\\Desktop\\Testing courses\\Working Projects\\OpenCartProject\\Pavan OpenCartProject\\OpenCart-TestCases.xlsx");
        FileInputStream fi = new FileInputStream(f);
        Workbook workbook = WorkbookFactory.create(fi);
       Sheet sheet = workbook.getSheet("Register");
            for (int i =0; i< sheet.getLastRowNum()+1; i++){
                Row row = sheet.getRow(i);

                for (int j =0; j< row.getLastCellNum(); j++){
                    Cell cell = row.getCell(j);
                    switch(cell.getCellType()){
                        case STRING -> {
                            System.out.println(cell.getStringCellValue());
                        }
                        case NUMERIC -> {
                            System.out.println(cell.getNumericCellValue());

                        }
                        case BLANK -> {
                            System.out.println("--Blank--");
                        }

                    }

                }
            }

    }
}
