package org.example.Controladores;

import org.example.Entidades.EmpresaCultural;
import org.example.Servicios.ServicioEmpresaCultural;

public class ControladorEmpresaCultural {
    EmpresaCultural empresaCultural = new EmpresaCultural();
    //llamar a la clase que valida
    ServicioEmpresaCultural servicioEmpresaCultural = new ServicioEmpresaCultural();

    public void registrarEmpresaCultural(String nit, String nombre, Integer ubicacion, String descripcion, String entidad, String mision, String email, Integer numeroContacto) {
        this.empresaCultural.setNit(nit);
        this.empresaCultural.setNombre(nombre);
        this.empresaCultural.setUbicacion(ubicacion);
        this.empresaCultural.setDescripcion(descripcion);
        this.empresaCultural.setEntidad(entidad);
        this.empresaCultural.setMision(mision);
        this.empresaCultural.setEmailContacto(email);
        this.empresaCultural.setNumeroContacto(numeroContacto);

        this.servicioEmpresaCultural.registrarEmpresaCultural(empresaCultural);

    }
}
