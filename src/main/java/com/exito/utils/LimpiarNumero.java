package com.exito.utils;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class LimpiarNumero {

    String Texto;

    public LimpiarNumero(String texto) {
            Texto = texto;
    }
    public static String LimpiarNumero(String Texto) {

        List<Character> list = new ArrayList<>();
        String[] arreglo = Texto.split("\\$");
        String l = arreglo[1];
        String k = l.replaceAll(" ", "");
        String f = k.replaceAll("\\.", "");
        System.out.println(f);

        return f;
    }

}







