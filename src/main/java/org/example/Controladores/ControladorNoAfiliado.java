package org.example.Controladores;

import org.example.Entidades.UsuarioPorEvento;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.ModeloDatos.ModeloUsuarioPorEvento;
import org.example.Servicios.ServicioNoAfiliado;

import java.util.List;

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
    public void consultarNoAfiliados() {
        List<ModeloUsuarioPorEvento> usuarioNoAfiliado = servicioNoAfiliado.consultarUsuarioPorEvento();
        for (ModeloUsuarioPorEvento noAfiliado: usuarioNoAfiliado) {
            System.out.println("Documento: " + noAfiliado.getDocumento());
            System.out.println("Nombre: " + noAfiliado.getNombres());
            System.out.println("Correo: " + noAfiliado.getCorreo());
            System.out.println("Ubicacion: " + noAfiliado.getUbicacion());
            System.out.println("Costo Por Evento: " + noAfiliado.getCostoEvento());

        }
    }
}

