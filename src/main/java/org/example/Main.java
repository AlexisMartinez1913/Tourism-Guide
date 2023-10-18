package org.example;


import org.example.Controladores.ControladorAfiliado;

import org.example.Controladores.ControladorEmpresaCultural;

import org.example.Controladores.ControladorNoAfiliado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorAfiliado controladorAfiliado = new ControladorAfiliado();
        ControladorNoAfiliado controladorNoAfiliado = new ControladorNoAfiliado();

        ControladorEmpresaCultural controladorEmpresaCultural = new ControladorEmpresaCultural();
        //metodo para guardar afiliado
        //controladorAfiliado.registrarAfiliado("AndresGuerrero", "122455555","ag@gmail.com",3,50000);

        //metodo para guardar no afiliado
        //controladorNoAfiliado.registrarNoAfiliado("122355555", "KarinaGuerro",
          //      "ka@gmail.com",2,100000);

        controladorEmpresaCultural.registrarEmpresaCultural("1237777777", "Mundial Café", 1, "Empresa de café", "Corp Calidad", "Llevar el café a todo el mundo", "ac@gmail.com", 4223312);


        controladorNoAfiliado.registrarNoAfiliado("123444444", "AndresGuerreroC","agc@gmail.com",2,30000);

        //construir un menu de opciones
        //1. registrar afiliado
        //2. ver afiliado
        //3. registrar afiliado por evento
        //4. ver afiliado eventos
        //
        //controladorAfiliado.consultarAfiliados();
        controladorNoAfiliado.consultarNoAfiliados();
        controladorEmpresaCultural.consultarEmpresaCultural();





    }
}