package clase4;



interface MetodoPago {
    void pagar(double cantidad);
}


class PagoTarjeta implements MetodoPago {

    public String marcaTarjeta;
    private int numeroTarjeta;

    public PagoTarjeta(){};

    public void pagar(double cantidad){
        System.out.println(
            "Pagando $" + cantidad + "con Tarjeta"
        );
    }

}


class PagoPayPal implements MetodoPago {

    public String titularPayPal;
    private int numeroCuenta;

    public PagoPayPal(){};

    public void pagar(double cantidad){
        System.out.println(
            "Pagando $" + cantidad + "con PayPal"
        );
    }

    public void validarCuenta(){
        System.out.println("Valido");
    }
}


public class MainInterfaces {
    
    public static void main(String[] args) {
        MetodoPago p1 = new PagoTarjeta();
        p1.pagar(10);
        MetodoPago p2 = new PagoPayPal();
        p2.pagar(30);
    }

}
