package com.campusdual.exercisespoo.exercise17;

public class Arrays01 {

    public static void main(String[] args) {

    //declaracion e inicializacion de los arrays

        int [] intArray = new int [3];
        String[] stringArray = {"1","2","3"};

    //establecer datos array
        intArray [0]=10;
        intArray [1]=9;
        intArray [2]=8;


    //mostrar datos de posicion del Array

        System.out.println(intArray [0]);
        System.out.println(stringArray [0]);

    //mostrar la longitud del array

        System.out.print(intArray.length);
        System.out.print(stringArray.length);

    }
}
