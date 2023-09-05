import ar.edu.unlu.poo.juegodepalabras.JuegoDePalabras;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        JuegoDePalabras j = new JuegoDePalabras();

        j.crearJugador("pedro");
        j.crearJugador("emanuel");
        j.crearJugador("pancho");
        j.crearJugador("luis");

        j.incorporarPalabra("alemania", "pedro");
        j.incorporarPalabra("otoño", "emanuel");
        j.incorporarPalabra("wix", "pancho");
        j.incorporarPalabra("yaguarete", "luis");

        System.out.println("pedro: "+ j.puntajeTotalJugador("pedro"));
        System.out.println("emanuel: "+ j.puntajeTotalJugador("emanuel"));
        System.out.println("pancho: "+ j.puntajeTotalJugador("pancho"));
        System.out.println("luis: "+ j.puntajeTotalJugador("luis"));

        System.out.println("ganador: " + j.puntajeMasAlto());
    }
}