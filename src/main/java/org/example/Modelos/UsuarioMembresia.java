package org.example.Modelos;

public class UsuarioMembresia extends Usuario {
    private Double costoMensual;

    public UsuarioMembresia() {
    }

    public UsuarioMembresia(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoMensual) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoMensual = costoMensual;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public void agregarInvitado(){

    }

}
