package org.example.Entidades.Interfaces;

public interface IReporte {
    //interface no tiene atributos
    //Lista metodos, no los implementa.
    void generarReporte(String datos);
    void buscarReporte(Integer id);
    void editarReporte(Integer id, String datos);

}
