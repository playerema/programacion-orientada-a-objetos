package ar.edu.unlu.poo.softwarematematico;

public class Rectangulo extends FiguraDosDimensiones {
    protected Double base;
    protected Double altura;

    public Rectangulo(Double base, Double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public Double getPerimetro() {
        return 2*base+2*altura;
    }

    @Override
    public Double getArea() {
        return base*altura;
    }

    public void setBase(Double base){this.base=base;}

    public Double getBase(){return this.base;}

    public void setAltura(Double altura){this.altura=altura;}

    public Double getAltura(){return this.altura;}
}
