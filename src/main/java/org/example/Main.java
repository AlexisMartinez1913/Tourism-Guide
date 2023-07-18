package org.example;


import org.example.Modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Ingrese un nombre: ");
        name = sc.nextLine();
        Usuario p1 = new Usuario();
        p1.setNombres(name);
        System.out.println(p1.getNombres());



    }
}