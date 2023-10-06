package ar.edu.unlu.poo.softwarematematico;

public class Circulo extends FiguraDosDimensiones {
    private Double radio;

    public Circulo(Double radio){this.radio=radio;}

    public void setRadio(Double radio){this.radio=radio;}

    public Double getRadio(){return radio;}

    @Override
    public Double getPerimetro() {
        return 2*(Math.PI)*radio;
    }

    @Override
    public Double getArea() {
        return (Math.PI)*(Math.pow(radio,2.0d));
    }
}
