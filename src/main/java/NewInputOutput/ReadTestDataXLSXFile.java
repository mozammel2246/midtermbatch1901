package NewInputOutput;

import utility.XLSXFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTestDataXLSXFile {

    /**
     * @author Jahidul Islam
     * 1. Using utility.XLSXFileReader class read data/testData.xlsx file
     * 2. And print values in console
     * Hints all methods required are implemented in utility.XLSXFileReader class
     * all you need to do is use thsoe methods and store XLSX file in a
     * two dimensional array, later you can get the required value from the
     * that two dimensional array.
     * !!!! That's true I did not show you exactly this but you know all the
     * necessary components of it.
     *
     * */
    public static void main(String[] args) throws Exception {
       XLSXFileReader xlReader = new XLSXFileReader();
       xlReader.setExcelFile("C:\\Users\\Mozammel\\Desktop\\Batch1901\\midtermbatch1901\\data\\testData.xlsx");

       String[][] data = xlReader.getExcelSheetData("sheet1");
        System.out.println(data[0][0] +" "+ data[0][1]);
        System.out.println(data[1][0] +" "+ data[1][1]);
        System.out.println(data[2][0] +" "+ data[2][1]);

    }
}
