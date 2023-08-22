package org.example.Validaciones;

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

    }
    @Test
    public void validarNombreFallaNombreCaracteres(){

    }
    @Test
    public void validarNombreCorrecto(){

    }
    //


}