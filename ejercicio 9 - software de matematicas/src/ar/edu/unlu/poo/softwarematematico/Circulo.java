package ar.edu.unlu.poo.softwarematematico;

import javax.swing.text.FlowView;

public class Circulo extends FiguraDosDimensiones{
    private Double radio;

    public Circulo(Double radio){this.radio=radio;}

    public void setRadio(Double radio){this.radio=radio;}

    public Double getRadio(){return radio;}

    @Override
    public Double GetArea() {
        return (Math.PI)*(Math.pow(radio,2.0d));
    }
}
