package ar.edu.unlu.poo.juegodepalabras;

import java.util.ArrayList;

public class Jugador {
    //ATRIBUTOS
    private String nombre = "";
    private ArrayList<String> palabras =new ArrayList<>();

    //CONSTRUCTOR

    public Jugador(String nombre){
        this.nombre=nombre;
    }

    //METODOS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){return this.nombre;}
    public void añadirpalabra(String cadena){
        palabras.add(cadena);
    }

    public int calcularPuntaje(){
        int n=0;

        for(int i = 0;i<palabras.size();i++){
            n+=calcularPalabra(palabras.get(i));
        }
        return n;
    }

    private int calcularPalabra(String cadena){
        Character ch;
        int n=0;

        for(int i=0;i<cadena.length();i++){
            ch=cadena.charAt(i);
            if ("kzxwq".contains(String.valueOf(ch))) {
                n += 2;
            } else {
                n += 1;
            }
        }

        return n;
    }
}
