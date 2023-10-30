package org.example.Controladores;

import org.example.Entidades.EmpresaCultural;
import org.example.ModeloDatos.ModeloEmpresaCultural;
import org.example.ModeloDatos.ModeloUsuarioMembresia;
import org.example.Servicios.ServicioEmpresaCultural;

import java.util.List;
import java.util.Scanner;

public class ControladorEmpresaCultural {
    EmpresaCultural empresaCultural = new EmpresaCultural();
    //llamar a la clase que valida
    ServicioEmpresaCultural servicioEmpresaCultural = new ServicioEmpresaCultural();

    public void registrarEmpresaCultural() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el NIT: ");
        String nit = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la ubicación: ");
        Integer ubicacion = Integer.valueOf(scanner.nextLine());

        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese la entidad: ");
        String entidad = scanner.nextLine();

        System.out.print("Ingrese la misión: ");
        String mision = scanner.nextLine();

        System.out.print("Ingrese el correo de contacto: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese el número de contacto: ");
        Integer numeroContacto = Integer.valueOf(scanner.nextLine());

        scanner.close();

        this.empresaCultural.setNit(nit);
        this.empresaCultural.setNombre(nombre);
        this.empresaCultural.setUbicacion(ubicacion);
        this.empresaCultural.setDescripcion(descripcion);
        this.empresaCultural.setEntidad(entidad);
        this.empresaCultural.setMision(mision);
        this.empresaCultural.setEmailContacto(email);
        this.empresaCultural.setNumeroContacto(numeroContacto);

        this.servicioEmpresaCultural.registrarEmpresaCultural(empresaCultural);
    }
    public void consultarEmpresaCultural() {
        List<ModeloEmpresaCultural> empresaCultural = servicioEmpresaCultural.buscarEmpresaCultural();
        for (ModeloEmpresaCultural empresaCultural1: empresaCultural) {
            System.out.println("Nit: " + empresaCultural1.getNit());
            System.out.println("Nombre: " + empresaCultural1.getNombre());
            System.out.println("Ubicación: " + empresaCultural1.getUbicacion());
            System.out.println("Descripción: " + empresaCultural1.getDescripcion());
            System.out.println("Entidad: " + empresaCultural1.getEntidad());
            System.out.println("Misión: " + empresaCultural1.getMision());
            System.out.println("Email Contacto: " + empresaCultural1.getEmailContacto());
            System.out.println("Número Contacto: " + empresaCultural1.getNumeroContacto());

        }
    }



}
