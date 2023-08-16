package org.example.Modelos;

import org.example.Utilidades.Util;
import org.example.Validaciones.OfertaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;

    private OfertaValidacion ofertaValidacion = new OfertaValidacion();
    Util util = new Util();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoPersona=" + costoPersona +
                ", idLocal=" + idLocal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            this.ofertaValidacion.validarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            this.ofertaValidacion.validarFormatoFechaInicio(fechaInicio);
            DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaReservaFormateada = LocalDate.parse(fechaInicio,formatoDeseado);
            this.fechaInicio = fechaReservaFormateada;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            this.ofertaValidacion.validarFormatoFechaFin(fechaFin);
            this.ofertaValidacion.validarFechaInicioFinal(this.fechaInicio, this.util.convertirString(fechaFin, "DD/MM/YYYY"));
            LocalDate fechaCorrecta = this.util.convertirString(fechaFin, "DD/MM/YYYY");
            this.fechaFin = fechaCorrecta;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try {
            this.ofertaValidacion.validarCostoPersona(costoPersona);
            this.costoPersona = costoPersona;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
