package com.campusdual.exercisespoo.exercise16;

public class sandbox {
    public static void main(String[] args) {
        IMachine plane1 = new Plane("boeing");
        IMachine tractor1 = new Tractor(1200);

        plane1.start();
        plane1.stop();
        plane1.mantenaince();



        ((Plane)plane1).fly();


    }
}
