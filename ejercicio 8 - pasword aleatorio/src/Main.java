import ar.unlu.poo.password.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,longitud = 0;

        System.out.println("ingrese el numero de instancias de contraseñas: ");
        n = sc.nextInt();

        System.out.println("ingrese la longitud de las contraseñas: ");
        longitud = sc.nextInt();

        Password[] contraseña = new Password[n];

        for(int i=0;i<n;i++){

            contraseña[i]= new Password(longitud);
        }

        for(int i=0;i<n;i++){
            System.out.println(contraseña[i].getcontraseña() + "-" + contraseña[i].fuerte());
        }
    }
}