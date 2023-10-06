import ar.edu.unlu.poo.softwarematematico.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("cubo");
        Cubo cubo = new Cubo(2.0d);

        System.out.println("arista: "+cubo.getArista());
        System.out.println("area: "+cubo.getArea());
        System.out.println("arista: "+cubo.getArista());

        System.out.println();
        System.out.println("esfera");
        Esfera esfera = new Esfera(2.0d);

        System.out.println("radio: "+esfera.getRadio());
        System.out.println("area: "+esfera.getArea());
        System.out.println("volumen: "+esfera.getVolumen());

        System.out.println();
        System.out.println("tetraedro");
        Tetraedro tetraedro = new Tetraedro(2.0d);

        System.out.println("arista: "+tetraedro.getArista());
        System.out.println("area: "+tetraedro.getArea());
        System.out.println("volumen: "+tetraedro.getVolumen());

        System.out.println();
        System.out.println("paralelelpipedo");
        Paralelepipedo paralelepipedo = new Paralelepipedo(2.0d,3.0d,4.0d);

        System.out.println("arista1: "+paralelepipedo.getArista1());
        System.out.println("arista2: "+paralelepipedo.getArista2());
        System.out.println("arista3: "+paralelepipedo.getArista3());
        System.out.println("area: "+paralelepipedo.getArea());
        System.out.println("volumen: "+paralelepipedo.getVolumen());

        System.out.println();
        System.out.println("cuadrado");
        Cuadrado cuadrado = new Cuadrado(2.0);

        System.out.println("lado: "+cuadrado.getLado());
        System.out.println("area: "+cuadrado.getArea());
        System.out.println("perimetro: "+cuadrado.getPerimetro());

        System.out.println();
        System.out.println("circulo");
        Circulo circulo = new Circulo(2.0d);

        System.out.println("radio: "+circulo.getRadio());
        System.out.println("area: "+circulo.getArea());
        System.out.println("perimetro: "+circulo.getPerimetro());

        System.out.println();
        Triangulo triangulo =new Triangulo(2.0d,5.0d);

        System.out.println("base: "+triangulo.getBase());
        System.out.println("altura: "+triangulo.getAltura());
        System.out.println("area: "+triangulo.getArea());
        System.out.println("perimetro: "+triangulo.getPerimetro());

        System.out.println();
        System.out.println("rectangulo");
        Rectangulo rectangulo = new Rectangulo(2.0d,3.0d);

        System.out.println("base: "+rectangulo.getBase());
        System.out.println("altura: "+rectangulo.getAltura());
        System.out.println("area: "+rectangulo.getArea());
        System.out.println("perimetro: "+rectangulo.getPerimetro());
    }
}