package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfertaValidacion {
    private Util util = new Util();

    public Boolean validarTitulo(String titulo) throws Exception{
        if(titulo.length()>20){
            throw new Exception(Mensaje.FORMATO_TITULO_OFERTA.getMensaje());
        }
        return true;

    }
    public Boolean validarFechaInicioFinal(LocalDate fechaInicio, LocalDate fechaFinal) throws Exception{
        if(fechaInicio == null || fechaFinal == null){
            throw new Exception(Mensaje.FECHAS_NULAS.getMensaje());
        }

        if(fechaFinal.isBefore(fechaInicio)){
            throw new Exception(Mensaje.FECHA_INICIO.getMensaje());
        }
        return true;
    }
    public Boolean validarFormatoFechaInicio(String fechaInicio) throws Exception{

        String expresionRegularFormatoFecha = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
        if(fechaInicio == null){
            throw new Exception(Mensaje.FECHAS_NULAS.getMensaje());
        }

        if(!util.buscarCoincidencia(fechaInicio, expresionRegularFormatoFecha)){
            throw new Exception(Mensaje.FECHA_FORMATO.getMensaje());
        }

        return true;
    }
    public Boolean validarFormatoFechaFin(String fechaFinal) throws Exception{
        String expresionRegularFormatoFecha = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
        if(fechaFinal == null){
            throw new Exception(Mensaje.FECHAS_NULAS.getMensaje());
        }

        if(!util.buscarCoincidencia(fechaFinal, expresionRegularFormatoFecha)){
            throw new Exception(Mensaje.FECHA_FORMATO.getMensaje());
        }


        return true;
    }
    public Boolean validarCostoPersona(Double costoPersona) throws Exception{
        if(costoPersona<0){
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        }
        return  true;
    }
}
