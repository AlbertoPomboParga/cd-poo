package com.campusdual.exercisespoo.exercise14;

public class PoliceOfficer extends Persona {
    private String squad;

    public PoliceOfficer(String name, String surname,String squad) {
        super(name, surname);
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }
}
