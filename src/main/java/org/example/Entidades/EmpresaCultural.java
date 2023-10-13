package org.example.Entidades;

import org.example.Entidades.Interfaces.IReporte;

public class EmpresaCultural extends Empresa implements IReporte {
    private String entidad;
    private String mision;
    private String emailContacto;
    private String numeroContacto;


    public EmpresaCultural() {
    }

    public EmpresaCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String entidad, String mision, String emailContacto, String numeroContacto) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
        this.emailContacto = emailContacto;
        this.numeroContacto = numeroContacto;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public Double cobrar(){

        return null;
    }


    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id, String datos) {

    }
}
