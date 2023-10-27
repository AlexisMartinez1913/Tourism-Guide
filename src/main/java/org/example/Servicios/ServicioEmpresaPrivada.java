package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.EmpresaCultural;
import org.example.Entidades.EmpresaPrivada;
import org.example.ModeloDatos.ModeloEmpresaCultural;
import org.example.ModeloDatos.ModeloEmpresaPrivada;

import java.util.List;

public class ServicioEmpresaPrivada {
    private EntityManager getEntityManager() {
        String configuracionPersistencia = "conexionbd";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
        return entityManagerFactory.createEntityManager();
    }
    public void registrarEmpresaPrivada(EmpresaPrivada empresaPrivada) {
        EntityManager entityManager = getEntityManager();
        try {
            // Iniciar la transacción
            entityManager.getTransaction().begin();
            // Crear un modelo de datos y cargar con información
            ModeloEmpresaPrivada modeloEmpresaPrivada = new ModeloEmpresaPrivada();
            modeloEmpresaPrivada.setId(empresaPrivada.getId());
            modeloEmpresaPrivada.setNit(empresaPrivada.getNit());
            modeloEmpresaPrivada.setNombre(empresaPrivada.getNombre());
            modeloEmpresaPrivada.setUbicacion(empresaPrivada.getUbicacion());
            modeloEmpresaPrivada.setDescripcion(empresaPrivada.getDescripcion());
            modeloEmpresaPrivada.setNombreRepresentateLegal(empresaPrivada.getNombreRepresentanteLegal());
            modeloEmpresaPrivada.setCedulaRepresentanteLegal(empresaPrivada.getCedulaRepresentanteLegal());

            // Activar la persistencia
            entityManager.persist(modeloEmpresaPrivada);
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
    public List<ModeloEmpresaPrivada> buscarEmpresaPrivada() {

        String configuracionPersistencia = "conexionbd";
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();
            // establecer una consulta para traer la BD
            String jpqlConsulta = "SELECT ep FROM ModeloEmpresaPrivada ep";
            //ejecutar consulta - lista de datos
            List<ModeloEmpresaPrivada> empresaPrivada = entityManager.createQuery(jpqlConsulta, ModeloEmpresaPrivada.class).getResultList();
            return empresaPrivada;


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
