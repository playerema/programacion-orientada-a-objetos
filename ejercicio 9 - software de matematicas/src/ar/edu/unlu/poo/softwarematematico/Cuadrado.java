package ar.edu.unlu.poo.softwarematematico;

public class Cuadrado extends Rectangulo {

    public Cuadrado(Double lado){
        super(lado,lado);
        this.base =lado;
    }

    @Override
    public Double getArea() {
        return base * base;
    }

    public void setLado(Double lado){this.setBase(lado);}

    public Double getLado(){return this.base;}

    @Override
    public Double getPerimetro() {
        return base *4;
    }

    @Override
    public Double getBase() {
        return super.getBase();
    }

    @Override
    public Double getAltura() {
        return super.getAltura();
    }

    @Override
    public void setBase(Double base) {
        super.setBase(base);
        this.altura=base;
    }

    @Override
    public void setAltura(Double base) {
        super.setBase(base);
        this.altura=base;
    }


}
