package org.example.Entidades;

import org.example.Validaciones.UsuarioValidacion;

public  class Usuario {
    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    private String contrasena;

    private UsuarioValidacion usuarioValidacion = new UsuarioValidacion();

    public Usuario() {

    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion, String contrasena, UsuarioValidacion usuarioValidacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
        this.contrasena = contrasena;
        this.usuarioValidacion = usuarioValidacion;
    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
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
        } catch (Exception ex) {
            //mensaje de la excepcion
            System.out.println(ex.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public void setCorreo(String correo) {
        try {
            this.usuarioValidacion.validarCorreo(correo);
            this.correo = correo;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try {
            this.usuarioValidacion.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    //metodos usuarios
    /*
    Yo como usuario sin importar si pago mensualidad o evento me debo
     poder registrar en BD
     */
    public void registrarUsuarioEnBD() {

    }

}
