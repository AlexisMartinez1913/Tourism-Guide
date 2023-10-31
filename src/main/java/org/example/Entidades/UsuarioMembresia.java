package org.example.Entidades;

import org.example.Entidades.Interfaces.IAnalitica;
import org.example.Entidades.Interfaces.IReporte;
import org.example.Validaciones.UsuarioValidacion;

import java.time.LocalDate;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica<UsuarioMembresia> {
    private Double costoMensual;

    /*
    * atributos para agregar invitados*/
    private String nombreInvitado;
    private Integer cedulaInvitado;
    private LocalDate fechaInvitacion;

    public UsuarioMembresia() {
    }

    public UsuarioMembresia(Integer id, String documento, String nombres, String correo, Integer ubicacion, String contrasena, UsuarioValidacion usuarioValidacion, Double costoMensual, String nombreInvitado, Integer cedulaInvitado, LocalDate fechaInvitacion) {
        super(id, documento, nombres, correo, ubicacion, contrasena, usuarioValidacion);
        this.costoMensual = costoMensual;
        this.nombreInvitado = nombreInvitado;
        this.cedulaInvitado = cedulaInvitado;
        this.fechaInvitacion = fechaInvitacion;

        /*Validar que el costo mensual no supere los $100000 COP
        if(costoMensual<=100000) {
            this.costoMensual = costoMensual;
        } else {
            throw new IllegalArgumentException("El costo mensual no debe superar $100000 COP");
        }*/
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public String getNombreInvitado() {
        return nombreInvitado;
    }

    public void setNombreInvitado(String nombreInvitado) {
        this.nombreInvitado = nombreInvitado;
    }

    public Integer getCedulaInvitado() {
        return cedulaInvitado;
    }

    public void setCedulaInvitado(Integer cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }

    public LocalDate getFechaInvitacion() {
        return fechaInvitacion;
    }

    public void setFechaInvitacion(LocalDate fechaInvitacion) {
        this.fechaInvitacion = fechaInvitacion;
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

    /* usuario referido:
    Yo como usuario que paga membresía puedo referenciar al mes un
      usuario invitado que puede acceder desde la fecha de invitación y HASTA
          POR 5 DIAS a todos los descuentos de la app
    */
    public void referenciarUsuarioInvitado(Integer invitado) {
        this.cedulaInvitado = invitado;
        this.fechaInvitacion = LocalDate.now();
    }
    public boolean AccesoADescuentosReferido() {
        if (cedulaInvitado != null) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaVencimiento = fechaInvitacion.plusDays(5); //se le añade los 5 días
            return !fechaActual.isAfter(fechaVencimiento);
            /* se verifica si la fechaActual no es posterior a la fechaVencimiento.
            Si esta condición es verdadera,
            significa que el usuario invitado tiene acceso a descuentos
             durante ese período de 5 días.*/
        }
        return false;
    }
    public void agregarReferido(Integer agregarCedulaReferido){

    }

}
