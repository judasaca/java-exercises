package Entidad;

import javax.xml.transform.Source;

public class Matematica {
    double num1, num2;

    public Matematica(){

    }
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double devolverMayor(){
        if (this.num1 > this.num2){
            return this.num1;
        } else {
            return this.num2;
        }
    }
    public void calculaPotencia(){
        double mayor= devolverMayor();
        double menor;
        if (mayor==this.num1){
            menor = this.num2;
        } else {
            menor = this.num1;
        }
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        System.out.println("La potencia es "+ Math.pow(mayor, menor));
    }
    public void calculaRaiz(){
        double menor;
        if (this.num1 > this.num2) {
            menor = this.num2;
        } else {
            menor = this.num1;
        }
        menor = Math.abs(menor);
        System.out.println("La raiz cuadrada del menor número es " + Math.sqrt(menor));
    }
}
