package com.exito.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatosExcel {

    private static HSSFWorkbook book;
    private static FileInputStream file;
    private FileOutputStream fileWrite;

    public String leerDatoExcel(String hoja, String ruta, int rowValue, int cellValue) throws IOException {

        String valor;
        file = new FileInputStream(new File(ruta));
        book = new HSSFWorkbook(file);
        Sheet sheet = book.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        valor = cell.getStringCellValue();
        book.close();
        file.close();
        return valor;
    }
}
