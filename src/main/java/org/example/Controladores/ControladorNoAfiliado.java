package org.example.Controladores;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.UsuarioPorEvento;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.ModeloDatos.ModeloUsuarioPorEvento;
import org.example.Servicios.ServicioNoAfiliado;

import java.util.List;
import java.util.Scanner;

public class ControladorNoAfiliado {
    UsuarioPorEvento usuarioPorEvento = new UsuarioPorEvento();
    //llamar al servicio
    ServicioNoAfiliado servicioNoAfiliado = new ServicioNoAfiliado();
    public void registrarNoAfiliado() {
        Scanner scanner = new Scanner(System.in);
        String configuracionPersistencia = "conexionbd";
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();

            ModeloUsuarioPorEvento modeloUsuarioPorEvento = new ModeloUsuarioPorEvento();

            System.out.print("Ingrese el documento: ");
            modeloUsuarioPorEvento.setDocumento(scanner.nextLine());

            System.out.print("Ingrese el nombre: ");
            modeloUsuarioPorEvento.setNombres(scanner.nextLine());

            System.out.print("Ingrese el correo: ");
            modeloUsuarioPorEvento.setCorreo(scanner.nextLine());

            System.out.print("Ingrese la ubicación: ");
            modeloUsuarioPorEvento.setUbicacion(Integer.valueOf(scanner.nextLine()));

            System.out.print("Ingrese el costo del evento: ");
            modeloUsuarioPorEvento.setCostoEvento(scanner.nextDouble());

            scanner.nextLine();

            entityManager.getTransaction().begin();
            entityManager.persist(modeloUsuarioPorEvento);
            entityManager.getTransaction().commit();
            System.out.println("Exito en la transacción - Usuario Registrado Con Éxito");


        } catch (Exception e) {
            System.out.println("Error en la transacción: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
        scanner.close();
    }
    public void consultarNoAfiliados() {
        List<ModeloUsuarioPorEvento> usuarioNoAfiliado = servicioNoAfiliado.consultarUsuarioPorEvento();
        for (ModeloUsuarioPorEvento noAfiliado: usuarioNoAfiliado) {
            System.out.println("Documento: " + noAfiliado.getDocumento());
            System.out.println("Nombre: " + noAfiliado.getNombres());
            System.out.println("Correo: " + noAfiliado.getCorreo());
            System.out.println("Ubicacion: " + noAfiliado.getUbicacion());
            System.out.println("Costo Por Evento: " + noAfiliado.getCostoEvento());

        }
    }
}

