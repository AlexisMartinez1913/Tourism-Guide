package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaValidacionTest {
    EmpresaValidacion empresaValidacion;
    @BeforeEach
    public void configuraciones_iniciales(){
        System.out.println("Inicio prueba clase LocalValidacion");
        this.empresaValidacion = new EmpresaValidacion();
    }

    @Test
    public void validar_falla_caracteres_formato_nit(){
        String nit="10005324a0";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.empresaValidacion.validarNit(nit));
        Assertions.assertEquals(Mensaje.FORMATO_NIT,respuesta.getMessage());

    }
    @Test
    public void validar_falla_longitud_nit(){
        //preparar prueba
        String nitPrueba = "10005324400";
        //ejecutar
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->
                this.empresaValidacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.TAMANIO_NIT.getMensaje(), respuesta.getMessage());
    }
    @Test
    public void validar_nit_correcto(){
        String nombreNIT = "1234567891";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.empresaValidacion.validarNit(nombreNIT));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validar_nombre_correcto_empresa(){
        String nombrePrueba = "JhonyAlexisMartinezGarcia";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.empresaValidacion.valdarNombreEmpresa(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validar_falla_por_longitud_nombre() {
        String nombre="karinaassssssssssssssssssssssassss";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.empresaValidacion.valdarNombreEmpresa(nombre));
        Assertions.assertEquals(Mensaje.LONGITUD_NIT,respuesta.getMessage());
    }

}