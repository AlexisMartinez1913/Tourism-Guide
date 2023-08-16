package org.example.Utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public Boolean buscarCoincidencia(String cadena, String expresionRegular){
        String regexEmail = expresionRegular;
        Pattern patron = Pattern.compile(regexEmail);
        // buscar y hacer coincidir la expresión regular en
        // la secuencia de caracteres proporcionada
        Matcher coincidencia = patron.matcher(cadena);
        if(coincidencia.matches()){
            return true;
        }
        else {
            return false;
        }
    }

    public LocalDate convertirString(String fecha, String formato){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDate fechaForm = LocalDate.parse(fecha,formatter);
        return  fechaForm;
    }
}
