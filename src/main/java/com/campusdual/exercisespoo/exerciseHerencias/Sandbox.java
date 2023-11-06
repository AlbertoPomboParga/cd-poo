package com.campusdual.exercisespoo.exerciseHerencias;

public class Sandbox {
    public static void main(String[] args) {
        Perro p1 = new Perro(90, 28, 11, "domestico", "gris",
                "canis", "Balto", "casa", "guau guau");
        Caballo c1 = new Caballo(170, 130, 6, "serra gallega", "marron",
                "equus", "Spirit", "o monte", "jiu jiu jiu");
        Halcon h1 = new Halcon(20, 7, 5, "salvaje", true,  "falco",
                "Jusé", "o ceo", "piuuu piuuu");
        Pollo po1 = new Pollo(30, 5, 2, "domestico", true,
                "gallus", "Calimero", "terra", "pio pio");
        Delfin d1 = new Delfin(150, 60, 15, "salvaje",  false,
                "delphinidae", "Flipper", "oceano", "iiii iiii");
        Orca o1 = new Orca(700, 10000, 12, "salvaje",false,
                "orcinus orca", "Willy", "mar", "iiiiiiiiiiiiiiio");
        p1.presentarse();
        c1.presentarse();
        h1.presentarse();
        po1.presentarse();
        d1.presentarse();
        o1.presentarse();
    }
}
