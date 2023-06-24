package Entidad;

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
        int residuo =n.getDNI()%23;
    }

    
}
