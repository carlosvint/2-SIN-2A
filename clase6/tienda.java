package clase6;

import java.util.Scanner;

interface Vendible {

    void vender(int cantidad);

}


class Producto {

    protected String nombre;
    protected double precio;
    protected int stock;

    private static int totalVentas = 0;

    public Producto (String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    public static void aumentarVentas(int cantidad){
        totalVentas += cantidad;
    }

    public static int getTotalVentas(){
        return totalVentas;
    }


    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){

        if (precio > 0){
            this.precio = precio;
        }
    }

    public void setStock(int stock){
        if (stock > 0){
            this.stock = stock;
        }
    }
}


class Videojuego extends Producto implements Vendible {

    private String genero;

    public Videojuego(String nombre, double precio, int stock, String genero){
        super(nombre, precio, stock);
        this.genero = genero;

    }

    @Override
    public void vender(int cantidad){

        if(cantidad <= 0){
            System.out.println("Cantidad debe ser mayor a 0");
            return;
        }

        if (getStock() >= cantidad){
            setStock(getStock() - cantidad);
            Producto.aumentarVentas(cantidad);
            System.out.println("Venta realizada");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

}


class Consola extends Producto implements Vendible {

    private String fabricante;

    public Consola(String nombre, double precio, int stock, String fabricante){
        super(nombre, precio, stock);
        this.fabricante = fabricante;

    }

    @Override
    public void vender(int cantidad){

        if(cantidad <= 0){
            System.out.println("Cantidad debe ser mayor a 0");
            return;
        }

        if (getStock() >= cantidad){
            setStock(getStock() - cantidad);
            Producto.aumentarVentas(cantidad);
            System.out.println("Venta realizada");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

}



public class tienda {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Producto [] inventario = {
            new Videojuego("Super Smash Bros", 60.0, 100, "Peleas"),
            new Videojuego("Minecraft", 20, 200, "Sandbox"),

            new Consola("Play Station 5", 500, 10, "Sony"),
            new Consola("PlayStation 4", 250, 10, "Sony")
        };

        int opcion;

        do {

            System.out.println("\n===============================");
            System.out.println("TIENDA DE VIDEOJUEGOS");
            System.out.println("\n===============================");

            System.out.println("1. Mostrar Productos");
            System.out.println("2. Vender Producto");
            System.out.println("3. Agregar Stock");
            System.out.println("4. Mostrar tipo de producto");
            System.out.println("5. Mostrar total de ventas");
            System.out.println("6. Salir");

            opcion = sc.nextInt();

            switch (opcion){

                case 1: 

                    for (int i =0; i < inventario.length; i++){
                        System.out.println("Producto #" + (i+1));
                        inventario[i].mostrarInformacion();
                    }
                    break;

                case 2:
                    System.out.println("Seleccionar un producto");

                    for (int i = 0; i < inventario.length; i++){
                        System.out.println((i + 1) + ". " + inventario[i].getNombre());
                    }

                    System.out.println("Producto: ");

                    int indice = sc.nextInt() - 1;

                    if (indice >=0 && indice < inventario.length){
                        System.out.println("Cantidad: ");
                        int cantidad = sc.nextInt();

                        if (inventario[indice] instanceof Vendible){
                            Vendible v = (Vendible) inventario[indice];
                            v.vender(cantidad);
                        }
                    } else {
                        System.out.println("Producto Invalido");
                    }
            }

        } while (opcion != 6);

        sc.close();

    }

}
