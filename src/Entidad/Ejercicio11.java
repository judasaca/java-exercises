package Entidad;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio11 {
    int dia, mes, año;
    LocalDate fecha;
    public Ejercicio11(){
        // SimpleDateFormat formater = new SimpleDateFormat("dd/M/yy");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el año");
        año = Integer.parseInt(leer.nextLine());
        System.out.println("Ingresa el mes");
        mes = Integer.parseInt(leer.nextLine());
        System.out.println("Ingresa el dia");
        dia = Integer.parseInt(leer.nextLine());

        fecha = LocalDate.of(año, mes, dia);

        System.out.println("Fecha ingresada: "+fecha.toString());
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: "+ fechaActual.toString());
        System.out.println("La cantidad de años entre hoy y la fecha ingresada es: "+ Math.abs(fechaActual.getYear() - fecha.getYear()));
    }
}
