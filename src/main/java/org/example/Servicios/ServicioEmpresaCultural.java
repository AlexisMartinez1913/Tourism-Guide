package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.EmpresaCultural;
import org.example.ModeloDatos.ModeloEmpresaCultural;
import org.example.ModeloDatos.ModeloUsuarioMembresia;

import java.util.List;

public class ServicioEmpresaCultural {

    private EntityManager getEntityManager() {
        String configuracionPersistencia = "conexionbd";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
        return entityManagerFactory.createEntityManager();
    }
    public void registrarEmpresaCultural(EmpresaCultural empresaCultural) {
        EntityManager entityManager = getEntityManager();
        try {
            // Iniciar la transacción
            entityManager.getTransaction().begin();
            // Crear un modelo de datos y cargar con información
            ModeloEmpresaCultural modeloEmpresaCultural = new ModeloEmpresaCultural();
            modeloEmpresaCultural.setId(empresaCultural.getId());
            modeloEmpresaCultural.setNit(empresaCultural.getNit());
            modeloEmpresaCultural.setNombre(empresaCultural.getNombre());
            modeloEmpresaCultural.setUbicacion(empresaCultural.getUbicacion());
            modeloEmpresaCultural.setDescripcion(empresaCultural.getDescripcion());
            modeloEmpresaCultural.setEntidad(empresaCultural.getEntidad());
            modeloEmpresaCultural.setMision(empresaCultural.getMision());
            modeloEmpresaCultural.setEmailContacto(empresaCultural.getEmailContacto());
            modeloEmpresaCultural.setNumeroContacto(empresaCultural.getNumeroContacto());

            // Activar la persistencia
            entityManager.persist(modeloEmpresaCultural);
            // Confirmar la transacción
            entityManager.getTransaction().commit();
            System.out.println("Exito en la transacción - Empresa Registrada Con Éxito");
        } catch (Exception e) {
            System.out.println("Error en la transacción: " + e.getMessage());
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback(); // Revertir la transacción en caso de error.
            }
        }finally {
            if (entityManager != null) {
                entityManager.close();
            }

        }

    }

    public List<ModeloEmpresaCultural> buscarEmpresaCultural() {

        String configuracionPersistencia = "conexionbd";
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();
            // establecer una consulta para traer la BD
            String jpqlConsulta = "SELECT ec FROM ModeloEmpresaCultural ec";
            //ejecutar consulta - lista de datos
            List<ModeloEmpresaCultural> empresaCultural = entityManager.createQuery(jpqlConsulta, ModeloEmpresaCultural.class).getResultList();
            return empresaCultural;


        } catch (Exception ex) {
            System.out.println("Error "+ ex.getMessage());
            return null;
        }finally {
            if(entityManager!= null){
                entityManager.close();
            }
            if (entityManagerFactory!=null) {
                entityManagerFactory.close();
            }
        }

    }
}
