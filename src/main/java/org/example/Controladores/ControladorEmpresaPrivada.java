package org.example.Controladores;

import org.example.Entidades.EmpresaCultural;
import org.example.Entidades.EmpresaPrivada;
import org.example.ModeloDatos.ModeloEmpresaCultural;
import org.example.ModeloDatos.ModeloEmpresaPrivada;
import org.example.Servicios.ServicioEmpresaCultural;
import org.example.Servicios.ServicioEmpresaPrivada;

import java.util.List;

public class ControladorEmpresaPrivada {

    EmpresaPrivada empresaPrivada = new EmpresaPrivada();
    //llamar a la clase que valida
    ServicioEmpresaPrivada servicioEmpresaPrivada = new ServicioEmpresaPrivada();

    public void registrarEmpresaPrivada(String nit, String nombre, Integer ubicacion, String descripcion, String nombreRepresentanteLegal, String cedulaRepresentanteLegal) {
        this.empresaPrivada.setNit(nit);
        this.empresaPrivada.setNombre(nombre);
        this.empresaPrivada.setUbicacion(ubicacion);
        this.empresaPrivada.setDescripcion(descripcion);
        this.empresaPrivada.setNombreRepresentanteLegal(nombreRepresentanteLegal);
        this.empresaPrivada.setCedulaRepresentanteLegal(cedulaRepresentanteLegal);


        this.servicioEmpresaPrivada.registrarEmpresaPrivada(empresaPrivada);

    }
    public void consultarEmpresaPrivada() {
        List<ModeloEmpresaPrivada> empresaPrivada = servicioEmpresaPrivada.buscarEmpresaPrivada();
        for (ModeloEmpresaPrivada empresaPrivada1: empresaPrivada) {
            System.out.println("Nit: " + empresaPrivada1.getNit());
            System.out.println("Nombre: " + empresaPrivada1.getNombre());
            System.out.println("Ubicación: " + empresaPrivada1.getUbicacion());
            System.out.println("Descripción: " + empresaPrivada1.getDescripcion());
            System.out.println("Nombre Representante Legal: " + empresaPrivada1.getNombreRepresentateLegal());
            System.out.println("Cedula Representante Legal: " + empresaPrivada1.getCedulaRepresentanteLegal());


        }
    }
}
