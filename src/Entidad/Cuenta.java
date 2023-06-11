package Entidad;


public class Cuenta {
    private int numeroCuenta;
    private double saldoActual;
    private long dni;
    public Cuenta(int numeroCuenta, double saldoActual, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public void ingresar(double ingreso){
        this.saldoActual+=ingreso;
    }
    public void retirar(double retiro){
        double saldoFinal = this.saldoActual -retiro;
        if (saldoFinal<0){
            this.saldoActual=0;
        } else {
            this.saldoActual=saldoFinal;
        }
    }
    public void extracionRapida(double retiro){
        double proporcion = retiro/this.saldoActual;
        if (proporcion>0.2) {
            System.out.println("No se puede retirar más del 20% de su saldo actual.");
        }else {
            this.saldoActual -= retiro;
        }
    }
    public void consultarSaldo(){
        System.out.println("El saldo actual es "+this.saldoActual + " USD");
    }
    public void consultarDatos(){
        System.out.println("Los datos de la cuenta son los siguientes...");
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI: "+ this.dni);
    }

}
