package com.campusdual.exercisespoo;

public class Exercise02    {

    public static void main(String[] args) {
        //Área de un círculo = PI * r * r
        //Longitud de una circunferencia = PI * 2 * r
        //Área de un cuadrado = lado * lado

        double r = 7;
        double lado = 4.5;

        System.out.print("Área de un círculo: ");
        System.out.println(Math.PI*Math.pow(r,2));
        System.out.print("Longitud de una circunferencia: ");
        System.out.println(Math.PI*2*r);
        System.out.print("Área de un cuadrado: ");
        System.out.println(Math.pow(lado,2));

    }
}
