package org.example.Validaciones;


import org.example.Utilidades.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {
    private Util util = new Util();
    //metodos ordinarios
    public Boolean validarNombre(String names) throws Exception{
        //expresion regular
        String regexLetras = "^[a-zA-Z]+$";

        if (!util.buscarCoincidencia(names,regexLetras)){
            throw new Exception("El nombre no debe llevar numeros");
        }
        if(names.length()<10){
            throw new Exception("El nombre debe ser mayor a 10 digitos");
        }
        return true;
    }
    public Boolean validarUbicacion(Integer ubicacion){
        return true;
    }
    public Boolean validarCorreo(String correo) throws Exception{
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(regexEmail);
        // buscar y hacer coincidir la expresión regular en
        // la secuencia de caracteres proporcionada
        Matcher coincidencia = patron.matcher(correo);
        if(coincidencia.matches()){
            return true;
        }
        else {
            throw new Exception("El nombre no puede contener numeros");
        }
    }
}
