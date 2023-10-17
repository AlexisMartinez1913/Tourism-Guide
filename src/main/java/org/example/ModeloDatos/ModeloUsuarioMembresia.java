package org.example.ModeloDatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;


@Entity
@Table(name = "usuario_membresia")
public class ModeloUsuarioMembresia extends ModeloUsuario{
    @Column(name = "valor_mensual")
    private double costoMensualidad;
    @Column(name = "cedula_invitado")
    private Integer cedulaInvitado;

    public ModeloUsuarioMembresia() {
    }

    public ModeloUsuarioMembresia(double costoMensualidad, Integer cedulaInvitado) {
        this.costoMensualidad = costoMensualidad;
        this.cedulaInvitado = cedulaInvitado;
    }

    public double getCostoMensualidad() {
        return costoMensualidad;
    }

    public void setCostoMensualidad(double costoMensualidad) {
        this.costoMensualidad = costoMensualidad;
    }

    public Integer getCedulaInvitado() {
        return cedulaInvitado;
    }

    public void setCedulaInvitado(Integer cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }
}
