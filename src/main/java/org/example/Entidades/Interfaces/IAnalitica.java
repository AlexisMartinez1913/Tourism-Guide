package org.example.Entidades.Interfaces;

public interface IAnalitica<T> {
    void limpiarDatos(T datos);
    void calcularDispersion(T datos);
}
