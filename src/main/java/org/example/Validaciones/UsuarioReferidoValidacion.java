package org.example.Validaciones;

import org.example.Utilidades.Mensaje;

import java.time.LocalDate;
import org.example.Utilidades.Util;

public class UsuarioReferidoValidacion {
    Util util = new Util();

    public Boolean validarFechaInicioFinal(LocalDate fechaInicio, LocalDate fechaFinal) throws Exception{

        if(fechaFinal.isBefore(fechaInicio)){
            throw new Exception(Mensaje.FECHA_INICIO.getMensaje());
        }
        return true;
    }
    public Boolean validarFormatoFechaInicio(String fechaInicio) throws Exception{

        String expresionRegularFormatoFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        if(!util.buscarCoincidencia(fechaInicio, expresionRegularFormatoFecha)){
            throw new Exception(Mensaje.FECHA_FORMATO.getMensaje());
        }

        return true;
    }

}
