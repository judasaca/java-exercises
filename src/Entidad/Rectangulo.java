package Entidad;

public class Rectangulo {
    private int base, altura;


    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area(){
        return this.altura*this.base;
    }
    public double perimetro(){
        return 2*(this.altura+this.base);
    }
    public void dibujar(){
        for (int i = 0; i < this.altura; i++) {
            System.out.print("*");
            for (int j = 1; j < this.base-1; j++) {
                if (i==0 || i==this.altura-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }                
            }
            System.out.println("*");
        }
    }
}
