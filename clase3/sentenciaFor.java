package clase3;

public class sentenciaFor {
    public static void main(String[] args) {
        triangulo();
    }

    public static void contar(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void contar_pares(){
        for (int i = 2; i <= 10; i+=2){
            System.out.println(i);
        }
    }

    public static void contar_impares(){
        for (int i = 1; i <= 10; i+=2){
            System.out.println(i);
        }
    }

    public static void triangulo(){
        for (int i = 1; i <= 5; i++){
            System.out.println("*".repeat(i));
        }
    }

    public static void cuadrado(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<=5; j++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void factorial(){
        for (int i = 1; i <=5; i++){

            int factorial = 1;

            for (int j = 1; j <= i; j++){
                System.out.println(j);
                factorial *= j;
            }

            System.out.println(i + "!= " + factorial);

        }
    }

}
