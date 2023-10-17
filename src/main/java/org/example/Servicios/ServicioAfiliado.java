package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.Entidades.UsuarioMembresia;

import java.util.List;

public class ServicioAfiliado {

    public void registrarAfiliado(UsuarioMembresia usuarioMembresia) {
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
            ModeloUsuarioMembresia modeloUsuarioMembresia = new ModeloUsuarioMembresia();
            modeloUsuarioMembresia.setNombres(usuarioMembresia.getNombres());
            modeloUsuarioMembresia.setDocumento(usuarioMembresia.getDocumento());
            modeloUsuarioMembresia.setCorreo(usuarioMembresia.getCorreo());
            modeloUsuarioMembresia.setUbicacion(usuarioMembresia.getUbicacion());

            //iniciar la transaccion
            entityManager.getTransaction().begin();

            //activar la persistencia
            entityManager.persist(modeloUsuarioMembresia);

            //registro operacion
            entityManager.getTransaction().commit();
            System.out.println("Exito en la transacción - Usuario Registrado Con Éxito");

            /* ******** Items para agregar al proyecto *************** */

            //revisar el servicio y agregar tres servicios
            // crear los otros modelos de datos
            //crear los otros controladores
            //llamar en el main a los controladores (4)

            /* ******************************************************** */


        }catch (Exception e) {
            System.out.println("error en la transaccion" + e.getMessage());
        }finally {
            if(entityManager!= null){
                entityManager.close();
            }
            if (entityManagerFactory!=null) {
                entityManager.close();
            }
        }

    }
    public List<ModeloUsuarioMembresia> buscarAfiliados() {
        return null;
    }
}
