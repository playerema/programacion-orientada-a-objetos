import ar.edu.unlu.pila.ClasePila;
import ar.edu.unlu.pila.MiObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClasePila p = new ClasePila();
        Scanner sc = new Scanner(System.in);
        Integer n = 0;

        System.out.println("se creo la pila p con longitud = " + p.longitud() + " y vacio = " + p.esvacio());

        System.out.println("PRUEBA DEL METODO APILAR");
        System.out.print("ingrese la cantidad de elementos a apilar: ");
        n=sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.print("ingrese el numero a apilar: ");
            p.apilar(sc.nextInt());
        }
        System.out.println();
        p.mostrar();

        System.out.println("PRUEBA DE DESAPILAR Y RECUPERAR " );
        System.out.println("se van a desapilar 2 elementos");
        System.out.println("se va ha desapilar el elemento: " + p.recuperar());
        p.desapilar();
        System.out.println("se esta desapilando el elemento: " + p.desapilar());
        System.out.println();
        p.mostrar();

        System.out.println("la pila p tiene la longitud = " + p.longitud() + " y vacio = " + p.esvacio());
    }
}