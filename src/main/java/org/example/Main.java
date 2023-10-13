package org.example;


import org.example.Controladores.ControladorAfiliado;
import org.example.Controladores.ControladorNoAfiliado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorAfiliado controladorAfiliado = new ControladorAfiliado();
        ControladorNoAfiliado controladorNoAfiliado = new ControladorNoAfiliado();
        //metodo para guardar afiliado
        //controladorAfiliado.registrarAfiliado("AlexisMartinez", "12345", "a@gmail.com", 1);
        //metodo para guardar no afiliado
        controladorNoAfiliado.registrarNoAfiliado("122355555", "KarinaGuerro",
                "ka@gmail.com",2,100000);




    }
}