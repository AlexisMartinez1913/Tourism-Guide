package org.example.ModeloDatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_por_evento")
=======

@Entity
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0
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
