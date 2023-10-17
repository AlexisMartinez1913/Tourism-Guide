package org.example.Entidades;

import org.example.Entidades.Interfaces.IAnalitica;
import org.example.Entidades.Interfaces.IReporte;
import org.example.Validaciones.UsuarioValidacion;

import java.time.LocalDate;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica<UsuarioMembresia> {
    private Double costoMensual;

    /*
    * atributos para agregar invitados*/
    private Usuario invitado;
    private LocalDate fechaInvitacion;

    public UsuarioMembresia() {
    }

    public UsuarioMembresia(Integer id, String documento, String nombres, String correo, Integer ubicacion, String contrasena, UsuarioValidacion usuarioValidacion, Double costoMensual) {
        super(id, documento, nombres, correo, ubicacion, contrasena, usuarioValidacion);

        this.costoMensual = costoMensual;
        // Validar que el costo mensual no supere los $100000 COP
        if(costoMensual<=100000) {
            this.costoMensual = costoMensual;
        } else {
            throw new IllegalArgumentException("El costo mensual no debe superar $100000 COP");
        }
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
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

    @Override
    public void limpiarDatos(UsuarioMembresia datos) {

    }

    @Override
    public void calcularDispersion(UsuarioMembresia datos) {

    }

    /* Metodos:
    Yo como usuario que paga membresía puedo referenciar al mes un
      usuario invitado que puede acceder desde la fecha de invitación y HASTA
          POR 5 DIAS a todos los descuentos de la app
    */
    public void referenciarUsuarioInvitado(Usuario invitado) {
        this.invitado = invitado;
        this.fechaInvitacion = LocalDate.now();
    }
    public boolean AccesoADescuentosReferido() {
        if (invitado != null) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaVencimiento = fechaInvitacion.plusDays(5);
            return !fechaActual.isAfter(fechaVencimiento);
        }
        return false;
    }
    public void agregarReferido(String agregarCedulaReferido){

    }

}
