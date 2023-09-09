package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    //preparar prueba
    ReservaValidacion reservaValidacion;
    @BeforeEach
    public void configurarPruebasIniciales(){
        System.out.println("Inicio prueba reservas");
        this.reservaValidacion = new ReservaValidacion();

    }
    @Test
    public void validar_formato_correcto_fecha_reserva(){
        String fechaPrueba = "08/09/2023";
        boolean respuesta = Assertions.assertDoesNotThrow(()-> this.reservaValidacion.validarFormatoFecha(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validar_formato_incorrecto_fecha_reserva(){
        String fechaPrueba = "08/09/2023";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.reservaValidacion.validarFormatoFecha(fechaPrueba));
        Assertions.assertEquals(Mensaje.FECHA_FORMATO.getMensaje(), respuesta.getMessage());
    }
    @Test
    public void validar_numero_personas_correcto(){
        Integer numeroPersonas = 4;
        boolean respuesta = Assertions.assertDoesNotThrow(()-> this.reservaValidacion.validarNumeroPersonas(numeroPersonas));
        Assertions.assertTrue(respuesta);
    }

}