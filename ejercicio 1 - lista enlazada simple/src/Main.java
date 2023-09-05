import ar.edu.unlu.poo.listaenlazadasimple.ListaEnlazada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaEnlazada l = new ListaEnlazada();
        Scanner sc = new Scanner(System.in);

        System.out.println("la lista l tiene una longiud = " + l.longitud() + " y vacia = " + l.esVacia());

        System.out.print("PROBANDO METODO AGREGAR");

        System.out.print("¡Se utilizaran integer solo para facilitar la demostracion!");
        System.out.println();
        System.out.print("ingrese la cantidad de elementos a agregar en la lista: ");
        Integer n = sc.nextInt();

        for(int i =0;i<n ;i++){
            System.out.print("Ingrese el numero a añadir: ");
            l.agregar(sc.nextInt());
        }
        l.mostrar();

        System.out.println("PRUEBA DE METODO INSERTAR");

        System.out.print("ingrese el numero a añadir: ");
        n = sc.nextInt();
        System.out.print("ingrese el lugar en la lista donde ira (indice): ");
        l.insertar(n,sc.nextInt());

        l.mostrar();

        System.out.println("PRUEBA DE METODO RECUPERAR");
        System.out.print("ingrese un numero de indice a recuperar: ");
        n = sc.nextInt();
        System.out.println(l.recuperar(n));

        System.out.println("PRUEBA DE METODO ELIMINAR");
        System.out.print("ingrese un numero de indice a eliminar: ");
        n =sc.nextInt();
        l.eliminar(n);

        l.mostrar();

        System.out.println("la lista l tiene una longiud = " + l.longitud() + " y vacia = " + l.esVacia());
    }

}