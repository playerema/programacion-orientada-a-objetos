package ar.edu.unlu.poo.softwarematematico;

public class Esfera extends FiguraTresDimensiones {
    private Double radio;

    public Esfera(Double radio){this.radio=radio;}

    @Override
    public Double getArea(){
        return 4*Math.PI*Math.pow(radio,2.0d);
    }

    @Override
    public Double getVolumen(){
        return (4/3)*Math.PI*Math.pow(radio,3.0d);
    }

    public void setRadio(Double base){this.radio=radio;}

    public Double getRadio(){return this.radio;}
}
