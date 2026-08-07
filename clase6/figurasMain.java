// package clase6;


// abstract class Figura {
    
//     public abstract double calcularArea();

// }


// class Circulo extends Figura {

//     private double radio;

//     public Circulo(double radio){
//         this.radio = radio;
//     }

//     public double calcularArea(){
//         return Math.PI * radio * radio;
//     }

// }


// class Cuadrado extends Figura {

//     private double lado;

//     public Cuadrado(double lado){
//         this.lado = lado;
//     }

//     public double calcularArea(){
//         return lado * lado;
//     }
// }


// class Triangulo extends Figura {

//     private double base;
//     private double altura;

//     public Triangulo(double base, double altura){
//         this.base = base;
//         this.altura = altura;
//     }

//     @Override
//     public double calcularArea(){
//         return (base * altura) / 2;
//     }
// }



// public class figurasMain {
    
//     public static void main(String[] args) {
        
//         Figura figuras[] = {
//             new Circulo(10),
//             new Cuadrado(10),
//             new Triangulo(4, 5)
//         };

//         for (Figura f : figuras){
//             System.out.println(f.calcularArea());
//         }

//     }
// }
