package clase5;


import java.util.Scanner;


class Animal {

    public String especie;
    public String nombre;
    public String nombreTutor;
    protected int edad;
    public String sintomas;

    public Animal (String especie, String nombre, String nombreTutor, int edad){
        this.especie = especie;
        this.nombre = nombre;
        this.nombreTutor = nombreTutor;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("El paciente " + nombre + "(" + especie + ")" + "tiene " +  edad + " años.");
    }

    public void diagnosticar(){
        System.out.println("Cuales son los sintomas del paciente?");
    }

    public void agendarCita(){
        System.out.println("Agende una fecha para su cita");
    }
}

class Perro extends Animal{

    public int precioConsulta = 10;
    public String raza;
    protected boolean isTerrier;

    public Perro(String nombre, String nombreTutor, int edad, String raza){

        super("Perro", nombre, nombreTutor, edad);
        this.raza = raza;
        this.isTerrier = true;
    }

    @Override
    public void diagnosticar(){
        System.out.println("Cuales son los sintomas del perro?");
    }

}

class Gato extends Animal{

    public Gato(String especie, String nombre, String nombreTutor, int edad){
        super(especie, nombre, nombreTutor, edad);
    }

    @Override
    public void diagnosticar(){
        System.out.println("Cuales son los sintomas del gato?");
    }
}

class Vaca extends Animal{


    public Vaca (String especie, String nombre, String nombreTutor, int edad){
        super(especie, nombre, nombreTutor, edad);
    }

}


class Terrier extends Perro {

    boolean isTerrier = super.isTerrier;
    
    public Terrier(String nombre, String nombreTutor, int edad, String raza){
        super(nombre, nombreTutor, edad, raza);
    }
}


public class veterinaria {

    public static void main(String[] args) {
        Terrier perro = new Terrier("Pepe", "Carlos Vintimilla", 12, "Schnauzer");
        // Animal gato = new Gato("gato", "Bigotes", "Carlos Vintimilla", 8);


        System.out.println(perro.edad);
        System.out.println(perro.raza);
        System.out.println(perro.isTerrier);
        System.out.println(perro instanceof Animal);
        perro.diagnosticar();

        System.out.println(perro.hashCode());
        System.out.println(perro.toString());
        // gato.diagnosticar();


    }

}
