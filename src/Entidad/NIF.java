package Entidad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NIF {
    private String letra;
    private long DNI;
    public NIF(){

    }
    public NIF(String letra, long dNI) {
        this.letra = letra;
        DNI = dNI;
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public long getDNI() {
        return DNI;
    }
    public void setDNI(long dNI) {
        this.DNI = dNI;
    }
    public static void crearNif(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el DNI");
        NIF n = new NIF();
        n.setDNI(Long.parseLong(leer.nextLine()));
        long residuo = n.getDNI()%23L;

        // Map<Long, String> dict = new HashMap<Long, String>();
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println(n.getDNI()+'-' + letras[(int)residuo]);
}
