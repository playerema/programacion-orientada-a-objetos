package ar.edu.unlu.poo.juegodepalabras;

import java.util.ArrayList;

public class Diccionario {
    public static ArrayList<String> diccionario =new ArrayList<String>();

    public static boolean validar(String cadena){
        boolean estaAdentro = false;
        diccionario.add("alemania");
        diccionario.add("wix");
        diccionario.add("josefina");
        diccionario.add("otoño");

        for(int i=0;i<diccionario.size();i++){
            if (diccionario.get(i).equals(cadena)){estaAdentro=true;}
        }
        return estaAdentro;
    }
}
