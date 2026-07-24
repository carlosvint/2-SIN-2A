package clase3;

import java.util.Scanner;


public class sentenciaSwitch {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Menu: 1. Abrir archivo. 2. Crear nuevo archivo. 3. Cerrar el programa");

    int opcion = sc.nextInt();

    switch (opcion) {
        case 1: 
            System.out.println("Abrir archivo.");
            break;
        case 2:
            System.out.println("Archivo creado");
            break;
        case 3:
            System.out.println("Programa cerrado");
            break;
        default:
            System.out.println("Opcion no valida");
    }

    }

}
