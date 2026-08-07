package clase6;


abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("--------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

    public abstract double calcularBono();

}


class Profesor extends Empleado {

    public boolean tiempoCompleto;
    public String facultad;

    public Profesor (String nombre, double salario, boolean tiempoCompleto, String facultad){
        super(nombre, salario);
        this.tiempoCompleto = tiempoCompleto;
        this.facultad = facultad;
    };

    public double calcularBono(){
        return salario * 1.1;
    }
}



public class claseAbstractaMain {
    
    public static void main(String[] args) {
        Empleado p = new Profesor("Carlos", 1000, false, "ECC");
        System.out.println(p.calcularBono());
    }

}
