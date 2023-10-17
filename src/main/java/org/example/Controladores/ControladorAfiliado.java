package org.example.Controladores;

import org.example.Entidades.UsuarioMembresia;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.Servicios.ServicioAfiliado;

import java.util.List;

public class ControladorAfiliado {
    //llamar a la clase que valida
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    //llamar al servicio
    ServicioAfiliado servicioAfiliado = new ServicioAfiliado();

    public void registrarAfiliado(String nombre, String documento, String correo, Integer ubicacion, double mensualidad) {
        //utilizar set del usuarioMembresia para validar datos
        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(ubicacion);
        this.usuarioMembresia.setCostoMensual(mensualidad);

        //si todos los datos del usuario se cargaraon con el set y no hubo errores,
        //entonces llamo al servicio para guardar los datos
        this.servicioAfiliado.registrarAfiliado(usuarioMembresia);

    }
    public void consultarAfiliados() {
        List<ModeloUsuarioMembresia> afiliados = servicioAfiliado.buscarAfiliados();
        for (ModeloUsuarioMembresia afiliado: afiliados) {
            System.out.println("Nombre: " + afiliado.getNombres());
            System.out.println("Documento: " + afiliado.getDocumento());
            System.out.println("Correo: " + afiliado.getCorreo());
            System.out.println("Ubicacion: " + afiliado.getUbicacion());

        }
    }

}
