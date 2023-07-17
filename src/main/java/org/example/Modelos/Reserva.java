package org.example.Modelos;

import java.time.LocalDate;

public class Reserva {
    private int id;
    private int idUsuario;
    private int idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    public Reserva() {
    }

    public Reserva(int id, int idUsuario, int idOferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                '}';
    }
}
