package Entidad;
import java.util.Arrays;

public class Ejercicio10 {
    public Ejercicio10(){
        double[] a, b;
        a = new double[50];
        b = new double[20];
        for (int i = 0; i < a.length; i++) {
            a[i]=Math.random();
        }
        System.out.println("Arreglo 'a' llenado: "+ Arrays.toString(a));
        Arrays.sort(a);
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        Arrays.fill(b, 10, b.length, 0.5);
        System.out.println("a: "+ Arrays.toString(a));
        System.out.println("b: "+ Arrays.toString(b));
    }

}
