package Entidad;

import java.io.Console;

public class Raices {
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }
    public boolean tieneRaices() {
        return getDiscriminante()>0;
    }
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    public void obtenerRaices(){
        if (tieneRaices()) {
            System.out.println("Raiz 1: " +  ((-this.b + Math.sqrt(Math.pow(this.b, 2)-4*this.a*this.c))/(2*this.a)));
            System.out.println("Raiz 1: " +  ((-this.b - Math.sqrt(Math.pow(this.b, 2)-4*this.a*this.c))/(2*this.a)));

        } else {
            System.out.println("La ecuación no tiene raices reales.");
        }
    }
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            System.out.println("La raiz es "+ (-this.b/2*this.a));
        } else {
            System.out.println("La ecuación no tiene una única raíz.");
        }
    }
    public void calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if (tieneRaiz()){
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene raices reales.");
        }
    }

    
}
