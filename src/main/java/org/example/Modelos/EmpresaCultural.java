package org.example.Modelos;

public class EmpresaCultural extends Empresa {
    private String entidad;
    private String mision;
    //private String emailContacto;
    //private String numeroContacto;


    public EmpresaCultural() {
    }

    public EmpresaCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String entidad, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
    }
    @Override
    public Double cobrar(){

        return null;
    }




}
