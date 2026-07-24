package clase4;

class Persona {
    
    public static int contador;

    public Persona(){
        contador += 1;
    };

    public static void saludar(){
        System.out.println("Hola");
    }

}


class Calculadora {

    public static int sumar(int a, int b){
        return a + b;
    }
}


public class estaticos {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        System.out.println(Persona.contador);

    }

}