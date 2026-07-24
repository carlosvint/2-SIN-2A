package clase3;

import java.util.Scanner;


public class sentenciadoWhile {
    public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     int opcion;


    //     do {
    //     System.out.println("=== MENÚ ===");
    //     System.out.println("1. Retirar");
    //     System.out.println("2. Depositar");
    //     System.out.println("3. Salir");
    //     System.out.print("Seleccione una opción: ");

    //     opcion = sc.nextInt();

    //     switch (opcion) {
    //         case 1:
    //             System.out.println("Retirando dinero");
    //             break;
    //         case 2:
    //             System.out.println("Depositando dinero");
    //             break;
    //         case 3:
    //             System.out.println("Salir del programa");
    //             break;
    //         default:
    //             System.out.println("Opcion invalida");
    //             break;
    //     }
    // } while (opcion != 3);


        int numero = 10;

        while (numero < 5) {
            System.out.println("While");
            numero ++;
        }

        do {
            System.out.println("Do While");
            numero++;
        } while (numero<5);


    }
}
