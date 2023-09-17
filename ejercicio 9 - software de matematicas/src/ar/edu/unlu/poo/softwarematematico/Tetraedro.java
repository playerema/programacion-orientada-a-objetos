package ar.edu.unlu.poo.softwarematematico;

public class Tetraedro extends FiguraTresDimensiones{
    private Double arista;

    public Tetraedro(Double arista){
        this.arista=arista;
    }

    @Override
    public Double getArea(){
        return Math.pow(arista,2.0d)*Math.pow(3.0d,0.5d);
    }

    @Override
    public Double getVolumen(){
        return (Math.pow(arista,3.0d)*Math.pow(2.0d,0.5d))/12;
    }

    public void setArista(Double arista){this.arista=arista;}

    public Double getArista(){return this.arista;}
}
