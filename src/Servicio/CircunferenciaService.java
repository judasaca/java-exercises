package Servicio;

import java.util.Scanner;

import Entidad.Circunferencia;

public class CircunferenciaService {
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el radio");
        Circunferencia newCircunferencia = new Circunferencia(leer.nextFloat());
        return newCircunferencia;        
    }
    public void area(Circunferencia circunferencia) {
        double area = Math.PI *Math.pow((double)circunferencia.getRadio(), 2); 
        System.out.println("Area: "+area);
    }
    public void perimetro(Circunferencia circunferencia){
        double perimetro = 2* Math.PI*circunferencia.getRadio();
        System.out.println("Perimetro: " + perimetro);
    }
}
