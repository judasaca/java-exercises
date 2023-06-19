package Entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasPorSemana;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso(){

    }
    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana,
            double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }
    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }
    public int getCantidadDiasPorSemana() {
        return this.cantidadDiasPorSemana;
    }
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    public double getPrecioPorHora() {
        return precioPorHora;
    }
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    public String[] getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    public void cargarAlumnos(){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < this.alumnos.length; i++) {
            System.out.println("Ingresa el alumno #"+(i+1));
            String alumno = leer.nextLine();
            this.alumnos[i] = alumno;
        }
        System.out.println("Alumnos ingresados exitosamente:");
        System.out.println(Arrays.toString(this.alumnos));
    }
    public void calcularGananciaSemanal(){
        double gananciaSemanal = getCantidadHorasPorDia()*getPrecioPorHora()*getAlumnos().length*getCantidadDiasPorSemana();
        System.out.println("La ganancia semanal es de "+ gananciaSemanal);
    }
}
