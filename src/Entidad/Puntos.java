package Entidad;

import java.util.Scanner;

public class Puntos {
    private double x1, x2, y1, y2;

    public Puntos() {
    }
    public static Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el punto X1:");

        Puntos p = new Puntos();
        p.setX1(Double.parseDouble(leer.nextLine()));

        System.out.println("Ingresa el punto Y1");
        p.setY1(Double.parseDouble(leer.nextLine()));

        System.out.println("Ingresa el punto X2");
        p.setX2(Double.parseDouble(leer.nextLine()));

        System.out.println("Ingresa el punto Y2");
        p.setY2(Double.parseDouble(leer.nextLine()));
        System.out.println(p);
        return p;
    }
    public double calcularDistancia(){
        return Math.sqrt(Math.pow(getX1()-getX2(), 2) + Math.pow(getY1()-getY2(), 2));
    }
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
