package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    //preparar la prueba
    UsuarioValidacion usuarioValidacion;
    @BeforeEach //funcionalidad adicional, caracteristicas especiales
    public void configurarPrubasIniciales(){
        System.out.println("Ejecución prueba");
        this.usuarioValidacion = new UsuarioValidacion();
    }
    @Test
    public void validarNombreFallaNombreCorto(){
        //preparar prueba
        String nombrePrueba = "AlexisG";
        //ejecutar
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->
                this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(), respuesta.getMessage());

        //verificar

    }
    @Test
    public void validarNombreFallaNombreCaracteres(){
        String nombrePrueba = "12";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(), respuesta.getMessage());

    }
    @Test
    public void validarNombreCorrecto(){
        String nombrePrueba = "AlexisGarcia";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);

    }
    @Test
    public void validarCorreoCorrecto(){
        String correoPrueba = "jhonyalexis100@gmail.com";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarCorreoIncorrecto(){
        String correoPrueba = "alexiscom";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_CORREO.getMensaje(), respuesta.getMessage());
    }



}