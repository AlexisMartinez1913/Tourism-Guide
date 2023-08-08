package org.example;


import org.example.Modelos.Local;
import org.example.Modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String nameCompany;
        String correo;
        System.out.println("Ingrese un nombre: ");
        name = sc.nextLine();
        System.out.println("Ingrese el nombre de la empresa: ");
        nameCompany = sc.nextLine();
        System.out.println("Ingrese un correo: ");
        correo = sc.nextLine();
        Usuario p1 = new Usuario();
        Local l1 = new Local();
        p1.setNombres(name);
        l1.setNombre(nameCompany);
        p1.setCorreo(correo);
        System.out.println(p1.getNombres());
        System.out.println(l1.getNombre());
        System.out.println(p1.getCorreo());



    }
}