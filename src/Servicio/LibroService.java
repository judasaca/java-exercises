package Servicio;

import java.util.Scanner;

import Entidad.Libro;

public class LibroService {
    public Libro crearLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el ISBN");
        String ISBN = leer.nextLine();
        System.out.println("Ingresa el titulo");
        String titulo = leer.nextLine();
        System.out.println("Ingresa el autor");
        String autor = leer.nextLine();
        System.out.println("Ingresa el número de páginas");
        int numeroPaginas = leer.nextInt();

        Libro newLibro = new Libro(ISBN, titulo, autor, numeroPaginas);
        mostrarLibro(newLibro);
        return newLibro;
    }
    public void mostrarLibro(Libro libro){
        System.out.println("ISBN: "+libro.ISBN);
        System.out.println("Título: "+libro.titulo);
        System.out.println("Autor: "+libro.autor);
        System.out.println("Número de páginas: "+libro.numeroPaginas);
    }
}
