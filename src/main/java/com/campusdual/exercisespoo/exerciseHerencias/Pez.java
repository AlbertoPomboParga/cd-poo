package com.campusdual.exercisespoo.exerciseHerencias;

public class Pez extends Animal{
    protected String habitat;
    protected boolean escamas;

    public Pez(int altura, int peso, int edad, String habitat, boolean escamas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.escamas = escamas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }
}
