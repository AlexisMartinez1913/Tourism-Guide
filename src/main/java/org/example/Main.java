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
        //metodo para guardar afiliado
        //controladorAfiliado.registrarAfiliado("AndresGuerrero", "122455555","ag@gmail.com",3,50000);

        //metodo para guardar no afiliado
        //controladorNoAfiliado.registrarNoAfiliado("122355555", "KarinaGuerro",
          //      "ka@gmail.com",2,100000);

        //controladorEmpresaCultural.registrarEmpresaCultural("1237777777", "Mundial Café", 1, "Empresa de café", "Corp Calidad", "Llevar el café a todo el mundo", "ac@gmail.com", 4223312);
        controladorEmpresaPrivada.registrarEmpresaPrivada("1234567899","Empresa De Hoteles sas",1,"Cadena de hoteles 3 estrellas","JanderBuriticaGarcia","1234567");


        controladorNoAfiliado.registrarNoAfiliado("123444444", "AndresGuerreroC","agc@gmail.com",2,30000);


        //construir un menu de opciones
        //1. registrar afiliado
        //2. ver afiliado
        //3. registrar afiliado por evento
        //4. ver afiliado eventos
        //
        //controladorAfiliado.consultarAfiliados();
        //controladorNoAfiliado.consultarNoAfiliados();
        //controladorEmpresaCultural.consultarEmpresaCultural();
        controladorEmpresaPrivada.consultarEmpresaPrivada();

        //menu
        Scanner scanner = new Scanner(System.in);
        boolean entrada = true;
        int opcion;
        while(entrada){
            System.out.println("Menu de opciones: ");
            System.out.println("1. Registrar afiliado: ");
            System.out.println("2. Registrar no afiliado");
            System.out.println("3. Registrar empresa cultural: ");
            System.out.println("4. Registrar empresa privada: ");
            System.out.println("5. consultar afiliados: ");
            System.out.println("6. consultar no afiliados: ");
            System.out.println("7. consultar empresas culturales: ");
            System.out.println("8. consultar empresas privadas: ");
            System.out.println("9. Salir: ");
            System.out.println("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    //logica
                    break;
                case 2:
                    break;
                case 3:
                    //logica
                    break;
                case 4:
                    //logica
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    entrada = false;
                    System.out.println("Salida");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;



            }


        }


    }
}