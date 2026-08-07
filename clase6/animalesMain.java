package clase6;


abstract class Animal {

    public String nombre;

    public Animal (String nombre){
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

}


class Perro extends Animal {

    public Perro (String nombre){
        super(nombre);
    }
   
    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }

}


class Gato extends Animal {

    public Gato (String nombre){
        super(nombre);
    }
   
    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }

}


class Vaca extends Animal {

    public Vaca (String nombre){
        super(nombre);
    }
   
    @Override
    public void hacerSonido() {
        System.out.println("Muuuuu");
    }

}


public class animalesMain {
    
    public static void main(String[] args) {
        // Animal a = new Perro("Pepe");
        // a.hacerSonido();


        Animal[] animales = {
            new Perro("Pepe"),
            new Gato("Bigotes"),
            new Vaca("Clara")
            };

        for (Animal a : animales){
            a.hacerSonido();
        }
    }

}
