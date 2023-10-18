package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.ModeloDatos.ModeloUsuarioPorEvento;
import org.example.Entidades.UsuarioPorEvento;

import java.util.List;

public class ServicioNoAfiliado {



    public void registrarNoAfiliado(UsuarioPorEvento usuarioPorEvento) {

        //nombre del traductor para hacer la persistencia
        String configuracionPersistencia = "conexionbd";
        //variable para la conexion y variable para manejar la conexion
        //se puede volver un metodo
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();


            //crear un modelo de datos y cargar con informacion
            ModeloUsuarioPorEvento modeloUsuarioPorEvento = new ModeloUsuarioPorEvento();
            modeloUsuarioPorEvento.setDocumento(usuarioPorEvento.getDocumento());
            modeloUsuarioPorEvento.setNombres(usuarioPorEvento.getNombres());
            modeloUsuarioPorEvento.setCorreo(usuarioPorEvento.getCorreo());
            modeloUsuarioPorEvento.setUbicacion(usuarioPorEvento.getUbicacion());
            modeloUsuarioPorEvento.setCostoEvento(usuarioPorEvento.getCostoPorEvento());



            //iniciar la transaccion
            entityManager.getTransaction().begin();

            //activar la persistencia
            entityManager.persist(modeloUsuarioPorEvento);

            //registro operacion
            entityManager.getTransaction().commit();
            System.out.println("Exito en la transacción - Usuario Registrado Con Éxito");

            //revisar el servicio y agregar tres servicios
            // crear los otros modelos de datos
            //crear los otros controladores
            //llamar en el main a los controladores (4)


        }catch (Exception e) {
            System.out.println("error en la transaccion" + e.getMessage());
        }finally {
            if(entityManager!= null){
                entityManager.close();
            }
            if (entityManagerFactory!=null) {
                entityManagerFactory.close();
            }
        }

    }

    public List<ModeloUsuarioPorEvento> consultarUsuarioPorEvento() {

        String configuracionPersistencia = "conexionbd";
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();
            // establecer una consulta para traer la BD
            String jpqlConsulta = "SELECT naf FROM ModeloUsuarioPorEvento naf";
            //ejecutar consulta - lista de datos
            List<ModeloUsuarioPorEvento> noAfiliado = entityManager.createQuery(jpqlConsulta, ModeloUsuarioPorEvento.class).getResultList();
            return noAfiliado;


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
