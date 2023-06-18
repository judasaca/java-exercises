package Entidad;

import java.time.LocalDate;
import java.util.Scanner;

public class Persona {
    public String nombre;
    public String sexo;
    public int edad; 
    public double peso, altura;
    
    private LocalDate fechaDeNacimiento;

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona() {

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public static Persona crearPersona() throws Exception{
        int año, mes, dia;

        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo");
        String sexo = leer.next();
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
            p.setSexo(sexo);
        } else {
            throw new Exception("Sexo debe tener valores de H, M u O.", null);
        }
        System.out.println("Ingrese el peso");
        p.setPeso(leer.nextDouble());

        System.out.println("Ingrese la altura");
        p.setAltura(leer.nextDouble());

        System.out.println("Ingrese el año de nacimiento:");
        año = leer.nextInt();

        System.out.println("Ingresa el mes de nacimiento:");
        mes = leer.nextInt();

        System.out.println("Ingresa el día de nacimiento:");
        dia = leer.nextInt();

        LocalDate fechaDeNacimiento = LocalDate.of(año, mes, dia);
        p.setFechaDeNacimiento(fechaDeNacimiento);
        
        return p;
    }

    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - this.getFechaDeNacimiento().getYear();
        System.out.println("La edad de "+this.nombre + " es "+ edad);
        return edad;
    }
    public boolean menorQue(int edad){
        return (this.calcularEdad() < edad);
    }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura, 2));
        int value = 0; 
        if (imc < 20) {
            System.out.println(this.nombre + " se encuentra debajo de su peso ideal.");
            value = -1;
        } else if(imc <= 25) {
            System.out.println(this.nombre + " tiene un peso ideal.");
            value = 0;
        } else if (imc > 25) {
            System.out.println(this.nombre + " tiene sobrepeso.");
            value = 1;
        }
        return value;
    }
    public boolean esMayorDeEdad(){
        return (this.edad >=18);
    }

    public void mostrarPersona(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Edad: "+ calcularEdad());
        System.out.println("Fecha de nacimiento: "+ getFechaDeNacimiento());
    }

}
