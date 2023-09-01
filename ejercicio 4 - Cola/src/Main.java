import ar.unlu.poo.cola.Cola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cola c = new Cola();
        Scanner sc = new Scanner(System.in);
        Integer n = 0;

        System.out.println("se creo la cola c con longitud = "+c.longitud()+" y vacio = " + c.esvacio());

        System.out.println("PRUEBA DEL METODO ENCOLAR");
        System.out.println("ingrese la cantidad de nodos a apilar: ");
        n = sc.nextInt();

        for(int i =0;i<n;i++){
            System.out.println("ingrese un numero a encolar: ");
            c.encolar(sc.nextInt());
        }

        c.mostrar();

        System.out.println("PRUEBA DEL METODO DESECOLAR Y RECUPERAR");
        System.out.println("se desencolara 2 veces");
        System.out.println("se desecolara:" + c.recuperar());
        c.desencolar();
        System.out.println("se desecolara:" + c.recuperar());
        c.desencolar();
        c.mostrar();

        System.out.println("cola c tiene longitud = "+c.longitud()+" y vacio = " + c.esvacio());

    }
}