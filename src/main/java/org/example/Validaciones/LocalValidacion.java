package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

public class LocalValidacion {
    private Util util = new Util();
    public Boolean validarNit(String nit) throws Exception{
        String regexNumeros = "^[0-9]+$";
        if(!util.buscarCoincidencia(nit,regexNumeros)){
            throw new Exception(Mensaje.FORMATO_NIT.getMensaje());
        }
        if(nit.length()!=10){
            throw new Exception("El campo nit debe tener  10 dígitos");
        }
        return true;

    }
    public Boolean valdarNombreEmpresa(String nombre) throws Exception{
        if(nombre.length()>30){
            throw new Exception(Mensaje.LONGITUD_NIT.getMensaje());
        }
        return true;
    }
}
