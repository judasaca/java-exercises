package Entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Movil {
    private String marca, modelo;
    private int[] codigo = new int[7];
    private double precio, memoriaRam, almacenamiento;
    public Movil(){

    }
    public Movil(String marca, String modelo, int[] codigo, double precio, double memoriaRam, double almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int[] getCodigo() {
        return codigo;
    }
    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public double getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public static Movil cargarCelular() {
        Scanner leer = new Scanner(System.in);
        Movil m = new Movil();
        System.out.println("Ingrese la marca:");
        m.setMarca(leer.nextLine());
        System.out.println("Ingrese el precio");
        m.setPrecio(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese el modelo");
        m.setModelo(leer.nextLine());
        System.out.println("Ingrese la memoria ram");
        m.setMemoriaRam(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese el almacenamiento");
        m.setAlmacenamiento(Double.parseDouble(leer.nextLine()));
        m.ingresarCodigo();
        return m;
    }
    public void ingresarCodigo(){
        Scanner leer = new Scanner(System.in);
        int[] c = new int[7];
        for (int i = 0; i < c.length; i++) {
            System.out.println("Ingresa el codigo en la posición "+i);
            c[i] =Integer.parseInt(leer.nextLine());
        }
        System.out.println("El codigo ingresado fue:"+ Arrays.toString(c));
        setCodigo(c);
    }
}
