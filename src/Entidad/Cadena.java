package Entidad;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cadena {
    String frase;
    int longitud;
    public Cadena(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la frase");
        this.frase = leer.nextLine();
        this.longitud = this.frase.length();
    }
    public void setFrase(String frase){
        this.frase = frase;
        this.longitud = frase.length();
    }
    public void mostrarVocales(){
        String lower = this.frase.toLowerCase();
        int contador = 0;
        String[] vocales = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < this.longitud; i++) {
            String letra = lower.split("")[i];
            if (Arrays.asList(vocales).contains(letra)) {
                contador++;
            } 
        }
        System.out.println("La frase '"+ this.frase +"' contiene "+contador+" vocales");
    }
    public void invertirFrase(){
        String[] letrasInvertidas = Collections.reverse(Arrays.asList(this.frase.split("")));
        String fraseInvertida =String.join();
    }
}
