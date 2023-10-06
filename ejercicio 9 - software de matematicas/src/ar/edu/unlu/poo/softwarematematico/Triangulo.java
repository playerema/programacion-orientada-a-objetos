package ar.edu.unlu.poo.softwarematematico;

public class Triangulo extends FiguraDosDimensiones {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public Double getArea() {
        return (base*altura)/2;
    }

    public void setBase(Double base){this.base=base;}

    public Double getBase(){return this.base;}

    public void setAltura(Double altura){this.altura=altura;}

    public Double getAltura(){return this.altura;}

    @Override
    public Double getPerimetro() {
        return base + altura + Math.pow((base*base)+(altura*altura),0.5);
    }
}
