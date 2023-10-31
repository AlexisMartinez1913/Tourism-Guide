package org.example.Controladores;

import org.example.Entidades.UsuarioMembresia;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.Servicios.ServicioAfiliado;

import java.util.List;
import java.util.Scanner;

public class ControladorAfiliado {
    //llamar a la clase que valida
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    //llamar al servicio
    ServicioAfiliado servicioAfiliado = new ServicioAfiliado();

    public void registrarAfiliado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el documento: ");
        String documento = scanner.nextLine();

        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese la ubicación: ");
        int ubicacion = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        System.out.print("Ingrese la cédula del invitado: ");
        int cedulaInvitado = scanner.nextInt();

        System.out.print("Ingrese la mensualidad: ");
        double mensualidad = scanner.nextDouble();

        //scanner.close();

        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(ubicacion);
        this.usuarioMembresia.setContrasena(contrasena);
        this.usuarioMembresia.setCedulaInvitado(cedulaInvitado);
        this.usuarioMembresia.setCostoMensual(mensualidad);

        this.servicioAfiliado.registrarAfiliado(usuarioMembresia);
    }
    public void consultarAfiliados() {
        List<ModeloUsuarioMembresia> afiliados = servicioAfiliado.buscarAfiliados();
        for (ModeloUsuarioMembresia afiliado: afiliados) {
            System.out.println("Nombre: " + afiliado.getNombres());
            System.out.println("Documento: " + afiliado.getDocumento());
            System.out.println("Correo: " + afiliado.getCorreo());
            System.out.println("Ubicacion: " + afiliado.getUbicacion());

        }
    }

}
