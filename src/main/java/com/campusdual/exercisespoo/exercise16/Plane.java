package com.campusdual.exercisespoo.exercise16;

public class Plane implements IMachine{
    @Override
    public void start() {
        System.out.println("El avión está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El avión está parado");
    }

    @Override
    public void mantenaince() {
        System.out.println("El avión está en mantenimiento");
    }
    public void takeOff(){
        System.out.println("El avión está despegando");
    }
    public void land(){
        System.out.println("El avión está aterrizando");
    }
    public void fly(){
        System.out.println("El avión está volando");
    }
    public final   String name;
    public Plane(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getDetails(){
        return "El modelo del avión es " + this.getName();
    }
}
