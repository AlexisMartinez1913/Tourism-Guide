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
    public void validad_falla_longitud_nombre(){
        //preparar prueba
        String nombrePrueba = "theuefachampionsleague";

        Exception respuesta = Assertions.assertThrows(Exception.class, ()->
                this.ofertaValidacion.validarTitulo(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_TITULO_OFERTA.getMensaje(), respuesta.getMessage());
    }
    @Test
    public void validar_diferencias_correctas_fechas(){
        String fechaInicio = "07/09/2023";
        String fechaFinal = "08/09/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha1 = LocalDate.parse(fechaInicio, formatter);
        LocalDate fecha2 = LocalDate.parse(fechaFinal, formatter);

        boolean respuesta = Assertions.assertDoesNotThrow(()->
                this.ofertaValidacion.validarFechaInicioFinal(fecha1,fecha2));
        Assertions.assertTrue(respuesta);
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
    public void validar_costo_persona_correcto(){
        Double costoPersona = 20.4;
        boolean respuesta = Assertions.assertDoesNotThrow(()->
                this.ofertaValidacion.validarCostoPersona(costoPersona));
        Assertions.assertTrue(respuesta);
    }
}