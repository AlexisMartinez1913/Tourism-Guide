package org.example.ModeloDatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity

=======
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0
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
