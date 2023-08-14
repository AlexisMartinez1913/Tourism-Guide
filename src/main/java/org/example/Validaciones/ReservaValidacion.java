package org.example.Validaciones;

import org.example.Utilidades.Mensaje;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaValidacion {
    public Boolean validarFecha(LocalDate fechaReserva) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(fechaReserva == null){
            throw new Exception(Mensaje.FECHAS_NULAS.getMensaje());
        }
        
        String fechaReservaStr = fechaReserva.format(formatter);

        if(!fechaReserva.format(formatter).equals(fechaReservaStr)){
            throw new Exception(Mensaje.FECHA_FORMATO.getMensaje());
        }

        return true;
    }
    public Boolean validarNumeroPersonas(Integer numPersonas) throws Exception{
        if(numPersonas>4){
            throw new Exception(Mensaje.CANTIDAD_PERSONAS_RESERVA.getMensaje());
        }
        return true;
    }
}
