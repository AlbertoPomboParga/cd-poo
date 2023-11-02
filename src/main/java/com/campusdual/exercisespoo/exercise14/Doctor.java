package com.campusdual.exercisespoo.exercise14;

import javax.sound.midi.Soundbank;

public class Doctor extends Persona{
    private String specialization;
    public Doctor(String name, String surname,String specialization) {
        super(name, surname);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public void getDetails(){

}
}