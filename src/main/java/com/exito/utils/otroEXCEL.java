package com.exito.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class otroEXCEL {


  /*  public otroEXCEL() throws IOException, InvalidFormatException {
        String excelFilePath = "datos/Logs.xlsx";
        String sheetName = "Log";
        int rowIndex = 0; // índice de la fila que se desea leer
        int columnIndex = 3; // índice de la columna que se desea leer

        Workbook workbook = WorkbookFactory.create(new FileInputStream(excelFilePath) {
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(columnIndex);
            DataFormatter formatter = new DataFormatter();
            cellValue = Integer.parseInt(formatter.formatCellValue(cell));
        }

    }*/

}
