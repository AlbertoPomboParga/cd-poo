package com.campusdual.exercisespoo.exercise20;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Persona;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {

    public static void main(String[] args) {
        List<Persona> stringList = new ArrayList<>();


        stringList.add(new Persona("alberto","pombo"));
        stringList.add(new Teacher("Maria","Smith","educacion"));
        stringList.add(new PoliceOfficer("Jack","Peralta","B99"));
        stringList.add(new Doctor("Jack","Johns","nefrologia"));


    }
}
