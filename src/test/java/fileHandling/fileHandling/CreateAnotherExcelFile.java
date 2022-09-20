package fileHandling.fileHandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAnotherExcelFile {

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet("SheetExample");
        XSSFRow row1 =sheet1.createRow(0);
        XSSFRow row2 =sheet1.createRow(1);
        XSSFRow row3 =sheet1.createRow(2);


        XSSFCell cell1 =row1.createCell(0);
        XSSFCell cell2 =row1.createCell(1);
        XSSFCell cell3 =row1.createCell(2);

        XSSFCell cell1_1 =row2.createCell(0);
        XSSFCell cell2_2 =row2.createCell(1);
        XSSFCell cell3_3 =row2.createCell(2);

        XSSFCell cell1_1_1 =row3.createCell(0);
        XSSFCell cell2_2_2 =row3.createCell(1);
        XSSFCell cell3_3_3 =row3.createCell(2);

        cell1.setCellValue("Name");
        cell2.setCellValue("Email");
        cell3.setCellValue("MobileNumber");

        cell1_1.setCellValue("Fouad Mesrane");
        cell2_2.setCellValue("Fouadmesrane@gmail.com");
        cell3_3.setCellValue(7207575814L);

        cell1_1_1.setCellValue("Asmaa Dahmani");
        cell2_2_2.setCellValue("Asmaadahmani7@gmail.com");
        cell3_3_3.setCellValue(7205675814L);

        // Creating File
        File f = new File("C:\\Users\\fouad\\IdeaProjects\\JavaTrial2\\Java\\TestFile2.xlsx");
        FileOutputStream fo = null;
        try {
             fo= new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook.write(fo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File Created");
    }


}
