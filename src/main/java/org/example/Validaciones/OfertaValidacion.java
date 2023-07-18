package org.example.Validaciones;

import java.time.LocalDate;

public class OfertaValidacion {
    public Boolean validarTitulo(String titulo){
        return true;
    }
    public Boolean validarFechaInicio(LocalDate fechaInicio){
        return true;
    }
    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin){
        return true;
    }
    public Boolean validarCostoPersona(Double costoPersona){
        return  true;
    }
}
