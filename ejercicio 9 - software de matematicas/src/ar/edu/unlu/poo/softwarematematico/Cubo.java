package ar.edu.unlu.poo.softwarematematico;

public class Cubo extends FiguraTresDimensiones{
    private Double arista;

    public Cubo(Double arista){this.arista=arista;}

    @Override
    public Double getArea() {
        return 6*Math.pow(arista,2.0d);
    }

    @Override
    public Double getVolumen(){
        return Math.pow(arista,3.0d);
    }

    public void setArista(Double arista){this.arista=arista;}

    public Double getArista(){return this.arista;}
}
