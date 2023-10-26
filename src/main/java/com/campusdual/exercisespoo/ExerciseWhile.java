package com.campusdual.exercisespoo;

import com.campusdual.Util.Utils;

import java.util.Scanner;

public class ExerciseWhile {
    public static void main(String[] args) {
        mostrarSaludoConUtils();
        pedirNumeroConUtils();
    }

        /*Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida con el*/
        public static void mostrarSaludo(){
            Scanner scan= new Scanner(System.in);
            String nombreUsuario;

            nombreUsuario = scan.next();

            System.out.println("Hola " + nombreUsuario +"!" + "Como estás?");

        }
    /*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla*/
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }
    public static void mostrarSaludoConUtils(){
        String nombreUsuario = Utils.string("Introduce tu nombre: ");
            System.out.println("Hola " + nombreUsuario +"!" + "Como estás?");
    }
    public static void pedirNumeroConUtils(){
        int numeroParaMostrar;
        do {
            numeroParaMostrar=Utils.integer("Introduce un numero mayor que 5");
        } while (numeroParaMostrar<5);
            System.out.println("El numero que has escrito es: " + numeroParaMostrar);
        }

    }

