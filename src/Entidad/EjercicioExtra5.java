package Entidad;

import java.util.Scanner;

public class EjercicioExtra5 {
    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[10];
    public EjercicioExtra5(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivina el mes");
        while (true) {
            String mesIngresado = leer.nextLine().toLowerCase();
            if(mesIngresado.equals(this.mesSecreto)){
                break;
            } else {
                System.out.println("Sigue intentando...");
            }
        }
        System.out.println("Lo lograste! El mes secreto era "+ this.mesSecreto);
    }
}
