package org.example.Entidades;

import org.example.Validaciones.UsuarioValidacion;

import java.util.Date;

public class UsuarioReferido extends Usuario{
    Date fechaLimiteInvitado;
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();


    public UsuarioReferido() {
    }


    public Double getCostoMensualEvento() {
        return null;
    }

    public UsuarioReferido(Integer id, String documento, String nombres, String correo, Integer ubicacion, String contrasena, UsuarioValidacion usuarioValidacion, Date fechaLimiteInvitado, UsuarioMembresia usuarioMembresia) {
        super(id, documento, nombres, correo, ubicacion, contrasena, usuarioValidacion);
        this.fechaLimiteInvitado = fechaLimiteInvitado;
        this.usuarioMembresia = usuarioMembresia;
    }

    public Date getFechaLimiteInvitado() {
        return fechaLimiteInvitado;
    }

    public void setFechaLimiteInvitado(Date fechaLimiteInvitado) {
        this.fechaLimiteInvitado = fechaLimiteInvitado;
    }

    public UsuarioMembresia getUsuarioMembresia() {
        return usuarioMembresia;
    }

    public void setUsuarioMembresia(UsuarioMembresia usuarioMembresia) {
        this.usuarioMembresia = usuarioMembresia;
    }
}
