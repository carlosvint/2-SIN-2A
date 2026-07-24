package clase4;

import java.util.Random;


class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre){
        this.nombre = nombre;
        this.notas = new double[5];
        generarNotas();
    }

    private void generarNotas(){
        Random random = new Random();

        for (int i = 0; i < notas.length; i++){
            notas[i] = random.nextDouble(0, 10);
        }

    }

    public void mostrarNotas(){
        for (int i=0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }

    public double calcularPromedio(){

        double suma = 0;

        for (int i=0; i < notas.length; i++){
            suma += notas[i];
        }

        return suma / notas.length;

    }


    public boolean estaAprobado(){
        return calcularPromedio() >= 7;
    }
}



public class SistemaNotas {
        public static void main(String[] args) {
            Estudiante e1 = new Estudiante("Carlos Vintimilla");
            // e1.generarNotas();
            System.out.println(e1.estaAprobado());
            e1.mostrarNotas();
    }
}
