package org.example.Entidades;

public class EmpresaPrivada extends Empresa {
    private String nombreRepresentanteLegal;
    private String cedulaRepresentanteLegal;

    public EmpresaPrivada() {
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String nombreRepresentanteLegal, String cedulaRepresentanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        this.cedulaRepresentanteLegal = cedulaRepresentanteLegal;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getCedulaRepresentanteLegal() {
        return cedulaRepresentanteLegal;
    }

    public void setCedulaRepresentanteLegal(String cedulaRepresentanteLegal) {
        this.cedulaRepresentanteLegal = cedulaRepresentanteLegal;
    }

    @Override
    public Double cobrar() {

        double tarifaBase = 2200000.0;
        double iva = tarifaBase * 0.10; // 10% de IVA
        return tarifaBase + iva;
    }
}
