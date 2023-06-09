package Servicio;

import java.util.Scanner;

import Entidad.Persona;

public class PersonaService {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona newPersona = new Persona();

        System.out.println("Ingresa el nombre de la persona");
        String nombre = leer.nextLine();
        newPersona.setNombre(nombre);

        System.out.println("Ingresa el primer apellido de la persona");
        newPersona.setPrimerApellido(leer.nextLine());

        System.out.println("Ingresa la edad de la persona");
        int edad = leer.nextInt();
        newPersona.setEdad(edad);
        
        return newPersona;

        
    }
}
