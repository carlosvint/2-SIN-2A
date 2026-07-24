package clase2;

import java.util.Scanner;


public class operadores_logicos {
    
    public static void main(String[] args) {
        // && AND
        // || OR
        // ! NOT    

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es su edad?");
        int edad = sc.nextInt();

        System.out.println("Cuanto gana al mes?");
        int ingresos = sc.nextInt();

        System.out.println("Tiene credito existente?(true/false)");
        boolean existente = sc.nextBoolean();

        if (edad >= 21 && ingresos >= 1000 && !existente){
            System.out.println("Crédito aprobado.");
        } else {
            System.out.println("Crédito rechazado.");
        }

        sc.close();

    }
}