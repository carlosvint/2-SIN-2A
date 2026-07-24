package clase2;

import java.util.Scanner;

public class condicionales {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese la presion del paciente: ");

        // int presion = sc.nextInt();

        // if (presion > 150){
        //     System.out.println("ALERTA");
        // }

        // System.out.println("Bienvenido al Laboratorio, ingrese el pin: ");

        // int pin = sc.nextInt();

        // if (pin == 1234){
        //     System.out.println("Abriendo la puerta");
        // } 
        // else {
        //     System.out.println("Acceso denegado");
        // }

        System.out.println("Ingrese su nota: ");

        int nota = sc.nextInt();

        if (nota >= 8){
            System.out.println("Buen trabajo");
        } else if (nota >= 6){
            System.out.println("Tu puedes");
        } else if (nota >= 4){
            System.out.println("Debes estudiar mas");
        }
        else {
            System.out.println("Debes dar un examen de recuperacion");
        }


        if (nota >= 6){
            System.out.println("Tu puedes");
        } else if (nota >= 8){
            System.out.println("Buen trabajo");
        } else if (nota >= 4){
            System.out.println("Debes estudiar mas");
        }
        else {
            System.out.println("Debes dar un examen de recuperacion");
        }

        if (nota < 4){
            System.out.println("Debes dar un examen de recuperacion");
        } else if (nota > 4) {
            System.out.println("Debes estudiar mas");
        } else if (nota < 8) {
            System.out.println("Tu puedes");
        } else {
            System.out.println("Buen trabajo");
        } 

    }

}


// si x > 150 entonces generar_alerta
// if x > 150 then generar_alerta