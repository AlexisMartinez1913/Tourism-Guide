package org.example;


import org.example.Modelos.Local;
import org.example.Modelos.Oferta;
import org.example.Modelos.Persona;
import org.example.Modelos.Reserva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Local objetoLocal = new Local();
        Reserva objetoReserva = new Reserva();
        Oferta objetoOferta = new Oferta();
        int id, ubicacion;
        String doc, name, email;
        System.out.println("Ingrese el id: ");
        id = sc.nextInt();
        System.out.println("Ingrese el documento: ");
        doc = sc.next();
        System.out.println("Ingrese el nombre: ");
        name = sc.next();
        System.out.println("Ingrese el email: ");
        email = sc.next();
        System.out.println("Ingrese el la ubicacion: ");
        ubicacion = sc.nextInt();
        Persona persona1 = new Persona(id,doc,name,email,ubicacion);

        System.out.println(persona1);

    }
}