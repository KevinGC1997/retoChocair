package com.exito.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

import static com.exito.utils.LecturaExcel.leerExcel;

public class prueba {


    /*for (int i = 1; i < a; i++) {
        String excelFilePath = "datos/Logs.xlsx";
        String sheetName = "Log";
        int rowIndex = i; // índice de la fila que se desea leer
        int columnIndex = 3; // índice de la columna que se desea leer
        try (Workbook workbook = WorkbookFactory.create(new FileInputStream(excelFilePath))) {
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(columnIndex);
            DataFormatter formatter = new DataFormatter();
            int cellValue = Integer.parseInt(formatter.formatCellValue(cell));


            if (lista.contains(cellValue)) {
                System.out.println("El número " + cellValue + " se encuentra en la lista."+"Lista     "+ lista);
            } else {
                System.out.println("El número " + cellValue + " no se encuentra en la lista."+"Lista     "+ lista);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }

    }*/

    }



