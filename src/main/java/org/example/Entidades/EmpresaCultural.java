package org.example.Entidades;

<<<<<<< HEAD
import jakarta.persistence.criteria.CriteriaBuilder;
=======
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0
import org.example.Entidades.Interfaces.IReporte;

public class EmpresaCultural extends Empresa implements IReporte {
    private String entidad;
    private String mision;
    private String emailContacto;
<<<<<<< HEAD
    private Integer numeroContacto;
=======
    private String numeroContacto;
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0


    public EmpresaCultural() {
    }

<<<<<<< HEAD
    public EmpresaCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String entidad, String mision, String emailContacto, Integer numeroContacto) {
=======
    public EmpresaCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String entidad, String mision, String emailContacto, String numeroContacto) {
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
        this.emailContacto = emailContacto;
        this.numeroContacto = numeroContacto;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

<<<<<<< HEAD
    public Integer getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Integer numeroContacto) {
=======
    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
>>>>>>> 83e9c3214a7e5267f2747c69bafc82d15d23ced0
        this.numeroContacto = numeroContacto;
    }

    @Override
    public Double cobrar(){

        return null;
    }


    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id, String datos) {

    }
}
