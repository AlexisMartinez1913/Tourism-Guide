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
        if(fechaInicio.isAfter(fechaFinal)){
            throw new Exception("La fecha de inicio no puede ser mayor que la fecha de fin");
        }
        return true;
    }
    public Boolean validarFormatoFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        if(!fechaInicio.equals(formatter)){
            throw new Exception("el formato debe ser DD/MM/YYYY");
        }
        if(!fechaFin.equals(formatter)){
            throw new Exception("el formato debe ser DD/MM/YYYY");
        }

        LocalDate validar = LocalDate.parse("", DateTimeFormatter.ofPattern("DD/MM/YYYY"));

        return true;
    }
    public Boolean validarCostoPersona(Double costoPersona) throws Exception{
        if(costoPersona<0){
            throw new Exception("El costo no puede ser negativo");
        }
        return  true;
    }
}
