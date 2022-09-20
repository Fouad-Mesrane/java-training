package fileHandling.fileHandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingExcelFile {

    public static void main(String[] args) {
        // Step 1: create a workbook -> .xlxs

        XSSFWorkbook workbook = new XSSFWorkbook();
        // create sheet in the workbook
        XSSFSheet sheet1 = workbook.createSheet("First Sheet");

        // Create row(s) in sheet1
        XSSFRow row1 = sheet1.createRow(0);

        // create first column in row 1
        XSSFCell cell1= row1.createCell(0);
        XSSFCell cell2= row1.createCell(1);
        XSSFCell cell3= row1.createCell(2);

        //Insert values in each cell created
        cell1.setCellValue("Name");
        cell2.setCellValue("Email");
        cell3.setCellValue("MobileNumber");
        // all steps above are just virtual
        // Create file class object
        File f = new File("C:\\Users\\fouad\\IdeaProjects\\JavaTrial2\\Java\\TestFile.xlsx");
        FileOutputStream fo = null;
        try {
             fo = new FileOutputStream(f); // the file will be created on this code
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(fo); // thi method will write on the excel file
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fo.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }
        System.out.println("File Created");

    }


}
