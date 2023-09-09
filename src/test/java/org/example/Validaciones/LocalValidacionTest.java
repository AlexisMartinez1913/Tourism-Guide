package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {
    LocalValidacion localValidacion;
    @BeforeEach
    public void configuraciones_iniciales(){
        System.out.println("Inicio prueba clase LocalValidacion");
        this.localValidacion = new LocalValidacion();
    }

    @Test
    public void validar_falla_caracteres_formato_nit(){
        String nitPrueba = "7A27062004";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.localValidacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);

    }
    @Test
    public void validar_falla_longitud_nit(){
        //preparar prueba
        String nitPrueba = "12";
        //ejecutar
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->
                this.localValidacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.TAMANIO_NIT.getMensaje(), respuesta.getMessage());
    }
    @Test
    public void validar_nit_correcto(){
        String nombreNIT = "1234567891";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.localValidacion.validarNit(nombreNIT));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validar_nombre_correcto_empresa(){
        String nombrePrueba = "JhonyAlexisMartinezGarcia";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.localValidacion.valdarNombreEmpresa(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

}