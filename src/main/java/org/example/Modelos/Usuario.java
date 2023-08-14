package org.example.Modelos;

import org.example.Utilidades.Util;
import org.example.Validaciones.UsuarioValidacion;

public class Usuario {
    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    private UsuarioValidacion usuarioValidacion = new UsuarioValidacion();

    public Usuario(){

    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", ubicacion=" + ubicacion +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {

        try {
            this.usuarioValidacion.validarNombre(nombres);
            this.nombres = nombres;
        }catch (Exception ex){
            //mensaje de la excepcion
            System.out.println(ex.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            this.usuarioValidacion.validarCorreo(correo);
            this.correo = correo;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try{
            this.usuarioValidacion.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
