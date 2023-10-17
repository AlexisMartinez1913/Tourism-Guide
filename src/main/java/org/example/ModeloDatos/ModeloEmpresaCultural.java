package org.example.ModeloDatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa_cultural")
public class ModeloEmpresaCultural extends ModeloEmpresa{
    @Column(name = "entidad")
    private String entidad;
    @Column(name = "mision")
    private String mision;
    @Column(name = "email_contacto")
    private String emailContacto;
    @Column(name = "numero_contacto")
    private Integer numeroContacto;

    public ModeloEmpresaCultural() {
    }

    public ModeloEmpresaCultural(String entidad, String mision, String emailContacto, Integer numeroContacto) {
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

    public Integer getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Integer numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
