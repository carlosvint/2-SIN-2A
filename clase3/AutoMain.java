package clase3;

class Auto {
    int año;
    String propietario;
    String marca;

    Auto(int año, String propietario, String marca){
        this.año = año;
        this.propietario = propietario;
        this.marca = marca;
    }

    public void enceder(){
        System.out.println("El auto esta encendido");
    }

    public void apagar(){
        System.out.println("El auto esta apagado");
    }

}

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto(2001, "Juan Perez", "Toyota");

        System.out.println(auto1.año);
        System.out.println(auto1.propietario);

        auto1.enceder();
        auto1.apagar();

        Auto auto2 = new Auto(2002, "Carlos Vintimilla", "Chevrolet");

        // auto2.propietario = "Carlos Vintimilla";

        System.out.println(auto2.año);
        System.out.println(auto2.propietario);
        
        auto2.enceder();
        auto2.apagar();
    }

}