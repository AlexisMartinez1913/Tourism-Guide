package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.EmpresaCultural;
import org.example.ModeloDatos.ModeloEmpresaCultural;

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
}
