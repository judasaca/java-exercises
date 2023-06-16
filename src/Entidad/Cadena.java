package Entidad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        List<String> letrasInvertidas = Arrays.asList(this.frase.split(""));
        Collections.reverse(letrasInvertidas);
        String fraseInvertida =String.join("", letrasInvertidas);
        System.out.println(fraseInvertida);
    }
    public void vecesRepetido(String letra){
        int contador = 0;
        for (int i = 0; i < this.frase.length(); i++) {
            if (letra.equals(this.frase.split("")[i])){
                contador++;
            }
        }
        System.out.println("La letra "+letra+" se repite "+contador+" veces.");
    }
}
