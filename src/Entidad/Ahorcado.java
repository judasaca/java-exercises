package Entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    private String[] palabra;
    private int cantidadMaximaIntentos, cantidadLetrasEncontradas, cantidadIntentos;

    public Ahorcado(String[] palabra, int cantidadIntentosMaximos, int cantidadLetrasEncontradas, int cantidadIntentos) {
        this.palabra = palabra;
        this.cantidadMaximaIntentos = cantidadIntentosMaximos;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadIntentos = cantidadIntentos;
    }
    public Ahorcado() {
    }
    public static Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la palabra");
        String[] p = leer.nextLine().split("");
        System.out.println("Ingresa la cantidad máxima de intentos");
        int intentos = Integer.parseInt(leer.nextLine());
        Ahorcado juego = new Ahorcado(p, intentos, 0, 0);
        return juego;
    }
    public int longitud(){
        return this.palabra.length;
    }
    public boolean buscarLetra(String letra){
        return Arrays.asList(this.palabra).contains(letra);
    }
    public int intentos(){
        return this.cantidadMaximaIntentos - this.cantidadIntentos;
    }
    public void juego(){
        Scanner leer = new Scanner(System.in);
        this.cantidadIntentos+=1;
        while (intentos()>0 & this.cantidadLetrasEncontradas<this.palabra.length) {
            System.out.println("-----------------------------------------");
            System.out.println("Ingresa una letra");
            String letra = leer.nextLine();
            String mensaje;
            if (buscarLetra(letra)) {
                mensaje = "Letra encontrada";
                for (int i = 0; i < this.palabra.length; i++) {
                    if (this.palabra[i].equals(letra)) {
                        this.palabra[i] = "-";
                        this.cantidadLetrasEncontradas+=1;
                    }
                }
                
                
            } else {
                mensaje = "Letra no encontrada";
            }
            System.out.println("Longitud de la palabra: "+ this.palabra.length);
            System.out.println("Mensaje: "+ mensaje);
            System.out.println("Número de letras (encontradas, faltantes): ("+this.cantidadLetrasEncontradas+ ", " + (longitud()-this.cantidadLetrasEncontradas)+')');
            System.out.println("Número de oportunidades restantes: "+intentos());
        }
        if (cantidadLetrasEncontradas==longitud()) {
            System.out.println("Felicidades, encontraste la palabra!");
        } else {
            System.out.println("Has perdido.");
        }
    }
}
