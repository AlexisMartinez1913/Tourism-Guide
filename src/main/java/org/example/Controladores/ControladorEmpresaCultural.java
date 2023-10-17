package org.example.Controladores;

<<<<<<< HEAD
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
=======
public class ControladorEmpresaCultural {
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0
}
