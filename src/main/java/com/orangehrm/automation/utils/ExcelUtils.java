package com.orangehrm.automation.utils;

import com.orangehrm.automation.constants.Framework;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelUtils {
    FileInputStream fileInputStream;
    XSSFWorkbook xssfWorkbook;
    XSSFSheet xssfSheet;
    XSSFRow xssRow;
    XSSFCell xssfCell;

    public void initExcel(String sheetName) throws IOException {
        fileInputStream =new FileInputStream(Framework.Paths.PROJECT_PATH+Framework.Paths.CONFIG_READER);
        xssfWorkbook=new XSSFWorkbook(fileInputStream);
        xssfSheet=xssfWorkbook.getSheet(sheetName);
    }

//      try {
//        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\TestData.xlsx");
//        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
//        XSSFSheet xssfSheet=xssfWorkbook.getSheet("LoginData");
//        int rows=xssfSheet.getLastRowNum();
//        int columns=xssfSheet.getRow(1).getLastCellNum();
//        System.out.println("ROW:"+rows);
//        System.out.println("COLUMNS: "+columns);
//
//        for (int i = 1; i <=rows; i++) {
//            XSSFRow xssfRow=xssfSheet.getRow(i);
//
//            for (int j = 0; j < columns ; j++) {
//                XSSFCell xssfCell =xssfRow.getCell(j);
//                System.out.print(xssfCell.toString()+" ");
//            }
//            System.out.println();
//        }
//        xssfWorkbook.close();
//        fileInputStream.close();
//
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }
//
//        try {
//        FileOutputStream fileOutputStream= null;
//        try {
//            fileOutputStream = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Data.xlsx");
//        } catch (FileNotFoundException ex) {
//            throw new RuntimeException(ex);
//        }
//        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
//        XSSFSheet xssfSheet=xssfWorkbook.createSheet("Employee");
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int numberOfRow=scanner.nextInt();
//        System.out.println();
//        System.out.println("Enter number of columns: ");
//        int numberOfColumns=scanner.nextInt();
//
//
//        for (int i = 0; i <=numberOfRow; i++) {
//            XSSFRow xssfRow=xssfSheet.createRow(i);
//
//            for (int j = 0; j < numberOfColumns ; j++) {
//                XSSFCell xssfCell =xssfRow.createCell(j);
//                System.out.print("Enter cell value: ");
//                xssfCell.setCellValue(scanner.next());
//            }
//            System.out.println();
//        }
//        xssfWorkbook.write(fileOutputStream);
//        xssfWorkbook.close();
//        fileOutputStream.close();
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }

}
