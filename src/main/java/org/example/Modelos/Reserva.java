package org.example.Modelos;

import org.example.Validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    private ReservaValidacion reservaValidacion = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaReservaStr = fechaReserva.format(formatter);
            LocalDate parseDate = LocalDate.parse(fechaReservaStr,formatter);
            this.reservaValidacion.validarFecha(parseDate);
            this.fechaReserva = fechaReserva;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
}
