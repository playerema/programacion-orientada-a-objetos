import ar.edu.unlu.poo.ecuacion.Ecuacion;

import java.util.Scanner;

public class Main {
    /*Se requiere implementar una clase que represente y pueda resolver una ecuación de segundo grado.
Dada una ecuación de 2do grado de la forma y = a * x^2 + b * x + c, la fórmula para el cálculo de las raíces
es (-b ± √((b^2) - (4 * a * c))) / (2 * a). Una vez que se crea una instancia de la clase no se podrán
modificar sus coeficientes. Recordar que puede darse el caso donde exista una única raíz y para que
esto ocurra el discriminante ((b^2) - 4 * a * c) debe ser igual a 0. En este último caso, en vez de
retornar 2 raíces se debería retornar una sola. Existe el caso también donde necesitemos calcular
el valor de y en base al valor de x, que se pasa como parámetro.

Objetivos:
    Definir estructura y comportamiento.
    Crear una clase que utilice a la anterior y que pruebe todos los métodos con varios resultados.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float a = 0.0f, b = 0.0f,c = 0.0f;

        System.out.println("Calculemos una ecuacion de segundo grado");
        System.out.println("ingrese un valor de a (puede ser decimal):");
        a=sc.nextFloat();
        System.out.println("ingrese un valor de b (puede ser decimal):");
        b=sc.nextFloat();
        System.out.println("ingrese un valor de c (puede ser decimal):");
        c=sc.nextFloat();

        Ecuacion e = new Ecuacion(a,b,c);

        switch(e.cantidadRaices()){
            case 0:System.out.println("la ecuacion no tiene raices");
                System.out.println("Raiz 1: " + e.solucion().getRaiz1());
                System.out.println("Raiz 2: " + e.solucion().getRaiz2());
            break;
            case 1:System.out.println("la ecuacion tiene una raiz");
                System.out.println("Raiz 1: " + e.solucion().getRaiz1());
                System.out.println("Raiz 2: " + e.solucion().getRaiz2());
            break;
            case 2:System.out.println("la ecuacion tiene dos raices");
                System.out.println("Raiz 1: " + e.solucion().getRaiz1());
                System.out.println("Raiz 2: " + e.solucion().getRaiz2());
            break;
        }
    }
}