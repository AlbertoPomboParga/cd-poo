package com.campusdual.exercisespoo.exercise17;

public class Arrays03 {

    public static void main(String[] args) {

    //declaracion e inicializacion del array unidimensional

        int [] intArrayUni = {1,2,3,4,5};


    //declaracion e inicializacion del array bidimensional

        int [][] intArrayBi = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
        };

    //declaracion e inicializacion del array tridimensional

        int [][][] intArrayTri = {
                {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3,},{4,4,4,4,4},{5,5,5,5,5}},
                {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3,},{4,4,4,4,4},{5,5,5,5,5}},
                {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3,},{4,4,4,4,4},{5,5,5,5,5}},
                {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3,},{4,4,4,4,4},{5,5,5,5,5}},
                {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3,},{4,4,4,4,4},{5,5,5,5,5}},
        };

        //recorremos array con unidimensional for
        System.out.println("Array unidimensional ");
        for (int i =0 ; i<intArrayUni.length;i++){
            System.out.print(intArrayUni[i] + " ");
        }

        //recorremos array con bidimensional con 2 for
        System.out.println("\n\nArray bidimensional ");
        for (int i =0 ; i<5;i++){
            for (int j =0;j<5;j++){
                System.out.print(intArrayBi[i][j]+ " ");
            }
            System.out.println();
        }


        //recorremos array con tridimensional con 3 for
        System.out.println("\n\nArray tridimensional ");
        for (int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                int val =0;
                for (int k =0; k<5;k++){
                    val += intArrayTri[i][j][k];
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
