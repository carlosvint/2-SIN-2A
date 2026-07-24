package clase2;

import java.util.Scanner;

public class programa_interactivo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Como te llamas? ");
        String nombre = sc.nextLine();

        System.out.println("Gusto en conocerte " + nombre);

        System.out.println("Cuantos años tienes?");
        String edad_string = sc.nextLine();

        int edad_num = Integer.parseInt(edad_string);

        System.out.println("Esos son " + (edad_num * 12) + " meses");

        // String texto = sc.nextLine(); //STRINGS
        // int entero = sc.nextInt(); // INT
        // double doble = sc.nextDouble(); //DOUBLE
        // boolean boleano = sc.nextBoolean(); //BOOLEAN

        // Double.parseDouble(iva);  Parsea STRING a DOUBLE
        // Long.parseLong(peso); Parsea STRING a LONG
        // Integer.parseInt(edad_string); Parsea STRING a INTEGER
        // String.valueOf(edad_num); Parse cualquier valor a STRING
        // Boolean.parseBoolean(edad_string);

        sc.close();

    }
}
