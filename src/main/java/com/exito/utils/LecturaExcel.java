package com.exito.utils;

import com.ibm.icu.impl.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LecturaExcel {

    public static Object[][] leerExcel(String path, String sheets) throws IOException, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        int iRow=1;
        int iColumnas=0;

        File fl= new File(path);
        InputStream inp= new FileInputStream(fl);
        Workbook wb= WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheet(sheets);
        Row row= sheet.getRow(iRow);
        int countRow= sheet.getLastRowNum();

        String [][] data= new String[countRow][4];
        while (row!=null){
            while (iColumnas<4){
                Cell cell=row.getCell(iColumnas);
                String value= cell.getStringCellValue();

                data[(iRow-1)][iColumnas]=value;

                iColumnas++;
            }
            iColumnas=0;
            iRow++;
            row= sheet.getRow(iRow);


        }



        return data;


    }
}
