package com.campusdual.exercisespoo.exercise14;

public class Persona {

    protected String name;
    protected String surname;

    public Persona(String name, String surname){
        this.name=name;
        this.surname=surname;
}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void getDetails(){

        System.out.println("este nombre es "+ this.getName());
        System.out.println("este apellido es"+ this.getSurname());
    }


    public static void main(String[] args) {
        Persona p1 = new Persona("Jose","Perez");
        System.out.println("El nombre de la persona es: "+ p1.name + " y su apellido es: "+ p1.surname);
    }

}
