package org.example.menu;

import org.example.Controladores.ControladorAfiliado;
import org.example.Controladores.ControladorEmpresaCultural;
import org.example.Controladores.ControladorEmpresaPrivada;
import org.example.Controladores.ControladorNoAfiliado;

import java.util.Scanner;

public class menu {

    public static void showMenu() {

        ControladorAfiliado controladorAfiliado = new ControladorAfiliado();
        ControladorNoAfiliado controladorNoAfiliado = new ControladorNoAfiliado();
        ControladorEmpresaCultural controladorEmpresaCultural = new ControladorEmpresaCultural();
        ControladorEmpresaPrivada controladorEmpresaPrivada = new ControladorEmpresaPrivada();


        Scanner scanner = new Scanner(System.in);
        boolean entrada = true;
        int opcion;

        while (entrada) {
            System.out.println("Menu de opciones: \n1. Registrar usuario membresia \n2. Registrar usuario por evento \n3. Registrar empresa cultural \n4. Registrar empresa privada \n5. Consultar usuarios membresia \n6. Consultar usuarios por evento \n7. Consultar empresas culturales \n8. Consultar empresas privadas \n9. Salir \nSeleccione una opcion: \n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controladorAfiliado.registrarAfiliado();
                    break;
                case 2:
                    controladorNoAfiliado.registrarNoAfiliado();
                    break;
                case 3:
                    controladorEmpresaCultural.registrarEmpresaCultural();
                    break;
                case 4:
                    controladorEmpresaPrivada.registrarEmpresaPrivada();
                    break;
                case 5:
                    controladorAfiliado.consultarAfiliados();
                    break;
                case 6:
                    controladorNoAfiliado.consultarNoAfiliados();
                    break;
                case 7:
                    controladorEmpresaCultural.consultarEmpresaCultural();
                    break;
                case 8:
                    controladorEmpresaPrivada.consultarEmpresaPrivada();
                    break;
                case 9:
                    entrada = false;
                    System.out.println("Salida");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }scanner.close();

    }

}
