package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

public class Exercise03 {


public static String saludo(String nombre) {
    String mensaje = "Hola. Bienvenido " + nombre;
    return mensaje;
}
public static void fechaActual(String fecha){
    System.out.println(fecha);
}
    public static void main(String[] args) {
        System.out.println(saludo("Alberto"));
        fechaActual("19/10/2023");


    }
}
