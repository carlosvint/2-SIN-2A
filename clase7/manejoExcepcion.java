package clase7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class PosicionNegativa extends Exception {
    public PosicionNegativa(String msg){
        super(msg);
    }
}


class Busqueda {

    int posicion;

    public Busqueda(int posicion) {
        if (posicion < 0){
            throw new ArrayIndexOutOfBoundsException("La posicion no puede ser negativa");
        }
        this.posicion = posicion;
    }

    public void buscar(int[] array){

        System.out.println(array[posicion]);
    }
}



public class manejoExcepcion {
    

    public static void dividir(int numero) throws ArithmeticException {
            int division = 10 / numero;
            System.out.println("10 dividido para " + numero + " = " + division);
    }


    public static void leerArchivo(){

        try {

            FileReader archivo = new FileReader("datos.txt");

        } catch (FileNotFoundException e){

            System.out.println(e);
        
        }



    }




    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int[] array = new int[5];


        try {
            int numero = sc.nextInt();
            System.out.println("Numero ingresado " + numero);
            dividir(numero);
            Busqueda b = new Busqueda(-1);
            b.buscar(array);
            // int[] numeros = new int[numero];
            // System.out.println("El n + 1 es " + numeros[numero + 1]);

            // leerArchivo();

        } catch (InputMismatchException e){

            System.out.println(e.getMessage());
            System.out.println("Tiene que ingresar un numero.");

        } 
        catch (ArithmeticException e){

            System.out.println(e.getMessage());
            System.out.println("Division para cero. Ingrese un nuevo numero.");

        } 
        catch (Exception e){
            
            System.out.println(e);
            System.out.println(e.getMessage());

        }


        sc.close();
    }


}
