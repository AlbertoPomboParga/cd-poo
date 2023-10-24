package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

public class Exercise05 {
    //comprobar si un numero es positivo o negativo. mayor o menor que 0
    //comprobar si un numero es multiplo de otro. resto de la division es 0
    //comprobar si un numero es menor a otro. mayor que otro

    //if (condicion){
     //   instrucciones si la condicion de sumple
    //} else{
    //}   instrucciones si la condicion NO se cumple

    public static void main(String[] args) {
        System.out.print("Comprobar si el número es positivo o negativo: ");
        esPositivo(0);
        System.out.println("Comprobar si el número es multiplo o no");
        esMultiplo(4,2);
        System.out.println("Comprobar si el numero es menor");
        esMenor (3,3);
    }

    public static void esPositivo(int numero){
        if (numero>=0){
            System.out.println("Es un numero positivo");
        }else {
            System.out.println("Es un numero negativo");
        }
    }

        public static void esMultiplo(int numero1, int numero2){
        if (numero1 % numero2 == 0){
            System.out.println("El numero" + numero1 + "es un multiplo de" + numero2);
        }else {
            System.out.println("El numero" + numero1 + "no es un multiplo de" + numero2);
        }
        }
    public static void  esMenor(int numero1,int numero2){
        if (numero1 < numero2) {
            System.out.println("El número " + numero1 + " es menor que " + numero2);
        } else if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("El número " + numero1 + " es igual a " + numero2);
        }

        }
    }





