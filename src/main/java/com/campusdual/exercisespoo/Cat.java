package com.campusdual.exercisespoo;

public class Cat {
    /*
    Crea una clase llamada Cat
    La clase debe tener las siguientes propiedades sin inicializar:
    - nombre (name)
    - raza (breed)
    - sexo (sex)
    - edad en meses (age) (estática)
    - tamaño del pelo (hair)
    - color del pelo (colour) (estática)
    - un booleano que indique si está castrado/a o no (castrated)I

    La clase debe tener las siguientes propiedades con los valores inicializados
    - el color de los ojos (eyeColour): "green"

    Crea un constructor que incluya todos los atributos no inicializados

    Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

    Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

    Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

    Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

    Crea un main()

    Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

    Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

    Cámbiale el color del pelo a los dos primeros gatos

    Cámbiale el color de los ojos al último gato

    Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

    Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

    Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático, getters y setters)
     Verás cómo afecta a los métodos estáticos
   */
    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;
    public String eyeColour = "green";

    public Cat(String name, String breed, String sex, String hair, boolean castrated, int age,String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hair = hair;
        this.castrated = castrated;
        this.age= age;
        this.colour=colour;
    }

    public static String changeColour(String color) {
        colour = color;
        return colour;
    }

    public void changeEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public static int changeAge(int edad) {
        age = edad;
        return age;
    }

    public int getAge() {
        return age;
    }

    public void changeCastrated() {
        this.castrated = true;
    }

    public void isCastrated() {
        if (this.castrated == true) {
            System.out.println("Este gato está castrado");
        } else {
            System.out.println("Este gato non está castrado");
        }
    }

    public void catDetails() {
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Sexo: " + sex);
        System.out.println("Edad: " + age + " meses");
        System.out.println("Tamaño del pelo: " + hair);
        System.out.println("Color del pelo: " + colour);
        System.out.println("Color de los ojos: " + eyeColour);
        System.out.println("Castrado: " + (castrated ? "Sí" : "No"));

    }

    public static void main(String[] args) {
        Cat gatoStitch = new Cat("Stitch", "siamés", "macho", "pelo largo", false,10,"gris");
        Cat gatoNala = new Cat("Nala", "persa", "femia", "pelo corto", false, 8,"blanco");
        Cat gatoKira = new Cat("Kira", "esfinge", "femia", "pelo corto", false,3,"negro");

        gatoStitch.changeCastrated();
        gatoNala.changeCastrated();
        gatoStitch.catDetails();
        gatoNala.catDetails();
        gatoKira.catDetails();
    }

}
