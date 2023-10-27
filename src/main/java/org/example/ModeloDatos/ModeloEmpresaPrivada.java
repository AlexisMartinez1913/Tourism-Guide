package org.example.ModeloDatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="empresa_privada")
public class ModeloEmpresaPrivada extends ModeloEmpresa {
    @Column(name = "nombre_representante_legal")
    private String nombreRepresentateLegal;
    @Column(name = "cedula_representante")
    private String cedulaRepresentanteLegal;

    public ModeloEmpresaPrivada() {
    }


    public ModeloEmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String nombreRepresentateLegal, String cedulaRepresentanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.nombreRepresentateLegal = nombreRepresentateLegal;
        this.cedulaRepresentanteLegal = cedulaRepresentanteLegal;
    }

    public String getNombreRepresentateLegal() {
        return nombreRepresentateLegal;
    }

    public void setNombreRepresentateLegal(String nombreRepresentateLegal) {
        this.nombreRepresentateLegal = nombreRepresentateLegal;
    }

    public String getCedulaRepresentanteLegal() {
        return cedulaRepresentanteLegal;
    }

    public void setCedulaRepresentanteLegal(String cedulaRepresentanteLegal) {
        this.cedulaRepresentanteLegal = cedulaRepresentanteLegal;
    }
}
