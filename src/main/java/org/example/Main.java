package org.example;


import org.example.Modelos.Empresa;
import org.example.Modelos.Oferta;
import org.example.Modelos.Reserva;
import org.example.Modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        String fechaReserva;
        System.out.println("Ingrese un nombre: ");
        name = sc.nextLine();
        System.out.println("Ingrese la fecha de la reserva: ");
        fechaReserva = sc.nextLine();

        //datos oferta
        String fechaIncio;
        String fechaFinal;
        System.out.println("Ingrese la fecha de inicio: ");
        fechaIncio = sc.nextLine();
        System.out.println("Ingrese la fecha final: ");
        fechaFinal = sc.nextLine();
        Oferta of1 = new Oferta();


        Usuario p1 = new Usuario();
        //Empresa l1 = new Empresa();
        Reserva r1 = new Reserva();
        p1.setNombres(name);

        r1.setFechaReserva(fechaReserva);

        of1.setFechaInicio(fechaIncio);
        of1.setFechaFin(fechaFinal);




    }
}