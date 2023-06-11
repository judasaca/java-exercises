package Servicio;

import java.util.Scanner;

import Entidad.Operacion;

public class OperacionService {
    public Operacion crearOperacion(){
        System.out.println("Ingresa el primer número");
        Scanner leer = new Scanner(System.in);
        double numero1 = leer.nextDouble();
        System.out.println("Ingresa el segundo número");
        double numero2 = leer.nextDouble();
        Operacion nOperacion = new Operacion(numero1, numero2);
        return nOperacion;
    }
    public double sumar(Operacion operacion){
        return operacion.getNumero1() + operacion.getNumero2();
    }
    public double restar(Operacion operacion){
        return operacion.getNumero1() - operacion.getNumero2();
    }
}
