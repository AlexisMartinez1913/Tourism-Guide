package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    OfertaValidacion ofertaValidacion;
    @BeforeEach
    public void configuraciones_iniciales(){
        System.out.println("Inicio prueba clase OfertaValidacion");
        this.ofertaValidacion = new OfertaValidacion();
    }
    @Test
    public void validar_falla_longitud_nombre(){
        //preparar prueba
        String nombrePrueba = "theuefachampionsleague";

        Exception respuesta = Assertions.assertThrows(Exception.class, ()->
                this.ofertaValidacion.validarTitulo(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_TITULO_OFERTA.getMensaje(), respuesta.getMessage());
    }
    @Test
    public void validar_titulo(){
        String titulo="aebcdefgh";
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarTitulo(titulo));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validar_diferencia_fechas_correctas(){
        LocalDate fechaInicio= LocalDate.of(2021,11,11);
        LocalDate fechaFin= LocalDate.of(2021,12,11);
        boolean respuesta= Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarFechaInicioFinal(fechaInicio, fechaFin));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validar_diferencias_de_fechas_incorrectas(){
        LocalDate fechaInicio= LocalDate.of(2021,12,11);
        LocalDate fechaFin= LocalDate.of(2021,11,11);
        Exception respuesta = Assertions.assertThrows(Exception.class, () ->
                this.ofertaValidacion.validarFechaInicioFinal(fechaInicio, fechaFin));
        Assertions.assertEquals(Mensaje.FECHA_INICIO, respuesta.getMessage());
    }

    @Test
    public void validar_formato_correcto_fecha_inicio(){
        String fechaInicio = "07/09/2023";

        boolean respuesta = Assertions.assertDoesNotThrow(()->
                this.ofertaValidacion.validarFormatoFechaInicio(fechaInicio));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validar_formato_correcto_fecha_final(){
        String fechaFinal = "10/09/2023";

        boolean respuesta = Assertions.assertDoesNotThrow(()->
                this.ofertaValidacion.validarFormatoFechaFin(fechaFinal));
        Assertions.assertTrue(respuesta);
    }



    @Test
    public void validacion_costo(){
        Double costo=1234123D;
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarCostoPersona(costo));
        Assertions.assertTrue(respuesta);
    }
}