package org.example;


import org.example.Controladores.ControladorAfiliado;
import org.example.Controladores.ControladorEmpresaCultural;
import org.example.Controladores.ControladorEmpresaPrivada;
import org.example.Controladores.ControladorNoAfiliado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorAfiliado controladorAfiliado = new ControladorAfiliado();
        ControladorNoAfiliado controladorNoAfiliado = new ControladorNoAfiliado();
        ControladorEmpresaCultural controladorEmpresaCultural = new ControladorEmpresaCultural();
        ControladorEmpresaPrivada controladorEmpresaPrivada = new ControladorEmpresaPrivada();

        Scanner scanner = new Scanner(System.in);
        boolean entrada = true;
        int opcion;
        while(entrada){
            System.out.println("Menu de opciones: \n1. Registrar usuario membresia: \n2. Registrar usuario por evento: \n3. Registrar empresa cultural: \n4. Registrar empresa privada: \n5. consultar usuarios membresia: \n6. consultar usuarios por evento: \n7. consultar empresas culturales: \n8. consultar empresas privadas: \n9. Salir: \nSeleccione una opcion: \n");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1-> controladorAfiliado.registrarAfiliado();
                case 2-> controladorNoAfiliado.registrarNoAfiliado();
                case 3->controladorEmpresaCultural.registrarEmpresaCultural();
                case 4->controladorEmpresaPrivada.registrarEmpresaPrivada();
                case 5-> controladorAfiliado.consultarAfiliados();
                case 6->controladorNoAfiliado.consultarNoAfiliados();
                case 7->controladorEmpresaCultural.consultarEmpresaCultural();
                case 8->controladorEmpresaPrivada.consultarEmpresaPrivada();
                case 9->{
                    entrada = false;
                    System.out.println("Salida");
                }
                default-> System.out.println("Opcion invalida");

            }
        }
    }
}