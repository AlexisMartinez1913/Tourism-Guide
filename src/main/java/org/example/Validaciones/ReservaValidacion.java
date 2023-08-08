package org.example.Validaciones;

import java.time.LocalDate;

public class ReservaValidacion {
    public Boolean validarFecha(LocalDate fechaReserva){
        return true;
    }
    public Boolean validarNumeroPersonas(Integer numPersonas) throws Exception{
        if(numPersonas>4){
            throw new Exception("No pueden ser mas de 4 personas");
        }
        return true;
    }
}
