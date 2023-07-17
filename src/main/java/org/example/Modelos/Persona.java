package org.example.Modelos;

public class Persona {
    private int id;
    private String documento;
    private String nombres;
    private String correo;
    private int ubicacion;

    public Persona() {
    }

    public Persona(int id, String documento, String nombres, String correo, int ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", Ubicacion=" + ubicacion +
                '}';
    }
}
