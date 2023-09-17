package ar.edu.unlu.poo.softwarematematico;

public class Cuadrado extends FiguraDosDimensiones{
    public Double lado1;
    public Double lado2;

    public Cuadrado(Double lado1, Double lado2){
        this.lado1 =lado1;
        this.lado2 =lado2;
    }

    @Override
    public Double GetArea() {
        return lado1 * lado2;
    }

    public void setLado1(Double lado){this.lado1=lado;}

    public Double getLado1(){return this.lado1;}

    public void setLado2(Double lado){this.lado2=lado;}

    public Double getLado2(){return this.lado2;}
}
