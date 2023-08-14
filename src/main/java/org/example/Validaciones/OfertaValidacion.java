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

        if(fechaInicio.isAfter(fechaFinal)){
            throw new Exception(Mensaje.FECHA_INICIO.getMensaje());
        }
        return true;
    }
    public Boolean validarFormatoFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(fechaInicio == null || fechaFin == null){
            throw new Exception(Mensaje.FECHAS_NULAS.getMensaje());
        }
        String fechaInicioStr = fechaInicio.format(formatter);
        String fechaFinStr = fechaFin.format(formatter);

        if(!fechaInicio.format(formatter).equals(fechaInicioStr)){
            throw new Exception(Mensaje.FECHA_FORMATO.getMensaje());
        }
        if(!fechaFin.format(formatter).equals(fechaFinStr)){
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
