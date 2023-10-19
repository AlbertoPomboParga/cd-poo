package com.campusdual.exercisespoo;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        String cnv = "200";
        int cnvInt = Integer.parseInt(cnv);
        cnv=cnv+1;
        cnvInt = cnvInt +1;
        String cnvStr = String.valueOf(cnvInt);
        char cnvChar =cnvStr.charAt(2);


        int i=1;
        String iStr = String.valueOf(i);
        Double iDouble = Double.valueOf(iStr);
        String iDStr = String.valueOf(iDouble)
        System.out.println(Boolean.valueOf("true"));
        System.out.println(String.valueOf(false));


        //1= "1" = 1.0 = "true"
        //0= "0" = 0.0 = "false"
        //2= "2" = 2.00 = "true"
}
