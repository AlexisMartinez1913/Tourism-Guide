package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaValidacion {
    Util util = new Util();
    public Boolean validarFormatoFecha(String fechaReserva) throws Exception{

        String expresionFormatoFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if(fechaReserva == null){
            throw new Exception(Mensaje.FECHAS_NULAS.getMensaje());
        }

        if(!util.buscarCoincidencia(fechaReserva, expresionFormatoFecha)){
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
    //Tenga en cuenta que a cada reserva se le debe cobrar un IVA del 19%
    //aplicada sobre el costoTotal previamente calculado
    public double costoTotalConIVA(double costoTotal){
        double IVA = 0.19;
        double costoMasIva = costoTotal *(1+IVA);
        return costoMasIva;

    }
}
