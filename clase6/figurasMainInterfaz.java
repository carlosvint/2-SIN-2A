package clase6;


interface Figuras {
    public double calcularArea();
}


class Circulo implements Figuras {

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

}


class Cuadrado implements Figuras {

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}


class Triangulo implements Figuras {

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
}



public class figurasMainInterfaz {
    
    public static void main(String[] args) {
        
        Figuras figuras[] = {
            new Circulo(10),
            new Cuadrado(10),
            new Triangulo(4, 5)
        };

        for (Figuras f : figuras){
            System.out.println(f.calcularArea());
        }

    }
}
