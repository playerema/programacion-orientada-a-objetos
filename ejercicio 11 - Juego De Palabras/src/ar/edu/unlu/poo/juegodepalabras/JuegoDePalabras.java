package ar.edu.unlu.poo.juegodepalabras;

import java.util.ArrayList;
/*Debemos resolver una pequeña parte de un juego donde cada jugador puede formar palabras,
y cada palabra tendrá un puntaje. Por el momento, el puntaje de una palabra va a estar dado por:

    la cantidad de letras de la palabra y
    las letras k, z, x, y, w, q suman un punto más.

El puntaje de cada jugador se determina en base a las palabras que pudo “formar”, pero para que
esa palabra sea válida tiene que existir en un diccionario.
Se requiere poder agregar nuevas palabras a cada jugador, siempre y cuando éstas sean válidas.
Finalmente, debo poder obtener el puntaje total de cada jugador y poder determinar cuál es el
jugador con el puntaje más alto.*/
public class JuegoDePalabras {

    private ArrayList<Jugador> jugadores;

    public JuegoDePalabras(){
        jugadores=new ArrayList<>();
    }

    public void crearJugador(String nombre){
        jugadores.add(new Jugador(nombre));
    }

    public void incorporarPalabra(String palabra,String nombreJugador) {

        if (Diccionario.validar(palabra)) {

            for (int i =0;i<jugadores.size();i++) {
                if (jugadores.get(i).getNombre()==nombreJugador) {
                    jugadores.get(i).añadirpalabra(palabra);
                }
            }
        }
    }

    private ArrayList<Integer> puntajeTotal() {
        ArrayList<Integer> n = new ArrayList<>();

        for (int i=0;i<jugadores.size();i++) {
            n.add(this.jugadores.get(i).calcularPuntaje());
        }

        return n;
    }

    public Integer puntajeTotalJugador(String nombreJugador){
        for (int i =0;i<jugadores.size();i++) {
            if (jugadores.get(i).getNombre()==nombreJugador) {
                return jugadores.get(i).calcularPuntaje();
            }
        }
        return -1;
    }

    public String puntajeMasAlto(){
        String str = "";
        Integer n = 0;
        ArrayList<Integer> puntajesjugadores = puntajeTotal();

        for(int i = 0;i<puntajesjugadores.size();i++){
            if(n<puntajesjugadores.get(i)){
                n = puntajesjugadores.get(i);
                str = jugadores.get(i).getNombre();
            }
        }
        return str;
    }
}
