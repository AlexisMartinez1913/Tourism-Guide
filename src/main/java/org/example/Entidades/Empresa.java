package org.example.Entidades;

import org.example.Validaciones.EmpresaValidacion;

public abstract class Empresa {
    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;

    private EmpresaValidacion empresaValidacion = new EmpresaValidacion();

    public Empresa() {
    }

    public Empresa(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {

        try {
            this.empresaValidacion.validarNit(nit);
            this.nit = nit;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.empresaValidacion.valdarNombreEmpresa(nombre);
            this.nombre = nombre;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public abstract Double cobrar();
}
