package org.example.ModeloDatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_por_evento")
public class ModeloUsuarioPorEvento extends ModeloUsuario{
    @Column(name = "valor_evento")
    private double costoEvento;

    public ModeloUsuarioPorEvento() {
    }

    public ModeloUsuarioPorEvento(double costoEvento) {
        this.costoEvento = costoEvento;
    }

    public double getCostoEvento() {
        return costoEvento;
    }

    public void setCostoEvento(double costoEvento) {
        this.costoEvento = costoEvento;
    }
}
