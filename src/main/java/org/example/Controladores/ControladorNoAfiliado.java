package org.example.Controladores;

import org.example.Entidades.UsuarioPorEvento;
import org.example.Servicios.ServicioNoAfiliado;

public class ControladorNoAfiliado {
    UsuarioPorEvento usuarioPorEvento = new UsuarioPorEvento();
    //llamar al servicio
    ServicioNoAfiliado servicioNoAfiliado = new ServicioNoAfiliado();
    public void registrarNoAfiliado(String documento, String nombres, String correo, Integer ubicacion, double costoPorEvento) {
        this.usuarioPorEvento.setDocumento(documento);
        this.usuarioPorEvento.setNombres(nombres);
        this.usuarioPorEvento.setCorreo(correo);
        this.usuarioPorEvento.setUbicacion(ubicacion);
        this.usuarioPorEvento.setCostoPorEvento(costoPorEvento);

        this.servicioNoAfiliado.registrarNoAfiliado(usuarioPorEvento);

    }
}

