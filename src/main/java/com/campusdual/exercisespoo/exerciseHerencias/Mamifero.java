package com.campusdual.exercisespoo.exerciseHerencias;

public class Mamifero extends Animal {
    protected String habitat;
    protected String colorPelo;

    public Mamifero(int altura, int peso, int edad, String habitat, String colorPelo) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorPelo = colorPelo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}
