package clase4;

class CuentaBancaria {
    
    public String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }


    //Getters
    public double getSaldo(){
        return saldo;
    }

    //Setters
    // public void setSaldo(double saldo){
    //     this.saldo = saldo;
    // }

    public void depositar(double cantidad){
        
        if (cantidad > 0){
            saldo += cantidad;
        }

    }    

    public void retirar(double cantidad){

        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
        }
    }

}


public class CuentaBancariaMain {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos Vintimilla", 100);

        System.out.println(cuenta.titular);
        // System.out.println(cuenta.saldo);

        cuenta.depositar(200);
        cuenta.retirar(50);

        // cuenta.saldo = 1000;

        double s = cuenta.getSaldo();

        System.out.println(s);

    }

}
