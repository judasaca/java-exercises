package Entidad;

import java.io.Console;

public class Cafetera {
    double capacidadMaxima, cantidadActual;

    public double getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public Cafetera(){

    }
    public Cafetera(double capacidadMaxima, double cantidadActual){
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    public void servirTaza(int tamaño){
        double diferencia = this.cantidadActual - tamaño;
        if (diferencia < 0) {
            System.out.println("No fue posible llenar toda la taza.");
            System.out.println("Se sirvió un " + (100*cantidadActual/tamaño) + "% de la taza.");
            this.cantidadActual = 0;
        } else {
            System.out.println("Taza servida exitosamente.");
        }
    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    public void agregarCafe(int cantidad){
        double cantidadTotal = cantidad + this.cantidadActual;
        if (cantidadTotal > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual=cantidadTotal;
        }
    }
}
