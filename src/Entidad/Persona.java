package Entidad;

public class Persona {
    public String nombre;
    public String primerApellido;
    public int edad; 

    public Persona(String nombre, Integer edad, String primerApellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.primerApellido = primerApellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}
