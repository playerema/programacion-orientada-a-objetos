package ar.edu.unlu.poo.softwarematematico;

public class Paralelepipedo extends FiguraTresDimensiones {

    private Double arista1;
    private Double arista2;
    private Double arista3;

    public Paralelepipedo(Double arista1,Double arista2,Double arista3){
        this.arista1=arista1;
        this.arista2=arista2;
        this.arista3=arista3;
    }

    @Override
    public Double getArea() {
        return 2*(arista1*arista2+arista1*arista3+arista2*arista3);
    }

    @Override
    public Double getVolumen() {
        return arista1*arista2*arista3;
    }

    public void setArista1(Double arista){this.arista1=arista;}
    public void setArista2(Double arista){this.arista2=arista;}
    public void setArista3(Double arista){this.arista3=arista;}

    public Double getArista1(){return this.arista1;}
    public Double getArista2(){return this.arista2;}
    public Double getArista3(){return this.arista3;}
}
